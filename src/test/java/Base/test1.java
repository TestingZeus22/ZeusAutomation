package Base;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.utilityClass;

public class test1 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohan.patil\\Jar files\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://zeuscloud.azurewebsites.net/Index?Status=SE");
		//driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=1794383009697357349&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007761&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=EAIaIQobChMIx4yr-oCG_QIVgzUrCh0t_wKcEAAYASAAEgKVi_D_BwE");
		//driver.get("https://zeuscloud.azurewebsites.net/Index?Status=SE");
		utilityClass.implicitlyWaitInMillis(1000);
		
		//Screenshot method calling 
		//utilityClass.screenshot(driver, "CheckIncorrectCredentialsOnPasswordTest");
  }
}
