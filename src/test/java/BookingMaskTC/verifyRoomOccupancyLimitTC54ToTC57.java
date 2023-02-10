	package BookingMaskTC;
	
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	
	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
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
	import POM.accommodationNewPage;
	import POM.calculationSettingPage;
	import POM.contractsPage;
	import POM.loginPage;
	import POM.offerCalculationPage;
	import POM.offerDefination;
	import POM.pricePage;
	import POM.roomDetailsPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import POM.tbmCodeMasterPage;
	import POM.tbmCodeNewCreatePage;
	import utility.utilityClass;
	
	public class verifyRoomOccupancyLimitTC54ToTC57 extends baseClass
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
			bookingupdate=new BookingUpdatePage(driver);
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
		
	    		@Test  (priority = 1) //54
	    		public void validateOccupancyMinLimitCross() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		utilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(2000);
	    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(2000);
	    		utilityClass.scrollByAxis(0, 300);
	    		utilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 808 from dropdown",true);
	    		utilityClass.implicitlyWaitInMillis(3000);
	    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		Thread.sleep(2000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(843, 1, "Sheet2"));
	    		Reporter.log("Send Booking action");
	    		utilityClass.implicitlyWaitInMillis(3000);
	    		BookingMask.clearNoOfPax();
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(844, 1, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(845, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(846, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(847, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(848, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(849, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(850, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(851, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(852, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-1");
	    		Reporter.log("Select Number of passenger",true);
	    		utilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	        	Thread.sleep(500);
	            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(854, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(855, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(856, 1, "Sheet2"));
				Thread.sleep(500);
	         
	            utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
				Thread.sleep(5000);
	            try {
	            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", sendButton);
					Reporter.log("Clicked on sendbookingButton",true);	
				} catch (Exception e) {
		
				}
	             Thread.sleep(4000);
				 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
		    	 String expectedMessage = utilityClass.readDataFromStringExcel(870, 1, "Sheet2");
		    	 Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
		    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(870, 1, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority = 2)  //TC-55
	    		public void validateOccupancyMaxLimitCross() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		utilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(2000);
		    		
		    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		utilityClass.scrollByAxis(0, 300);
		    		utilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 808 from dropdown",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(2000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(843, 2, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(844, 2, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(845, 2, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(846, 2, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(847, 2, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(848, 2, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(849, 2, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(850, 2, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(851, 2, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(852, 2, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-4");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(854, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(855, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(856, 2, "Sheet2"));
					Thread.sleep(500);
		            
					utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown2());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(858, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(859, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(860, 2, "Sheet2"));
					Thread.sleep(500);
					
					utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown3());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(862, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(863, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(864, 2, "Sheet2"));
					Thread.sleep(500);
					
					utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown4());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData4(utilityClass.readDataFromStringExcel(866, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData4(utilityClass.readDataFromStringExcel(867, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData4(utilityClass.readDataFromStringExcel(868, 2, "Sheet2"));
					Thread.sleep(500);
					
		            utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					Thread.sleep(5000);
		            try {
		            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", sendButton);
						Reporter.log("Clicked on sendbookingButton",true);	
					} catch (Exception e) {
			
					}
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = utilityClass.readDataFromStringExcel(870, 2, "Sheet2");
			    	 Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(870, 2, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority = 3)//TC56
	    		public void validateOccupancyMinLimitNotSatisfied() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		utilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		utilityClass.scrollByAxis(0, 300);
		    		utilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 808 from dropdown",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(843, 3, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(844, 3, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(845, 3, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(846, 3, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(847, 3, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(848, 3, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(849, 3, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(850, 3, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(851, 3, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(852, 3, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(854, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(855, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(856, 3, "Sheet2"));
					Thread.sleep(500);
		            
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(858, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(859, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(860, 3, "Sheet2"));
					Thread.sleep(500);
		         
		            utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					utilityClass.implicitlyWaitInMillis(20000);
		            try {
		            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", sendButton);
						Reporter.log("Clicked on sendbookingButton",true);	
					} catch (Exception e) {
			
					}
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = utilityClass.readDataFromStringExcel(870, 3, "Sheet2");
			    	 Assert.assertTrue(expectedMessage.contains(ActualMessage), "TC failed as Actual message and expected message are not matching ");
			    	 //Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(870, 3, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority = 4) //TC57
	    		public void validateOccupancyMaxLimitNotSatisfied() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		utilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		utilityClass.scrollByAxis(0, 300);
		    		utilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 808 from dropdown",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(843, 4, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(844, 4, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(845, 4, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(846, 4, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(847, 4, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(848, 4, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(849, 4, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(850, 4, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(851, 4, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(852, 4, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-4");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(854, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(855, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(856, 4, "Sheet2"));
					Thread.sleep(500);
		            
					utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown2());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(858, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(859, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(860, 4, "Sheet2"));
					
					utilityClass.listBoxHandlingUsingByText("Boy", BookingMask.genderSelectDropdown3());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(862, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(863, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(864, 4, "Sheet2"));
					
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown4());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData4(utilityClass.readDataFromStringExcel(866, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData4(utilityClass.readDataFromStringExcel(867, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData4(utilityClass.readDataFromStringExcel(868, 4, "Sheet2"));
					Thread.sleep(500);
					
		            utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					utilityClass.implicitlyWaitInMillis(20000);
		            try {
		            	WebElement sendButton = driver.findElement(By.id("sendbooking"));
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", sendButton);
						Reporter.log("Clicked on sendbookingButton",true);	
					} catch (Exception e) {
			
					}
		            Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = utilityClass.readDataFromStringExcel(870, 4, "Sheet2");
			    	 Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(870, 4, "Sheet2"),true);
	    		}
	    	
	    		@AfterMethod
	    		public void Logout() throws InterruptedException
	    		{
	    		Thread.sleep(5000);
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
	
	
	
	



