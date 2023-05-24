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

public class modifySingleSalesLineBookingTC36TC37 extends BaseClass
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
	String ActualPrice;
	String ActualPriceOnBM;
	String ActualMessage;
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
		BookingMask = new bookingMaskPage(driver);
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
	
	 @Test (enabled =false) // TC_36
	 public void validateModifiedBookingPriceAndAllotment() throws EncryptedDocumentException, IOException, InterruptedException {

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
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(510, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(511, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(512, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(513, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(514, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(515, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(516, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(517, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(518, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(519, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(521, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(522, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(523, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(524, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(525, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(526, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(527, 1, "Sheet5"));
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
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(513, 1, "Sheet5"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(1000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInsec(80);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(513, 1, "Sheet5"));
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
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(530, 1, "Sheet5"));
	        UtilityClass.implicitlyWaitInMillis(20000);
//    		bookingUpdate.clearTravelFrom1();
//    		bookingUpdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(528, 1, "Sheet5"));
//    		Reporter.log("Send Modified Travel from date",true);
//    		UtilityClass.implicitlyWaitInMillis(20000);
    		bookingUpdate.clearTravelTo1();
    		bookingUpdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(529, 1, "Sheet5"));
    		Reporter.log("Send Modified Travel To date",true);
    		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		Thread.sleep(1000);
     		
     		String ActualPriceOnBM = BookingMask.getPriceFieldValue1("value");
     		ActualPrice = ActualPriceOnBM;
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
     		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(528, 1, "Sheet5"));
     	    Reporter.log("Send start date on allotment page",true);
     	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(529, 1, "Sheet5"));
     	    Reporter.log("Send end date on allotment page",true);
     	    Thread.sleep(1000);
     	    allotment.clickOnLoadAllotment();
     	    Reporter.log("Clicked on load Allotment button",true);
     	    Thread.sleep(1000);
     	    
     		String expectedPrice = UtilityClass.readDataFromStringExcel(531, 1, "Sheet5");
     	    Assert.assertEquals(ActualPrice,expectedPrice, "TC failed as Actual message and expected message are not matching ");
     	    Reporter.log("Validating Actual Message for season-E is "+ActualPrice+" and Expected Message for season-E is "+UtilityClass.readDataFromStringExcel(531, 1, "Sheet5"),true);
     	    
     	    String ActualInitialAllot = allotment.getInitialAllotRoom1R1C1();
     	    String expectedInitailAllot_E = UtilityClass.readDataFromStringExcel(532, 1, "Sheet5");
     	    Assert.assertEquals(ActualInitialAllot,expectedInitailAllot_E, "TC failed as Actual allotment and expected initial allotment are not matching ");
     	    Reporter.log("Validating Actual Initial allotment is "+ActualInitialAllot+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(532, 1, "Sheet5"),true);  
      	    
     	    String ActualSoldAllot_E = allotment.getSoldAllotRoom1R1C1();
     	    String expectedSoldAllot_E = UtilityClass.readDataFromStringExcel(533, 1, "Sheet5");
     	    Assert.assertEquals(ActualSoldAllot_E, expectedSoldAllot_E,"Test Case Failed as actual and expected sold allotment number are not matching");
     	    Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(533, 1, "Sheet5"),true);
     	    
     	    String ActualRemainingAllot_E = allotment.getRemainingAllotRoom1R1C1();
    	    String expectedRemainingAllot_E = UtilityClass.readDataFromStringExcel(534, 1, "Sheet5");
    	    Assert.assertEquals(ActualRemainingAllot_E, expectedRemainingAllot_E,"Test Case Failed as actual and expected remaining allotment number are not matching");
    	    Reporter.log("Validating Actual sold allotment is "+ActualRemainingAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(534, 1, "Sheet5"),true);
	 }
	 
	 @Test  (priority=1) // TC_37
	 public void validateModifiedBookingAndErrorMessage() throws EncryptedDocumentException, IOException, InterruptedException {

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
  		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(510, 2, "Sheet5"));
  		Reporter.log("Send Booking action",true);
 		UtilityClass.scrollByAxis(0, 300);
 		Thread.sleep(1000);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.clearNoOfPax();
 		UtilityClass.implicitlyWaitInMillis(1000);
 		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(511, 2, "Sheet5"));
 		Reporter.log("Send number of passengers",true);
 		Thread.sleep(1000);
 		
 		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(512, 2, "Sheet5"));
 		Reporter.log("Send correct KOS in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(513, 2, "Sheet5"));
 		Reporter.log("Send correct ProductCode in input field",true);
 		UtilityClass.implicitlyWaitInMillis(1000);
 		
 		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(514, 2, "Sheet5"));
 		Reporter.log("Send roomcode in input field",true);
 		
 		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(515, 2, "Sheet5"));
 		Reporter.log("Send correct boardName",true);
 		
 		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(516, 2, "Sheet5"));
 		Reporter.log("Send Occupancy",true);
 	
 		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(517, 2, "Sheet5"));
 		Reporter.log("Send bookinglines ",true);
 		
 		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(518, 2, "Sheet5"));
 		Reporter.log("Send Travel from date",true);
 		
 		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(519, 2, "Sheet5"));
 		Reporter.log("Send Travel To date",true);
 		
 		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
 		Reporter.log("Send Number of passenger",true);
 		
 		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
 		UtilityClass.implicitlyWaitInsec(30);
  		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(521, 2, "Sheet5"));
  		UtilityClass.implicitlyWaitInsec(30);
  		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(522, 2, "Sheet5"));
  		UtilityClass.implicitlyWaitInsec(30);
  		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(523, 2, "Sheet5"));
  		UtilityClass.implicitlyWaitInsec(30);
  		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(524, 2, "Sheet5"));
  		UtilityClass.implicitlyWaitInsec(30);
  		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(525, 2, "Sheet5"));
  		UtilityClass.implicitlyWaitInsec(30);
  		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(526, 2, "Sheet5"));
  		UtilityClass.implicitlyWaitInsec(30);
  		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(527, 2, "Sheet5"));
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
	    salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(513, 2, "Sheet5"));
	    Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	    Thread.sleep(1000);
	    salesBookingList.clickOnbookingListButton();
	    Reporter.log("Clicked on Booking listButton",true);
	    UtilityClass.implicitlyWaitInsec(80);
	    salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(513, 2, "Sheet5"));
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
	    BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(530, 2, "Sheet5"));
	    UtilityClass.implicitlyWaitInMillis(20000);
 		bookingUpdate.clearTravelFrom1();
 		bookingUpdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(528, 2, "Sheet5"));
 		Reporter.log("Send Modified Travel from date",true);
 		UtilityClass.implicitlyWaitInMillis(20000);
 		bookingUpdate.clearTravelTo1();
 		bookingUpdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(529, 2, "Sheet5"));
 		Reporter.log("Send Modified Travel To date",true);
 		UtilityClass.implicitlyWaitInMillis(20000);
  		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
  		Reporter.log("Click on sendBookingButton",true);
  		Thread.sleep(2000);
  		
  		String ActualErrorMsg = BookingMask.getInvalidTravelDurationMsg();
  		ActualMessage = ActualErrorMsg;
  		System.out.println(ActualErrorMsg);
  		Thread.sleep(3000);
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
  		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(528, 2, "Sheet5"));
  	    Reporter.log("Send start date on allotment page",true);
  	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(529, 2, "Sheet5"));
  	    Reporter.log("Send end date on allotment page",true);
  	    Thread.sleep(1000);
  	    allotment.clickOnLoadAllotment();
  	    Reporter.log("Clicked on load Allotment button",true);
  	    Thread.sleep(3000);
  	    
  	  	String expectedErroMsg = UtilityClass.readDataFromStringExcel(531, 2, "Sheet5");
  	  	Assert.assertEquals(ActualMessage,expectedErroMsg, "TC failed as Actual message and expected message are not matching ");
  	    Reporter.log("Validating Actual Message for season-E is "+ActualMessage+" and Expected Message for season-E is "+UtilityClass.readDataFromStringExcel(531, 2, "Sheet5"),true); 
	 
  	    String ActualInitialAllot = allotment.getInitialAllotRoom1R8C8();
  	    String expectedInitailAllot_E = UtilityClass.readDataFromStringExcel(532, 2, "Sheet5");
  	    Assert.assertEquals(ActualInitialAllot,expectedInitailAllot_E, "TC failed as Actual allotment and expected initial allotment are not matching ");
  	    Reporter.log("Validating Actual Initial allotment is "+ActualInitialAllot+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(532, 2, "Sheet5"),true);  
   	    
  	    String ActualSoldAllot_E = allotment.getSoldAllotRoom1R8C8();
  	    String expectedSoldAllot_E = UtilityClass.readDataFromStringExcel(533, 2, "Sheet5");
  	    Assert.assertEquals(ActualSoldAllot_E, expectedSoldAllot_E,"Test Case Failed as actual and expected sold allotment number are not matching");
  	    Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(533, 2, "Sheet5"),true);
  	    
  	    String ActualRemainingAllot_E = allotment.getRemainingAllotRoom1R8C8();
 	    String expectedRemainingAllot_E = UtilityClass.readDataFromStringExcel(534, 2, "Sheet5");
 	    Assert.assertEquals(ActualRemainingAllot_E, expectedRemainingAllot_E,"Test Case Failed as actual and expected remaining allotment number are not matching");
 	    Reporter.log("Validating Actual sold allotment is "+ActualRemainingAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(534, 2, "Sheet5"),true);
	 
     	
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













