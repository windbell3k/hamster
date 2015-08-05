package org.windbell.lab.hamster.utlis;

public class SystemUtil {
	/**
	 * @Title: isLinux
	 * @author: MN
	 * @Description: 判断系统是否是Linux
	 * @date: 2015年8月5日 下午4:57:47
	 * @return
	 * @throws 
	 */
	public static boolean isLinux(){
		return System.getProperty("os.name").toLowerCase().indexOf("linux")>=0;
	}
}
