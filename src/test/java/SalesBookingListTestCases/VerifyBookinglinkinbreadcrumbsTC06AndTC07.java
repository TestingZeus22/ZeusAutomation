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
	
	public class VerifyBookinglinkinbreadcrumbsTC06AndTC07 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
		bookingMaskPage BookingMask;
		
		@BeforeClass
		 	public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver);
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
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
	    		salesBookingList.clickOncreateButton();
	    		Reporter.log("Clicked on create button on sales booking list page");
	    		UtilityClass.implicitlyWaitInMillis(1000);
		}
	    		@Test   (priority=1)
	    		public void validateSalesbookinglinkinBreadcrumbs() throws IOException, InterruptedException {
                BookingMask.clickOnsalesBookingLink();
	    		Reporter.log("Clicked on sales booking link on Booking mask page");
	    		Thread.sleep(4000);	
	    		String ActualText = salesBookingList.getTextDashboard();
		  		String expectedText = UtilityClass.readDataFromStringExcel(16, 1, "Sheet4");
		  		Assert.assertEquals(ActualText, expectedText,"Test Case Failed as actual & expected messages are not matching");
		  		Reporter.log("Validating Actual Text in salesBooking list page is "+salesBookingList.getTextDashboard()+" and Expected text in the salesBooking list page is "+UtilityClass.readDataFromStringExcel(16, 1, "Sheet4"),true);
	    }
	    		
	    		@Test (priority=2)
	    		public void validateDashboardlinkinBreadcrumbs() throws IOException, InterruptedException {
	    		BookingMask.clickOndashboardLink();
	    		Reporter.log("Clicked on dashboard link on Booking mask page");
	    		Thread.sleep(4000);	
	    		String ActualText = dashboard.getActualTextOnDashboard();
		  		String expectedText = UtilityClass.readDataFromStringExcel(16, 1, "Sheet4");
		  		Assert.assertEquals(ActualText, expectedText,"Test Case Failed as actual & expected messages are not matching");
		  		Reporter.log("Validating Actual Text in Dashboard page is "+dashboard.getActualTextOnDashboard()+" and Expected text in the Dashboard page is "+UtilityClass.readDataFromStringExcel(16, 1, "Sheet4"),true);
	    		
	    		}
	    		@AfterMethod
	    	    public void Logout() throws InterruptedException
	    	    {
	    	      Thread.sleep(3500);
	    	      BookingMask.ClickOnLogoutButtonOFBookingMask();
	    		  Reporter.log("Clicking on Logout Button in Booking Mask page",true);
	    		  Thread.sleep(1000);
	    		  BookingMask.logoutClickOFBookingMask();
	    		  Reporter.log("Logout from Booking Mask Page",true);
	    	    }
	    	  
	    	   @AfterClass 
	    	   public void closeBrowser()
	    	    {
	    		 driver.close();
	    		 Reporter.log("Closing Browser",true);
	    	    }
	    	 
	    	 }
	
	
	
	


