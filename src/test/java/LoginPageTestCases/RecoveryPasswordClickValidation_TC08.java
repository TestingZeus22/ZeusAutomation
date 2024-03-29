package LoginPageTestCases;

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
import Base.BaseClass;
import POM.recoverPasswordPage;
import POM.loginPage;
import utility.UtilityClass;

public class RecoveryPasswordClickValidation_TC08 extends BaseClass {
	loginPage login;
	recoverPasswordPage email;
	File myFile;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		email=new recoverPasswordPage(driver);
	}

	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login.ClickOnRecoverPassword();
		Reporter.log("Clicked on Recovery PasswordButton ",true);
		UtilityClass.implicitlyWaitInMillis(1000);	
	}
  
    @Test
    public void ClickOnRecoveryPasswordLinkTest() throws EncryptedDocumentException, IOException
    {
	  String actualText = email.getTextCopyright();
	  String expectedText = UtilityClass.readDataFromStringExcel(5, 2, "Sheet1");
	  Assert.assertEquals(actualText, expectedText,"Test case Failed as expected and actual Message are not matching");
	  Reporter.log("Validating actual "+email.getTextCopyright()+" and Expected Text "+UtilityClass.readDataFromStringExcel(5, 2, "Sheet1"),true);  
    }
  
  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
