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
import POM.recoverPasswordPage;
import POM.loginPage;
import utility.UtilityClass;

public class recoveryPasswordPageValidation_TC24 extends BaseClass {
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
		UtilityClass.implicitlyWaitInMillis(2000);	
	}
  
  @Test 
  public void ValidateCopyrightTextOnRecoveryPasswordTest() throws EncryptedDocumentException, IOException
  {
	  String ActualMsgCopyRight = email.getTextCopyright();
	  String expectedMsgCopyRight = UtilityClass.readDataFromStringExcel(14, 2, "Sheet1");
	  Assert.assertEquals(ActualMsgCopyRight, expectedMsgCopyRight,"Test case Failed as expectedMsg and actualMsg are not matching");
	  Reporter.log("Validating actual Text"+email.getTextCopyright()+" and Expected Text "+UtilityClass.readDataFromStringExcel(14, 2, "Sheet1"),true); 
  }
  
  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
