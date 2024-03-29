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
import Base.BaseClass;
import POM.bookingUpdatePage;
import POM.DashboardPage;
import POM.bookingMaskPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class VerifyBookingForMinStayForFirstAndSecondMonthTC131ToTC132 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	bookingUpdatePage bookingUpdate;
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
		bookingUpdate=new bookingUpdatePage(driver);
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
	    @Test (priority=1)
	    public void validateBookingForFirstMonthWithMinStay() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		UtilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 804 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(526, 3, "Sheet2"));
    		UtilityClass.implicitlyWaitInMillis(2000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(527, 3, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(528, 3, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(529, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode to input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(530, 3, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(531, 3, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(532, 3, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(533, 3, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(534, 3, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(535, 3, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.implicitlyWaitInMillis(2000);
            
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInMillis(20000);
			UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on SendBookingButton",true);
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(8000);
            String ActualPrice = bookingUpdate.getPriceFieldValue1("value");
            ActualPrices=ActualPrice;
            UtilityClass.implicitlyWaitInMillis(30000);
	        String ResNo=BookingMask.getReservationNoBM("value");
	        String ResVer=BookingMask.getReservationVerNoBM("value");
	        String ActualReservNo= ResNo + ("/"+ResVer);
	        ActualReser=ActualReservNo;
	        Thread.sleep(5000);
	        UtilityClass.implicitlyWaitInMillis(20000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
		    UtilityClass.implicitlyWaitInMillis(8000);
		    salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(529, 3, "Sheet2"));
		    Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		    Thread.sleep(2000);
		    salesBookingList.clickOnbookingListButton();
		    Reporter.log("Clicked on Booking listButton",true);
		    Thread.sleep(20000);
		     salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(529, 3, "Sheet2"));
		     Reporter.log("Send TBM code",true);
		     Thread.sleep(8000);
		     salesBookingList.clickOnbookingListButton();
		     Reporter.log("Clicked on Booking listButton",true);
		     UtilityClass.implicitlyWaitInMillis(10000);  
		     String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
            
		     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
		     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
			 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
            
            String expectedPrice = UtilityClass.readDataFromStringExcel(537, 3, "Sheet2");
            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(537, 3, "Sheet2"),true);
	    }
    	
	    @Test (priority=2)
	    public void validateBookingForSecondMonthWithMinStay() throws EncryptedDocumentException, IOException, InterruptedException 
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
    		UtilityClass.listBoxHandlingUsingByText("804 - (room4)", BookingMask.roomCodeDropDownMethod());
    		Reporter.log("Selected room 804 from dropdown",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(526, 4, "Sheet2"));
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(527, 4, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(528, 4, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(529, 4, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(530, 4, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(531, 4, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(532, 4, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(533, 4, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(534, 4, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(535, 4, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
            
    		UtilityClass.implicitlyWaitInMillis(2000);
            
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
			UtilityClass.implicitlyWaitInsec(30);
			BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
    		UtilityClass.implicitlyWaitInMillis(2000);
    		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
    		Reporter.log("Click on SendBookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(10000); 
        
            String ActualMessage = BookingMask.getStayExceedErrorMessage();
    	    String expectedMessage = UtilityClass.readDataFromStringExcel(537, 4, "Sheet2");
    	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
    	    Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(537, 4, "Sheet2"),true);
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

