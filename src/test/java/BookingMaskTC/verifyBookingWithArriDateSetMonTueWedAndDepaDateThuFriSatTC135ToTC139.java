package BookingMaskTC;

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

public class verifyBookingWithArriDateSetMonTueWedAndDepaDateThuFriSatTC135ToTC139 extends baseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	BookingUpdatePage bookingUpdate;
	
	String ActualReser;
	String ExpectedReservationNo;
	String ActualPrices;
	
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
	    @Test  //tc135
	    public void validateBookingWithMinStayForCorrectArriDeptDaysWithB() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		utilityClass.implicitlyWaitInMillis(2000);
    		
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(541, 3, "Sheet2"));
    		utilityClass.implicitlyWaitInMillis(2000);
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(542, 3, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(543, 3, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(544, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode to input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(545, 3, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(546, 3, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(547, 3, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(548, 3, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(549, 3, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(550, 3, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            
    		utilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		Thread.sleep(500);
			BookingMask.sendLastName(utilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendFirstName(utilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendCityName(utilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendZipCode(utilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendStreetNo(utilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendPhoneNum(utilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendEmail(utilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
         
			utilityClass.implicitlyWaitInMillis(20000);
            try {
            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", sendButton);
				Reporter.log("Clicked on sendbookingButton",true);
            	
			} catch (Exception e) {
			}
			
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(8000);
            
            String ActualPrice = bookingUpdate.getPriceFieldValue1("value");
            ActualPrices=ActualPrice;
            
            utilityClass.implicitlyWaitInMillis(30000);
	        String ResNo=BookingMask.getReservationNoBM("value");
	        String ResVer=BookingMask.getReservationVerNoBM("value");
	        String ActualReservNo= ResNo + ("/"+ResVer);
	        ActualReser=ActualReservNo;
	          
	        utilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
		    utilityClass.implicitlyWaitInMillis(8000);
		    salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(544, 3, "Sheet2"));
		    Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		    Thread.sleep(2000);
		    salesBookingList.clickOnbookingListButton();
		    Reporter.log("Clicked on Booking listButton",true);
		    Thread.sleep(20000);
		        
		     salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(544, 3, "Sheet2"));
		     Reporter.log("Send TBM code",true);
		     Thread.sleep(8000);
		     salesBookingList.clickOnbookingListButton();
		     Reporter.log("Clicked on Booking listButton",true);
		     utilityClass.implicitlyWaitInMillis(10000);  
		        
		     String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
            
		     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
		     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
			 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
            
            String expectedPrice = utilityClass.readDataFromStringExcel(552, 3, "Sheet2");
            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+utilityClass.readDataFromStringExcel(552, 3, "Sheet2"),true);
	    }
	    
	    @Test  //TC136
	    public void validateBookingWithMaxStayForCorrectArriDeptDaysWithB() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(541, 4, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(542, 4, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(543, 4, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(544, 4, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(545, 4, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(546, 4, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(547, 4, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(548, 4, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(549, 4, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(550, 4, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
    		
    		utilityClass.implicitlyWaitInMillis(2000);
            
    		utilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		Thread.sleep(500);
			BookingMask.sendLastName(utilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendFirstName(utilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendCityName(utilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendZipCode(utilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendStreetNo(utilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendPhoneNum(utilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendEmail(utilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
    		
			utilityClass.implicitlyWaitInMillis(20000);
            try {
            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", sendButton);
				Reporter.log("Clicked on sendbookingButton",true);
            	
			} catch (Exception e) {
			}
            Reporter.log("Clicked on sendbookingButton",true);
    		utilityClass.implicitlyWaitInMillis(2000);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(9000); 
            
            String ActualPrice = bookingUpdate.getPriceFieldValue1("value");
            ActualPrices=ActualPrice;
            
            utilityClass.implicitlyWaitInMillis(30000);
	        String ResNo=BookingMask.getReservationNoBM("value");
	        String ResVer=BookingMask.getReservationVerNoBM("value");
	        String ActualReservNo= ResNo + ("/"+ResVer);
	        ActualReser=ActualReservNo;
	          
	        utilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
		    utilityClass.implicitlyWaitInMillis(8000);
		    salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(544, 4, "Sheet2"));
		    Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		    Thread.sleep(2000);
		    salesBookingList.clickOnbookingListButton();
		    Reporter.log("Clicked on Booking listButton",true);
		    Thread.sleep(20000);
		        
		     salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(544, 4, "Sheet2"));
		     Reporter.log("Send TBM code",true);
		     Thread.sleep(8000);
		     salesBookingList.clickOnbookingListButton();
		     Reporter.log("Clicked on Booking listButton",true);
		     utilityClass.implicitlyWaitInMillis(10000);  
		        
		     String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
            
		     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
		     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
			 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
            
            String expectedPrice = utilityClass.readDataFromStringExcel(552, 4, "Sheet2");
            Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+ActualPrice+" and Expected Price "+utilityClass.readDataFromStringExcel(552, 4, "Sheet2"),true);
	    }
	    
	    @Test  //TC137
	    public void validateBookingToCrossMaxStayForCorrectArriDeptDaysWithB() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(556, 1, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(557, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(558, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(559, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(560, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(561, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(562, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(563, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(564, 1, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(565, 1, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            
    		utilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		Thread.sleep(500);
			BookingMask.sendLastName(utilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendFirstName(utilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendCityName(utilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendZipCode(utilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendStreetNo(utilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendPhoneNum(utilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendEmail(utilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
    		utilityClass.implicitlyWaitInMillis(2000);
    		try {
            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", sendButton);
				Reporter.log("Clicked on sendbookingButton",true);
            	
			} catch (Exception e) {
			}
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(8000); 
            
            String ActualMessage = BookingMask.getStayExceedErrorMessage();
    	    String expectedMessage = utilityClass.readDataFromStringExcel(567, 1, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(567, 1, "Sheet2"),true);
          
	    }
	    @Test //TC138
	    public void validateBookingWithOutofArrivalDayWithB() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(556, 2, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(557, 2, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(558, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(559, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(560, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(561, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(562, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(563, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(564, 2, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(565, 2, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            
    		utilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		Thread.sleep(500);
			BookingMask.sendLastName(utilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendFirstName(utilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendCityName(utilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendZipCode(utilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendStreetNo(utilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendPhoneNum(utilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendEmail(utilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
    		utilityClass.implicitlyWaitInMillis(2000);
    		try {
            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", sendButton);
				Reporter.log("Clicked on sendbookingButton",true);
            	
			} catch (Exception e) {
			}
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(10000); 
        
            String ActualMessage = BookingMask.getStayExceedErrorMessage();
    	    String expectedMessage = utilityClass.readDataFromStringExcel(567, 2, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(567, 2, "Sheet2"),true);
	    }
	   
	    @Test //TC139
	    public void validateBookingWithStayLimitCrossedAndIncorrectArriDeptWithB() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(556, 3, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(557, 3, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(558, 3, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(559, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(560, 3, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(561, 3, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(562, 3, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(563, 3, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(564, 3, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(565, 3, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
    		utilityClass.implicitlyWaitInMillis(2000);
            
    		utilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		Thread.sleep(500);
			BookingMask.sendLastName(utilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendFirstName(utilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendCityName(utilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendZipCode(utilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendStreetNo(utilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendPhoneNum(utilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			Thread.sleep(500);
			BookingMask.sendEmail(utilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
    		utilityClass.implicitlyWaitInMillis(2000);
    		try {
            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", sendButton);
				Reporter.log("Clicked on sendbookingButton",true);
            	
			} catch (Exception e) {
			}
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(10000); 
     
		     String ActualMessage = BookingMask.getStayExceedErrorMessage();
	    	 String expectedMessage = utilityClass.readDataFromStringExcel(567, 3, "Sheet2");
	    	 Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
	    	 Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(567, 3, "Sheet2"),true);
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



