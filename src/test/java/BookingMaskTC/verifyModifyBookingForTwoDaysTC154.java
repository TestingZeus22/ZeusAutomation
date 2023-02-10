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
	import POM.bookingMaskPage;
	import POM.BookingUpdatePage;
	import POM.DashboardPage;
	import POM.accommodationListPage;
	import POM.loginPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import utility.utilityClass;
	
	public class verifyModifyBookingForTwoDaysTC154 extends baseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
	    bookingMaskPage BookingMask;
		accommodationListPage accommdationList;
		BookingUpdatePage bookingupdate;
	
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			utilityClass.implicitlyWaitInMillis(3000);
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver); 
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
			accommdationList =new accommodationListPage(driver);
			bookingupdate =new BookingUpdatePage(driver);
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
	    		utilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		utilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		
	    		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		
	    		Thread.sleep(1500);
	    		
	    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		
	    		utilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(787, 1, "Sheet2"));
	    		
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		
	    		BookingMask.clearNoOfPax();
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(788, 1, "Sheet2"));
	    		Reporter.log("Send number of passengers",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(789, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(790, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(791, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(792, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(793, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(794, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(795, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(796, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	            
	            utilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	           
	    		BookingMask.sendKOS2(utilityClass.readDataFromStringExcel(789, 2, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode2(utilityClass.readDataFromStringExcel(790, 2, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode2(utilityClass.readDataFromStringExcel(791, 2, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard2(utilityClass.readDataFromStringExcel(792, 2, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy2(utilityClass.readDataFromStringExcel(793, 2, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax2(utilityClass.readDataFromStringExcel(794, 2, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate2(utilityClass.readDataFromStringExcel(795, 2, "Sheet2"));
	    		Reporter.log("Send Travel from date for Season-C",true);
	    		
	    		BookingMask.sendTravelToDate2(utilityClass.readDataFromStringExcel(796, 2, "Sheet2"));
	    		Reporter.log("Send Travel To date for Season-C",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		
	    		BookingMask.sendKOS3(utilityClass.readDataFromStringExcel(789, 3, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode3(utilityClass.readDataFromStringExcel(790, 3, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode3(utilityClass.readDataFromStringExcel(791, 3, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard3(utilityClass.readDataFromStringExcel(792, 3, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy3(utilityClass.readDataFromStringExcel(793, 3, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax3(utilityClass.readDataFromStringExcel(794, 3, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate3(utilityClass.readDataFromStringExcel(795, 3, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate3(utilityClass.readDataFromStringExcel(796, 3, "Sheet2"));
	    		Reporter.log("Send Travel To date ",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_4")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	            
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
				utilityClass.implicitlyWaitInMillis(30000);
	            try {
	            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", sendButton);
					Reporter.log("Clicked on sendbookingButton",true);
	            	
				} catch (Exception e) {
				}   
		        
		        utilityClass.implicitlyWaitInMillis(12000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        utilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(790, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(23000);
		        
		        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(790, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(9000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		      
		        utilityClass.implicitlyWaitInMillis(10000);
		        utilityClass.scrollByAxis(0, -400);
		        salesBookingList.clickOneditBooking1();
		        Reporter.log("Click on Edit booking1",true);
		        utilityClass.implicitlyWaitInMillis(40000);
		        
		        Thread.sleep(8000);
		        utilityClass.implicitlyWaitInMillis(40000);
	            BookingMask.ClearbookingActionfield();
	            utilityClass.implicitlyWaitInMillis(40000);
	    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(798, 1, "Sheet2"));
	    		Reporter.log("Change Booking Action to U",true);
	    		bookingupdate.clearTravelFrom1();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelFrom1(utilityClass.readDataFromStringExcel(799, 1, "Sheet2"));
	    		Reporter.log("Send Modified Travel from date",true);
	    		utilityClass.scrollByAxis(0, 900);
				utilityClass.implicitlyWaitInMillis(25000);
	    		bookingupdate.clearTravelTo1();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelTo1(utilityClass.readDataFromStringExcel(800, 1, "Sheet2"));
	    		Reporter.log("Send Modified Travel To date",true);
	    		utilityClass.scrollByAxis(0, 900);
				utilityClass.implicitlyWaitInMillis(25000);

	            try {
	            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", sendButton);
					Reporter.log("Clicked on sendbookingButton",true);
				} catch (Exception e) {
				}
	    		Thread.sleep(2000);
		}

	   @Test
	   public void validateModifyBookingForTwoDaysWithArriDeparCondition() throws EncryptedDocumentException, IOException 
	   {
		     String ActualMessage = BookingMask.getStayExceedErrorMessage();
	    	 String expectedMessage = utilityClass.readDataFromStringExcel(802, 1, "Sheet2");
	    	 Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
	    	 Reporter.log("Validating Actual message "+BookingMask.getStayExceedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(802, 1, "Sheet2"),true);
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
	
	
	
	



