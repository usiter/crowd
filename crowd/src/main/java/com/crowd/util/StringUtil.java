/**
 * crowd
 * com.crowd.util
 * StringUtil.java
 * 
 * 2016年7月20日-下午11:59:35
 *  2016lange-版权所有
 *
 */
package com.crowd.util;

/**
 *
 * StringUtil
 * 
 * Lange
 * Lange
 * 2016年7月20日 下午11:59:35
 * 
 * @version 1.0.0
 *
 */
public class StringUtil {
	
	/**
	 * 
	 * isEmpty(判断字符串是否为空)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param str
	 * @return
	 *boolean
	 * @exception
	 * @since  1.0.0
	 */
	public static boolean isEmpty(String str){
		boolean flag = false;
		if("".equals(str.trim())||null==str){
			flag = true;
			return flag;
		}
		return flag;
	}

}
