package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONArray;




public class JsonUtil {
	public static String getStrFromWeb(String strURL) throws Exception{
		URL url = new URL(strURL);
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
		String strResult = buffer.toString();
		return strResult;
	}
	//json转化用到的jar commons-beanutils-1.9.3  commons.logging-1.1.1  commons-collections-3.2.2(*)  commons-lang-2.3(*)   ezmorph-1.0.4   json-lib-2.4-jdk15
	public static JSONArray StrToJson(String strJson){
	    JSONArray array=JSONArray.fromObject(strJson);
		return array;
		}
}
