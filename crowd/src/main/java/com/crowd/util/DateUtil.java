/**
 * crowd
 * com.crowd.util
 * DateUtil.java
 * 
 * 2016年7月30日-下午3:11:31
 *  
 *
 */
package com.crowd.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * DateUtil
 * 
 * Lange Lange 2016年7月30日 下午3:11:31
 * 
 * @version 1.0.0
 *
 */
public class DateUtil {

	// 日期格式 年.
	public static final String YEAR_FORMAT = "yyyy";

	// 默认日期格式.
	public static final String DEFALT_DATE_FORMAT = "yyyy-MM-dd";

	// 默认时间格式.带时分秒
	public static final String DEFUALT_TIMESTAMPE_FORMAT = "yyyy-MM-dd hh:mm:ss sss";

	// 时间格式yyyyMMddHHmmssSSS.
	public static final String DATE_FORMATE_YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";

	// 时间格式yyyy-MM-dd HH:mm:ss.
	public static final String DATE_FORMATE_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

	// 时间格式yyMMdd.
	public static final String DATE_FORMATE_YYMMDD = "yyMMdd";

	// 时间格式DATE_FORMATE_YYYYMMDD.
	public static final String DATE_FORMATE_YYYYMMDD = "yyyyMMdd";

	// 时间格式yyyyMMddHHmmssSSS.
	public static final String DATE_FORMATE_YYMMDDHHMMSS = "yyMMddHHmmss";

	/**
	 * private constructor
	 */
	private DateUtil() {

	}

