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
	
	public class VerifyBookingTC09AndTC10 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
	    bookingMaskPage BookingMask;
	    String price;
		String SalesBookingNo;
		String ActualReser;
		
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
		}
	    		
	    	@Test (priority = 1)  //TC-09
	  	    public void ValidateBooking1() throws EncryptedDocumentException, IOException, InterruptedException {
	    		
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(2000);
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(20, 2, "Sheet4"));
	    		Reporter.log("Send booking action",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(21, 2, "Sheet4"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(22, 2, "Sheet4"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(23, 2, "Sheet4"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(24, 2, "Sheet4"));
	    		Reporter.log("Send roomcode in input field",true);
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(25, 2, "Sheet4"));
	    		Reporter.log("Send correct boardName",true);
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(26, 2, "Sheet4"));
	    		Reporter.log("Send Occupancy",true);
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(27, 2, "Sheet4"));
	    		Reporter.log("Send bookinglines ",true);
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(28, 2, "Sheet4"));
	    		Reporter.log("Send Travel from date",true);
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(29, 2, "Sheet4"));
	    		Reporter.log("Send Travel To date",true);
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passengers",true);
	            UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
	            UtilityClass.implicitlyWaitInsec(40);
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
	            String ActualPrice = BookingMask.getPriceFieldValue1("value");
	            price = ActualPrice;
	            String ResNo=BookingMask.getReservationNoBM("value");
	            String ResVer=BookingMask.getReservationVerNoBM("value");
	            String ActualReservNo= ResNo + ("/"+ResVer);
	            ActualReser=ActualReservNo;
	            UtilityClass.implicitlyWaitInMillis(12000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 2, "Sheet4"));
		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 2, "Sheet4"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(8000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        UtilityClass.implicitlyWaitInMillis(10000);
		 
		        String expectedPrice = UtilityClass.readDataFromStringExcel(31, 2, "Sheet4");
		        Assert.assertEquals(price, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		        Reporter.log("Validating Actual price is "+price+" and Expected Price is "+UtilityClass.readDataFromStringExcel(31, 2, "Sheet4"),true);
		        String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
		        Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
		        Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
	   }
	    
	    	@Test (priority = 2)  //TC-10
	  	    public void ValidateBooking2() throws EncryptedDocumentException, IOException, InterruptedException {
	    		
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(20, 3, "Sheet4"));
	    		Reporter.log("Send booking action",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(21, 3, "Sheet4"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(22, 3, "Sheet4"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(23, 3, "Sheet4"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(24, 3, "Sheet4"));
	    		Reporter.log("Send roomcode in input field",true);
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(25, 3, "Sheet4"));
	    		Reporter.log("Send correct boardName",true);
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(26, 3, "Sheet4"));
	    		Reporter.log("Send Occupancy",true);
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(27, 3, "Sheet4"));
	    		Reporter.log("Send bookinglines ",true);
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(28, 3, "Sheet4"));
	    		Reporter.log("Send Travel from date",true);
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(29, 3, "Sheet4"));
	    		Reporter.log("Send Travel To date",true);
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passengers",true);
	            UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
	            UtilityClass.implicitlyWaitInsec(40);
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
	            String ActualPrice = BookingMask.getPriceFieldValue1("value");
	            price = ActualPrice;
	            String ResNo=BookingMask.getReservationNoBM("value");
	            String ResVer=BookingMask.getReservationVerNoBM("value");
	            String ActualReservNo= ResNo + ("/"+ResVer);
	            ActualReser=ActualReservNo;
	            UtilityClass.implicitlyWaitInMillis(12000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 3, "Sheet4"));
		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 3, "Sheet4"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(8000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        UtilityClass.implicitlyWaitInMillis(10000);
	
		        String expectedPrice = UtilityClass.readDataFromStringExcel(31, 3, "Sheet4");
		        Assert.assertEquals(price, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		        Reporter.log("Validating Actual price is "+price+" and Expected Price is "+UtilityClass.readDataFromStringExcel(31, 3, "Sheet4"),true);
		        String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
		        Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
		        Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
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
	
	
