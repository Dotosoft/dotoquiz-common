/*
	Copyright 2015 Denis Prasetio
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/

package com.dotosoft.dotoquiz.utils;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileUtils {
	
	private static final Logger log = LogManager.getLogger(FileUtils.class.getName());
	
	public static Path getPath(String rootFolder, String folder, String file) {
		Path returnPath = Paths.get(rootFolder, folder, file);
		return returnPath;
	}
	
	public static boolean moveToTrash(File fileToDelete)
    {
		com.sun.jna.platform.FileUtils fileUtils = com.sun.jna.platform.FileUtils.getInstance();
        if (fileUtils.hasTrash())
        {
            try
            {
                fileUtils.moveToTrash( new File[] { fileToDelete } );
                return true;

            } catch (IOException ioe)
            {
            }
        }

        return false;
    }
	
	public static boolean downloadFileToLocal( String urlPath, Path saveToFile, Boolean isReplaced ) {
		return downloadFileToLocal(urlPath, saveToFile.toString(), isReplaced);
	}
	
	public static boolean downloadFileToLocal( String urlPath, String saveToFile, Boolean isReplaced ) {
		try {
			File checkfileExist = new File(saveToFile);
			if(checkfileExist.exists() && !isReplaced) {
				return true;
			}
			
			if(!checkfileExist.getParentFile().exists()) {
				if(checkfileExist.getParentFile().mkdirs()) {
					log.info("Create folder at " + checkfileExist.getParentFile());
				}
			}
			
			log.info("Download " + urlPath + " to local('" + saveToFile + "')");
			
			URL url = new URL(urlPath);
			InputStream in = new BufferedInputStream(url.openStream());
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int n = 0;
			while (-1!=(n=in.read(buf)))
			{
			   out.write(buf, 0, n);
			}
			out.close();
			in.close();
			byte[] response = out.toByteArray();
			
			if(!checkfileExist.getParentFile().exists()) {
				if(checkfileExist.getParentFile().mkdirs()) {
					log.info("Create folder at '" + checkfileExist.getParent() + "'");
				}
			}
			
			FileOutputStream fos = new FileOutputStream(saveToFile);
			fos.write(response);
			fos.close();
			
			return true;
		} catch ( Exception ex ) {
			// ex.printStackTrace();
			log.error(ex.getMessage());
		}
		
		return false;
	}
}
