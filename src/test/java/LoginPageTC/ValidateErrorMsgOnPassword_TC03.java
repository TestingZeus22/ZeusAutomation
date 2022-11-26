package LoginPageTC;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.baseClass;
import POM.loginPage;
import POM.selectCompanyPage;
import utility.utilityClass;

@Listeners ()
	public class ValidateErrorMsgOnPassword_TC03 extends baseClass {
		loginPage login;
		File myFile;
		
		@BeforeClass
		public void launchBrowser()
		{
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
		}

		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException
		{
			utilityClass.implicitlyWaitInMillis(1000);
			login.SendUserName(utilityClass.readDataFromStringExcel(3, 0, "Sheet1"));
			Reporter.log("Valid Username Entered ",true);
			login.SendPassword(utilityClass.readDataFromStringExcel(3, 1, "Sheet1"));
			Reporter.log("Invalid Password Entered",true);
			utilityClass.implicitlyWaitInMillis(1000);	
			login.ClickOnLoginToDashboard();
			Reporter.log("Click on Dashboard button ",true);
			utilityClass.implicitlyWaitInMillis(1000);
		}
	  
	 @Test
	  public void CheckIncorrectCredentialsOnPasswordFieldTest() throws EncryptedDocumentException, IOException
	  
	  {
		 String Actual_Msg = login.getCredentialsInvalidTextOnPasswordField();
		 String expected_Msg = utilityClass.readDataFromStringExcel(3, 2, "Sheet1");
		 Assert.assertEquals(expected_Msg, Actual_Msg,"Test case Failed as actual & expected Credential message are not matching");
		 Reporter.log("Validating actual "+login.getCredentialsInvalidTextOnPasswordField()+" and Expected Text "+utilityClass.readDataFromStringExcel(3, 2, "Sheet1"),true);
		 utilityClass.screenshot(driver, "CheckIncorrectCredentialsOnPasswordTest");
	  }

	  @AfterClass 
	  public void closeBrowser()
	  {
		  Reporter.log("Closing Browser",true);
		  driver.quit();
		  
	  }
	}
