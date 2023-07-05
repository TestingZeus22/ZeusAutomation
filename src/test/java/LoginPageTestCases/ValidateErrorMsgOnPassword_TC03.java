package LoginPageTestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base.BaseClass;
import POM.loginPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

@Listeners ()
	public class ValidateErrorMsgOnPassword_TC03 extends BaseClass {
		loginPage login;
		File myFile;
		
		@BeforeClass
		public void launchBrowser()
		{
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
		}

		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException
		{
			UtilityClass.implicitlyWaitInMillis(1000);
			login.SendUserName(UtilityClass.readDataFromStringExcel(3, 0, "Sheet1"));
			Reporter.log("Valid Username Entered ",true);
			UtilityClass.screenshot(driver, "10");
			login.SendPassword(UtilityClass.readDataFromStringExcel(3, 1, "Sheet1"));
			Reporter.log("Invalid Password Entered",true);
			UtilityClass.screenshot(driver, "11");
			UtilityClass.implicitlyWaitInMillis(1000);	
			login.ClickOnLoginToDashboard();
			Reporter.log("Click on Dashboard button ",true);
			UtilityClass.screenshot(driver, "12");
			UtilityClass.implicitlyWaitInMillis(1000);
			UtilityClass.screenshot(driver, "13");
		}
	  
	 @Test 
	  public void CheckIncorrectCredentialsOnPasswordFieldTest() throws EncryptedDocumentException, IOException
	  
	  {
		 String Actual_Msg = login.getCredentialsInvalidTextOnPasswordField();
		 String expected_Msg = UtilityClass.readDataFromStringExcel(3, 2, "Sheet1");
		 Assert.assertEquals(Actual_Msg, expected_Msg,"Test case Failed as actual & expected Credential message are not matching");
		 Reporter.log("Validating actual "+login.getCredentialsInvalidTextOnPasswordField()+" and Expected Text "+UtilityClass.readDataFromStringExcel(3, 2, "Sheet1"),true);
		 UtilityClass.screenshot(driver, "14");
		 UtilityClass.implicitlyWaitInsec(80);
		 driver.findElement(By.xpath("//button[text()='Ok']")).click();
		 UtilityClass.screenshot(driver, "15");
	  }

	  @AfterClass 
	  public void closeBrowser()
	  {
		  Reporter.log("Closing Browser",true);
		  driver.quit();
		  
	  }
	}
