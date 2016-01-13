package com.dotosoft.dotoquiz.utils;

import java.util.Locale;
import java.util.ResourceBundle;

import com.dotosoft.dotoquiz.common.QuizConstant;

public class LabelUtils {
	public static String getLabel(Locale currentLocale, String bundle, String key) {
		ResourceBundle labels = ResourceBundle.getBundle(bundle, currentLocale);
		String value = labels.getString(key);
		return value;
	}
	
	public static String getLabel(String key) {
		return getLabel(QuizConstant.DEFAULT_LOCALE, "common", key);
	}
	
	public static String getLabel(String bundle, String key) {
		return getLabel(QuizConstant.DEFAULT_LOCALE, bundle, key);
	}
}
