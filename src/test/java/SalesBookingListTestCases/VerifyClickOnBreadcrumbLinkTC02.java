	package SalesBookingListTestCases;
	
	import java.io.File;
	import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import Base.BaseClass;
	import POM.bookingMaskPage;
	import POM.DashboardPage;
	import POM.loginPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import utility.UtilityClass;
	
	public class VerifyClickOnBreadcrumbLinkTC02 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
		bookingMaskPage BookingMask;
		String ActualDashboardAndSalesBookingList;
		
		@BeforeClass
		 	public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver);
			salesBookingList =new salesBookingListPage(driver);
		}
		
		@BeforeMethod
		public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException
		{
				login.SendUserName(UtilityClass.readDataFromStringExcel(5, 1, "Sheet2"));
				Reporter.log("Valid Username Entered",true);
				login.SendPassword(UtilityClass.readDataFromStringExcel(6, 1, "Sheet2"));
				Reporter.log("Valid Password Entered",true);
				login.ClickOnLoginToDashboard();
				Reporter.log("Clicked on Dashboard button",true);
				UtilityClass.implicitlyWaitInMillis(1000);
				UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", selectCompany.SelectDropDownList());
				Reporter.log("Select the Falk Tours AG from given list",true);
				UtilityClass.implicitlyWaitInMillis(1000);
				selectCompany.ClickOnProceedButton();
				Reporter.log("Clicked on proceed button",true);	
				Thread.sleep(9500); 
	    		dashboard.SalesClick();
	    		Reporter.log("Clicked on sales dropdown in Dashboard",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		dashboard.salesBookingClick();
	    		Reporter.log("Clicked on sales Booking in Dashboard",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		salesBookingList.clickOndashboard();
	    		Reporter.log("Clicked on dashboard link on sales booking list page");
	    		Thread.sleep(5000);	
		}
	    		@Test 
	    		public void ValidateBreadcrumbLink() throws IOException {
	  			String ActualText = dashboard.getActualTextOnDashboard();
	  			String expectedText = UtilityClass.readDataFromStringExcel(8, 1, "Sheet4");
	  			Assert.assertEquals(ActualText, expectedText,"Test Case Failed as actual & expected messages are not matching");
	  			Reporter.log("Validating Actual Text in dashboard page is "+dashboard.getActualTextOnDashboard()+" and Expected text in dashboard page is "+UtilityClass.readDataFromStringExcel(8, 1, "Sheet4"),true);
	    }
	    		
	   @AfterMethod
	   public void Logout() throws InterruptedException
	   {
	      Thread.sleep(3000);
	      salesBookingList.ClickOnLogoutButtonOfSalesBookingList();
		  Reporter.log("Clicking on Logout Button in Sales Booking",true);
		  Thread.sleep(500);
		  salesBookingList.logoutClickOfSalesBookingList();
		  Reporter.log("Logout from Sales Booking ",true);
	   }
	 
	  @AfterClass 
	  public void closeBrowser()
	   {
		 driver.close();
		 Reporter.log("Closing Browser",true);
	   }
	}
	
	
	
	

