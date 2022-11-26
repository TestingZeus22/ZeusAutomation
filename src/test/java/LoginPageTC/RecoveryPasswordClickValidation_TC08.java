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
import POM.recoverPasswordPage;
import POM.loginPage;
import utility.utilityClass;

public class RecoveryPasswordClickValidation_TC08 extends baseClass {
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
		utilityClass.implicitlyWaitInMillis(1000);	
	}
  
    @Test
    public void ClickOnRecoveryPasswordLinkTest() throws EncryptedDocumentException, IOException
    {
	  String actualText = email.getTextCopyright();
	  String expectedText = utilityClass.readDataFromStringExcel(5, 2, "Sheet1");
	  Assert.assertEquals(expectedText, actualText,"Test case Failed as expected and actual Message are not matching");
	  Reporter.log("Validating actual "+email.getTextCopyright()+" and Expected Text "+utilityClass.readDataFromStringExcel(5, 2, "Sheet1"),true);  
    }
  
  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
