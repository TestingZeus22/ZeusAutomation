package BookingMaskTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import POM.bookingUpdatePage;
import POM.DashboardPage;
import POM.accommodationGeneratedPage;
import POM.accommodationListPage;
import POM.accommodationNewPage;
import POM.bookingMaskPage;
import POM.calculationSettingPage;
import POM.contractDetailsPage;
import POM.loginPage;
import POM.offerCalculationPage;
import POM.offerDefinationPage;
import POM.pricePage;
import POM.roomDetailsPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import POM.tbmCodeMasterPage;
import POM.tbmCodeNewCreatePage;
import utility.UtilityClass;

public class VerifyBookingByEditingTravelTypeTC47 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	bookingUpdatePage bookingupdate;
	
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
    	UtilityClass.scrollByAxis(0, 300);
    	Thread.sleep(1000);
    	UtilityClass.implicitlyWaitInMillis(1000);
    	UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    	Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    	UtilityClass.listBoxHandlingUsingByText("FNTR", BookingMask.TravelTypeDropDownMethod());
      	Reporter.log("Select FNTR TravelType option in dropdownList",true);
    	BookingMask.ClearbookingActionfield();
    	BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(666, 3, "Sheet2"));
    	BookingMask.clearNoOfPax();
    	UtilityClass.implicitlyWaitInMillis(1000);
    		
    	BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(667, 3, "Sheet2"));
    	Reporter.log("Send number of passenger",true);
    	Thread.sleep(1000);
    		
    	BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(668, 3, "Sheet2"));
    	Reporter.log("Send correct KOS in input field",true);
    	UtilityClass.implicitlyWaitInMillis(1000);
    	BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(669, 3, "Sheet2"));
    	Reporter.log("Send correct ProductCode in input field",true);
    	UtilityClass.implicitlyWaitInMillis(1000);
    		
    	BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(670, 3, "Sheet2"));
    	Reporter.log("Send roomcode in input field",true);
    		
    	BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(671, 3, "Sheet2"));
    	Reporter.log("Send correct boardName",true);
    		
    	BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(672, 3, "Sheet2"));
    	Reporter.log("Send Occupancy",true);
    	
    	BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(673, 3, "Sheet2"));
    	Reporter.log("Send bookinglines ",true);
    		
    	BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(674, 3, "Sheet2"));
    	Reporter.log("Send Travel from date ",true);
    		
    	BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(675, 3, "Sheet2"));
    	Reporter.log("Send Travel To date ",true);
    	driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    	Reporter.log("Send Number of passenger",true);
            
    	UtilityClass.implicitlyWaitInMillis(2000);
        BookingMask.clickOnSendbookingButton();
        Reporter.log("Clicked on sendbookingButton",true);
        UtilityClass.scrollByAxis(0, 600);
        Thread.sleep(3000); 
        UtilityClass.implicitlyWaitInMillis(2000);
    	BookingMask.clickOnSendbookingButton();
        Reporter.log("Clicked on SendbookingButton",true);   
        Thread.sleep(3000);
	}
 
    @Test //TC47
    public void validateBookingWithFNTRTravelType() throws EncryptedDocumentException, IOException 
    {
    	String ActualMessage = BookingMask.getTravelTypeErrorMessage();
	    String expectedMessage = UtilityClass.readDataFromStringExcel(677, 3, "Sheet2");
	    Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
	    Reporter.log("Validating Actual message "+BookingMask.getTravelTypeErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(677, 3, "Sheet2"),true);  
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


