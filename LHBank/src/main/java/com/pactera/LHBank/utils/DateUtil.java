/**
 * 
 */
package com.pactera.LHBank.utils;

/**   
* @Title: DateUtil.java 
* @Package com.pactera.LHBank.utils 
* @Description: TODO(用一句话描述该文件做什么) 
* @author cbw   
* @date 2017年12月14日 下午3:51:48 
* @version V1.0   
*/
public class DateUtil {
	
	//截取 “1-值” 
	public static String dealData(String str) {
		String temp = str;
		if(!"".equals(str)) {
			temp = str.split("-")[0];
		}
		return temp;
	}

}
