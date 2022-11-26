package LoginPageTC;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

public class ValidateRecoverPwdLinkTC_20 extends baseClass {
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
		utilityClass.implicitlyWaitInMillis(100);	
	}
  
    @Test
    public void VerifyRecoverPwdIsLinkTest() throws EncryptedDocumentException, IOException
    {
	  String ActualLink = login.getRecoverPasswordLink();
	  String expectedLink =utilityClass.readDataFromStringExcel(11, 2, "Sheet1");
	  Assert.assertEquals(expectedLink, ActualLink,"Test Case Failed as actual & expected Link are not matching");  
	  Reporter.log("Validating actual "+login.getRecoverPasswordLink()+" and Expected Text "+utilityClass.readDataFromStringExcel(11, 2, "Sheet1"),true);
     }
  
  
  @AfterClass 
  public void closeBrowser()
     {
	  Reporter.log("Closing Browser",true);
	  driver.close();
     }
}
