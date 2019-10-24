package utils;

import java.util.UUID;

public class KeyUtil {
	 public static String getUuid(){
	        return UUID.randomUUID().toString().replace("-", "");
	    }
}
