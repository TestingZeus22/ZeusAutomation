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
import POM.recoverPasswordPage;
import POM.loginPage;
import utility.utilityClass;

public class RecoveryPasswordPageTextValidation_TC23 extends baseClass {
	loginPage login;
	recoverPasswordPage email;
	File myFile;
	
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		email= new recoverPasswordPage(driver); 
	}

	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login.ClickOnRecoverPassword();
		Reporter.log("Clicked on Recovery PasswordButton ",true);
		utilityClass.implicitlyWaitInMillis(1000);	
	}
	
  @Test 
  public void ValidateWelcomeTextOnRecoveryPageTest() throws EncryptedDocumentException, IOException
  {
	  String ActualMsgOfWelcome = email.getWelcomeFalkTourText();
	  String expectedMsgofWelcome = utilityClass.readDataFromStringExcel(12, 2, "Sheet1");
	  Assert.assertEquals(expectedMsgofWelcome, ActualMsgOfWelcome,"Test case Failed as expected and actual Text are not matching");
	  Reporter.log("Validating actual "+email.getWelcomeFalkTourText()+" and Expected Message "+utilityClass.readDataFromStringExcel(12, 2, "Sheet1"),true);
	  
	  String ActualMsgOfDataEnterMessage = email.getDataEnterMessage();
	  String expectedMsgOfDataEnterMessage = utilityClass.readDataFromStringExcel(13, 2, "Sheet1");
	  Assert.assertEquals(expectedMsgOfDataEnterMessage, ActualMsgOfDataEnterMessage,"Test case Failed as expected Text and actual Text are not matching");
	  Reporter.log("Validating actual "+email.getDataEnterMessage()+" and Expected Message "+utilityClass.readDataFromStringExcel(13, 2, "Sheet1"),true);
  }
  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
