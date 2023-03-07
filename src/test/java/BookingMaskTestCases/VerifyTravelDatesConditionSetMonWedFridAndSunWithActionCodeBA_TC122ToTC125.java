package BookingMaskTestCases;

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
import POM.DashboardPage;
import POM.bookingMaskPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class VerifyTravelDatesConditionSetMonWedFridAndSunWithActionCodeBA_TC122ToTC125 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;

	@BeforeClass
	public void launchBrowser(){
	openApplication();
	Reporter.log("Browser Launch ",true);
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
	    @Test //TC122
	    public void validateBookingBySendingTravelDateMonToTuesWeekdaySetMonWedFriAndSunWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		UtilityClass.listBoxHandlingUsingByText("805 - (room5)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 805 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(496, 2, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(497, 2, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(498, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(499, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(500, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(501, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(502, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(503, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(504, 2, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(505, 2, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		UtilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
            
            String ActualPrice = BookingMask.getPriceFieldValue1("value");
  		    String expectedPrice = UtilityClass.readDataFromStringExcel(507, 2, "Sheet2");
  		    Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
  		    Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+UtilityClass.readDataFromStringExcel(507, 2, "Sheet2"),true);
	    }
	    
	    @Test  //TC123
	    public void validateErrorMsgBySendingTravelDateMonToWedWeekdaySetMonWedFriAndSunWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		UtilityClass.listBoxHandlingUsingByText("805 - (room5)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 805 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(496, 3, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(497, 3, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(498, 3, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(499, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(500, 3, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(501, 3, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(502, 3, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(503, 3, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(504, 3, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(505, 3, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		UtilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(507, 3, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getInvalidTravelDurationNoPriceInfoMsg()+" and Expected message "+UtilityClass.readDataFromStringExcel(507, 3, "Sheet2"),true);  
	    }
	    @Test  //TC124
	    public void validateErrorMsgBySendingTravelDateMonToNextMonSetMonWedFriAndSunWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1500);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		UtilityClass.listBoxHandlingUsingByText("805 - (room5)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 805 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(496, 4, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(497, 4, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(498, 4, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(499, 4, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(500, 4, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(501, 4, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(502, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(503, 4, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(504, 4, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(505, 4, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		UtilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(507, 4, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getInvalidTravelDurationNoPriceInfoMsg()+" and Expected message "+UtilityClass.readDataFromStringExcel(507, 4, "Sheet2"),true);  
	    }
	    
	    @Test  //TC125
	    public void validateErrorMsgBySendingTravelDateSatToMonWeekdaySetMonWedFriAndSunWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1500);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		UtilityClass.listBoxHandlingUsingByText("805 - (room5)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 805 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(511, 1, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(512, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(513, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(514, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(515, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(516, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(517, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(518, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(519, 1, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(520, 1, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		UtilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(522, 1, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getInvalidTravelDurationNoPriceInfoMsg()+" and Expected message "+UtilityClass.readDataFromStringExcel(522, 1, "Sheet2"),true);
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






