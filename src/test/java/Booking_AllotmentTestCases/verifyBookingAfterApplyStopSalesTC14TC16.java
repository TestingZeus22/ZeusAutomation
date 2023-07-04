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

public class verifyBookingAfterApplyStopSalesTC14TC16 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	allotmentPage allotment;
	ChangeAllotmentPage ChangeAllotment;
	String Allot_Binitial;
	String Allot_Bcurrent;
	String Allot_Bremaining;
	String Allot_Bsold;
	String Allot_Einitial;
	String Allot_Hinitial;
	String ActualErrorMsg;
	
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

	@Test  (priority=2) //TC_14
	public void validateBookingAfterStopSalesWithSameDates() throws EncryptedDocumentException, IOException, InterruptedException {
	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(485, 1, "Sheet5"));
	    Reporter.log("Send start date of season_F on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(486, 1, "Sheet5"));
	    Reporter.log("Send end date of season_F on allotment page",true);
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
 		Thread.sleep(2000);
    	allotment.clickOnchangeAllotment();
    	Reporter.log("Clicked on Change allotment button",true);
    	Thread.sleep(2000);
    	UtilityClass.listBoxHandlingUsingByText("Apply_stop_sales", ChangeAllotment.selectChangeAllotmentDropdown());
    	Thread.sleep(3000);   
    	ChangeAllotment.clickOnMultiselectDropdwn();
   	    Thread.sleep(1500);
   	    ChangeAllotment.clickOnSelectAllRoomsmultiselectdropdown1();
   	    Thread.sleep(1000);
   	    ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(485, 1, "Sheet5"));
   	    Reporter.log("Enter start date",true);
   	    Thread.sleep(1000);
    	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(486, 1, "Sheet5"));
    	Reporter.log("Enter until date",true);
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
    	Thread.sleep(1000);
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
 		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		Thread.sleep(1000);
 		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
 		Reporter.log("Select TFT1 in TravelType dropdownList",true);
 		Thread.sleep(1000);
 		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
 		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
 		Thread.sleep(1000);
 		UtilityClass.scrollByAxis(0, 300);
 		Thread.sleep(1000);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.ClearbookingActionfield();
 		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(488, 1, "Sheet5"));
 		Reporter.log("Send Booking action",true);
 		BookingMask.clearNoOfPax();
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(489, 1, "Sheet5"));
 		Reporter.log("Send number of passenger",true);
 		Thread.sleep(1000);
 		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(490, 1, "Sheet5"));
 		Reporter.log("Send correct KOS in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(491, 1, "Sheet5"));
 		Reporter.log("Send correct ProductCode in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(492, 1, "Sheet5"));
 		Reporter.log("Send roomcode in input field",true);
 		
 		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(493, 1, "Sheet5"));
 		Reporter.log("Send correct boardName",true);
 		
 		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(494, 1, "Sheet5"));
 		Reporter.log("Send Occupancy",true);

 		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(495, 1, "Sheet5"));
 		Reporter.log("Send bookinglines ",true);
 		
 		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(496, 1, "Sheet5"));
 		Reporter.log("Send Travel from date for season-E",true);
 		
 		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(497, 1, "Sheet5"));
 		Reporter.log("Send Travel To date for season-E",true);
 		
 		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
 		Reporter.log("Send Number of passenger",true);
 		UtilityClass.implicitlyWaitInMillis(2000);
 		
 		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
 	    UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(499, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(500, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(501, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(502, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(503, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(504, 1, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(505, 1, "Sheet5"));
 		UtilityClass.scrollByAxis(0, 900);
 		UtilityClass.implicitlyWaitInMillis(20000);
 		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
 		Reporter.log("Click on sendBookingButton",true);
 		UtilityClass.scrollByAxis(0, 1000);
 		Thread.sleep(2000);
        
 		String ActualErrorMsg = BookingMask.getInvalidTravelDurationMsg();
 		String expectedErrorMsg = UtilityClass.readDataFromStringExcel(506, 1, "Sheet5");
	    Assert.assertEquals(ActualErrorMsg,expectedErrorMsg, "TC failed as Actual message and expected message are not matching ");
 		//Assert.assertTrue(ActualErrorMsg.contains(expectedErrorMsg), "Test case failed");
	    Reporter.log("Validating Actual Message for season-F is "+ActualErrorMsg+" and Expected Message for season-F is "+UtilityClass.readDataFromStringExcel(506, 1, "Sheet5"),true);  
	}
	
	@Test (priority=1) //TC-16
	public void validateBookingAfterStopSalesWithDatesOutsideStopSales() throws EncryptedDocumentException, IOException, InterruptedException {
		
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(485, 2, "Sheet5"));
	    Reporter.log("Send start date of season_F on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(486, 2, "Sheet5"));
	    Reporter.log("Send end date of season_F on allotment page",true);
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
    	Thread.sleep(1000);
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
   	    ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(485, 2, "Sheet5"));
   	    Reporter.log("Enter start date for room1",true);
   	    Thread.sleep(1000);
    	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(486, 2, "Sheet5"));
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
    	Thread.sleep(1000);
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
 		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		Thread.sleep(1000);
 		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
 		Reporter.log("Select TFT1 in TravelType dropdownList",true);
 		Thread.sleep(1000);
 		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
 		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
 		Thread.sleep(1000);
 		UtilityClass.scrollByAxis(0, 300);
 		Thread.sleep(1000);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.ClearbookingActionfield();
 		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(488, 2, "Sheet5"));
 		Reporter.log("Send Booking action",true);
 		BookingMask.clearNoOfPax();
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(489, 2, "Sheet5"));
 		Reporter.log("Send number of passenger",true);
 		Thread.sleep(1000);
 		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(490, 2, "Sheet5"));
 		Reporter.log("Send correct KOS in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(491, 2, "Sheet5"));
 		Reporter.log("Send correct ProductCode in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(492, 2, "Sheet5"));
 		Reporter.log("Send roomcode in input field",true);
 		
 		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(493, 2, "Sheet5"));
 		Reporter.log("Send correct boardName",true);
 		
 		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(494, 2, "Sheet5"));
 		Reporter.log("Send Occupancy",true);

 		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(495, 2, "Sheet5"));
 		Reporter.log("Send bookinglines ",true);
 		
 		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(496, 2, "Sheet5"));
 		Reporter.log("Send Travel from date for season-E",true);
 		
 		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(497, 2, "Sheet5"));
 		Reporter.log("Send Travel To date for season-E",true);
 		
 		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
 		Reporter.log("Send Number of passenger",true);
 		UtilityClass.implicitlyWaitInMillis(2000);
 		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
 	    UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(499, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(500, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(501, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(502, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(503, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(504, 2, "Sheet5"));
 		UtilityClass.implicitlyWaitInsec(30);
 		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(505, 2, "Sheet5"));
 		UtilityClass.scrollByAxis(0, 900);
 		UtilityClass.implicitlyWaitInMillis(20000);
 		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
 		Reporter.log("Click on sendBookingButton",true);
 		
	    String ActualPrice = BookingMask.getPriceFieldValue1("value");
	    String expectedPrice = UtilityClass.readDataFromStringExcel(506, 2, "Sheet5");
	    Assert.assertEquals(ActualPrice,expectedPrice, "TC failed as Actual message and expected prices are not matching ");
	    Reporter.log("Validating Actual price for season-F is "+ActualPrice+" and Expected price for season-F is "+UtilityClass.readDataFromStringExcel(506, 2, "Sheet5"),true);  
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








