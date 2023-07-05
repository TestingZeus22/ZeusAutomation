package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilityPropertyFile {

public static String getDatafromPropertiesFile(String key) throws IOException


{
	Properties obj= new Properties();
	FileInputStream Myfile= new FileInputStream("C:\\Users\\rohan.patil\\eclipse-workspace\\Zeus\\data.properties");
	obj.load(Myfile);
	String vaule = obj.getProperty("Url");
	return vaule;
	
}

}
