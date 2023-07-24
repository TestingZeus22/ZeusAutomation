package Base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import utility.UtilityClass;

public class TestUrl {
  @Test
  public void TestApp() {
	  
	  // System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohan.patil\\Jar files\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://zeuscloud.azurewebsites.net/Index?Status=SE");
		
		WebElement tt = driver.findElement(By.tagName("button"));
		
		//obtain color in rgba
		String s = tt.getCssValue("color");
		
		// convert rgba to hex
	      String c = Color.fromString(s).asHex();
	      System.out.println("Color is :" + s);
	      
	      System.out.println("Hex code for color:" + c);
	      
	      driver.quit();
	      
	      
	      
	      
		
//		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=1794383009697357349&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007761&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=EAIaIQobChMIx4yr-oCG_QIVgzUrCh0t_wKcEAAYASAAEgKVi_D_BwE");
//		//driver.get("https://zeuscloud.azurewebsites.net/Index?Status=SE");
//		UtilityClass.implicitlyWaitInMillis(1000);
//		
//		//Screenshot method calling 
//		//utilityClass.screenshot(driver, "CheckIncorrectCredentialsOnPasswordTest");
  }
}
