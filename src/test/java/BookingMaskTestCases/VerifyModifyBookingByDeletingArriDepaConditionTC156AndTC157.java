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
	import POM.BookingUpdatePage;
	import POM.DashboardPage;
	import POM.accommodationListPage;
	import POM.loginPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import utility.UtilityClass;
	
	public class VerifyModifyBookingByDeletingArriDepaConditionTC156AndTC157 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
	    bookingMaskPage BookingMask;
		accommodationListPage accommdationList;
		BookingUpdatePage bookingupdate;
		String SalesBookingNo;
		String ActualReser;
	
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
			bookingupdate =new BookingUpdatePage(driver);
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
	    	  @Test 
	    	  public void validateBookingByDeletingArriDeparCondition() throws InterruptedException, EncryptedDocumentException, IOException
	    	  {
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
	    		
	    		Thread.sleep(1500);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(824, 1, "Sheet2"));
	    		
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(825, 1, "Sheet2"));
	    		Reporter.log("Send number of passengers",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(826, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(828, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(829, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(830, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(831, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(832, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(833, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	            
	            UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	           
	    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(826, 2, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(827, 2, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(828, 2, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(829, 2, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(830, 2, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(831, 2, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(832, 2, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(833, 2, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		
	    		BookingMask.sendKOS3(UtilityClass.readDataFromStringExcel(826, 3, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode3(UtilityClass.readDataFromStringExcel(827, 3, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode3(UtilityClass.readDataFromStringExcel(828, 3, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard3(UtilityClass.readDataFromStringExcel(829, 3, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy3(UtilityClass.readDataFromStringExcel(830, 3, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax3(UtilityClass.readDataFromStringExcel(831, 3, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate3(UtilityClass.readDataFromStringExcel(832, 3, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate3(UtilityClass.readDataFromStringExcel(833, 3, "Sheet2"));
	    		Reporter.log("Send Travel To date ",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_4")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	            
	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
	            Thread.sleep(500);
				BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));

				UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(30000);
	            try {
	            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", sendButton);
					Reporter.log("Clicked on sendbookingButton",true);
	            	
				} catch (Exception e) {
				}   
	            
	              UtilityClass.implicitlyWaitInMillis(30000);
		           String ResNo=BookingMask.getReservationNoBM("value");
		           String ResVer=BookingMask.getReservationVerNoBM("value");
		           String ActualReservNo= ResNo + ("/"+ResVer);
		           ActualReser=ActualReservNo;
		        
		        UtilityClass.implicitlyWaitInMillis(12000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(23000);
		        
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(9000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        UtilityClass.implicitlyWaitInMillis(10000);  
		        UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on SendBookingButton",true);
	    		Thread.sleep(3000);
	    		
	    		String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
	 			Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
	 			Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
		}
	
		   @Test 
	    	  public void validateBookingModificationByDeletingArriDeparCondition() throws InterruptedException, EncryptedDocumentException, IOException
	    	  {
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
	    		Thread.sleep(1500);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.scrollByAxis(0, 300);
	    		Thread.sleep(1000);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(824, 1, "Sheet2"));
	    		
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(825, 1, "Sheet2"));
	    		Reporter.log("Send number of passengers",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(826, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(828, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(829, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(830, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(831, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(832, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(833, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	            
	            UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	           
	    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(826, 2, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(827, 2, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(828, 2, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(829, 2, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(830, 2, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(831, 2, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(832, 2, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(833, 2, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		
	    		BookingMask.sendKOS3(UtilityClass.readDataFromStringExcel(826, 3, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode3(UtilityClass.readDataFromStringExcel(827, 3, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode3(UtilityClass.readDataFromStringExcel(828, 3, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard3(UtilityClass.readDataFromStringExcel(829, 3, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy3(UtilityClass.readDataFromStringExcel(830, 3, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax3(UtilityClass.readDataFromStringExcel(831, 3, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate3(UtilityClass.readDataFromStringExcel(832, 3, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate3(UtilityClass.readDataFromStringExcel(833, 3, "Sheet2"));
	    		Reporter.log("Send Travel To date ",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_4")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	            
	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
	            Thread.sleep(500);
				BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(99, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(100, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(101, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(102, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(103, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(104, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
				UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(30000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on SendBookingButton",true);
		        UtilityClass.implicitlyWaitInMillis(12000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(23000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(9000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        UtilityClass.implicitlyWaitInMillis(10000);  
		
		        UtilityClass.scrollByAxis(0, -400);
		        salesBookingList.clickOneditBooking1();
		        Reporter.log("Clicked on Edit booking1",true);
		        UtilityClass.implicitlyWaitInMillis(40000);
		        
		        Thread.sleep(8000);
		        UtilityClass.implicitlyWaitInMillis(40000);
	            BookingMask.ClearbookingActionfield();
	            UtilityClass.implicitlyWaitInMillis(40000);
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(835, 1, "Sheet2"));
	    		Reporter.log("Change Booking Action to U",true);
	    		bookingupdate.clearTravelFrom1();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelFrom1(UtilityClass.readDataFromStringExcel(836, 1, "Sheet2"));
	    		Reporter.log("Send Modified Travel from date for KOS1",true);
	    		UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(25000);
	    		bookingupdate.clearTravelTo1();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelTo1(UtilityClass.readDataFromStringExcel(837, 1, "Sheet2"));
	    		Reporter.log("Send Modified Travel To date for KOS1",true);
	    		bookingupdate.clearTravelFrom2();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelFrom2(UtilityClass.readDataFromStringExcel(836, 2, "Sheet2"));
	    		Reporter.log("Send Modified Travel from date for KOS2",true);
	    		UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(25000);
	    		bookingupdate.clearTravelTo2();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelTo2(UtilityClass.readDataFromStringExcel(837, 2, "Sheet2"));
	    		Reporter.log("Send Modified Travel To date FOR KOS2",true);
	    		bookingupdate.clearTravelFrom3();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelFrom3(UtilityClass.readDataFromStringExcel(836, 3, "Sheet2"));
	    		Reporter.log("Send Modified Travel from date for KOS3",true);
	    		UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(25000);
	    		bookingupdate.clearTravelTo3();
	    		Thread.sleep(1000);
	    		bookingupdate.sendTravelTo3(UtilityClass.readDataFromStringExcel(837, 3, "Sheet2"));
	    		Reporter.log("Send Modified Travel To date for KOS3",true);
	    		UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInsec(40);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on SendBookingButton",true);
	            UtilityClass.implicitlyWaitInMillis(30000);
		        String ResNo=BookingMask.getReservationNoBM("value");
		        String ResVer=BookingMask.getReservationVerNoBM("value");
		        String ActualReservNo= ResNo + ("/"+ResVer);
		        ActualReser=ActualReservNo;
		    	Reporter.log("Actual Reservation Number from Booking Page",true);
	    		Thread.sleep(3000);
	    		UtilityClass.implicitlyWaitInMillis(12000);
				BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(2000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(23000);
		        
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(827, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        Thread.sleep(9000);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        UtilityClass.implicitlyWaitInMillis(10000);  
	    		
	    		String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
	 			Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
	 			Reporter.log("Validating Modified ReservationNo with Action code U is "+ActualReser+" and Actual ReservationNo with Action code U "+salesBookingList.getSalesBookingColumn1(),true);
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
	
	
	
	




