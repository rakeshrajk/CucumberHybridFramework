package utils;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConfigUtils {
	
	public static Properties configReader() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config\\Config.properties");
		prop.load(fis);
		return prop;
	} 
	

}
