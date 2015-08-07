package org.windbell.lab.hamster.utlis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

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
	/**
	 * @Title: getSystemEncoding
	 * @author: MN
	 * @Description: 获取系统默认编码
	 * @date: 2015年8月7日 下午9:29:51
	 * @return
	 * @throws 
	 */
	public static String getSystemEncoding(){
		//Charset.defaultCharset();
		return System.getProperty("file.encoding");
	}
	public static Process execCommand(String command){
		Runtime rt = Runtime.getRuntime();
		String[] cmd = new String[] { "sh", "-c", command };
		if(!SystemUtil.isLinux()){
			cmd[0]="cmd";
			cmd[1]="/c";
		}
		try {
			Process process = rt.exec(cmd);
			if(0==process.waitFor()){
				System.out.println("command run ok~");
			}else{
				System.err.println("command run Failed~");
			}
			return process;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static StringBuffer runCommand(String command){
		Process execCommand = execCommand(command);
		BufferedReader input = new BufferedReader(new InputStreamReader(execCommand.getInputStream())); 
		StringBuffer sb=new StringBuffer();
		String line = "";  
        try {
			while ((line = input.readLine()) != null) {  
			    sb.append(new String(line.getBytes(),"UTF-8"));
			    sb.append("\n");
			}  
			input.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return sb;
	}
}
