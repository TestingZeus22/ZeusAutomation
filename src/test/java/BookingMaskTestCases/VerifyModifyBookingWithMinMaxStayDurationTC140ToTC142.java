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
import POM.bookingUpdatePage;
import POM.DashboardPage;
import POM.bookingMaskPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class VerifyModifyBookingWithMinMaxStayDurationTC140ToTC142 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	bookingUpdatePage bookingupdate;
	String ActualReser;
	String ExpectedReservationNo;
	String ActualPrices;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver);
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
		bookingupdate=new bookingUpdatePage(driver);
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
	    @Test 
	    public void validateBookingToLessthanMinStay() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		Thread.sleep(1000);
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(1000);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(571, 1, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(572, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(573, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(574, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(575, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(576, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(577, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(578, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(579, 1, "Sheet2"));
    		Reporter.log("Send Travel from date for Season-G",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(580, 1, "Sheet2"));
    		Reporter.log("Send Travel To date for Season-G",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            UtilityClass.implicitlyWaitInsec(30);
            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
            UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
			UtilityClass.scrollByAxis(0, 900);
			UtilityClass.implicitlyWaitInMillis(25000);
			UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on sendBookingButton after U action code",true);
            UtilityClass.implicitlyWaitInMillis(40000);
            BookingMask.ClearbookingActionfield();
            UtilityClass.implicitlyWaitInMillis(40000);
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(582, 1, "Sheet2"));
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingupdate.clearTravelFrom1();
    		bookingupdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(579, 1, "Sheet2"));
    		Reporter.log("Send Modified Travel from date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingupdate.clearTravelTo1();
    		bookingupdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(583, 1, "Sheet2"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.scrollByAxis(0, 900);
			UtilityClass.implicitlyWaitInMillis(25000);
			UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on sendBookingButton after U action code",true);
            Thread.sleep(6000);
            String ActualMessage = BookingMask.getStayExceedErrorMessage();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(586, 1, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(586, 1, "Sheet2"),true);
	    }
	    
	    @Test 
	    public void validateBookingToMorethanMaxStay() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		Thread.sleep(1000);
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		UtilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 804 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(571, 2, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(572, 2, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(573, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(574, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(575, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(576, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(577, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(578, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(579, 2, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(580, 2, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
    		UtilityClass.implicitlyWaitInMillis(2000);
            
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInMillis(20000);
			UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on sendBookingButton after U action code",true);
            UtilityClass.implicitlyWaitInMillis(40000);
            BookingMask.ClearbookingActionfield();
            UtilityClass.implicitlyWaitInMillis(40000);
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(582, 2, "Sheet2"));
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingupdate.clearTravelFrom1();
    		bookingupdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(579, 2, "Sheet2"));
    		Reporter.log("Send Modified Travel from date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingupdate.clearTravelTo1();
    		bookingupdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(583, 2, "Sheet2"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.scrollByAxis(0, 900);
			UtilityClass.implicitlyWaitInMillis(25000);
			UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on sendBookingButton after U action code",true);
			Thread.sleep(6000);
            String ActualMessage = BookingMask.getStayExceedErrorMessage();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(586, 2, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(586, 2, "Sheet2"),true);
	    }
	    
	    @Test 
	    public void validateBookingWithVaildStay() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		Thread.sleep(1000);
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		UtilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 804 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(571, 3, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(572, 3, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(573, 3, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(574, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(575, 3, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(576, 3, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(577, 3, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(578, 3, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(579, 3, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(580, 3, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.implicitlyWaitInMillis(2000);
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
    		UtilityClass.implicitlyWaitInMillis(2000);
    		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on sendBookingButton after U action code",true);
    		UtilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
	        UtilityClass.implicitlyWaitInMillis(8000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(574, 3, "Sheet2"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(2000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        Thread.sleep(22000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(574, 3, "Sheet2"));
	        Reporter.log("Send TBM code",true);
	        Thread.sleep(8000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInMillis(10000);
	        UtilityClass.scrollByAxis(0, -400);
	        salesBookingList.clickOneditBooking1();
	        Reporter.log("Clicked on Edit booking1",true);
	        UtilityClass.implicitlyWaitInMillis(30000);
	        UtilityClass.scrollByAxis(0, -500);
	        BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(582, 3, "Sheet2"));
    		Reporter.log("Change booking action to U",true);
    	    Thread.sleep(1000);
    	    UtilityClass.implicitlyWaitInMillis(20000);
    		bookingupdate.clearTravelFrom1();
    		bookingupdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(579, 3, "Sheet2"));
    		Reporter.log("Send Modified Travel from date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingupdate.clearTravelTo1();
    		bookingupdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(583, 3, "Sheet2"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.scrollByAxis(0, 900);
			UtilityClass.implicitlyWaitInMillis(30000);
			UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on sendBookingButton after U action code",true);
			String ActualPrice = bookingupdate.getPriceFieldValue1("value");
            ActualPrices=ActualPrice;
            UtilityClass.implicitlyWaitInMillis(30000);
	        String ResNo=BookingMask.getReservationNoBM("value");
	        String ResVer=BookingMask.getReservationVerNoBM("value");
	        String ActualReservNo= ResNo + ("/"+ResVer);
	        ActualReser=ActualReservNo;
	        System.out.println(ActualReservNo);
	        Thread.sleep(2000);
	        UtilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
	        UtilityClass.implicitlyWaitInMillis(8000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(574, 3, "Sheet2"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(22000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(574, 3, "Sheet2"));
	        Reporter.log("Send TBM code",true);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        Thread.sleep(8000);
            
		     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
		     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
			 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
            
            String expectedPrice = UtilityClass.readDataFromStringExcel(586, 3, "Sheet2");
            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(586, 3, "Sheet2"),true);
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




