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

public class verifyAllotmentwithRoomBooking_TC07andTC09 extends BaseClass {
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
		login.SendUserName(UtilityClass.readDataFromStringExcel(2, 0, "Sheet1"));
		Reporter.log("Valid Username Entered",true);
		login.SendPassword(UtilityClass.readDataFromStringExcel(2, 1, "Sheet1"));
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

	@Test (enabled=false)  //TC_07
	public void validateIncrDecrAllotWithRoomBooking() throws EncryptedDocumentException, IOException, InterruptedException {
	
	allotment.sendStartDate(UtilityClass.readDataFromStringExcel(67, 1, "Sheet5"));
    Reporter.log("Send start date of season_B on allotment page",true);
    allotment.sendendDate(UtilityClass.readDataFromStringExcel(67, 2, "Sheet5"));
    Reporter.log("Send end date of season_B on allotment page",true);
	
    Thread.sleep(1000);
	allotment.clickOnLoadAllotment();
	Reporter.log("Clicked on load allotment",true);
	
	String initialAllot_B = allotment.getInitialAllotRoom1R1C1();
	Allot_Binitial=initialAllot_B;
	Thread.sleep(1000);
	
	allotment.clickOnchangeAllotment();
	Reporter.log("Clicked on Change allotment button",true);
	Thread.sleep(2000);
	
	UtilityClass.listBoxHandlingUsingByText("Increase_Decrease_Allotment", ChangeAllotment.selectChangeAllotmentDropdown());
	Thread.sleep(3000);
	    	
	ChangeAllotment.clickOnMultiselectDropdwn();
	Thread.sleep(1000);
	    
	ChangeAllotment.clickOnSelectAllRoomsmultiselectdropdown1();
	Thread.sleep(1000);

	ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(106, 1, "Sheet5"));
	Thread.sleep(2000);
	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(107, 1, "Sheet5"));
	Thread.sleep(2000);
	ChangeAllotment.sendAmount1(UtilityClass.readDataFromStringExcel(108, 1, "Sheet5"));
	Thread.sleep(5000);

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.body.style.zoom='70%'");
	Thread.sleep(1000);
	
