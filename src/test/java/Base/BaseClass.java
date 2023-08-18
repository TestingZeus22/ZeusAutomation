package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import utility.UtilityClass;

public class BaseClass {

	public static WebDriver driver;
	
	public void openApplication()
	
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohan.patil\\Jar files\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://zeuscloud.azurewebsites.net/Index?Status=SE");
		UtilityClass.implicitlyWaitInMillis(1000);

	}

}
		
		

