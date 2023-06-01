	package SalesBookingListTestCases;
	
	import java.io.File;
	import java.io.IOException;
	
	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
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
	import POM.accommodationListPage;
	import POM.accommodationNewPage;
	import POM.calculationSettingPage;
	import POM.contractDetailsPage;
	import POM.loginPage;
	import POM.offerCalculationPage;
	import POM.offerDefinationPage;
	import POM.pricePage;
	import POM.roomDetailsPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import POM.tbmCodeMasterPage;
	import POM.tbmCodeNewCreatePage;
	import utility.UtilityClass;
	
	public class VerifyBookingStatusAfterBookingCancellationTC44 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
	    bookingMaskPage BookingMask;
		String BmStatus;
		String ActualStatus;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			UtilityClass.implicitlyWaitInMillis(1000);
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
	    	Thread.sleep(5000);
	    	UtilityClass.scrollByAxis(100, 0);
	    	salesBookingList.clickOncreateButton();
	    	Reporter.log("Clicked on create Button in sales Booking page",true);
	    	Thread.sleep(6000);
	    		
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    	Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    	Thread.sleep(1000);
	    	UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    	Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    	UtilityClass.scrollByAxis(0, 300);
	    	UtilityClass.implicitlyWaitInsec(30);
	    	BookingMask.ClearbookingActionfield();
	    	BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(37, 1, "Sheet4"));
	    	Reporter.log("Send booking action",true);
	    	UtilityClass.implicitlyWaitInMillis(1000);
	    	UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    	Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    	BookingMask.clearNoOfPax();
	    	UtilityClass.implicitlyWaitInMillis(1000);
	    	BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(38, 1, "Sheet4"));
	    	Reporter.log("Send number of passenger",true);
	    	UtilityClass.implicitlyWaitInsec(30);
	    	BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(39, 1, "Sheet4"));
	    	Reporter.log("Send correct KOS in input field",true);
	    	UtilityClass.implicitlyWaitInMillis(1000);
	    	BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(40, 1, "Sheet4"));
	    	Reporter.log("Send correct ProductCode in input field",true);
	    	UtilityClass.implicitlyWaitInMillis(1000);
	    	BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(41, 1, "Sheet4"));
	    	Reporter.log("Send roomcode in input field",true);
	    	BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(42, 1, "Sheet4"));
	    	Reporter.log("Send correct boardName",true);
	    	BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(43, 1, "Sheet4"));
	    	Reporter.log("Send Occupancy",true);
	    	BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(44, 1, "Sheet4"));
	    	Reporter.log("Send bookinglines ",true);
	    	BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(45, 1, "Sheet4"));
	    	Reporter.log("Send Travel from date",true);
	    	BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(46, 1, "Sheet4"));
	    	Reporter.log("Send Travel To date",true);
	    	driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    	Reporter.log("Select Number of passengers",true);
	        UtilityClass.scrollByAxis(0, 600);
	        Thread.sleep(1000);
	        UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
	        Thread.sleep(500);
			BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(3, 4, "Sheet4"));
		    UtilityClass.implicitlyWaitInsec(40);
			BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(4, 4, "Sheet4"));
		    UtilityClass.implicitlyWaitInsec(40);
			BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(5, 4, "Sheet4"));
		    UtilityClass.implicitlyWaitInsec(40);
			BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(6, 4, "Sheet4"));
		    UtilityClass.implicitlyWaitInsec(40);
			BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(7, 4, "Sheet4"));
		    UtilityClass.implicitlyWaitInsec(40);
			BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(8, 4, "Sheet4"));
		    UtilityClass.implicitlyWaitInsec(40);
			BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(9, 4, "Sheet4"));
			UtilityClass.scrollByAxis(0, 900);
			UtilityClass.implicitlyWaitInMillis(20000);
			UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    	Reporter.log("Click on SendBookingButton",true);
	        UtilityClass.implicitlyWaitInMillis(30000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
		    UtilityClass.implicitlyWaitInMillis(8000);
		    salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(40, 1, "Sheet4"));
		    Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		    UtilityClass.implicitlyWaitInsec(60);
		    salesBookingList.clickOnbookingListButton();
		    Reporter.log("Clicked on Booking listButton",true);
		    UtilityClass.implicitlyWaitInsec(60);
		    salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(40, 1, "Sheet4"));
		    Reporter.log("Send TBM code",true);
		    UtilityClass.implicitlyWaitInsec(50);
		    salesBookingList.clickOnbookingListButton();
		    Reporter.log("Clicked on Booking listButton",true);
		    UtilityClass.implicitlyWaitInMillis(10000);
		    salesBookingList.clickOneditBooking1();
		    Reporter.log("Clicked on edit Booking1");
		    BookingMask.ClearbookingActionfield();
		    BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(49, 1, "Sheet4"));
		    Reporter.log("Send Booking action",true);
		    UtilityClass.implicitlyWaitInsec(60);
		    UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    Reporter.log("Click on SendBookingButton",true);
	    	Thread.sleep(3000);
	    	String StatusOnBM = BookingMask.getStatus1("value");
		    BmStatus=StatusOnBM;
		    Thread.sleep(2000);
		    BookingMask.clickOnViewList();
		    Reporter.log("Clicked on viewList",true);
		    Thread.sleep(1000);
		    driver.navigate().refresh();
		    Thread.sleep(1000);
		}
		    @Test
		  	public void ValidateBookingStatus() throws EncryptedDocumentException, IOException, InterruptedException 
		     {
		     String expectedStatus=salesBookingList.getStatusRow9Col1();  
		     Assert.assertEquals(BmStatus, expectedStatus,"Test Case Failed as actual & expected status are not matching");
		     Reporter.log("Validating Actual Status "+BmStatus+" and Expected status is "+salesBookingList.getStatusRow9Col1(),true);
		     
		     }
		        
	        @AfterMethod
	        public void Logout() throws InterruptedException
	        {
	         Thread.sleep(3000);
	         BookingMask.ClickOnLogoutButtonOFBookingMask();
	         Reporter.log("Clicking on Logout Button in Booking Mask page",true);
	         Thread.sleep(500);
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

	
	
