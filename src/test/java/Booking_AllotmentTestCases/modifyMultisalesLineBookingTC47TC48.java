package Booking_AllotmentTestCases;

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
import POM.bookingUpdatePage;
import POM.DashboardPage;
import POM.accommodationListPage;
import POM.accommodationNewPage;
import POM.allotmentPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class modifyMultisalesLineBookingTC47TC48 extends BaseClass
{
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
    bookingMaskPage BookingMask;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	bookingUpdatePage bookingUpdate;
	allotmentPage allotment;
	String ActualPriceRoom1;
	String ActualPriceRoom2;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		UtilityClass.implicitlyWaitInMillis(3000);
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver); 
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
		accommdationList =new accommodationListPage(driver);	
		accommodationNew =new accommodationNewPage(driver);
		allotment = new allotmentPage(driver);
		bookingUpdate = new bookingUpdatePage(driver);
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
	}
	
	 @Test  (priority=1)// TC_47
	 public void validateMultisalesLineBookingWhenNoAllotment() throws EncryptedDocumentException, IOException, InterruptedException {

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
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(385, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(386, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(387, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(388, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(389, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(390, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(391, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(392, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(393, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(394, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(387, 2, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(388, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(389, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(390, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(391, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(392, 2, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(393, 2, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(394, 2, "Sheet5"));
    		Reporter.log("Send Travel To date ",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(396, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(397, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(398, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(399, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(400, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(401, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(402, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true); 
     		Thread.sleep(2000);
     		UtilityClass.scrollByAxis(0, -400);
     		UtilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
	        UtilityClass.implicitlyWaitInMillis(8000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(388, 1, "Sheet5"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(1000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInsec(80);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(388, 1, "Sheet5"));
	        Reporter.log("Send TBM code",true);
	        Thread.sleep(14000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInMillis(10000);
	        UtilityClass.scrollByAxis(0, -400);
	        salesBookingList.clickOneditBooking1();
	        Reporter.log("Clicked on edit booking1",true);
	        UtilityClass.implicitlyWaitInMillis(40000);
            BookingMask.ClearbookingActionfield();
            UtilityClass.implicitlyWaitInMillis(40000);
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(385, 2, "Sheet5"));
	        UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom1();
    		bookingUpdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(403, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelTo1();
    		bookingUpdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(404, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom2();
    		bookingUpdate.sendTravelFrom2(UtilityClass.readDataFromStringExcel(403, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		bookingUpdate.clearTravelTo2();
    		bookingUpdate.sendTravelTo2(UtilityClass.readDataFromStringExcel(404, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		Thread.sleep(1000);
     		
     		String ActualErrorMsg = BookingMask.getInvalidTravelDurationMsg();
     		String expectedErroMsg = UtilityClass.readDataFromStringExcel(405, 1, "Sheet5");
     	    Assert.assertEquals(ActualErrorMsg,expectedErroMsg, "TC failed as Actual message and expected message are not matching ");
     	    Reporter.log("Validating Actual Message for season-E is "+BookingMask.getInvalidTravelDurationMsg()+" and Expected Message for season-E is "+UtilityClass.readDataFromStringExcel(405, 1, "Sheet5"),true);  
	 }
	 @Test  (enabled=false)// TC_48
	 public void validateMultisalesLineBookingWhenOneRoomHasAllotment() throws EncryptedDocumentException, IOException, InterruptedException {

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
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(409, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(410, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(411, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(412, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(413, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(414, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(415, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(416, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(417, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(418, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
            
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(411, 2, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(412, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(413, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(414, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(415, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(416, 2, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(417, 2, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(418, 2, "Sheet5"));
    		Reporter.log("Send Travel To date ",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(420, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(421, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(422, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(423, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(424, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(425, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(426, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true); 
     		Thread.sleep(2000);
     		UtilityClass.scrollByAxis(0, -400);
     		UtilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
	        UtilityClass.implicitlyWaitInMillis(8000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(412, 1, "Sheet5"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(1000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInsec(80);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(412, 1, "Sheet5"));
	        Reporter.log("Send TBM code",true);
	        Thread.sleep(14000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInMillis(10000);
	        UtilityClass.scrollByAxis(0, -400);
	        salesBookingList.clickOneditBooking1();
	        Reporter.log("Clicked on edit booking1",true);
	        UtilityClass.implicitlyWaitInMillis(40000);
            BookingMask.ClearbookingActionfield();
            UtilityClass.implicitlyWaitInMillis(40000);
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(409, 2, "Sheet5"));
	        UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom1();
    		bookingUpdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(427, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelTo1();
    		bookingUpdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(428, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom2();
    		bookingUpdate.sendTravelFrom2(UtilityClass.readDataFromStringExcel(427, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		bookingUpdate.clearTravelTo2();
    		bookingUpdate.sendTravelTo2(UtilityClass.readDataFromStringExcel(428, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true); 
     		
     		String ActualErrorMsg = BookingMask.getInvalidTravelDurationMsg();
     		String expectedErroMsg = UtilityClass.readDataFromStringExcel(429, 1, "Sheet5");
     	    Assert.assertEquals(ActualErrorMsg,expectedErroMsg, "TC failed as Actual message and expected message are not matching ");
     	    Reporter.log("Validating Actual Message for season-E is "+BookingMask.getInvalidTravelDurationMsg()+" and Expected Message for season-E is "+UtilityClass.readDataFromStringExcel(429, 1, "Sheet5"),true); 
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













