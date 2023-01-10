package BookingMaskTC;

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
import Base.baseClass;
import POM.DashboardPage;
import POM.bookingMaskPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.utilityClass;

public class verifyTravelDateNotInAnySeason_TC87 extends baseClass {
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
			login.SendUserName(utilityClass.readDataFromStringExcel(5, 1, "Sheet2"));
			Reporter.log("Valid Username Entered",true);
			login.SendPassword(utilityClass.readDataFromStringExcel(6, 1, "Sheet2"));
			Reporter.log("Valid Password Entered",true);
			login.ClickOnLoginToDashboard();
			Reporter.log("Clicked on Dashboard button",true);
			
			utilityClass.implicitlyWaitInMillis(1000);
			utilityClass.listBoxHandlingUsingByText("Falk Tours AG", selectCompany.SelectDropDownList());
			Reporter.log("Select the Falk Tours AG from given list",true);
			utilityClass.implicitlyWaitInMillis(1000);
			selectCompany.ClickOnProceedButton();
			Reporter.log("Clicked on proceed button",true);	
			Thread.sleep(9500); 
		
    		dashboard.SalesClick();
    		Reporter.log("Clicked on sales dropdown in Dashboard",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		dashboard.salesBookingClick();
    		Reporter.log("Clicked on sales Booking in Dashboard",true);
    		Thread.sleep(5000);
    		utilityClass.scrollByAxis(100, 0);
    		salesBookingList.clickOncreateButton();
    		Reporter.log("Clicked on create Button in sales Booking page",true);
    		Thread.sleep(6000);
    		
    		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		
    		Thread.sleep(1000);
    		
    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(1000);
    		utilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		utilityClass.implicitlyWaitInMillis(1000);
    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(67, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(68, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(69, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(70, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(71, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(72, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(73, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(172, 3, "Sheet2"));
    		Reporter.log("Send Travel from date end of Season-B",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(173, 3, "Sheet2"));
    		Reporter.log("Send Travel To start date of season-C",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(2000); 
		}
	    @Test
	    public void validateErrorMsgDatesOutOfSeason() throws EncryptedDocumentException, IOException 
	    {
	    	String ActualMessage = BookingMask.getseasonPriceNotbelongToTableMsg();
		    String expectedMessage = utilityClass.readDataFromStringExcel(174, 3, "Sheet2");
		    Assert.assertEquals(true, expectedMessage.contains(ActualMessage));
		    Reporter.log("Validating Actual message "+BookingMask.getseasonPriceNotbelongToTableMsg()+"and Expected message "+utilityClass.readDataFromStringExcel(174, 3, "Sheet2"),true);
	    }
	    
	   @AfterClass 
	   public void closeBrowser()
	    {
		 driver.close();
		 Reporter.log("Closing Browser",true);
	    }
	 
	 }






