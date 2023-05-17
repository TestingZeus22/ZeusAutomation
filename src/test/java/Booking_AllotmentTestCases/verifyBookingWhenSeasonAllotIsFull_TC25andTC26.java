package Booking_AllotmentTestCases;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import POM.ChangeAllotmentPage;
import POM.DashboardPage;
import POM.accommodationGeneratedPage;
import POM.accommodationListPage;
import POM.accommodationNewPage;
import POM.allotmentPage;
import POM.bookingMaskPage;
import POM.calculationSettingPage;
import POM.contractDetailsPage;
import POM.contractsPage;
import POM.loginPage;
import POM.offerCalculationPage;
import POM.offerDefinationPage;
import POM.pricePage;
import POM.roomDetailsPage;
import POM.roomsPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import POM.tbmCodeMasterPage;
import POM.tbmCodeNewCreatePage;
import utility.UtilityClass;

public class verifyBookingWhenSeasonAllotIsFull_TC25andTC26 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	offerCalculationPage offerCalculation;    
	calculationSettingPage calculationSetting; 
	offerDefinationPage offerdefination;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	roomDetailsPage roomDetails;
	contractDetailsPage contractDetail;
	contractsPage contracts;
	ChangeAllotmentPage ChangeAllotment;
	pricePage price;
	roomsPage room;
	allotmentPage allotment;
	String Allot_Hinitial;
	String ActualMessage;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		UtilityClass.implicitlyWaitInMillis(3000);
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver);
		offerCalculation = new offerCalculationPage(driver);  
		calculationSetting =new calculationSettingPage(driver); 
		offerdefination = new offerDefinationPage(driver); 
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
		accommdationList =new accommodationListPage(driver);
		accommodationNew =new accommodationNewPage(driver);
		roomDetails =new roomDetailsPage(driver);
		contractDetail =new contractDetailsPage(driver);
		contracts =new contractsPage(driver);
		price = new pricePage(driver);
		room = new roomsPage(driver);
		allotment = new allotmentPage(driver);
		ChangeAllotment = new ChangeAllotmentPage(driver);
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
        dashboard.clickOnpurchasebutton();
        Reporter.log("Clicked on purchase option",true);
		Thread.sleep(1000);
        dashboard.clickOnAccommodation();
        Reporter.log("Clicked on accommodation option in list",true);
        Thread.sleep(2000);  
    	accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
    	Thread.sleep(4000);
    	accommdationList.clickOnEditRow1Column1();
    	Thread.sleep(1000);  
    	accommodationNew.clickOnAllotment();
    	Reporter.log("Clicked on Allotment ",true);
    	Thread.sleep(2000);
	}

	@Test (priority=1) //TC_25
	public void validateBookingInquiryWhenSeasonAllotIsFull() throws EncryptedDocumentException, IOException, InterruptedException {
	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(159, 1, "Sheet5"));
	    Reporter.log("Send start date of season_F on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(160, 1, "Sheet5"));
	    Reporter.log("Send end date of season_F on allotment page",true);
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
 	    Thread.sleep(1000);
 	    String initialAllot_H = allotment.getInitialAllotRoom1R1C1();
 	    Allot_Hinitial=initialAllot_H;
 		Thread.sleep(2000);
 		allotment.clickOnDashboardLink();
 		Reporter.log("Clicked on dashboardLink",true);
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
 		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
 		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
 		Thread.sleep(1000);
 		UtilityClass.scrollByAxis(0, 300);
 		Thread.sleep(1000);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
 		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.ClearbookingActionfield();
 		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(162, 1, "Sheet5"));
 		Reporter.log("Send Booking action",true);
 		BookingMask.clearNoOfPax();
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(163, 1, "Sheet5"));
 		Reporter.log("Send number of passenger",true);
 		Thread.sleep(1000);
 		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(164, 1, "Sheet5"));
 		Reporter.log("Send correct KOS in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(165, 1, "Sheet5"));
 		Reporter.log("Send correct ProductCode in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(166, 1, "Sheet5"));
 		Reporter.log("Send roomcode in input field",true);
 		
 		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(167, 1, "Sheet5"));
 		Reporter.log("Send correct boardName",true);
 		
 		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(168, 1, "Sheet5"));
 		Reporter.log("Send Occupancy",true);

 		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(169, 1, "Sheet5"));
 		Reporter.log("Send bookinglines ",true);
 		
 		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(170, 1, "Sheet5"));
 		Reporter.log("Send Travel from date for season-H",true);
 		
 		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(171, 1, "Sheet5"));
 		Reporter.log("Send Travel To date for season-H",true);
 		
 		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
 		Reporter.log("Send Number of passenger",true);
 		UtilityClass.implicitlyWaitInMillis(2000);
        BookingMask.clickOnSendbookingButton();
        Reporter.log("Clicked on sendbookingButton",true);
        UtilityClass.scrollByAxis(0, 600);
        Thread.sleep(2000);
        String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
        System.out.println("Message on BM PAGE IS "+ActualMessage);
 	    Thread.sleep(1000);
 	    UtilityClass.scrollByAxis(0, -500);
 	    BookingMask.clickOndashboardLink();
 	    Reporter.log("Clicked on dashboardLink",true);
 	    Thread.sleep(9500);
        dashboard.clickOnpurchasebutton();
        Reporter.log("Clicked on purchase option",true);
	    Thread.sleep(1000);
        dashboard.clickOnAccommodation();
        Reporter.log("Clicked on accommodation option in list",true);
        Thread.sleep(2000);
   		accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
   		Thread.sleep(4000);
   		accommdationList.clickOnEditRow1Column1();
   		Thread.sleep(1000);
   		accommodationNew.clickOnAllotment();
   		Reporter.log("Clicked on Allotment ",true);
   		Thread.sleep(2000);
   		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(159, 1, "Sheet5"));
	    Reporter.log("Send start date of season_H on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(160, 1, "Sheet5"));
	    Reporter.log("Send end date of season_H on allotment page",true);
	    Thread.sleep(1000);
	    allotment.clickOnLoadAllotment();
	    Reporter.log("Clicked on load allotment",true);
	    UtilityClass.implicitlyWaitInsec(70);
	    Thread.sleep(1000);
	    
	     String expectedMessage = UtilityClass.readDataFromStringExcel(183, 1, "Sheet5");
	     Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
	     Reporter.log("Validating Actual message "+ActualMessage+" and Expected message "+UtilityClass.readDataFromStringExcel(183, 1, "Sheet5"),true);  
        
    	 String expectedInitailAllot_H = allotment.getInitialAllotRoom1R1C1();
    	 Assert.assertEquals(Allot_Hinitial,expectedInitailAllot_H, "TC failed as Actual allotment and expected allotment are not matching ");
    	 Reporter.log("Validating Actual initial allotment is "+Allot_Hinitial+" and Expected allotment for season_F is "+expectedInitailAllot_H,true);  
    	    
    	 String ActualCurrentAllot_H = allotment.getCurrentAllotRoom1R1C1();
    	 String expectedCurrentAllot_H = UtilityClass.readDataFromStringExcel(173, 1, "Sheet5");
    	 Assert.assertEquals(ActualCurrentAllot_H, expectedCurrentAllot_H,"Test Case Failed as actual and expected current allotment are not matching");
    	 Reporter.log("Validating Actual current allotment is "+ActualCurrentAllot_H+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(173, 1, "Sheet5"),true);
    	    
    	 String ActualSoldAllot_H = allotment.getSoldAllotRoom1R1C1();
    	 String expectedSoldAllot_H = UtilityClass.readDataFromStringExcel(174, 1, "Sheet5");
    	 Assert.assertEquals(ActualSoldAllot_H, expectedSoldAllot_H,"Test Case Failed as actual and expected sold allotment are not matching");
    	 Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_H+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(174, 1, "Sheet5"),true);
    	    
    	 String ActualRemainingAllot_H = allotment.getRemainingAllotRoom1R1C1();
    	 String expectedRemainingAllot_H = UtilityClass.readDataFromStringExcel(175, 1, "Sheet5");
    	 Assert.assertEquals(ActualRemainingAllot_H, expectedRemainingAllot_H,"Test Case Failed as actual & expected remaining allotment are not matching");
    	 Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_H+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(175, 1, "Sheet5"),true); 
	}
	
	@Test (priority=2)   //TC_26
	public void validateConfirmBookingWhenSeasonAllotIsFull() throws EncryptedDocumentException, IOException, InterruptedException {
	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(159, 2, "Sheet5"));
	    Reporter.log("Send start date of season_F on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(160, 2, "Sheet5"));
	    Reporter.log("Send end date of season_F on allotment page",true);
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
 	    Thread.sleep(1000);
 	    String initialAllot_H = allotment.getInitialAllotRoom1R1C1();
 	    Allot_Hinitial=initialAllot_H;
 		Thread.sleep(2000);
 		allotment.clickOnDashboardLink();
 		Reporter.log("Clicked on dashboardLink",true);
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
 		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
 		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
 		Thread.sleep(1000);
 		UtilityClass.scrollByAxis(0, 300);
 		Thread.sleep(1000);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
 		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.ClearbookingActionfield();
 		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(162, 2, "Sheet5"));
 		Reporter.log("Send Booking action",true);
 		BookingMask.clearNoOfPax();
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(163, 2, "Sheet5"));
 		Reporter.log("Send number of passenger",true);
 		Thread.sleep(1000);
 		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(164, 2, "Sheet5"));
 		Reporter.log("Send correct KOS in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(165, 2, "Sheet5"));
 		Reporter.log("Send correct ProductCode in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(166, 2, "Sheet5"));
 		Reporter.log("Send roomcode in input field",true);
 		
 		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(167, 2, "Sheet5"));
 		Reporter.log("Send correct boardName",true);
 		
 		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(168, 2, "Sheet5"));
 		Reporter.log("Send Occupancy",true);

 		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(169, 2, "Sheet5"));
 		Reporter.log("Send bookinglines ",true);
 		
 		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(170, 2, "Sheet5"));
 		Reporter.log("Send Travel from date for season-H",true);
 		
 		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(171, 2, "Sheet5"));
 		Reporter.log("Send Travel To date for season-H",true);
 		
 		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
 		Reporter.log("Send Number of passenger",true);
 		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(176, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(177, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(178, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(179, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(180, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(181, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(182, 2, "Sheet5"));
 		UtilityClass.scrollByAxis(0, 900);
 		UtilityClass.implicitlyWaitInMillis(20000);
 		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
 		Reporter.log("Click on sendBookingButton",true);
 		Thread.sleep(2000);
        String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
 	    Thread.sleep(2000);
 	    UtilityClass.scrollByAxis(0, -500);
 	    BookingMask.clickOndashboardLink();
 	    Reporter.log("Clicked on dashboardLink",true);
 	    Thread.sleep(9500);
        dashboard.clickOnpurchasebutton();
        Reporter.log("Clicked on purchase option",true);
	    Thread.sleep(1000);
        dashboard.clickOnAccommodation();
        Reporter.log("Clicked on accommodation option in list",true);
        Thread.sleep(2000);
   		accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
   		Thread.sleep(4000);
   		accommdationList.clickOnEditRow1Column1();
   		Thread.sleep(1000);
   		accommodationNew.clickOnAllotment();
   		Reporter.log("Clicked on Allotment ",true);
   		Thread.sleep(2000);
   		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(159, 2, "Sheet5"));
	    Reporter.log("Send start date of season_H on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(160, 2, "Sheet5"));
	    Reporter.log("Send end date of season_H on allotment page",true);
	    Thread.sleep(1000);
	    allotment.clickOnLoadAllotment();
	    Reporter.log("Clicked on load allotment",true);
	    
	    String expectedMessage = UtilityClass.readDataFromStringExcel(183, 1, "Sheet5");
	    Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
	    Reporter.log("Validating Actual message "+ActualMessage+" and Expected message "+UtilityClass.readDataFromStringExcel(183, 1, "Sheet5"),true);  
       
    	String expectedInitailAllot_H = allotment.getInitialAllotRoom1R1C1();
    	Assert.assertEquals(Allot_Hinitial,expectedInitailAllot_H, "TC failed as Actual allotment and expected allotment are not matching ");
    	Reporter.log("Validating Actual initial allotment is "+Allot_Hinitial+" and Expected allotment for season_H is "+expectedInitailAllot_H,true);  
    	    
    	String ActualCurrentAllot_H = allotment.getCurrentAllotRoom1R1C1();
    	String expectedCurrentAllot_H = UtilityClass.readDataFromStringExcel(173, 2, "Sheet5");
    	Assert.assertEquals(ActualCurrentAllot_H, expectedCurrentAllot_H,"Test Case Failed as actual and expected current allotment are not matching");
    	Reporter.log("Validating Actual current allotment is "+ActualCurrentAllot_H+" and Expected allotment for season_H is "+UtilityClass.readDataFromStringExcel(173, 2, "Sheet5"),true);
    	    
    	String ActualSoldAllot_H = allotment.getSoldAllotRoom1R1C1();
    	String expectedSoldAllot_H = UtilityClass.readDataFromStringExcel(174, 2, "Sheet5");
    	Assert.assertEquals(ActualSoldAllot_H, expectedSoldAllot_H,"Test Case Failed as actual and expected sold allotment are not matching");
    	Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_H+" and Expected allotment for season_H is "+UtilityClass.readDataFromStringExcel(174, 2, "Sheet5"),true);
    	    
    	String ActualRemainingAllot_H = allotment.getRemainingAllotRoom1R1C1();
    	String expectedRemainingAllot_H = UtilityClass.readDataFromStringExcel(175, 2, "Sheet5");
    	Assert.assertEquals(ActualRemainingAllot_H, expectedRemainingAllot_H,"Test Case Failed as actual & expected remaining allotment are not matching");
    	Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_H+" and Expected allotment for season_H is "+UtilityClass.readDataFromStringExcel(175, 2, "Sheet5"),true); 
	}
    @AfterMethod
    public void Logout() throws InterruptedException
    {
      Thread.sleep(3000);
      allotment.ClickOnLogoutButtonOfAllotment();
   	  Reporter.log("Clicking on Logout Button",true);
   	  Thread.sleep(1000);
   	  allotment.logoutClickOFAllotment();
   	  Reporter.log("Logout from allotment",true);
    }
  
   @AfterClass 
   public void closeBrowser()
    {
	 driver.close();
	 Reporter.log("Closing Browser",true);
    }
 
 }







