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

public class mofifyMultisalesLineBookingTC45TC46 extends BaseClass
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
	String ActualReser;
	
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
		bookingUpdate = new bookingUpdatePage(driver);
		allotment = new allotmentPage(driver);
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
	 @Test (priority=1) //TC-45
	 public void validateModifiedMultisalesBookingPrice() throws EncryptedDocumentException, IOException, InterruptedException {

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
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(331, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(332, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(333, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(334, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(335, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(336, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(337, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(338, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(339, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(340, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
           
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(333, 2, "Sheet5"));
    		Reporter.log("Send correct KOS2 in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(334, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(335, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(336, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(337, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(338, 2, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(339, 2, "Sheet5"));
    		Reporter.log("Send Travel from date to second line",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(340, 2, "Sheet5"));
    		Reporter.log("Send Travel To date to second line",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
     	    UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(342, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(343, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(344, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(345, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(346, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(347, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(348, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		UtilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
	        UtilityClass.implicitlyWaitInMillis(8000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(334, 1, "Sheet5"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(1000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInsec(80);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(334, 1, "Sheet5"));
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
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(331, 2, "Sheet5"));
	        
	        UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom1();
    		bookingUpdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(349, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelTo1();
    		bookingUpdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(350, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
     		
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom2();
    		bookingUpdate.sendTravelFrom2(UtilityClass.readDataFromStringExcel(349, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		bookingUpdate.clearTravelTo2();
    		bookingUpdate.sendTravelTo2(UtilityClass.readDataFromStringExcel(350, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true); 
	      
     		String ActualPriceRoom1 = BookingMask.getPriceFieldValue1("value");
			String expectedPriceRoom1 = UtilityClass.readDataFromStringExcel(351, 1, "Sheet5");
     		Assert.assertEquals(ActualPriceRoom1,expectedPriceRoom1, "TC failed as Actual Prices and expected prices are not matching ");
     		Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected price is "+UtilityClass.readDataFromStringExcel(351, 1, "Sheet5"),true);
     		
     		String ActualPriceRoom2 = BookingMask.getPriceFieldValue2("value");
     		String expectedPriceRoom2 = UtilityClass.readDataFromStringExcel(352, 2, "Sheet5");
     		Assert.assertEquals(ActualPriceRoom2,expectedPriceRoom2, "TC failed as Actual Prices and expected prices are not matching ");
     		Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue2("value")+" and Expected price is "+UtilityClass.readDataFromStringExcel(352, 2, "Sheet5"),true);
	 }
	 @Test (enabled=false) //TC-46
	 public void validateMultisalesBookingAllotment() throws EncryptedDocumentException, IOException, InterruptedException {

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
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(356, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(357, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(358, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(359, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(360, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(361, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(362, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(363, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(364, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(365, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
           
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(358, 2, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(359, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(360, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(361, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(362, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(363, 2, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(364, 2, "Sheet5"));
    		Reporter.log("Send Travel from date for second line",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(365, 2, "Sheet5"));
    		Reporter.log("Send Travel To date to second line",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
     	    UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(367, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(368, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(369, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(370, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(371, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(372, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(372, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		UtilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
	        UtilityClass.implicitlyWaitInMillis(8000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(359, 1, "Sheet5"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(1000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInsec(80);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(359, 1, "Sheet5"));
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
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(356, 2, "Sheet5"));
	        UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom1();
    		bookingUpdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(374, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelTo1();
    		bookingUpdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(375, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelFrom2();
    		bookingUpdate.sendTravelFrom2(UtilityClass.readDataFromStringExcel(374, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel from date",true);
    		bookingUpdate.clearTravelTo2();
    		bookingUpdate.sendTravelTo2(UtilityClass.readDataFromStringExcel(375, 2, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		
    		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true); 
     		Thread.sleep(1500);
            BookingMask.clickOndashboardLink();
            Reporter.log("Clicked on dashboardLink",true);
            Thread.sleep(9500);
            dashboard.clickOnpurchasebutton();
            Reporter.log("Clicked on purchase option",true);
    	    Thread.sleep(1000);
            dashboard.clickOnAccommodation();
            Reporter.log("Clicked on accommodation option in list",true);
            Thread.sleep(2000);
       	   
       		accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(359, 1, "Sheet5"));
       		Thread.sleep(4000);
       		accommdationList.clickOnEditRow1Column1();
       		Thread.sleep(1000);
       	
       		accommodationNew.clickOnAllotment();
       		Reporter.log("Clicked on Allotment ",true);
       		Thread.sleep(2000);
      
       		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(378, 1, "Sheet5"));
    	    Reporter.log("Send start date of season_E on allotment page",true);
    	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(379, 1, "Sheet5"));
    	    Reporter.log("Send end date of season_E on allotment page",true);
    	    Thread.sleep(1000);
    	    allotment.clickOnLoadAllotment();
    	    Reporter.log("Clicked on load allotment",true);
            Thread.sleep(1000);
            
    	    String ActualSoldAllot_E = allotment.getSoldAllotRoom1R4C4();
    	    System.out.println(ActualSoldAllot_E);
    	    String expectedSoldAllot_E = UtilityClass.readDataFromStringExcel(380, 1, "Sheet5");
    	    Assert.assertEquals(ActualSoldAllot_E, expectedSoldAllot_E,"Test Case Failed as actual & expected sold allotment number are not matching");
    	    Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_E+" and Expected sold allotment is "+UtilityClass.readDataFromStringExcel(380, 1, "Sheet5"),true);
    	    
    	    String ActualRemainingAllot_E = allotment.getRemainingAllotRoom1R4C4();
    	    String expectedRemainingAllot_E = UtilityClass.readDataFromStringExcel(381, 1, "Sheet5");
    	    Assert.assertEquals(ActualRemainingAllot_E, expectedRemainingAllot_E,"Test Case Failed as actual & expected remaining allotment are not matching");
    	    Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_E+" and Expected allotment is "+UtilityClass.readDataFromStringExcel(381, 1, "Sheet5"),true); 
    	    
    	    String ActualSoldAllot_E1 = allotment.getSoldAllotRoom2R4C4();
    	    String expectedSoldAllot_E1= UtilityClass.readDataFromStringExcel(380, 2, "Sheet5");
    	    Assert.assertEquals(ActualSoldAllot_E1, expectedSoldAllot_E1,"Test Case Failed as actual & expected sold allotment number are not matching");
    	    Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_E1+" and Expected sold allotment is "+UtilityClass.readDataFromStringExcel(380, 2, "Sheet5"),true);
    	    
    	    String ActualRemainingAllot_E1 = allotment.getRemainingAllotRoom2R4C4();
    	    String expectedRemainingAllot_E1 = UtilityClass.readDataFromStringExcel(381, 2, "Sheet5");
    	    Assert.assertEquals(ActualRemainingAllot_E1, expectedRemainingAllot_E1,"Test Case Failed as actual & expected remaining allotment are not matching");
    	    Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_E1+" and Expected allotment is "+UtilityClass.readDataFromStringExcel(381, 2, "Sheet5"),true); 
	 }
   
	    @AfterMethod
	    public void Logout() throws InterruptedException
	   {
       Thread.sleep(2000);
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