	/**
	 * 取得现在时间.
	 * 
	 * @return 现在时间
	 */
	public static String getCurrentSqlTimestampString() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(DEFUALT_TIMESTAMPE_FORMAT);
		return sdf.format(today);
	}

	/**
	 * 取得指定格式的时间格式字符串
	 * 
	 * @return 现在时间
	 */
	public static String getDateStringByFormat(String format) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(today);
	}

	/**
	 * 将传入的时间转换为指定时间格式字符串.
	 * 
	 * @param time
	 *            传入时间
	 * @param dateFormat
	 *            时间格式
	 * @return 时间字符串
	 */
	public static String formatTimeStamp(Timestamp time, String dateFormat) {
		if (time == null) {
			return "";
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(time);
	}

	/**
	 * 取得现在时间.
	 * 
	 * @return 现在时间
	 */
	public static Timestamp getCurrentSqlTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * 取得今天日期字符串.
	 * 
	 * @return 今天日期字符串
	 */
	public static String getCurrentDay() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(DEFALT_DATE_FORMAT);
		return sdf.format(today);
	}

	/**
	 * 取得今天日期+时间字符串.
	 * 
	 * @return 今天日期字符串 YYYY-MM-dd HH:mm:ss
	 */
	public static String getCurrentDayTime() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMATE_YYYYMMDDHHMMSS);
		return sdf.format(today);
	}

	/**
	 * 将传入的时间转换为默认时间格式字符串.
	 * 
	 * @param time
	 *            传入时间
	 * @return 时间字符串
	 */
	public static String formatTimeStampDefualt(Timestamp time) {
		if (time == null) {
			return "";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(DEFUALT_TIMESTAMPE_FORMAT);
		return sdf.format(time);
	}

	/**
	 * 将传入日期转换为默认格式字符串.
	 * 
	 * @param date
	 *            传入日期
	 * @return 日期字符串
	 */
	public static String formatDateDefault(Date date) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(DEFALT_DATE_FORMAT);
		return sdf.format(date);
	}

	/**
	 * 功能描述: 根据指定的格式化规则返回当前日期
	 * 
	 * @param string
	 * @return [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static String getCurrentDate(String formater) {
		SimpleDateFormat format = new SimpleDateFormat(formater);
		return format.format(new Date());
	}

	/**
	 * 将传入日期转换为指定格式字符串.
	 * 
	 * @param date
	 *            传入日期
	 * @param dateFormat
	 *            时间格式
	 * @return 日期字符串
	 */
	public static String formatDateByDateFormate(Date date, String dateFormat) {
		if (date == null) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}

	/**
	 * 取得当前年 .
	 * 
	 * @return 当前年
	 */
	public static String getCurrentYear() {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(YEAR_FORMAT);
		return sdf.format(today);
	}

	public static Date formatDate(String date) throws ParseException {
		DateFormat df = new SimpleDateFormat(DEFALT_DATE_FORMAT);
		return df.parse(date);
	}

	/**
	 * 
	 * 功能描述: <br>
	 * 计算距今天指定天数的日期
	 * 
	 * @param days
	 * @return
	 * @since 20130630
	 */
	public static String getDateAfterDays(int days) {
		Calendar date = Calendar.getInstance();// today
		date.add(Calendar.DATE, days);
		SimpleDateFormat simpleDate = new SimpleDateFormat(DEFALT_DATE_FORMAT);
		return simpleDate.format(date.getTime());
	}

	/**
	 * 在指定的日期的前几天或后几天
	 * 
	 * @param source
	 *            源日期(yyyy-MM-dd)
	 * @param days
	 *            指定的天数,正负皆可
	 * @return
	 * @throws ParseException
	 */
	public static String addDays(String source, int days) {
		Date date = null;
		try {
			date = formatDate(source);
		} catch (ParseException e) {
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		SimpleDateFormat dateFormat = new SimpleDateFormat(DEFALT_DATE_FORMAT);
		return dateFormat.format(calendar.getTime());
	}

	/**
	 * 
	 * 功能描述: <br>
	 * 〈功能详细描述〉校验正确的日期格式
	 * 
	 * @param str
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static boolean isValidDate(String str, String format) {
		boolean convertSuccess = true;
		// 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
		SimpleDateFormat sf = new SimpleDateFormat(format);
		try {
			// 设置lenient为false.
			// 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
			sf.setLenient(false);
			sf.parse(str);
		} catch (ParseException e) {
			// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
			convertSuccess = false;
		}
		return convertSuccess;
	}

	/**
	 * 
	 * 功能描述: <br>
	 * 〈功能详细描述〉计算时间相隔的天数
	 *
	 * @param beginDateStr
	 * @param endDateStr
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	public static long getDaySub(String beginDateStr, String endDateStr) {
		long day = 0;
		SimpleDateFormat format = new SimpleDateFormat(
				DateUtil.DEFALT_DATE_FORMAT);
		Date beginDate;
		Date endDate;
		try {
			beginDate = format.parse(beginDateStr);
			endDate = format.parse(endDateStr);
			day = (endDate.getTime() - beginDate.getTime())
					/ (24 * 60 * 60 * 1000);
		} catch (ParseException e) {
			throw new RuntimeException("传入日期参数有误!", e);
		}
		return day;
	}
	
	/**
     * 以友好的方式显示时间
     * @param time
     * @return
     */
    public static String friendlyTime(Date time) {
        //获取time距离当前的秒数
        int ct = (int)((System.currentTimeMillis() - time.getTime())/1000);
         
        if(ct == 0) {
            return "刚刚";
        }
         
        if(ct > 0 && ct < 60) {
            return ct + "秒前";
        }
         
        if(ct >= 60 && ct < 3600) {
            return Math.max(ct / 60,1) + "分钟前";
        }
        if(ct >= 3600 && ct < 86400)
            return ct / 3600 + "小时前";
        if(ct >= 86400 && ct < 2592000){ //86400 * 30
            int day = ct / 86400 ;           
            return day + "天前";
        }
        if(ct >= 2592000 && ct < 31104000) { //86400 * 30
            return ct / 2592000 + "月前";
        }
        return ct / 31104000 + "年前";
    }
	/**
     * 将字符串转换为Date类型
     * @param str
     * @return
     */
    public static Date stringToDate(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 格式化字符串，解决从MySql中查出来的数据后面多了0的问题
     * @param date
     * @return
     */
    public static String formatDate(Date date){
    	return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
}
