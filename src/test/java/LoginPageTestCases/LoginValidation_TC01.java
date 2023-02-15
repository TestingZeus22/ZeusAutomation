package LoginPageTestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.baseClass;

import POM.loginPage;
import POM.selectCompanyPage;
import utility.utilityClass;

public class LoginValidation_TC01 extends baseClass
{
	loginPage login;
	selectCompanyPage select;
	File myFile;
	
	@BeforeClass
	public void launchBrowser()
	{
		openApplication();
		Reporter.log("Browser Launch",true);
		login=new loginPage(driver);
		select=new selectCompanyPage(driver);
	}

	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login.SendUserName(utilityClass.readDataFromStringExcel(1, 0, "Sheet1"));
		Reporter.log("Valid Username Entered",true);
		login.SendPassword(utilityClass.readDataFromStringExcel(1, 1, "Sheet1"));
		Reporter.log("Valid Password Entered",true);
		login.ClickOnLoginToDashboard();
		Reporter.log("Click on Dashboard button",true);
		utilityClass.implicitlyWaitInMillis(1000);
	}
  @Test
  public void ValidUserNameAndValidPasswordTest() throws EncryptedDocumentException, IOException
  {
	  String actualText = select.getActualText();
	  String expectedText = utilityClass.readDataFromStringExcel(1, 2,"Sheet1");
	  Assert.assertEquals(actualText, expectedText,"Test case Failed as actual & expected Text are not matching");
	  Reporter.log("Validating actual "+select.getActualText()+" and Expected Text "+utilityClass.readDataFromStringExcel(1, 2, "Sheet1"),true);
  }
  
  @AfterClass 
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
	  driver.close();
  }
}
