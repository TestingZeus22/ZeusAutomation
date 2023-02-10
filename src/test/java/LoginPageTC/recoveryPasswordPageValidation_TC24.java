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

public class recoveryPasswordPageValidation_TC24 extends baseClass {
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
		utilityClass.implicitlyWaitInMillis(2000);	
	}
  
  @Test 
  public void ValidateCopyrightTextOnRecoveryPasswordTest() throws EncryptedDocumentException, IOException
  {
	  String ActualMsgCopyRight = email.getTextCopyright();
	  String expectedMsgCopyRight = utilityClass.readDataFromStringExcel(14, 2, "Sheet1");
	  Assert.assertEquals(ActualMsgCopyRight, expectedMsgCopyRight,"Test case Failed as expectedMsg and actualMsg are not matching");
	  Reporter.log("Validating actual Text"+email.getTextCopyright()+" and Expected Text "+utilityClass.readDataFromStringExcel(14, 2, "Sheet1"),true); 
  }
  
  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
