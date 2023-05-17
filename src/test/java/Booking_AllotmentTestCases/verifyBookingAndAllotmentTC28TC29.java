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

public class verifyBookingAndAllotmentTC28TC29 extends BaseClass {
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
	String Allot_Binitial;
	String Allot_Bcurrent;
	String Allot_Bremaining;
	String Allot_Bsold;
	String Allot_Einitial;
	String Allot_Hinitial;
	String Allot_Ginitial;
	
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

	@Test (priority=1)   //TC_28
	public void validateBookingWithValidAllotment() throws EncryptedDocumentException, IOException, InterruptedException {
	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(205, 2, "Sheet5"));
	    Reporter.log("Send start date of season_G on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(206, 2, "Sheet5"));
	    Reporter.log("Send end date of season_G on allotment page",true);
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
    	Thread.sleep(1000);
 	    String initialAllot_G = allotment.getInitialAllotRoom1R1C1();
 	    Allot_Ginitial=initialAllot_G;
 		Thread.sleep(2000);
 		allotment.clickOnDashboardLink();
 		Reporter.log("Clicked on dashboardLink",true);
 		Thread.sleep(10000);
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
 		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(208, 2, "Sheet5"));
 		Reporter.log("Send Booking action",true);
 		BookingMask.clearNoOfPax();
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(209, 2, "Sheet5"));
 		Reporter.log("Send number of passenger",true);
 		Thread.sleep(1000);
 		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(210, 2, "Sheet5"));
 		Reporter.log("Send correct KOS in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(211, 2, "Sheet5"));
 		Reporter.log("Send correct ProductCode in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(212, 2, "Sheet5"));
 		Reporter.log("Send roomcode in input field",true);
 		
 		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(213, 2, "Sheet5"));
 		Reporter.log("Send correct boardName",true);
 		
 		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(214, 2, "Sheet5"));
 		Reporter.log("Send Occupancy",true);

 		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(215, 2, "Sheet5"));
 		Reporter.log("Send bookinglines ",true);
 		
 		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(216, 2, "Sheet5"));
 		Reporter.log("Send Travel from date for season-E",true);
 		
 		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(217, 2, "Sheet5"));
 		Reporter.log("Send Travel To date for season-E",true);
 		
 		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
 		Reporter.log("Send Number of passenger",true);
 	    
 		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(219, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(220, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(221, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(222, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(223, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(224, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(225, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		UtilityClass.implicitlyWaitInMillis(20000);
 		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
 		Reporter.log("Click on sendBookingButton",true);
 		Thread.sleep(2000);
 		String ActualPrice = BookingMask.getPriceFieldValue1("value");
 	    Thread.sleep(1000);
 	    UtilityClass.scrollByAxis(0, -500);
        Thread.sleep(2000);
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
   		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(205, 2, "Sheet5"));
	    Reporter.log("Send start date of season_G on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(206, 2, "Sheet5"));
	    Reporter.log("Send end date of season_G on allotment page",true);
	    Thread.sleep(1000);
	    allotment.clickOnLoadAllotment();
	    Reporter.log("Clicked on load allotment",true);
   
	    String expectedPrice = UtilityClass.readDataFromStringExcel(231, 2, "Sheet5");
	    Assert.assertEquals(ActualPrice,expectedPrice, "TC failed as Actual allotment and expected allotment are not matching ");
        Reporter.log("Validating Actual initial allotment is "+ActualPrice+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(231, 2, "Sheet5"),true);  
        
        String expectedInitailAllot_G = allotment.getInitialAllotRoom1R1C1();
        Assert.assertEquals(Allot_Ginitial,expectedInitailAllot_G, "TC failed as Actual allotment and expected allotment are not matching ");
        Reporter.log("Validating Actual initial allotment is "+Allot_Ginitial+" and Expected allotment for season_E is "+allotment.getInitialAllotRoom1R1C1(),true);  
        
        String ActualCurrentAllot_G = allotment.getCurrentAllotRoom1R1C1();
        String expectedCurrentAllot_G = UtilityClass.readDataFromStringExcel(226, 2, "Sheet5");
        Assert.assertEquals(ActualCurrentAllot_G, expectedCurrentAllot_G,"Test Case Failed as actual and expected current allotment are not matching");
        Reporter.log("Validating Actual current allotment is "+ActualCurrentAllot_G+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(226, 2, "Sheet5"),true);
        
        String ActualSoldAllot_G = allotment.getSoldAllotRoom1R1C1();
        String expectedSoldAllot_G = UtilityClass.readDataFromStringExcel(227, 2, "Sheet5");
        Assert.assertEquals(ActualSoldAllot_G, expectedSoldAllot_G,"Test Case Failed as actual & expected sold allotment number are not matching");
        Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_G+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(227, 2, "Sheet5"),true);
        
        String ActualRemainingAllot_G = allotment.getRemainingAllotRoom1R1C1();
        String expectedRemainingAllot_G = UtilityClass.readDataFromStringExcel(228, 2, "Sheet5");
        Assert.assertEquals(ActualRemainingAllot_G, expectedRemainingAllot_G,"Test Case Failed as actual & expected sold allotment number are not matching");
        Reporter.log("Validating Actual Remaining allotment is "+ActualRemainingAllot_G+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(228, 2, "Sheet5"),true);
	}
	
	@Test  (priority=2) //TC-29
	public void validateBookingErrorMsgWhenAllRoomsAreBooked() throws EncryptedDocumentException, IOException, InterruptedException {
		
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(46, 1, "Sheet5"));
	    Reporter.log("Send start date of season_E on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(46, 2, "Sheet5"));
	    Reporter.log("Send end date of season_E on allotment page",true);
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
    	Thread.sleep(2000);
 	    String initialAllot_E = allotment.getInitialAllotRoom1R1C1();
 	    Allot_Einitial=initialAllot_E;
 		Thread.sleep(2000);
    	allotment.clickOnchangeAllotment();
    	Reporter.log("Clicked on Change allotment button",true);
    	Thread.sleep(2000);
    	UtilityClass.listBoxHandlingUsingByText("Apply_stop_sales", ChangeAllotment.selectChangeAllotmentDropdown());
    	Thread.sleep(3000); 
    	ChangeAllotment.clickOnMultiselectDropdwn();
   	    Thread.sleep(1000);
   	    ChangeAllotment.clickOnSelectAllRoomsmultiselectdropdown1();
   	    Thread.sleep(1000);
   	    ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(235, 1, "Sheet5"));
   	    Reporter.log("Enter start date for room1",true);
   	    Thread.sleep(1000);
    	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(236, 1, "Sheet5"));
    	Reporter.log("Enter until date for room1",true);
    	Thread.sleep(1500);
    	UtilityClass.implicitlyWaitInsec(70);
    	
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("document.body.style.zoom='70%'"); 
    	UtilityClass.implicitlyWaitInsec(70);
    	Thread.sleep(3000);  
    	//ChangeAllotment.clickOnConfirmButtonByJSE();
    	WebElement confirmButton=driver.findElement(By.xpath("//button[text()='Confirm']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("arguments[0].click();", confirmButton);
    	Thread.sleep(6000);
    	    
    	//ChangeAllotment.clickOnOkPopUPByJSE();
    	WebElement OkButton = driver.findElement(By.xpath("//button[text()='OK']"));
    	js.executeScript("arguments[0].click();", OkButton);
    	Thread.sleep(1000);
    	
    	//ChangeAllotment.clickOncloseButtonByJSE();
    	WebElement closeButton = driver.findElement(By.id("closeImageFeature"));
    	js.executeScript("arguments[0].click();", closeButton);
    	Thread.sleep(1000);
        
    	jse.executeScript("document.body.style.zoom='100%'");
    	Thread.sleep(2000);
    	allotment.clickOnDashboardLink();
 		Reporter.log("Clicked on dashboardLink",true);
 		Thread.sleep(10000);
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
 		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(238, 1, "Sheet5"));
 		Reporter.log("Send Booking action",true);
 		BookingMask.clearNoOfPax();
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(239, 1, "Sheet5"));
 		Reporter.log("Send number of passenger",true);
 		Thread.sleep(1000);
 		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(240, 1, "Sheet5"));
 		Reporter.log("Send correct KOS in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(241, 1, "Sheet5"));
 		Reporter.log("Send correct ProductCode in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(242, 1, "Sheet5"));
 		Reporter.log("Send roomcode in input field",true);
 		
 		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(243, 1, "Sheet5"));
 		Reporter.log("Send correct boardName",true);
 		
 		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(244, 1, "Sheet5"));
 		Reporter.log("Send Occupancy",true);

 		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(245, 1, "Sheet5"));
 		Reporter.log("Send bookinglines ",true);
 		
 		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(246, 1, "Sheet5"));
 		Reporter.log("Send Travel from date for season-E",true);
 		
 		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(247, 1, "Sheet5"));
 		Reporter.log("Send Travel To date for season-E",true);
 		
 		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
 		Reporter.log("Send Number of passenger",true);
 		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(249, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(250, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(251, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(252, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(253, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(254, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(255, 1, "Sheet5"));
 		UtilityClass.scrollByAxis(0, 900);
 		UtilityClass.implicitlyWaitInMillis(20000);
 		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
 		Reporter.log("Click on sendBookingButton",true);
 		Thread.sleep(2000);
 		String ActualErrorMsg = BookingMask.getInvalidTravelDurationMsg();
 	    Thread.sleep(1000);
 	    UtilityClass.scrollByAxis(0, -500);
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
   		accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
   		Thread.sleep(4000);
   		accommdationList.clickOnEditRow1Column1();
   		Thread.sleep(1000);
   		accommodationNew.clickOnAllotment();
   		Reporter.log("Clicked on Allotment ",true);
   		Thread.sleep(2000);
   		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(235, 1, "Sheet5"));
	    Reporter.log("Send start date of season_E on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(236, 1, "Sheet5"));
	    Reporter.log("Send end date of season_E on allotment page",true);
	    Thread.sleep(1000);
	    allotment.clickOnLoadAllotment();
	    Reporter.log("Clicked on load allotment",true);
	    Thread.sleep(500);
	    
	    String expectedErroMsg = UtilityClass.readDataFromStringExcel(256, 1, "Sheet5");
	    Assert.assertEquals(ActualErrorMsg,expectedErroMsg, "TC failed as Actual message and expected prices are not matching ");
	    Reporter.log("Validating Actual Message for season-E is "+ActualErrorMsg+" and Expected Message for season-E is "+UtilityClass.readDataFromStringExcel(256, 1, "Sheet5"),true);  
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








