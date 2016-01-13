package com.dotosoft.dotoquiz.utils;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.dotosoft.dotoquiz.common.QuizConstant;

public class LabelUtils {
	public static String getLabel(Locale currentLocale, String bundle, String key, String... params) {
		ResourceBundle labels = ResourceBundle.getBundle(bundle, currentLocale);
		String value = labels.getString(key);
		
		if(params != null && params.length > 0) {
			try {
	            return MessageFormat.format(value, params);
	        } catch (MissingResourceException e) {
	            return '!' + key + '!';
	        }
		}
		
		return value;
	}
	
	public static String getLabel(Locale currentLocale, String bundle, String key) {
		return getLabel(currentLocale, bundle, key, null);
	}
	
	public static String getLabel(String key) {
		return getLabel(QuizConstant.DEFAULT_LOCALE, "common", key);
	}
	
	public static String getLabel(String key, String... params) {
		return getLabel(QuizConstant.DEFAULT_LOCALE, "common", key, params);
	}
	
	public static String getLabel(String bundle, String key) {
		return getLabel(QuizConstant.DEFAULT_LOCALE, bundle, key);
	}
	
	public static String getLabel(String bundle, String key, String params) {
		return getLabel(QuizConstant.DEFAULT_LOCALE, bundle, key, params);
	}
}
