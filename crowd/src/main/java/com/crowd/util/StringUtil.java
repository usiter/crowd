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

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	/**
	 * 格式化金額
	 * getFormatAmount(格式化金額)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param str    数字字符串  
	 * @return  保留两位数  遵循四舍五入
	 *String
	 * @exception
	 * @since  1.0.0
	 */
	public static String getFormatAmount(String str){
		//判断是否数字字符串
		if(isNumeric(str)){
			DecimalFormat decimalFormat=new DecimalFormat("0.00");//构造方法的字符格式这里如果小数不足2位,会以0补足.
			return decimalFormat.format(Double.valueOf(str));
		}
		return str;
		
	}
	
	/**
	 * 
	 * isNumeric(校验是否数字)
	 * (这里描述这个方法适用条件 – 可选)
	 * [0-9]+  
	 * +表示1个或多个（如"3"或"225"），
	 * *表示0个或多个（[0-9]*）（如""或"1"或"22"），
	 * ?表示0个或1个([0-9]?)(如""或"7")
	 * @param str  待校验字符串
	 * @return  是数字 返回 true, 否则返回false
	 *	boolean
	 * @exception
	 * @since  1.0.0
	 */
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}
	/**
	 * 生成6位随机数
	 * getRandomNumber(这里用一句话描述这个方法的作用)
	 * 100000 6位
	 * 同理 10000 5位 ,1000 4位
	 * 
	 * @return
	 *String
	 * @exception
	 * @since  1.0.0
	 */
	public static String getRandomNumber(){
		int randmNumber = (int)((Math.random()*9+1)*100000);
		return randmNumber+"";
	}
	public static void main(String[] args) {
		System.out.println(getFormatAmount("12"));
		System.out.println(isNumeric("12g"));
		System.out.println(getRandomNumber());
	}
}
