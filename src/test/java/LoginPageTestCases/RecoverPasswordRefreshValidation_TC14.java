package LoginPageTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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

public class RecoverPasswordRefreshValidation_TC14 extends baseClass {
	loginPage login;
	File myFile;
	recoverPasswordPage email;
	
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		Reporter.log("Browser launch ",true);
		login=new loginPage(driver);
		email= new recoverPasswordPage(driver); 
	}

	@BeforeMethod
	public void loginToEmail() throws EncryptedDocumentException, IOException
	{
		login.ClickOnRecoverPassword();
		Reporter.log("Clicked on Recovery PasswordButton",true);
		email.sendUName(utilityClass.readDataFromStringExcel(8, 3, "Sheet1"));
		Reporter.log("Valid UserName Entered",true);
		driver.navigate().refresh();
		utilityClass.implicitlyWaitInMillis(1000);
	}
  
    @Test
    public void ValidUserNameEnterAndRefreshPageTest() throws EncryptedDocumentException, IOException
     {
	  String Actual_Url= driver.getCurrentUrl();
	  String expected_Url = utilityClass.readDataFromStringExcel(8, 2, "Sheet1");
	  Assert.assertEquals(Actual_Url, expected_Url,"Test case Failed as actual and Expected Url are not matching");    
	  Reporter.log("Validating actual "+driver.getCurrentUrl()+" and Expected Text "+utilityClass.readDataFromStringExcel(8, 2, "Sheet1"),true);	
     }
  
  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
