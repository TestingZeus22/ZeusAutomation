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

public class LoginPageTextValidationTC_18 extends BaseClass {
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
		UtilityClass.implicitlyWaitInMillis(200);
	}
  
  @Test
  public void ValidateWelcomeBackTextOnLoginPageTest() throws EncryptedDocumentException, IOException
   { 
	 String Actual_Text = login.getWelcomeBackText();
	 String expected_Text =UtilityClass.readDataFromStringExcel(10, 2, "Sheet1");
	 Assert.assertEquals(Actual_Text, expected_Text,"Test case Failed as actual & expected Text are not matching");  
	 Reporter.log("Validating actual "+login.getWelcomeBackText()+" and Expected Text "+UtilityClass.readDataFromStringExcel(10, 2, "Sheet1"),true);
	
   }

  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
