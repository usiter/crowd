/**
 * crowd
 * com.crowd.util.common
 * PrimaryKeyGenerator.java
 * 
 * 2016年7月30日-下午3:06:26
 *  
 *
 */
package com.crowd.util.common;

import com.crowd.util.DateUtil;
import com.crowd.util.StringUtil;

/**
 *
 * PrimaryKeyGenerator
 * 主键生成器
 * Lange Lange 2016年7月30日 下午3:06:26
 * 
 * @version 1.0.0
 *
 */
public class PrimaryKeyGenerator {
	// 时间格式yyyyMMddHHmmssSSS.
	private static final String DATE_FORMATE_YYMMDDHHMMSS = "yyMMddHHmmss";
	
	/**
	 * 主键
	 * getPrimaryKey(这里用一句话描述这个方法的作用)
	 * (这里描述这个方法适用条件 – 可选)
	 * @return
	 *	String
	 * @exception
	 * @since  1.0.0
	 */
	public static String getPrimaryKey() {
		String currentDate = DateUtil
				.getDateStringByFormat(DATE_FORMATE_YYMMDDHHMMSS);
		String randomNumber = StringUtil.getRandomNumber();
		return currentDate + randomNumber;

	}

	public static void main(String[] args) {
		System.out.println(getPrimaryKey());
	}
}
