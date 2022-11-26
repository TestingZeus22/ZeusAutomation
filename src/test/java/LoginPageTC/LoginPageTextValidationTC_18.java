package LoginPageTC;

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

import Base.baseClass;
import POM.loginPage;
import utility.utilityClass;

public class LoginPageTextValidationTC_18 extends baseClass {
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
		utilityClass.implicitlyWaitInMillis(200);
	}
  
  @Test
  public void ValidateWelcomeBackTextOnLoginPageTest() throws EncryptedDocumentException, IOException
   { 
	 String Actual_Text = login.getWelcomeBackText();
	 String expected_Text =utilityClass.readDataFromStringExcel(10, 2, "Sheet1");
	 Assert.assertEquals(expected_Text, Actual_Text,"Test case Failed as actual & expected Text are not matching");  
	 Reporter.log("Validating actual "+login.getWelcomeBackText()+" and Expected Text "+utilityClass.readDataFromStringExcel(10, 2, "Sheet1"),true);
	
   }

  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
