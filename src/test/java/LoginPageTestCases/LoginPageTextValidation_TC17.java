package LoginPageTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import POM.loginPage;
import utility.UtilityClass;

public class LoginPageTextValidation_TC17 extends BaseClass {
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
		UtilityClass.implicitlyWaitInMillis(200);
	}
  
  @Test
  public void ValidateCopyrightTextOnLoginPageTest() throws EncryptedDocumentException, IOException
  {
	 String Actual_TextMsg = login.getCopyrightZeusText();
	 String expected_TextMsg = UtilityClass.readDataFromStringExcel(9, 2, "Sheet1");
	 Assert.assertEquals(Actual_TextMsg, expected_TextMsg,"Test Case Failed as actual & expected Message are not matching");  
	 Reporter.log("Validating actual "+login.getCopyrightZeusText()+" and Expected Text "+UtilityClass.readDataFromStringExcel(9, 2, "Sheet1"),true);
  }

  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
