package com.peachliu.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	
	/**
	 * 是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		boolean flag = false;
		if("".equals(str.trim())||null==str){
			flag = true;
			return flag;
		}else{
			return flag;
		}
	}
	
			/**
			 * 替换空白字符
			 * @param str
			 * @return
			 */
	 public static String replaceBlank(String str) {
	        String dest = "";
	        if (str!=null) {
	            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
	            Matcher m = p.matcher(str);
	            dest = m.replaceAll("");
	        }
	        return dest;
	    }
}
