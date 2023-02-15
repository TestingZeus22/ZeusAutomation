package BookingMaskTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.baseClass;
import POM.BookingUpdatePage;
import POM.DashboardPage;
import POM.bookingMaskPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.utilityClass;

public class verifyBookingsForMaxAndMinStayDurationWithActionCodeBA_TC126ToTC130 extends baseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	BookingUpdatePage bookingUpdate;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver);
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
		bookingUpdate=new BookingUpdatePage(driver);
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
		}
	    @Test 
	    public void validateBookingAndPriceForMinStayWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(511, 2, "Sheet2"));
    		utilityClass.implicitlyWaitInMillis(2000);
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(512, 2, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(513, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(514, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode to input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(515, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(516, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(517, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(518, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(519, 2, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(520, 2, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
                       
       		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
	    	
            String ActualPrice = BookingMask.getPriceFieldValue1("value");
            String expectedPrice = utilityClass.readDataFromStringExcel(522, 2, "Sheet2");
            Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(522, 2, "Sheet2"),true);
	    }
	    
	    @Test 
	    public void validateBookingAndPriceForMaxStayWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(511, 3, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(512, 3, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(513, 3, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(514, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(515, 3, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(516, 3, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(517, 3, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(518, 3, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(519, 3, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(520, 3, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
	    	
            String ActualPrice = BookingMask.getPriceFieldValue1("value");
            String expectedPrice = utilityClass.readDataFromStringExcel(522, 3, "Sheet2");
            Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(522, 3, "Sheet2"),true);
	    }
	    
	    @Test 
	    public void validateBookingAndPriceBetweenMinAndMaxStayWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(511, 4, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(512, 4, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(513, 4, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(514, 4, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(515, 4, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(516, 4, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(517, 4, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(518, 4, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(519, 4, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(520, 4, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualPrice = BookingMask.getPriceFieldValue1("value");
            String expectedPrice = utilityClass.readDataFromStringExcel(522, 4, "Sheet2");
            Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(522, 4, "Sheet2"),true);
	    }
	    @Test 
	    public void validteErrorMessageForBelowMinStayWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1500);
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(526, 1, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(527, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(528, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(529, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(530, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(531, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(532, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(533, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(534, 1, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(535, 1, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualMessage = BookingMask.getStayExceedErrorMessage();
    	    String expectedMessage = utilityClass.readDataFromStringExcel(537, 1, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(537, 1, "Sheet2"),true);
	    }
	    
	    @Test 
	    public void validateErrorMessageForAboveMaxStayWithBA() throws EncryptedDocumentException, IOException, InterruptedException 
	    {
	    	utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		Thread.sleep(1500);
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(526, 2, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(527, 2, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(528, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(529, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(530, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(531, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(532, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(533, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(534, 2, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(535, 2, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(5000); 
         
            String ActualMessage = BookingMask.getStayExceedErrorMessage();
    	    String expectedMessage = utilityClass.readDataFromStringExcel(537, 2, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(537, 2, "Sheet2"),true);
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

