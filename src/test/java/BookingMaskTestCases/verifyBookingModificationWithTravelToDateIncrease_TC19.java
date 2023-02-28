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

public class verifyBookingModificationWithTravelToDateIncrease_TC19 extends baseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
		bookingMaskPage BookingMask;
		BookingUpdatePage bookingupdate;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver);
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
			bookingupdate = new BookingUpdatePage(driver);
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
	    		Thread.sleep(6000);
	    		utilityClass.scrollByAxis(100, 0);
	    		salesBookingList.clickOncreateButton();
	    		Reporter.log("Clicked on create Button in sales Booking page",true);
	    		Thread.sleep(7000);
	    		
	    		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		utilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		utilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(261, 3, "Sheet2"));
	    		Reporter.log("Send Booking action");
	    		
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		
	    		BookingMask.clearNoOfPax();
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(262, 3, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(263, 3, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(264, 3, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(265, 3, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(266, 3, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(267, 3, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(268, 3, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(269, 3, "Sheet2"));
	    		Reporter.log("Send Travel from dates in Season-B",true);
	    		
	    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(270, 3, "Sheet2"));
	    		Reporter.log("Send Travel To date in Season-B",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		utilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
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
				utilityClass.scrollByAxis(0, 900);
				utilityClass.implicitlyWaitInMillis(40000);
				utilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton",true);
	            utilityClass.scrollByAxis(0, 300);
	            utilityClass.implicitlyWaitInMillis(40000);
	            BookingMask.ClearbookingActionfield();
	            BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(272, 3, "Sheet2"));
	    		utilityClass.implicitlyWaitInMillis(40000);
	    		bookingupdate.clearTravelTo1();
	    		utilityClass.implicitlyWaitInMillis(40000);
	    		bookingupdate.sendTravelTo1(utilityClass.readDataFromStringExcel(273, 3, "Sheet2"));
	    		Reporter.log("Send Modified Travel To date",true);
	    		utilityClass.implicitlyWaitInMillis(10000);
	    		utilityClass.scrollByAxis(0, 900);
				utilityClass.implicitlyWaitInMillis(20000);
				utilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton",true);
	    		Thread.sleep(6000);
		          }
	    		 @Test
	    		 public void validatePriceWithTravelToDateIncrease() throws EncryptedDocumentException, IOException 
	    		 {
	    		 String ActualPrice = bookingupdate.getPriceFieldValue1("value");
	    		 String expectedPrice = utilityClass.readDataFromStringExcel(276, 3, "Sheet2");
	    		 Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	    		 Reporter.log("Validating Actual Price with increased travel to date  "+bookingupdate.getPriceFieldValue1("value")+" and Expected Price with increase in date is "+utilityClass.readDataFromStringExcel(276, 3, "Sheet2"),true);
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