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
import POM.selectCompanyPage;
import utility.utilityClass;

public class ValidateErrorMsgOnUserName_TC04 extends baseClass {
		
		loginPage login;
		File myFile;
	
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch Successfully",true);
			login=new loginPage(driver);
		}

		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException
		{
			utilityClass.implicitlyWaitInMillis(1000);
			login.SendUserName(utilityClass.readDataFromStringExcel(4, 0, "Sheet1"));
			Reporter.log("Invalid Username Entered ",true);
			login.SendPassword(utilityClass.readDataFromStringExcel(4, 1, "Sheet1"));
			Reporter.log("valid Password Entered ",true);
			login.ClickOnLoginToDashboard();
			Reporter.log("Clicked on Dashboard button ",true);
			utilityClass.implicitlyWaitInMillis(1000);	
		}
	  
	 @Test
	  public void CheckIncorrectCredentialsOnUserNameFieldTest() throws EncryptedDocumentException, IOException
	  {
		 String Actual_Msg = login.getCredentialsInvalidTextOnUserNameField();
		 String expected_Msg = utilityClass.readDataFromStringExcel(4, 2, "Sheet1");
		 Assert.assertEquals(expected_Msg, Actual_Msg,"Test case Failed as actual & expected error Message are not matching");  
		 Reporter.log("Validating actual "+login.getCredentialsInvalidTextOnUserNameField()+" and Expected Text "+utilityClass.readDataFromStringExcel(4, 2, "Sheet1"),true);
		 utilityClass.screenshot(driver, "CheckIncorrectCredentialsOnUserNameFieldTest");
	  }
	 
	  @AfterClass 
	  public void closeBrowser()
	  {
		  Reporter.log("Closing Browser",true);
		  driver.close();
	  }
	}
