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
	
	public class VerifyRoomOccupancyLimitTC74ToTC77 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
		bookingMaskPage BookingMask;
		bookingUpdatePage bookingupdate;
		String ActualReser;
		String ExpectedReservationNo;
		String ActualPrices;
		
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
	    		Thread.sleep(6000);
		     }
		
	    		@Test  (priority=1)
	    		public void validateOccupancyLimitCombinationBooking() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		UtilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		UtilityClass.scrollByAxis(0, 300);
	    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 807 from dropdown",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(748, 1, "Sheet2"));
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(749, 1, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(750, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(751, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(752, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(753, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(754, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(755, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(756, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(757, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-4");
	    		Reporter.log("Select Number of passenger",true);
	    		UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	        	Thread.sleep(500);
	            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(759, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(760, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(761, 1, "Sheet2"));
				Thread.sleep(500);
	            
				UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown2());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(763, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(764, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(765, 1, "Sheet2"));
				Thread.sleep(500);
	         
				UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown3());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(767, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(768, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(769, 1, "Sheet2"));
				Thread.sleep(500);
				
				UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown4());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData4(UtilityClass.readDataFromStringExcel(771, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData4(UtilityClass.readDataFromStringExcel(772, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData4(UtilityClass.readDataFromStringExcel(773, 1, "Sheet2"));
				Thread.sleep(500);
				
	            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
				UtilityClass.implicitlyWaitInMillis(20000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton after U action code",true);
	            Thread.sleep(3000);
	            String ActualPrice = bookingupdate.getPriceFieldValue1("value");
	            ActualPrices=ActualPrice;
	            
	            UtilityClass.implicitlyWaitInMillis(30000);
		        String ResNo=BookingMask.getReservationNoBM("value");
		        String ResVer=BookingMask.getReservationVerNoBM("value");
		        String ActualReservNo= ResNo + ("/"+ResVer);
		        ActualReser=ActualReservNo;
		        Thread.sleep(3000);
		        UtilityClass.implicitlyWaitInMillis(12000);
		        BookingMask.clickOnViewList();
				Reporter.log("Clicked on ViewList",true);
		        UtilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(751, 1, "Sheet2"));
		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(751, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(8000);
	            
			     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
			     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
				 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
	            
	            String expectedPrice = UtilityClass.readDataFromStringExcel(783, 1, "Sheet2");
	            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(783, 1, "Sheet2"),true);
	    		}
	    		
	    		@Test (priority=2)
	    		public void validateOccupancyLimitCrossMaxAdults() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		UtilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		UtilityClass.scrollByAxis(0, 300);
		    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 807 from dropdown",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(748, 2, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(749, 2, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(750, 2, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(751, 2, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(752, 2, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(753, 2, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(754, 2, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(755, 2, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(756, 2, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(757, 2, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-4");
		    		Reporter.log("Select Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(759, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(760, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(761, 2, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown2());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(763, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(764, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(765, 2, "Sheet2"));
					Thread.sleep(500);
		         
					UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown3());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(767, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(768, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(769, 2, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown4());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData4(UtilityClass.readDataFromStringExcel(771, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData4(UtilityClass.readDataFromStringExcel(772, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData4(UtilityClass.readDataFromStringExcel(773, 2, "Sheet2"));
					Thread.sleep(500);
					
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					UtilityClass.implicitlyWaitInMillis(20000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton after U action code",true);
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = UtilityClass.readDataFromStringExcel(783, 2, "Sheet2");
			    	 Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(783, 2, "Sheet2"),true);
	    		}
	    		
	    		@Test  (priority=3)
	    		public void validateOccupancyLimitCrossMaxPersons() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		UtilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		UtilityClass.scrollByAxis(0, 300);
		    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 807 from dropdown",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(748, 3, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(749, 3, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(750, 3, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(751, 3, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(752, 3, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(753, 3, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(754, 3, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(755, 3, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(756, 3, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(757, 3, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-6");
		    		Reporter.log("Select Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(759, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(760, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(761, 3, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown2());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(763, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(764, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(765, 3, "Sheet2"));
					Thread.sleep(500);
		         
					UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown3());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(767, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(768, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(769, 3, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown4());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData4(UtilityClass.readDataFromStringExcel(771, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData4(UtilityClass.readDataFromStringExcel(772, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData4(UtilityClass.readDataFromStringExcel(773, 3, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown5());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData5(UtilityClass.readDataFromStringExcel(775, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData5(UtilityClass.readDataFromStringExcel(776, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData5(UtilityClass.readDataFromStringExcel(777, 3, "Sheet2"));
					Thread.sleep(500);
					
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown6());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData6(UtilityClass.readDataFromStringExcel(779, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData6(UtilityClass.readDataFromStringExcel(780, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData6(UtilityClass.readDataFromStringExcel(781, 3, "Sheet2"));
					Thread.sleep(500);
					
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					UtilityClass.implicitlyWaitInMillis(20000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton after U action code",true);
		            UtilityClass.scrollByAxis(0, 900);
					UtilityClass.implicitlyWaitInMillis(20000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on SendBookingButton",true);
		             Thread.sleep(3000);
					 String ActualMessage = BookingMask.getMaximumPersonCrossedErrorMessage();
			    	 String expectedMessage = UtilityClass.readDataFromStringExcel(783, 3, "Sheet2");
			    	 Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
			    	 Reporter.log("Validating Actual message "+BookingMask.getMaximumPersonCrossedErrorMessage()+" and Expected message "+UtilityClass.readDataFromStringExcel(783, 3, "Sheet2"),true);
			
	    		}
	    		
	    		@Test  (priority=4)
	    		public void validateOccupancyLimitForMinPersonWithOneChild() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		UtilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		UtilityClass.scrollByAxis(0, 300);
		    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 807 from dropdown",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(748, 4, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(749, 4, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(750, 4, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(751, 4, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(752, 4, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(753, 4, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(754, 4, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(755, 4, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(756, 4, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(757, 4, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-1");
		    		Reporter.log("Select Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(759, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(760, 4, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(761, 4, "Sheet2"));
					Thread.sleep(500);
		        
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
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
					UtilityClass.implicitlyWaitInMillis(20000);
					UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
		    		Reporter.log("Click on sendBookingButton after U action code",true);
		           Thread.sleep(3000);
		           String ActualPrice = bookingupdate.getPriceFieldValue1("value");
		           ActualPrices=ActualPrice;
		            
		            UtilityClass.implicitlyWaitInMillis(30000);
			        String ResNo=BookingMask.getReservationNoBM("value");
			        String ResVer=BookingMask.getReservationVerNoBM("value");
			        String ActualReservNo= ResNo + ("/"+ResVer);
			        ActualReser=ActualReservNo;
			        Thread.sleep(3000);
			        UtilityClass.implicitlyWaitInMillis(12000);
			        BookingMask.clickOnViewList();
					Reporter.log("Clicked on ViewList",true);
			        UtilityClass.implicitlyWaitInMillis(8000);
			        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(751, 4, "Sheet2"));
			        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
			        Thread.sleep(22000);
			        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(751, 4, "Sheet2"));
			        Reporter.log("Send TBM code",true);
			        salesBookingList.clickOnbookingListButton();
			        Reporter.log("Clicked on Booking listButton",true);
			        Thread.sleep(8000);
		            
				     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
				     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
					 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
		            
		            String expectedPrice = UtilityClass.readDataFromStringExcel(783, 4, "Sheet2");
		            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(783, 4, "Sheet2"),true);
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
	
	
	
	


