package LoginPageTestCases;

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
import Base.BaseClass;
import POM.loginPage;
import utility.UtilityClass;

public class ValidateRecoverPwdLinkTC_20 extends BaseClass {
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
		UtilityClass.implicitlyWaitInMillis(100);	
	}
  
    @Test
    public void VerifyRecoverPwdIsLinkTest() throws EncryptedDocumentException, IOException
    {
	  String ActualLink = login.getRecoverPasswordLink();
	  String expectedLink =UtilityClass.readDataFromStringExcel(11, 2, "Sheet1");
	  Assert.assertEquals(ActualLink, expectedLink,"Test Case Failed as actual & expected Link are not matching");  
	  Reporter.log("Validating actual "+login.getRecoverPasswordLink()+" and Expected Text "+UtilityClass.readDataFromStringExcel(11, 2, "Sheet1"),true);
     }
  
  
  @AfterClass 
  public void closeBrowser()
     {
	  Reporter.log("Closing Browser",true);
	  driver.close();
     }
}
