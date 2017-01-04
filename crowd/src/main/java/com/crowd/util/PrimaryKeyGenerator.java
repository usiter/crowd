/**
 * 
 */
package com.crowd.util;

import java.util.UUID;

/**
 * @author lange
 *	主键生成器
 */
public class PrimaryKeyGenerator {
	
	/*ip*/
	private static final String IP = "127.0.0.1";
	
	/**
	  * @description 根据时间，IP，端口号，流水号等生成全局唯一的主键
	        年(2位) + 月(2位) + 日期(2位) + IP(后2位)+端口号(后2位)+时(2位)+分(2位)+秒(2位)+流水号(4位); 共计20位
	       IP/端口号指服务器信息，从配置文件中取
	  * @version 1.0
	  * @return 20位的主键
	  */
	public static String getPrimaryKey(){
		
		return "";
	}
		public static void main(String[] args) {
			System.out.println();
			System.out.println(UUID.randomUUID());
			System.out.println(UUID.randomUUID().hashCode());
			System.out.println(UUID.randomUUID());
			
		}
}
