package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 获取url的内容为字符串
 * @author gaol
 *
 */
public class UrlStrUtil {
    @SuppressWarnings("finally")
	public static String getStr(String strURL){
		URL url;
		String res = "系统错误！";
		try {
			url = new URL(strURL);
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setRequestMethod("GET");
			httpConn.connect();
	 
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "utf-8"));
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			httpConn.disconnect();
			res = buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			return res;
		}
    }
}