//	//ChangeAllotment.clickOnConfirmButtonByJSE();
	WebElement confirmButton=driver.findElement(By.xpath("//button[text()='Confirm']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", confirmButton);
	Reporter.log("Clicked on confirm button",true);
	Thread.sleep(1000);
	    
//	//ChangeAllotment.clickOnOkPopUPByJSE();
	WebElement OkButton = driver.findElement(By.xpath("//button[text()='OK']"));
	js.executeScript("arguments[0].click();", OkButton);
	Reporter.log("Clicked on Ok popup",true);
	Thread.sleep(1000);
	    
	//ChangeAllotment.clickOncloseButtonByJSE();
	WebElement closeButton = driver.findElement(By.id("closeImageFeature"));
	js.executeScript("arguments[0].click();", closeButton);
	Reporter.log("Clicked on close button",true);
	   
	jse.executeScript("document.body.style.zoom='100%'");
	Thread.sleep(1000);
	
	allotment.clickOnDashboardLink();
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
	BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(114, 1, "Sheet5"));
	Reporter.log("Send Booking action",true);
	BookingMask.clearNoOfPax();
	UtilityClass.implicitlyWaitInMillis(1000);
	
	BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(115, 1, "Sheet5"));
	Reporter.log("Send number of passenger",true);
	Thread.sleep(1000);
	
	BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(116, 1, "Sheet5"));
	Reporter.log("Send correct KOS in input field",true);
	UtilityClass.implicitlyWaitInMillis(1000);
	BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(117, 1, "Sheet5"));
	Reporter.log("Send correct ProductCode in input field",true);
	UtilityClass.implicitlyWaitInMillis(1000);
	
	BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(118, 1, "Sheet5"));
	Reporter.log("Send roomcode in input field",true);
	
	BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(119, 1, "Sheet5"));
	Reporter.log("Send correct boardName",true);
	
	BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(120, 1, "Sheet5"));
	Reporter.log("Send Occupancy",true);

	BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(121, 1, "Sheet5"));
	Reporter.log("Send bookinglines ",true);
	
	BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(122, 1, "Sheet5"));
	Reporter.log("Send Travel from date for season-A",true);
	
	BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(123, 1, "Sheet5"));
	Reporter.log("Send Travel To date for season-A",true);
	
	driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	Reporter.log("Select Number of passenger",true);
    
	UtilityClass.implicitlyWaitInMillis(2000);
    UtilityClass.scrollByAxis(0, 600);
    Thread.sleep(2000); 
	
    UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    Thread.sleep(500);
	BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(125, 1, "Sheet5"));
	Thread.sleep(500);
	BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(126, 1, "Sheet5"));
	Thread.sleep(500);
	BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(127, 1, "Sheet5"));
	Thread.sleep(500);
	BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(128, 1, "Sheet5"));
	Thread.sleep(500);
	BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(129, 1, "Sheet5"));
	Thread.sleep(500);
	BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(130, 1, "Sheet5"));
	Thread.sleep(500);
	BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(131, 1, "Sheet5"));
	UtilityClass.scrollByAxis(0, 900);
	UtilityClass.implicitlyWaitInMillis(20000);
	UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	Reporter.log("Click on sendBookingButton",true);
	
	Thread.sleep(1000);
	BookingMask.clickOndashboardLink();
	
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
	
	allotment.sendStartDate(UtilityClass.readDataFromStringExcel(67, 1, "Sheet5"));
    Reporter.log("Send start date of season_B on allotment page",true);
    allotment.sendendDate(UtilityClass.readDataFromStringExcel(67, 2, "Sheet5"));
    Reporter.log("Send end date of season_B on allotment page",true);
	
    UtilityClass.implicitlyWaitInsec(80);
    allotment.clickOnLoadAllotment();
    Thread.sleep(2000);
    
    String currentAllot_B = allotment.getCurrentAllotRoom1R1C1();
    Allot_Bcurrent = currentAllot_B;
    
    String soldAllot_B = allotment.getCurrentAllotRoom1R1C1();
    Allot_Bsold = soldAllot_B;
    
    String RemainingAllot_B  =allotment.getRemainingAllotRoom1R1C1();
    Allot_Bremaining = RemainingAllot_B;
    
    UtilityClass.implicitlyWaitInsec(60);
    UtilityClass.scrollByAxis(0, -350);
    
    String ActualInitialAllot_B = allotment.getInitialAllotRoom1R1C1();
    String expectedInitailAllot_B = UtilityClass.readDataFromStringExcel(109, 1, "Sheet5");
    Assert.assertEquals(ActualInitialAllot_B,expectedInitailAllot_B, "TC failed as Actual message and expected allotment are not matching ");
    Reporter.log("Validating Actual initial allotment is "+ActualInitialAllot_B+" and Expected allotment for season_B is "+UtilityClass.readDataFromStringExcel(109, 1, "Sheet5"),true);  
    
    String ActualCurrentAllot_B = allotment.getCurrentAllotRoom1R1C1();
    String expectedCurrentAllot_B = UtilityClass.readDataFromStringExcel(110, 1, "Sheet5");
    Assert.assertEquals(ActualCurrentAllot_B, expectedCurrentAllot_B,"Test Case Failed as actual and expected current allotment are not matching");
    Reporter.log("Validating Actual current allotment is "+ActualCurrentAllot_B+" and Expected allotment for season_B is "+UtilityClass.readDataFromStringExcel(110, 1, "Sheet5"),true);
    
    String ActualSoldAllot_B = allotment.getSoldAllotRoom1R1C1();
    String expectedSoldAllot_B = UtilityClass.readDataFromStringExcel(111, 1, "Sheet5");
    Assert.assertEquals(ActualSoldAllot_B, expectedSoldAllot_B,"Test Case Failed as actual & expected sold allotment number are not matching");
    Reporter.log("Validating Actual current allotment is "+ActualSoldAllot_B+" and Expected allotment for season_B is "+UtilityClass.readDataFromStringExcel(111, 1, "Sheet5"),true);
    
    String ActualRemainingAllot_B = allotment.getRemainingAllotRoom1R1C1();
    String expectedRemainingAllot_B = UtilityClass.readDataFromStringExcel(112, 1, "Sheet5");
    Assert.assertEquals(ActualRemainingAllot_B, expectedRemainingAllot_B,"Test Case Failed as actual & expected remaining allotment are not matching");
    Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_B+" and Expected allotment for season_B is "+UtilityClass.readDataFromStringExcel(112, 1, "Sheet5"),true); 
	
	}
	
	@Test (priority = 1) //TC_09
	public void validateApplyStopSales() throws EncryptedDocumentException, IOException, InterruptedException {
	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(135, 1, "Sheet5"));
	    Reporter.log("Send start date of season_E on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(136, 1, "Sheet5"));
	    Reporter.log("Send end date of season_E on allotment page",true);
    	
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
    	
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
	
   	    ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(137, 1, "Sheet5"));
   	    Reporter.log("Enter start date for room1",true);
   	    Thread.sleep(500);
    	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(138, 1, "Sheet5"));
    	Reporter.log("Enter until date for room1",true);
    	Thread.sleep(1000);
    	UtilityClass.implicitlyWaitInsec(70);
    	
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("document.body.style.zoom='70%'"); 
    	UtilityClass.implicitlyWaitInsec(70);
    	
    	Thread.sleep(3000);  
    	//ChangeAllotment.clickOnConfirmButtonByJSE();
    	WebElement confirmButton=driver.findElement(By.xpath("//button[text()='Confirm']"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
     	js.executeScript("arguments[0].click();", confirmButton);
    	Thread.sleep(2000);
    	    
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
    	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(135, 1, "Sheet5"));
	    Reporter.log("Send start date of season_E on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(136, 1, "Sheet5"));
	    Reporter.log("Send end date of season_E on allotment page",true);
	    allotment.clickOnLoadAllotment();
    	
    	 String expectedInitailAllot_E = UtilityClass.readDataFromStringExcel(139, 1, "Sheet5");
    	 Assert.assertEquals(Allot_Einitial,expectedInitailAllot_E, "TC failed as Actual allotment and expected allotment are not matching ");
    	 Reporter.log("Validating Actual initial allotment is "+Allot_Einitial+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(139, 1, "Sheet5"),true);  
    	    
    	 String ActualCurrentAllot_E = allotment.getCurrentAllotRoom1R1C1();
    	 String expectedCurrentAllot_E = UtilityClass.readDataFromStringExcel(140, 1, "Sheet5");
    	 Assert.assertEquals(ActualCurrentAllot_E, expectedCurrentAllot_E,"Test Case Failed as actual and expected current allotment are not matching");
    	 Reporter.log("Validating Actual current allotment is "+ActualCurrentAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(140, 1, "Sheet5"),true);
    	    
    	 String ActualSoldAllot_E = allotment.getSoldAllotRoom1R1C1();
    	 String expectedSoldAllot_E = UtilityClass.readDataFromStringExcel(143, 1, "Sheet5");
    	 Assert.assertEquals(ActualSoldAllot_E, expectedSoldAllot_E,"Test Case Failed as actual and expected sold allotment number are not matching");
    	 Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(143, 1, "Sheet5"),true);
    	    
    	 String ActualRemainingAllot_E = allotment.getRemainingAllotRoom1R1C1();
    	 String expectedRemainingAllot_E = UtilityClass.readDataFromStringExcel(141, 1, "Sheet5");
    	 Assert.assertEquals(ActualRemainingAllot_E, expectedRemainingAllot_E,"Test Case Failed as actual & expected remaining allotment are not matching");
    	 Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(141, 1, "Sheet5"),true); 
    		
    	 String ActualStopSales_E = allotment.getstopSalesRoom1R1C1();
    	 System.out.println("Stop sales is "+ActualStopSales_E);
    	 String expectedStopSales_E = UtilityClass.readDataFromStringExcel(142, 1, "Sheet5");
    	 Assert.assertEquals(ActualStopSales_E, expectedStopSales_E,"Test Case Failed as actual and expected stop sales text are not matching");
    	 Reporter.log("Validating Actual Stop sale text is "+ActualStopSales_E+" and Expected stop sales text for season_E is "+UtilityClass.readDataFromStringExcel(142, 1, "Sheet5"),true); 
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






