package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class utilityPropertyFile {

public static String getDatafromPropertiesFile(String key) throws IOException


{
	Properties obj= new Properties();
	FileInputStream Myfile= new FileInputStream("C:\\Users\\rohan.patil\\eclipse-workspace\\Zeus\\data.properties");
	obj.load(Myfile);
	String value = obj.getProperty("Url");
	return value;
	
}


public static Date parseDate(String inputDate) throws ParseException {
    SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yy");
    return inputFormat.parse(inputDate);
}

public static String formatDate(Date date) {
    SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
    return outputFormat.format(date);
}

}
