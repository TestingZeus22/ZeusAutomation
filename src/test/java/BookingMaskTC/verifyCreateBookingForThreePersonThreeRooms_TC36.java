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
	
	public class verifyCreateBookingForThreePersonThreeRooms_TC36 extends baseClass
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
    		
    		utilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.ClearbookingActionfield();
    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(591, 1, "Sheet2"));
    		
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(592, 3, "Sheet2"));
    		Reporter.log("Send number of paX",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(593, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(594, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(595, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(596, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(597, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(598, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(599, 1, "Sheet2"));
    		Reporter.log("Send Travel from date for Season-B",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(600, 1, "Sheet2"));
    		Reporter.log("Send Travel To date for Season-B",true);
    		
    		BookingMask.sendPassenger(utilityClass.readDataFromStringExcel(601, 1, "Sheet2"));
    		Reporter.log("Select Number of passenger",true);
            
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
            
    		BookingMask.sendKOS2(utilityClass.readDataFromStringExcel(593, 2, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(utilityClass.readDataFromStringExcel(594, 2, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(utilityClass.readDataFromStringExcel(595, 2, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(utilityClass.readDataFromStringExcel(596, 2, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(utilityClass.readDataFromStringExcel(597, 2, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(utilityClass.readDataFromStringExcel(598, 2, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate2(utilityClass.readDataFromStringExcel(599, 2, "Sheet2"));
    		Reporter.log("Send Travel from date for Season-B",true);
    		
    		BookingMask.sendTravelToDate2(utilityClass.readDataFromStringExcel(600, 2, "Sheet2"));
    		Reporter.log("Send Travel To date for Season-B",true);
    		
    		BookingMask.sendPassenger2(utilityClass.readDataFromStringExcel(601, 2, "Sheet2"));
    		Reporter.log("Select Number of passenger",true);
    		
    		Thread.sleep(500);
         

	    		
	    		BookingMask.sendKOS3(utilityClass.readDataFromStringExcel(593, 3, "Sheet2"));
	    		Reporter.log("Send correct KOS2 in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode3(utilityClass.readDataFromStringExcel(594, 3, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode3(utilityClass.readDataFromStringExcel(595, 3, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard3(utilityClass.readDataFromStringExcel(596, 3, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy3(utilityClass.readDataFromStringExcel(597, 3, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax3(utilityClass.readDataFromStringExcel(598, 3, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate3(utilityClass.readDataFromStringExcel(599, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date for Season-C",true);
	    		
	    		BookingMask.sendTravelToDate3(utilityClass.readDataFromStringExcel(600, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date for Season-C",true);
	    		
	    		BookingMask.sendPassenger3(utilityClass.readDataFromStringExcel(601, 3, "Sheet2"));
	    		Reporter.log("Select Number of passenger",true);
	    		Thread.sleep(500);
	            
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
		}
	
	   @Test
	   public void validatePriceForThreePersonThreeRoom() throws EncryptedDocumentException, IOException 
	  
	   {
		   	  String ActualPrice1 = BookingMask.getPriceFieldValue1("value");
			  String expectedPrice1 = utilityClass.readDataFromStringExcel(602, 1, "Sheet2");
			  Assert.assertEquals(ActualPrice1, expectedPrice1,"Test Case Failed as actual & expected Price are not matching");
			  Reporter.log("Validating Actual price for Season-H is "+BookingMask.getPriceFieldValue1("value")+" and Expected Price for Season-H is"+utilityClass.readDataFromStringExcel(602, 1, "Sheet2"),true);
			  
			  String ActualPrice2 = BookingMask.getPriceFieldValue2("value");
			  String expectedPrice2 = utilityClass.readDataFromStringExcel(602, 2, "Sheet2");
			  Assert.assertEquals(ActualPrice2, expectedPrice2,"Test Case Failed as actual & expected Price are not matching");
			  Reporter.log("Validating Actual price for Season-H is "+BookingMask.getPriceFieldValue2("value")+" and Expected Price for Season-H is "+utilityClass.readDataFromStringExcel(602, 2, "Sheet2"),true); 
			  
			  String ActualPrice3 = BookingMask.getPriceFieldValue2("value");
			  String expectedPrice3 = utilityClass.readDataFromStringExcel(602, 3, "Sheet2");
			  Assert.assertEquals(ActualPrice3, expectedPrice3,"Test Case Failed as actual & expected Price are not matching");
			  Reporter.log("Validating Actual price for Season-H is "+BookingMask.getPriceFieldValue3("value")+" and Expected Price for Season-H is "+utilityClass.readDataFromStringExcel(602, 3, "Sheet2"),true);  
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
	
	
	
	

