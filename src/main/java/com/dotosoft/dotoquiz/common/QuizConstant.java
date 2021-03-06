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

package com.dotosoft.dotoquiz.common;

import java.util.Locale;

public class QuizConstant {
	public static final String EMPTY_STRING = "";
	
	public static final String YES = "Y";
	public static final String NO = "N";
	public static final String SYSTEM_USER = "system";

	public static final String ROLE_USER_PLAYER = "player";
	public static final String[] ROLE_DEFAULTS = { QuizConstant.ROLE_USER_PLAYER };

	public static final String STATUS_USER_ACTIVE = "ACTIVE";
	public static final String STATUS_USER_LOCKED = "LOCKED";
	public static final String STATUS_USER_BANNED = "BANNED";

	public static final String OAUTH_TYPE_GMAIL = "GMAIL";
	public static final String OAUTH_TYPE_FACEBOOK = "FACEBOOK";

	public static final String GAME_STATUS_WIN = "WIN";
	public static final String GAME_STATUS_LOSER = "LOSER";
	public static final String GAME_STATUS_DRAW = "DRAW";
	
	public static final String TITLE_DEFAULT_PLAYER = "Novice";
	
	public static Locale DEFAULT_LOCALE = Locale.ENGLISH;
}
