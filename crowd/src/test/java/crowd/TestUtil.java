/**
 * crowd
 * crowd
 * TestUtil.java
 * 
 * 2016年7月29日-下午8:12:40
 *  
 *
 */
package crowd;

import com.crowd.util.chinesepinyin.PinyinHelper;

/**
 *
 * TestUtil
 * 
 * Lange
 * Lange
 * 2016年7月29日 下午8:12:40
 * 
 * @version 1.0.0
 *
 */
public class TestUtil {

	
	public static void main(String[] args) {
		int[] arr = new int[]{8,2,1,0,3};
		int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
		String tel = "";
		for (int i : index) {
			tel+= arr[i];
		}
		
		System.out.println(tel);
		System.out.println(PinyinHelper.getShortPinyin("中国长沙"));	
		System.out.println(PinyinHelper.convertToPinyinString("中国长沙", "Upper"));
	}
}
