package LoginPageTC;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseClass;
import POM.loginPage;
import utility.utilityClass;

public class LoginPageRefreshValidation_TC10 extends baseClass {
	
		loginPage login;
		File myFile;
		
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			
		}
		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException
		{
			login.SendUserName(utilityClass.readDataFromStringExcel(7, 0, "Sheet1"));
			Reporter.log("Valid Username Entered",true);
			login.SendPassword(utilityClass.readDataFromStringExcel(7, 1, "Sheet1"));
			Reporter.log("Valid Password Entered",true);
			utilityClass.implicitlyWaitInMillis(1000);
			login.ClickOnLoginToDashboard();	
			Reporter.log("Clicked on Login to Dashboard button",true);
			driver.navigate().refresh();
			utilityClass.implicitlyWaitInMillis(1000);
		}
	  
	  @Test
	  public void ValidUserNamePasswordAndRefreshpageTest() throws EncryptedDocumentException, IOException
	  
	  {
		  String Actual_Url= driver.getCurrentUrl();
		  String expected_Url = utilityClass.readDataFromStringExcel(7, 2, "Sheet1");
		  System.out.println("expected_Url is "+expected_Url);
		  Assert.assertEquals(Actual_Url, expected_Url,"Test case Failed as actual and Expected Url are not matching");  
		  Reporter.log("Validating actual "+driver.getCurrentUrl()+" and Expected Text "+utilityClass.readDataFromStringExcel(7, 2, "Sheet1"),true);	
	   }

	  @AfterClass 
	  public void closeBrowser()
	  {
		  Reporter.log("Closing Browser",true);
		  driver.close();
	  }
	}
