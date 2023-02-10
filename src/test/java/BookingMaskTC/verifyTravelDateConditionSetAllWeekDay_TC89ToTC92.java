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

public class verifyTravelDateConditionSetAllWeekDay_TC89ToTC92 extends baseClass {
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
    		
		}
	    @Test //TC89
	    public void validatePriceForWeekDay() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		utilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 804 from dropdown",true);
    		utilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		utilityClass.implicitlyWaitInMillis(1000);
    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(376, 1, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(377, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(378, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(379, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(380, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(381, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(382, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(383, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(384, 1, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(385, 1, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
            
            String ActualPrice = BookingMask.getPriceFieldValue1("value");
            String expectedPrice = utilityClass.readDataFromStringExcel(387, 1, "Sheet2");
            Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(387, 1, "Sheet2"),true);
	    }
	    
	    @Test //TC90
	    public void validatePriceForWeekend() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1000);
    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(2000);
    		utilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 804 from dropdown",true);
    		utilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		utilityClass.implicitlyWaitInMillis(1000);
    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(376, 2, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(377, 2, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(378, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(379, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(380, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(381, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(382, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(383, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(384, 2, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(385, 2, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
	    	
            String ActualPrice = BookingMask.getPriceFieldValue1("value");
  		    String expectedPrice = utilityClass.readDataFromStringExcel(387, 2, "Sheet2");
  		    Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
  		    Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(387, 2, "Sheet2"),true);
	    }
	    
	    @Test  //TC91
	    public void validatePriceForBothWeekdaysAndWeekend() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		Thread.sleep(1000);
		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		Thread.sleep(2000);
		utilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
		Reporter.log("Selected room 804 from dropdown",true);
		utilityClass.scrollByAxis(0, 300);
		Thread.sleep(1000);
		utilityClass.implicitlyWaitInMillis(1000);
		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		utilityClass.implicitlyWaitInMillis(1000);
		BookingMask.ClearbookingActionfield();
		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(376, 3, "Sheet2"));
		BookingMask.clearNoOfPax();
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(377, 3, "Sheet2"));
		Reporter.log("Send number of passenger",true);
		Thread.sleep(1000);
		
		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(378, 3, "Sheet2"));
		Reporter.log("Send correct KOS in input field",true);
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(379, 3, "Sheet2"));
		Reporter.log("Send correct ProductCode in input field",true);
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(380, 3, "Sheet2"));
		Reporter.log("Send roomcode in input field",true);
		
		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(381, 3, "Sheet2"));
		Reporter.log("Send correct boardName",true);
		
		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(382, 3, "Sheet2"));
		Reporter.log("Send Occupancy",true);
	
		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(383, 3, "Sheet2"));
		Reporter.log("Send bookinglines ",true);
		
		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(384, 3, "Sheet2"));
		Reporter.log("Send Travel from date",true);
		
		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(385, 3, "Sheet2"));
		Reporter.log("Send Travel To date",true);
		
		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		Reporter.log("Select Number of passenger",true);
        
		utilityClass.implicitlyWaitInMillis(2000);
        BookingMask.clickOnSendbookingButton();
        Reporter.log("Clicked on sendbookingButton",true);
        utilityClass.scrollByAxis(0, 600);
        Thread.sleep(3000); 
        
        String ActualPrice = BookingMask.getPriceFieldValue1("value");
		String expectedPrice = utilityClass.readDataFromStringExcel(387, 3, "Sheet2");
		Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(387, 3, "Sheet2"),true);
        
	    }
	    
	    @Test //TC92
	    public void validatePriceForTwoWeekdayAndOneWeekend() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		Thread.sleep(1000);
		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		Thread.sleep(2000);
		utilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
		Reporter.log("Selected room 804 from dropdown",true);
		utilityClass.scrollByAxis(0, 300);
		Thread.sleep(1000);
		utilityClass.implicitlyWaitInMillis(1000);
		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		utilityClass.implicitlyWaitInMillis(1000);
		BookingMask.ClearbookingActionfield();
		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(376, 4, "Sheet2"));
		BookingMask.clearNoOfPax();
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(377, 4, "Sheet2"));
		Reporter.log("Send number of passenger",true);
		Thread.sleep(1000);
		
		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(378, 4, "Sheet2"));
		Reporter.log("Send correct KOS in input field",true);
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(379, 4, "Sheet2"));
		Reporter.log("Send correct ProductCode in input field",true);
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(380, 4, "Sheet2"));
		Reporter.log("Send roomcode in input field",true);
		
		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(381, 4, "Sheet2"));
		Reporter.log("Send correct boardName",true);
		
		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(382, 4, "Sheet2"));
		Reporter.log("Send Occupancy",true);
	
		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(383, 4, "Sheet2"));
		Reporter.log("Send bookinglines ",true);
		
		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(384, 4, "Sheet2"));
		Reporter.log("Send Travel from date",true);
		
		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(385, 4, "Sheet2"));
		Reporter.log("Send Travel To date",true);
		
		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		Reporter.log("Select Number of passenger",true);
        
		utilityClass.implicitlyWaitInMillis(2000);
        BookingMask.clickOnSendbookingButton();
        Reporter.log("Clicked on sendbookingButton",true);
        utilityClass.scrollByAxis(0, 600);
        Thread.sleep(5000); 
        
        String ActualPrice = BookingMask.getPriceFieldValue1("value");
		String expectedPrice = utilityClass.readDataFromStringExcel(387, 4, "Sheet2");
		Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(387, 4, "Sheet2"),true);
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




