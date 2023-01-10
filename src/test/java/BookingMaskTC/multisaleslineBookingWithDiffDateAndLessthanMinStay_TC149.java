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
	import POM.DashboardPage;
	import POM.accommodationListPage;
	import POM.loginPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import utility.utilityClass;
	
	public class multisaleslineBookingWithDiffDateAndLessthanMinStay_TC149 extends baseClass
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
			utilityClass.implicitlyWaitInMillis(3000);
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
	    		
	    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(13, 1, "Sheet3"));
	    		Reporter.log("Send number of passengers",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(4, 1, "Sheet3"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(5, 1, "Sheet3"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(6, 1, "Sheet3"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(7, 1, "Sheet3"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(8, 1, "Sheet3"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(9, 1, "Sheet3"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(21, 1, "Sheet3"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(22, 1, "Sheet3"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	            
	            utilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	           
	    		BookingMask.sendKOS2(utilityClass.readDataFromStringExcel(4, 2, "Sheet3"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode2(utilityClass.readDataFromStringExcel(5, 2, "Sheet3"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode2(utilityClass.readDataFromStringExcel(6, 2, "Sheet3"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard2(utilityClass.readDataFromStringExcel(7, 2, "Sheet3"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy2(utilityClass.readDataFromStringExcel(8, 2, "Sheet3"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax2(utilityClass.readDataFromStringExcel(9, 2, "Sheet3"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate2(utilityClass.readDataFromStringExcel(21, 2, "Sheet3"));
	    		Reporter.log("Send Travel from date for Season-C",true);
	    		
	    		BookingMask.sendTravelToDate2(utilityClass.readDataFromStringExcel(22, 2, "Sheet3"));
	    		Reporter.log("Send Travel To date for Season-C",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	    		
	    	   	
	    		BookingMask.sendKOS3(utilityClass.readDataFromStringExcel(4, 3, "Sheet3"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode3(utilityClass.readDataFromStringExcel(5, 3, "Sheet3"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode3(utilityClass.readDataFromStringExcel(6, 3, "Sheet3"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard3(utilityClass.readDataFromStringExcel(7, 3, "Sheet3"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy3(utilityClass.readDataFromStringExcel(8, 3, "Sheet3"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax3(utilityClass.readDataFromStringExcel(9, 3, "Sheet3"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate3(utilityClass.readDataFromStringExcel(21, 3, "Sheet3"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate3(utilityClass.readDataFromStringExcel(22, 3, "Sheet3"));
	    		Reporter.log("Send Travel To date ",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_4")).sendKeys("1-2");
	    		Reporter.log("Select Number of passenger",true);
	         
				utilityClass.scrollByAxis(0, 900);
				utilityClass.implicitlyWaitInMillis(30000);
	            try {
	            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", sendButton);
					Reporter.log("Clicked on sendbookingButton",true);
	            	
				} catch (Exception e) {
					System.out.println("Not clicked on Send Button");
				}   
	            
	            utilityClass.scrollByAxis(0, -500);
	            Thread.sleep(1500);
		}   
	   @Test
	   public void validategetmultisalesLinesBookingErrorMsgwithInValidStay() throws EncryptedDocumentException, IOException 
	  
	   {
		    String ActualMessage = BookingMask.getmultisalesLinesBookingErrorMsgwithValidStay();
		    String expectedMessage = utilityClass.readDataFromStringExcel(33, 1, "Sheet3");
		    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
		    Reporter.log("Validating Actual message "+BookingMask.getmultisalesLinesBookingErrorMsgwithValidStay()+" and Expected message "+utilityClass.readDataFromStringExcel(33, 1, "Sheet3"),true);
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
	
	
	
	



