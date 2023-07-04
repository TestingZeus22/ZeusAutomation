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
	
	public class VerifyRoomOccupancyLimitTC66ToTC69 extends BaseClass
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
		
	    		@Test //TC66
	    		public void validateBookingWithMaxPersonLimit() throws EncryptedDocumentException, IOException, InterruptedException 
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
	    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 807 from dropdown",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(682, 1, "Sheet2"));
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(683, 1, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(684, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(685, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(686, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(687, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(688, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(689, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(690, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(691, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-5");
	    		Reporter.log("Send Number of passenger",true);
	    		UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	            UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(693, 1, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(694, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(695, 1, "Sheet2"));
				Thread.sleep(500);
	            
				UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown2());
				UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(697, 1, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(698, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(699, 1, "Sheet2"));
				Thread.sleep(500);
	            
				UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown3());
				UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(701, 1, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(702, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(703, 1, "Sheet2"));
				Thread.sleep(500);
				
				UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown4());
				UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData4(UtilityClass.readDataFromStringExcel(705, 1, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData4(UtilityClass.readDataFromStringExcel(706, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData4(UtilityClass.readDataFromStringExcel(707, 1, "Sheet2"));
				Thread.sleep(500);
				
				UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown5());
				UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData5(UtilityClass.readDataFromStringExcel(709, 1, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData5(UtilityClass.readDataFromStringExcel(710, 1, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData5(UtilityClass.readDataFromStringExcel(711, 1, "Sheet2"));
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
				Thread.sleep(500);
				BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(105, 4, "Sheet2"));
				UtilityClass.scrollByAxis(0, 900);
				UtilityClass.implicitlyWaitInMillis(20000);
				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
	    		Reporter.log("Click on sendBookingButton ",true);  
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
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(8000);
	            
			     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
			     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
				 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
	            
	            String expectedPrice = UtilityClass.readDataFromStringExcel(713, 1, "Sheet2");
	            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(713, 1, "Sheet2"),true);
	    		}
	    		
	    		@Test  //TC67
	    		public void validateBookingWithMinPersonLimit() throws EncryptedDocumentException, IOException, InterruptedException 
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
		    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 807 from dropdown",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(682, 2, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(683, 2, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(684, 2, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(685, 2, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(686, 2, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(687, 2, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(688, 2, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(689, 2, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(690, 2, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(691, 2, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-1");
		    		Reporter.log("Select Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		            UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(693, 2, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(694, 2, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(695, 2, "Sheet2"));
					Thread.sleep(500);
		            
		            UtilityClass.listBoxHandlingUsingByText("Frau", BookingMask.ListBoxTitleGender());
		            UtilityClass.implicitlyWaitInsec(30);
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
		    		Reporter.log("Click on sendBookingButton ",true);  
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
			        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 2, "Sheet2"));
			        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
			        Thread.sleep(22000);
			        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 2, "Sheet2"));
			        Reporter.log("Send TBM code",true);
			        salesBookingList.clickOnbookingListButton();
			        Reporter.log("Clicked on Booking listButton",true);
			        Thread.sleep(8000);
		            
				     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
				     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
					 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
		            
		            String expectedPrice = UtilityClass.readDataFromStringExcel(713, 2, "Sheet2");
		            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(713, 2, "Sheet2"),true);
	    		}
	    		
	    		@Test //TC68
	    		public void validateOccupancyLimitCombinationBooking() throws EncryptedDocumentException, IOException, InterruptedException 
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
		    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 807 from dropdown",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(682, 3, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(683, 3, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(684, 3, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(685, 3, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		UtilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(686, 3, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(687, 3, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(688, 3, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(689, 3, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(690, 3, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(691, 3, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		    		Reporter.log("Select Number of passenger",true);
		    		UtilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		            UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(693, 3, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(694, 3, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(695, 3, "Sheet2"));
					Thread.sleep(500);
		            
					UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
					UtilityClass.implicitlyWaitInsec(30);
		            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(697, 1, "Sheet2"));
		            UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(798, 1, "Sheet2"));
					UtilityClass.implicitlyWaitInsec(30);
					BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(699, 1, "Sheet2"));
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
			        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
			        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
			        Thread.sleep(22000);
			        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
			        Reporter.log("Send TBM code",true);
			        salesBookingList.clickOnbookingListButton();
			        Reporter.log("Clicked on Booking listButton",true);
			        Thread.sleep(8000);
		            
				     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
				     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
					 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
		            
		            String expectedPrice = UtilityClass.readDataFromStringExcel(713, 3, "Sheet2");
		            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(713, 3, "Sheet2"),true);
		    		}
	    		
	    		@Test  //TC69
	    		public void validateOccupancyLimitForMaxChildrenBooking() throws EncryptedDocumentException, IOException, InterruptedException 
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
	    		UtilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 807 from dropdown",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(682, 4, "Sheet2"));
	    		BookingMask.clearNoOfPax();
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(683, 4, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(684, 4, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(685, 4, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		UtilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(686, 4, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(687, 4, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(688, 4, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(689, 4, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(690, 4, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(691, 4, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-3");
	    		Reporter.log("Send Number of passenger",true);
	    		UtilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            UtilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	            UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData1(UtilityClass.readDataFromStringExcel(693, 4, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData1(UtilityClass.readDataFromStringExcel(694, 4, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData1(UtilityClass.readDataFromStringExcel(695, 4, "Sheet2"));
				Thread.sleep(500);
	            
				UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
				UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData2(UtilityClass.readDataFromStringExcel(697, 4, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData2(UtilityClass.readDataFromStringExcel(698, 4, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData2(UtilityClass.readDataFromStringExcel(699, 4, "Sheet2"));
				Thread.sleep(500);
	            
				UtilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
				UtilityClass.implicitlyWaitInsec(30);
	            BookingMask.sendlastNameFieldData3(UtilityClass.readDataFromStringExcel(701, 4, "Sheet2"));
	            UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendfirstNameFieldData3(UtilityClass.readDataFromStringExcel(702, 4, "Sheet2"));
				UtilityClass.implicitlyWaitInsec(30);
				BookingMask.sendAgeFieldData3(UtilityClass.readDataFromStringExcel(703, 4, "Sheet2"));
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
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(8000);
	            
			     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
			     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
				 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
	            
	            String expectedPrice = UtilityClass.readDataFromStringExcel(713, 4, "Sheet2");
	            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+UtilityClass.readDataFromStringExcel(713, 4, "Sheet2"),true);
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
	
	
	
	

