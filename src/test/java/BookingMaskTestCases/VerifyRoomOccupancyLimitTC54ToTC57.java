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
	
	public class VerifyRoomOccupancyLimitTC54ToTC57 extends BaseClass
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
		
	    		@Test  (priority = 1) //TC54
	    		public void validateOccupancyMinLimitCross() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    	Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    	Thread.sleep(1000);
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(2000);
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(2000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		UtilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 808 from dropdown",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(2000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(843, 1, "Sheet2"));
	    		Reporter.log("Send Booking action");
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(844, 1, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(845, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(846, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(847, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(848, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(849, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(850, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(851, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(852, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-1");
	    		Reporter.log("Select Number of passenger",true);
	    		UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	            UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(854, 1, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(855, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(856, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
	     
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
				Thread.sleep(5000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("click on sendBookingButton",true);
	            Thread.sleep(4000);
				String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
		    	String expectedMessage = UtilityClass.readDataFromStringExcel(870, 1, "Sheet2");
		    	Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
		    	Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(870, 1, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority = 2)  //TC-55
	    		public void validateOccupancyMaxLimitCross() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
	    			UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		UtilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(2000);
		    		
		    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		UtilityClass.scrollByAxis(0, 300);
		    		UtilityClass.listBoxHandlingUsingByText("808 - (room8)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 808 from dropdown",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		Thread.sleep(2000);
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(843, 2, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(844, 2, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(845, 2, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(846, 2, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(847, 2, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(848, 2, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(849, 2, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(850, 2, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(851, 2, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(852, 2, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-4");
		    		Reporter.log("Send Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		            UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(854, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(855, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(856, 2, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown2());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(858, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(859, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(860, 2, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown3());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(862, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(863, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(864, 2, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown4());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData4(UtilityClass.readDataFromStringExcel(866, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData4(UtilityClass.readDataFromStringExcel(867, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData4(UtilityClass.readDataFromStringExcel(868, 2, "Sheet2"));
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
					Thread.sleep(5000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("click on sendBookingButton",true);
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = UtilityClass.readDataFromStringExcel(870, 2, "Sheet2");
			    	 Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(870, 2, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority = 3)//TC56
	    		public void validateOccupancyMinLimitNotSatisfied2() throws EncryptedDocumentException, IOException, InterruptedException 
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
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(843, 3, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(844, 3, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(845, 3, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(846, 3, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(847, 3, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(848, 3, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(849, 3, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(850, 3, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(851, 3, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(852, 3, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		    		Reporter.log("Send Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		            UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(854, 3, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(855, 3, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(856, 3, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(858, 3, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(859, 3, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(860, 3, "Sheet2"));
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
		    		Reporter.log("click on sendBookingButton",true);
			
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = UtilityClass.readDataFromStringExcel(870, 3, "Sheet2");
			    	 //Assert.assertTrue(expectedMessage.contains(ActualMessage), "TC failed as Actual message and expected message are not matching ");
			    	 Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(870, 3, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority = 4) //TC57
	    		public void validateOccupancyMaxLimitNotSatisfied() throws EncryptedDocumentException, IOException, InterruptedException 
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
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(843, 4, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(844, 4, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(845, 4, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(846, 4, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(847, 4, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(848, 4, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(849, 4, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(850, 4, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(851, 4, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(852, 4, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-4");
		    		Reporter.log("Send Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		            UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(854, 4, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(855, 4, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(856, 4, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown2());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(858, 4, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(859, 4, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(860, 4, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.genderSelectDropdown3());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(862, 4, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(863, 4, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(864, 4, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown4());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData4(UtilityClass.readDataFromStringExcel(866, 4, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData4(UtilityClass.readDataFromStringExcel(867, 4, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData4(UtilityClass.readDataFromStringExcel(868, 4, "Sheet2"));
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
		    		Reporter.log("click on sendBookingButton ",true);
		            Thread.sleep(3000);
		            
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = UtilityClass.readDataFromStringExcel(870, 4, "Sheet2");
			    	 Assert.assertEquals(ActualMessage,expectedMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(870, 4, "Sheet2"),true);
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
	
	
	
	



