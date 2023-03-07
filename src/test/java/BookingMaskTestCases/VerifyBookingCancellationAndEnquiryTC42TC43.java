package BookingMaskTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseClass;
import POM.BookingUpdatePage;
import POM.DashboardPage;
import POM.bookingMaskPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class VerifyBookingCancellationAndEnquiryTC42TC43 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
		bookingMaskPage BookingMask;
		BookingUpdatePage bookingupdate;
		String ActualReser;
		String ActualPrices;
		String ExpectedReservationNo;
		String ActualCancellationFees;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver);
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
			bookingupdate = new BookingUpdatePage(driver);
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
    		Thread.sleep(6000);
    		UtilityClass.scrollByAxis(100, 0);
    		salesBookingList.clickOncreateButton();
    		Reporter.log("Clicked on create Button in sales Booking page",true);
    		Thread.sleep(6000);
		}
    	     @Test (priority=1)
	         public void validateCancellationPricesWithSA() throws EncryptedDocumentException, IOException, InterruptedException {
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("HK002 - (code)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK002 - (code) from dropdown list",true);
	    		Thread.sleep(1000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(932, 3, "Sheet2"));
	    		Reporter.log("Send Booking action");
	    		
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(933, 3, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(934, 3, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		Thread.sleep(1000);
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(935, 3, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInsec(10);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(936, 3, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(937, 3, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(938, 3, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(939, 3, "Sheet2"));
	    		Reporter.log("Send TotalPax ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(940, 3, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(941, 3, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
	            Thread.sleep(200);
				BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
				Thread.sleep(200);
				BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
				Thread.sleep(200);
				BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
				Thread.sleep(100);
				BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
				Thread.sleep(100);
				BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
				Thread.sleep(100);
				BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
				Thread.sleep(100);
				BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
				UtilityClass.implicitlyWaitInMillis(12000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    	Reporter.log("Click on SendBookingButton",true);
		    	Thread.sleep(4000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(935, 3, "Sheet2"));
		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(935, 3, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(8000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        UtilityClass.implicitlyWaitInMillis(10000);
		        UtilityClass.scrollByAxis(0, -400);
		        salesBookingList.clickOneditBooking1();
		        Reporter.log("Clicked on edit booking1",true);
		        UtilityClass.implicitlyWaitInMillis(30000);
				UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(20000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Clicked on SendBookingButton",true);
	            UtilityClass.scrollByAxis(0, -500);
	            Thread.sleep(3000);
	            BookingMask.ClearbookingActionfield();
	            Thread.sleep(500);
	            BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(944, 3, "Sheet2"));
	            Reporter.log("Send Modified booking action");
	            UtilityClass.implicitlyWaitInMillis(5000);
	            UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Clicked on SendBookingButton after entering SA action code",true);
	    		Thread.sleep(4000);
	    		String ActualPrice = BookingMask.getPriceFieldValue1("value");
		        ActualPrices=ActualPrice;
		        Thread.sleep(500);
		        String cancellationFees =BookingMask.getCancellationFees("value");
		        ActualCancellationFees=cancellationFees;
		        Thread.sleep(2000);
	    		String ResNo=BookingMask.getReservationNoBM("value");
		        String ResVer=BookingMask.getReservationVerNoBM("value");
		        String ActualReservNo= ResNo + ("/"+ResVer);
		        ActualReser=ActualReservNo;
		        Thread.sleep(1000);
	    		BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(935, 3, "Sheet2"));
		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
	    		
	    		String expectedPrice = UtilityClass.readDataFromStringExcel(943, 3, "Sheet2");
	    		Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	    		Reporter.log("Validating Actual Price with excluding Cancellation charges is "+ActualPrices+" and Expected Price excluding Cancellation charges is "+UtilityClass.readDataFromStringExcel(943, 3, "Sheet2"),true);
	    		 
	    		String expectedCancellationFees = UtilityClass.readDataFromStringExcel(945, 3, "Sheet2");
	    		Assert.assertEquals(ActualCancellationFees, expectedCancellationFees,"Test Case Failed as actual & expected Cancellation charges are not matching");
	    		Reporter.log("Validating Actual Cancellation charges with 50% is "+ActualCancellationFees+" and Expected Cancelation Charges with 50% is "+UtilityClass.readDataFromStringExcel(945, 3, "Sheet2"),true);
	    		 
	 			Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
	 			Reporter.log("Validating Actual ReservationNo "+ActualReser+" and Expected ReservationNo is "+ExpectedReservationNo,true);
		        }
	    		
	    		@Test (priority = 2)
	    		public void validateCancellationPricesWithS() throws EncryptedDocumentException, IOException, InterruptedException {
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("HK002 - (code)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK002 - (code) from dropdown list",true);
	    		Thread.sleep(1000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(932, 4, "Sheet2"));
	    		Reporter.log("Send Booking action");
	    		
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(933, 4, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(934, 4, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(935, 4, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(936, 4, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(937, 4, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(938, 4, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(939, 4, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(940, 4, "Sheet2"));
	    		Reporter.log("Send Travel from dates",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(941, 4, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
	            Thread.sleep(500);
				BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
				UtilityClass.implicitlyWaitInMillis(12000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    	Reporter.log("Click on sendBookingButton",true);
		    	Thread.sleep(4000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(935, 4, "Sheet2"));
		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(935, 4, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(8000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        UtilityClass.implicitlyWaitInMillis(10000);
		        UtilityClass.scrollByAxis(0, -400);
		        salesBookingList.clickOneditBooking1();
		        Reporter.log("Clicked on edit booking1",true);
		        UtilityClass.implicitlyWaitInMillis(30000);
				UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(20000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on SendBookingButton",true);
	            UtilityClass.scrollByAxis(0, -500);
	            Thread.sleep(3000);
	            BookingMask.ClearbookingActionfield();
	            Thread.sleep(500);
	            BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(944, 4, "Sheet2"));
	            Reporter.log("Send Modified booking action");
	            UtilityClass.implicitlyWaitInMillis(5000);
	            UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton after entering SA action code",true);
	    		Thread.sleep(4000);
	    		String ActualPrice = BookingMask.getPriceFieldValue1("value");
		        ActualPrices=ActualPrice;
		        Thread.sleep(500);
		        String cancellationFees =BookingMask.getCancellationFees("value");
		        ActualCancellationFees=cancellationFees;
		        Thread.sleep(2000);
	    		String ResNo=BookingMask.getReservationNoBM("value");
		        String ResVer=BookingMask.getReservationVerNoBM("value");
		        String ActualReservNo= ResNo + ("/"+ResVer);
		        ActualReser=ActualReservNo;
		        Thread.sleep(1000);
	    		BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(935, 4, "Sheet2"));
		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
	    		
		    	String expectedPrice = UtilityClass.readDataFromStringExcel(943, 4, "Sheet2");
		    	Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		    	Reporter.log("Validating Actual Price with excluding Cancellation charges is "+ActualPrices+" and Expected Price excluding Cancellation charges is "+UtilityClass.readDataFromStringExcel(943, 4, "Sheet2"),true);
		    	
		    	String expectedCancellationFees = UtilityClass.readDataFromStringExcel(945, 4, "Sheet2");
	    		Assert.assertEquals(ActualCancellationFees, expectedCancellationFees,"Test Case Failed as actual & expected Cancellation charges are not matching");
	    		Reporter.log("Validating Actual Cancellation charges with 50% is "+ActualCancellationFees+" and Expected Cancelation Charges with 50% is "+UtilityClass.readDataFromStringExcel(945, 4, "Sheet2"),true);
		    	
		 		Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
		 		Reporter.log("Validating Actual ReservationNo "+ActualReser+" and Expected ReservationNo is "+ExpectedReservationNo,true);
			        
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
