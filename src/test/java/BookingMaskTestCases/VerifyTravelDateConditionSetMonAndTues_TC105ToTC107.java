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

public class VerifyTravelDateConditionSetMonAndTues_TC105ToTC107 extends BaseClass {
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
	    @Test   (priority=1)
	    public void validateErrorMsgBySendingTravelDateMonToThurWeekdaySetMonToTue() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		UtilityClass.listBoxHandlingUsingByText("812 - (room12)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 812 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(436, 1, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(437, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(438, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(439, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(440, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(441, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(442, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(443, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(444, 1, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(445, 1, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(4000); 
	    	
            String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(447, 1, "Sheet2");
    	    Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getInvalidTravelDurationNoPriceInfoMsg()+" and Expected message "+UtilityClass.readDataFromStringExcel(447, 1, "Sheet2"),true);
	    }
	    
	    @Test  (priority=2)
	    public void validateErrorMsgBySendingTravelDateSunToTueWeekdaySetMonToTue() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		UtilityClass.listBoxHandlingUsingByText("812 - (room12)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 812 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(436, 2, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(437, 2, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(438, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(439, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(440, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(441, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(442, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(443, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(444, 2, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(445, 2, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(447, 2, "Sheet2");
    	    Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getInvalidTravelDurationNoPriceInfoMsg()+" and Expected message "+UtilityClass.readDataFromStringExcel(447, 2, "Sheet2"),true);
	    }
	    
	    @Test  (priority=3)
	    public void validateErrorMsgBySendingTravelDateThursToFridWeekdaySetMonToTue() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		Thread.sleep(1000);
	    	UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1500);
    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		UtilityClass.listBoxHandlingUsingByText("812 - (room12)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 812 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(436, 3, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(437, 3, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(438, 3, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(439, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(440, 3, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(441, 3, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(442, 3, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(443, 3, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(444, 3, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(445, 3, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualMessage = BookingMask.getInvalidTravelDurationNoPriceInfoMsg();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(447, 3, "Sheet2");
    	    Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getInvalidTravelDurationNoPriceInfoMsg()+" and Expected message "+UtilityClass.readDataFromStringExcel(447, 3, "Sheet2"),true);
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





