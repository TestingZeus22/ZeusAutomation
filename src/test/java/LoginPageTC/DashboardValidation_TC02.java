package LoginPageTC;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseClass;
import POM.DashboardPage;
import POM.loginPage;
import POM.selectCompanyPage;
import utility.utilityClass;

public class DashboardValidation_TC02 extends baseClass {
		
		loginPage login;
		DashboardPage dash;
		selectCompanyPage selectCompany;
		File myFile;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			dash = new DashboardPage(driver);
			selectCompany = new selectCompanyPage(driver);
		}
		
		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException
		{
			login.SendUserName(utilityClass.readDataFromStringExcel(2, 0, "Sheet1"));
			Reporter.log("Valid Username Entered",true);
			login.SendPassword(utilityClass.readDataFromStringExcel(2, 1, "Sheet1"));
			Reporter.log("Valid Password Entered",true);
			login.ClickOnLoginToDashboard();
			Reporter.log("Clicked on Dashboard button",true);
			utilityClass.implicitlyWaitInMillis(1000);
			utilityClass.listBoxHandlingUsingByText("Falk Tours AG", selectCompany.SelectDropDownList());
			Reporter.log("Select the Falk Tours DE GmbH from given list",true);
			utilityClass.implicitlyWaitInMillis(1000);
			selectCompany.ClickOnProceedButton();
			Reporter.log("Clicked on proceed button",true);	
		}
		
	  @Test
	  public void ValidUserNameAndValidPasswordEnterToDashboardPageTest() throws EncryptedDocumentException, IOException
	  {
		  String ActualTtext= dash.getActualTextOnDashboard();
		  String expectedText = utilityClass.readDataFromStringExcel(2, 2, "Sheet1");
		  Assert.assertEquals(expectedText, ActualTtext,"Test case Failed as Actual and expected Text are not matching");
		  Reporter.log("Validating actual Text "+dash.getActualTextOnDashboard()+" and Expected Text "+utilityClass.readDataFromStringExcel(2, 2, "Sheet1"),true);
	  }
	  
	  @AfterMethod
	  public void Logout() throws InterruptedException
	  {
		  dash.ClickOnLogoutButton();
		  Reporter.log("Clicking on Logout Button in Dashboard page",true);
		  utilityClass.implicitlyWaitInMillis(1000);
		  dash.logoutClick();
		  Reporter.log("Logout from Dashboard Page",true);
	  }
	  
	  @AfterClass 
	  public void closeBrowser()
	  {
		 driver.close();
		 Reporter.log("Closing Browser",true);
	  }
	}


