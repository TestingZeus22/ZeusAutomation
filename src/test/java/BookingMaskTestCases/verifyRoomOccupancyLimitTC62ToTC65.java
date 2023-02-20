	package BookingMaskTestCases;
	
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
	
	public class verifyRoomOccupancyLimitTC62ToTC65 extends baseClass
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
		
	    		@Test (priority=1) //62
	    		public void validateMismatchInNOofPaxFieldErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException 
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
	    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(905, 1, "Sheet2"));
	    		Reporter.log("Send Booking Action",true);
	    		BookingMask.clearNoOfPax();
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(906, 1, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(907, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(908, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(909, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(910, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(911, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(912, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(913, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(914, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-3");
	    		Reporter.log("Select Number of passenger",true);
	    		utilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	        	Thread.sleep(500);
	            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(916, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(917, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(918, 1, "Sheet2"));
				Thread.sleep(500);
	         
				utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
		        Thread.sleep(500);
		        BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(920, 1, "Sheet2"));
			    Thread.sleep(500);
				BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(921, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(922, 1, "Sheet2"));
				Thread.sleep(500);
				
				utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
		        Thread.sleep(500);
		        BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(924, 1, "Sheet2"));
			    Thread.sleep(500);
				BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(925, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(926, 1, "Sheet2"));
				Thread.sleep(500);
				
	            utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.ListBoxTitleGender());
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
				utilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton ",true);
	             Thread.sleep(3000);
				 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
		    	 String expectedMessage = utilityClass.readDataFromStringExcel(928, 1, "Sheet2");
		    	 Assert.assertTrue(expectedMessage.contains(ActualMessage), "TC failed as Actual message and expected message are not matching ");
		    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(928, 1, "Sheet2"),true);
	    		}
	    		
	    		@Test (priority=2)  //TC-63
	    		public void validateMismatchInPassengerFieldErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException 
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
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(905, 2, "Sheet2"));
		    		Reporter.log("Send Booking action");
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(906, 2, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(907, 2, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(908, 2, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(909, 2, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(910, 2, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(911, 2, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(912, 2, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(913, 2, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(914, 2, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(916, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(917, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(918, 2, "Sheet2"));
					Thread.sleep(500);
		            
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(920, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(921, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(922, 2, "Sheet2"));
					Thread.sleep(500);
					
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(924, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(925, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(926, 2, "Sheet2"));
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
					utilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton ",true);
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = utilityClass.readDataFromStringExcel(928, 2, "Sheet2");
			    	 Assert.assertTrue(expectedMessage.contains(ActualMessage), "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(928, 2, "Sheet2"),true);
	    		}
	    		@Test (priority = 3) //TC64
	    		public void validateMismatchInOCCFieldErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException 
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
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(905, 3, "Sheet2"));
		    		Reporter.log("Send Booking action");
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(906, 3, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(907, 3, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(908, 3, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(909, 3, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(910, 3, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(911, 3, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(912, 3, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(913, 3, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(914, 3, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-3");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(916, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(917, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(918, 3, "Sheet2"));
					Thread.sleep(500);
					
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(920, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(921, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(922, 3, "Sheet2"));
					Thread.sleep(500);
		            
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(924, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(925, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(926, 3, "Sheet2"));
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
					utilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton ",true);
		            Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = utilityClass.readDataFromStringExcel(928, 3, "Sheet2");
			    	 //Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Assert.assertTrue(expectedMessage.contains(ActualMessage), "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(928, 3, "Sheet2"),true);
	    		}
	    		
	    		@Test (priority = 4) //TC65
	    		public void validateMismatchInAllFieldsErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		utilityClass.implicitlyWaitInMillis(2000);
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
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(905, 4, "Sheet2"));
		    		Reporter.log("Send Action code");
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(906, 4, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(907, 4, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(908, 4, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(909, 4, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(910, 4, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(911, 4, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(912, 4, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(913, 4, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(914, 4, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-1");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(5000);
		           
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(916, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(917, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(918, 4, "Sheet2"));
					Thread.sleep(500);
					
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(920, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(921, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(922, 4, "Sheet2"));
					Thread.sleep(500);
		            
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(924, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(925, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(926, 4, "Sheet2"));
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
					utilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton ",true);
		            Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = utilityClass.readDataFromStringExcel(928, 4, "Sheet2");
			    	 Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+utilityClass.readDataFromStringExcel(928, 4, "Sheet2"),true);
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
	
	
	
	





