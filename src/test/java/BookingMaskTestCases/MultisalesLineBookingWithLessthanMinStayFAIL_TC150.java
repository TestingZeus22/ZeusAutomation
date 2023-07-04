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
	import POM.bookingMaskPage;
	import POM.DashboardPage;
	import POM.accommodationListPage;
	import POM.loginPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import utility.UtilityClass;
	
	public class MultisalesLineBookingWithLessthanMinStayFAIL_TC150 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
	    bookingMaskPage BookingMask;
		accommodationListPage accommdationList;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			UtilityClass.implicitlyWaitInMillis(3000);
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver); 
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
			accommdationList =new accommodationListPage(driver);	
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
	    		Thread.sleep(1000);

	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		Thread.sleep(6000);
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    
	    		UtilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(13, 1, "Sheet3"));
	    		Reporter.log("Send number of passengers",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(4, 1, "Sheet3"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(5, 1, "Sheet3"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(6, 1, "Sheet3"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(7, 1, "Sheet3"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(8, 1, "Sheet3"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(9, 1, "Sheet3"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(24, 1, "Sheet3"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(25, 1, "Sheet3"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Send Number of passenger",true);
	            UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	           
	    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(4, 2, "Sheet3"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(5, 2, "Sheet3"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(6, 2, "Sheet3"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(7, 2, "Sheet3"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(8, 2, "Sheet3"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(9, 2, "Sheet3"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(24, 2, "Sheet3"));
	    		Reporter.log("Send Travel from date for Season-C",true);
	    		
	    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(25, 2, "Sheet3"));
	    		Reporter.log("Send Travel To date for Season-C",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		
	    		BookingMask.sendKOS3(UtilityClass.readDataFromStringExcel(4, 3, "Sheet3"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode3(UtilityClass.readDataFromStringExcel(5, 3, "Sheet3"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode3(UtilityClass.readDataFromStringExcel(6, 3, "Sheet3"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard3(UtilityClass.readDataFromStringExcel(7, 3, "Sheet3"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy3(UtilityClass.readDataFromStringExcel(8, 3, "Sheet3"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax3(UtilityClass.readDataFromStringExcel(9, 3, "Sheet3"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate3(UtilityClass.readDataFromStringExcel(24, 3, "Sheet3"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate3(UtilityClass.readDataFromStringExcel(25, 3, "Sheet3"));
	    		Reporter.log("Send Travel To date ",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_4")).sendKeys("1-2");
	    		Reporter.log("Send Number of passenger",true);
				UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(30000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton",true);  
	            UtilityClass.scrollByAxis(0, -500);
	            Thread.sleep(1500);
		}   
	   @Test
	   public void validategetmultisalesLinesBookingErrorMsgwithLessthanMinStay() throws EncryptedDocumentException, IOException 
	   {
		    String ActualMessage = BookingMask.getmultisalesLinesBookingErrorMsgwithValidStay();
		    String expectedMessage = UtilityClass.readDataFromStringExcel(34, 1, "Sheet3");
		    Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
		    Reporter.log("Validating Actual message "+BookingMask.getmultisalesLinesBookingErrorMsgwithValidStay()+" and Expected message "+UtilityClass.readDataFromStringExcel(34, 1, "Sheet3"),true);
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
	
	
	
	




