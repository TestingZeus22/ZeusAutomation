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
	
	import Base.BaseClass;
	import POM.bookingMaskPage;
	import POM.bookingUpdatePage;
	import POM.DashboardPage;
	import POM.accommodationListPage;
	import POM.accommodationNewPage;
	import POM.calculationSettingPage;
	import POM.contractDetailsPage;
	import POM.loginPage;
	import POM.offerCalculationPage;
	import POM.offerDefinationPage;
	import POM.pricePage;
	import POM.roomDetailsPage;
	import POM.salesBookingListPage;
	import POM.selectCompanyPage;
	import POM.tbmCodeMasterPage;
	import POM.tbmCodeNewCreatePage;
	import utility.UtilityClass;
	
	public class VerifyRoomOccupancyLimitTC58ToTC61 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
		bookingMaskPage BookingMask;
		bookingUpdatePage bookingupdate;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver);
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
			bookingupdate=new bookingUpdatePage(driver);
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
	    		Thread.sleep(7000);
		     }
		
	    		@Test (priority = 1) //58
	    		public void validateOccupancyMinLimitNotSatisfield1() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    	Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    	Thread.sleep(1000);
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		UtilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 808 from dropdown",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(874, 1, "Sheet2"));
	    		Reporter.log("Send Booking action");
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(875, 1, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(876, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(877, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(878, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(879, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(880, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(881, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(882, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(883, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-1");
	    		Reporter.log("Send Number of passenger",true);
	    		UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown1());
	            UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(885, 1, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(886, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(887, 1, "Sheet2"));
				Thread.sleep(500);
	         
	            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
				UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(20000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton ",true);  
	            Thread.sleep(3000);
				String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
		    	String expectedMessage = UtilityClass.readDataFromStringExcel(901, 1, "Sheet2");
		    	Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
		    	Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(901, 1, "Sheet2"),true);
	    		}
	    		
	    		@Test (priority = 2)  //TC-59
	    		public void validateOccupancyMinLimitNotSatisfield2() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
	    			UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		UtilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		UtilityClass.scrollByAxis(0, 300);
		    		UtilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 808 from dropdown",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(874, 2, "Sheet2"));
		    		Reporter.log("Send Booking action");
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(875, 2, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(876, 2, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(877, 2, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(878, 2, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(879, 2, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(880, 2, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(881, 2, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(882, 2, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(883, 2, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-3");
		    		Reporter.log("Send Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		            UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(885, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(886, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(887, 2, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(889, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(890, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(891, 2, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(893, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(894, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(895, 2, "Sheet2"));
					Thread.sleep(500);
					
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					
					UtilityClass.scrollByAxis(0, 900);
					UtilityClass.implicitlyWaitInMillis(20000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton ",true);  
		            
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = UtilityClass.readDataFromStringExcel(901, 2, "Sheet2");
			    	 Assert.assertTrue(expectedMessage.contains(ActualMessage), "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(901, 2, "Sheet2"),true);
	    		}
	    		@Test (priority = 3) //TC60
	    		public void validateOccupancyMaxLimitCross() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
	    			UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		UtilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		UtilityClass.scrollByAxis(0, 300);
		    		UtilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 808 from dropdown",true);
		    		Thread.sleep(1000);
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(874, 3, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(875, 3, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(876, 3, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(877, 3, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(878, 3, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(879, 3, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(880, 3, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(881, 3, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(882, 3, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(883, 3, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-4");
		    		Reporter.log("Send Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		            UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(885, 3, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(886, 3, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(887, 3, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown2());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(889, 3, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(890, 3, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(891, 3, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(893, 3, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(894, 3, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(895, 3, "Sheet2"));
					Thread.sleep(500);
		         
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown4());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData4(UtilityClass.readDataFromStringExcel(897, 3, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData4(UtilityClass.readDataFromStringExcel(898, 3, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData4(UtilityClass.readDataFromStringExcel(899, 3, "Sheet2"));
					Thread.sleep(500);
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					UtilityClass.scrollByAxis(0, 900);
					UtilityClass.implicitlyWaitInMillis(20000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton ",true);  
		            Thread.sleep(3000);
					String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	String expectedMessage = UtilityClass.readDataFromStringExcel(901, 3, "Sheet2");
			    	Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(901, 3, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority = 4)//TC61
	    		public void validateOccupancyMinLimitCross() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
	    			UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		UtilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		UtilityClass.scrollByAxis(0, 300);
		    		UtilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 808 from dropdown",true);
		    		Thread.sleep(1000);
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(874, 4, "Sheet2"));
		    		Reporter.log("Send Booking Action");
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(875, 4, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(876, 4, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(877, 4, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(878, 4, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(879, 4, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(880, 4, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(881, 4, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(882, 4, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(883, 4, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-0");
		    		Reporter.log("Send Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(5000);
		           
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					UtilityClass.scrollByAxis(0, 900);
					UtilityClass.implicitlyWaitInMillis(20000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on SendBookingButton ",true);  
		            Thread.sleep(3000);
		            
					String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	String expectedMessage = UtilityClass.readDataFromStringExcel(901, 4, "Sheet2");
			    	Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(901, 4, "Sheet2"),true);
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
	
	
	
	




