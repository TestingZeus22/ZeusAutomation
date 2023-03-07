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
import POM.recoverPasswordPage;
import POM.loginPage;
import utility.UtilityClass;

public class RecoverPasswordAndBackToLoginVaidation_TC09 extends BaseClass {
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
		login.ClickOnRecoverPassword();
		Reporter.log("Clicked on Recovery PasswordButton ",true);
		UtilityClass.implicitlyWaitInMillis(1000);
		driver.navigate().back();
		UtilityClass.implicitlyWaitInMillis(1000);
	}
  
  @Test
  public void RecoverPasswordAndGoBackToLoginTest() throws EncryptedDocumentException, IOException
  {
	 String expectedText=login.getCopyrightZeusText();
	 String actualText = UtilityClass.readDataFromStringExcel(6, 2, "Sheet1");
	 Assert.assertEquals(actualText, expectedText,"Test case Failed as actual & expected Message are not matching"); 
	 Reporter.log("Validating actual "+login.getCopyrightZeusText()+" and Expected Text "+UtilityClass.readDataFromStringExcel(6, 2, "Sheet1"),true);
  }

  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
