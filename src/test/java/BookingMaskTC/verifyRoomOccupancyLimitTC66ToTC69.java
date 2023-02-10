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
	
	public class verifyRoomOccupancyLimitTC66ToTC69 extends baseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
		bookingMaskPage BookingMask;
		BookingUpdatePage bookingupdate;
		
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
		
	    		@Test //TC66
	    		public void validateBookingWithMaxPersonLimit() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		utilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		utilityClass.scrollByAxis(0, 300);
	    		utilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 807 from dropdown",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(682, 1, "Sheet2"));
	    		BookingMask.clearNoOfPax();
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(683, 1, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(684, 1, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(685, 1, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(686, 1, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(687, 1, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(688, 1, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(689, 1, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(690, 1, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(691, 1, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-5");
	    		Reporter.log("Select Number of passenger",true);
	    		utilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	        	Thread.sleep(500);
	            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(693, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(694, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(695, 1, "Sheet2"));
				Thread.sleep(500);
	            
				utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown2());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(697, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(698, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(699, 1, "Sheet2"));
				Thread.sleep(500);
	            
				utilityClass.listBoxHandlingUsingByText("Frau", BookingMask.genderSelectDropdown3());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(701, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(702, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(703, 1, "Sheet2"));
				Thread.sleep(500);
				
				utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown4());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData4(utilityClass.readDataFromStringExcel(705, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData4(utilityClass.readDataFromStringExcel(706, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData4(utilityClass.readDataFromStringExcel(707, 1, "Sheet2"));
				Thread.sleep(500);
				
				utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown5());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData5(utilityClass.readDataFromStringExcel(709, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData5(utilityClass.readDataFromStringExcel(710, 1, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData5(utilityClass.readDataFromStringExcel(711, 1, "Sheet2"));
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
	           String ActualPrice = bookingupdate.getPriceFieldValue1("value");
	           ActualPrices=ActualPrice;
	            
	            utilityClass.implicitlyWaitInMillis(30000);
		        String ResNo=BookingMask.getReservationNoBM("value");
		        String ResVer=BookingMask.getReservationVerNoBM("value");
		        String ActualReservNo= ResNo + ("/"+ResVer);
		        ActualReser=ActualReservNo;
		      
		        Thread.sleep(3000);
	    	    
		        utilityClass.implicitlyWaitInMillis(12000);
		        try {
		        	BookingMask.clickOnViewList();
				} catch (Exception e) {
					// TODO: handle exception
				}
			
				Reporter.log("Clicked on ViewList",true);
		        utilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(8000);
	            
			     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
			     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
				 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
	            
	            String expectedPrice = utilityClass.readDataFromStringExcel(713, 1, "Sheet2");
	            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+utilityClass.readDataFromStringExcel(713, 1, "Sheet2"),true);
	    		}
	    		
	    		@Test  //TC67
	    		public void validateBookingWithMinPersonLimit() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		utilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		utilityClass.scrollByAxis(0, 300);
		    		utilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 807 from dropdown",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(682, 2, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(683, 2, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(684, 2, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(685, 2, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(686, 2, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(687, 2, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(688, 2, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(689, 2, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(690, 2, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(691, 2, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-1");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(693, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(694, 2, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(695, 2, "Sheet2"));
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
		           String ActualPrice = bookingupdate.getPriceFieldValue1("value");
		           ActualPrices=ActualPrice;
		            
		            utilityClass.implicitlyWaitInMillis(30000);
			        String ResNo=BookingMask.getReservationNoBM("value");
			        String ResVer=BookingMask.getReservationVerNoBM("value");
			        String ActualReservNo= ResNo + ("/"+ResVer);
			        ActualReser=ActualReservNo;
			      
			        Thread.sleep(3000);
		    	    
			        utilityClass.implicitlyWaitInMillis(12000);
			        try {
			        	BookingMask.clickOnViewList();
					} catch (Exception e) {
						// TODO: handle exception
					}
				
					Reporter.log("Clicked on ViewList",true);
			        utilityClass.implicitlyWaitInMillis(8000);
			        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 2, "Sheet2"));
			        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
			        Thread.sleep(22000);
			        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 2, "Sheet2"));
			        Reporter.log("Send TBM code",true);
			        salesBookingList.clickOnbookingListButton();
			        Reporter.log("Clicked on Booking listButton",true);
			        Thread.sleep(8000);
		            
				     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
				     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
					 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
		            
		            String expectedPrice = utilityClass.readDataFromStringExcel(713, 2, "Sheet2");
		            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+utilityClass.readDataFromStringExcel(713, 2, "Sheet2"),true);
	    		}
	    		
	    		@Test //TC68
	    		public void validateOccupancyLimitCombinationBooking() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    			utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		    		utilityClass.implicitlyWaitInMillis(3000);
		    		Thread.sleep(1000);
		    		
		    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		    		Thread.sleep(1000);
		    		utilityClass.scrollByAxis(0, 300);
		    		utilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
		    		Reporter.log("Selected room 807 from dropdown",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.ClearbookingActionfield();
		    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(682, 3, "Sheet2"));
		    		BookingMask.clearNoOfPax();
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(683, 3, "Sheet2"));
		    		Reporter.log("Send number of passenger",true);
		    		Thread.sleep(1000);
		    		
		    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(684, 3, "Sheet2"));
		    		Reporter.log("Send correct KOS in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(685, 3, "Sheet2"));
		    		Reporter.log("Send correct ProductCode in input field",true);
		    		utilityClass.implicitlyWaitInMillis(1000);
		    		
		    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(686, 3, "Sheet2"));
		    		Reporter.log("Send roomcode in input field",true);
		    		
		    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(687, 3, "Sheet2"));
		    		Reporter.log("Send correct boardName",true);
		    		
		    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(688, 3, "Sheet2"));
		    		Reporter.log("Send Occupancy",true);
		    	
		    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(689, 3, "Sheet2"));
		    		Reporter.log("Send bookinglines ",true);
		    		
		    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(690, 3, "Sheet2"));
		    		Reporter.log("Send Travel from date",true);
		    		
		    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(691, 3, "Sheet2"));
		    		Reporter.log("Send Travel To date",true);
		    		
		    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		    		Reporter.log("Select Number of passenger",true);
		    		utilityClass.scrollByAxis(0, 600);
		            Thread.sleep(1000);
		            
		            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
		        	Thread.sleep(500);
		            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(693, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(694, 3, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(695, 3, "Sheet2"));
					Thread.sleep(500);
		            
					utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
					Thread.sleep(500);
		            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(697, 1, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(798, 1, "Sheet2"));
					Thread.sleep(500);
					BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(699, 1, "Sheet2"));
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
		           String ActualPrice = bookingupdate.getPriceFieldValue1("value");
		           ActualPrices=ActualPrice;
		            
		            utilityClass.implicitlyWaitInMillis(30000);
			        String ResNo=BookingMask.getReservationNoBM("value");
			        String ResVer=BookingMask.getReservationVerNoBM("value");
			        String ActualReservNo= ResNo + ("/"+ResVer);
			        ActualReser=ActualReservNo;
			      
			        Thread.sleep(3000);
		    	    
			        utilityClass.implicitlyWaitInMillis(12000);
			        try {
			        	BookingMask.clickOnViewList();
					} catch (Exception e) {
						// TODO: handle exception
					}
				
					Reporter.log("Clicked on ViewList",true);
			        utilityClass.implicitlyWaitInMillis(8000);
			        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
			        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
			        Thread.sleep(22000);
			        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
			        Reporter.log("Send TBM code",true);
			        salesBookingList.clickOnbookingListButton();
			        Reporter.log("Clicked on Booking listButton",true);
			        Thread.sleep(8000);
		            
				     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
				     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
					 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
		            
		            String expectedPrice = utilityClass.readDataFromStringExcel(713, 3, "Sheet2");
		            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
		            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+utilityClass.readDataFromStringExcel(713, 3, "Sheet2"),true);
		    		}
	    		
	    		@Test  //TC69
	    		public void validateOccupancyLimitForMaxChildrenBooking() throws EncryptedDocumentException, IOException, InterruptedException 
	    		{
	    		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
	    		utilityClass.implicitlyWaitInMillis(3000);
	    		Thread.sleep(1000);
	    		
	    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
	    		Thread.sleep(1000);
	    		utilityClass.scrollByAxis(0, 300);
	    		utilityClass.listBoxHandlingUsingByText("807 - (room7)", BookingMask.roomCodeDropDownMethod());
	    		Reporter.log("Selected room 807 from dropdown",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.ClearbookingActionfield();
	    		BookingMask.sendBookingAction(utilityClass.readDataFromStringExcel(682, 4, "Sheet2"));
	    		BookingMask.clearNoOfPax();
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(683, 4, "Sheet2"));
	    		Reporter.log("Send number of passenger",true);
	    		Thread.sleep(1000);
	    		
	    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(684, 4, "Sheet2"));
	    		Reporter.log("Send correct KOS in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(685, 4, "Sheet2"));
	    		Reporter.log("Send correct ProductCode in input field",true);
	    		utilityClass.implicitlyWaitInMillis(1000);
	    		
	    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(686, 4, "Sheet2"));
	    		Reporter.log("Send roomcode in input field",true);
	    		
	    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(687, 4, "Sheet2"));
	    		Reporter.log("Send correct boardName",true);
	    		
	    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(688, 4, "Sheet2"));
	    		Reporter.log("Send Occupancy",true);
	    	
	    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(689, 4, "Sheet2"));
	    		Reporter.log("Send bookinglines ",true);
	    		
	    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(690, 4, "Sheet2"));
	    		Reporter.log("Send Travel from date",true);
	    		
	    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(691, 4, "Sheet2"));
	    		Reporter.log("Send Travel To date",true);
	    		
	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-3");
	    		Reporter.log("Select Number of passenger",true);
	    		utilityClass.scrollByAxis(0, 600);
	            Thread.sleep(1000);
	            
	            utilityClass.listBoxHandlingUsingByText("Herr", BookingMask.genderSelectDropdown1());
	        	Thread.sleep(500);
	            BookingMask.sendlastNameFieldData1(utilityClass.readDataFromStringExcel(693, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData1(utilityClass.readDataFromStringExcel(694, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData1(utilityClass.readDataFromStringExcel(695, 4, "Sheet2"));
				Thread.sleep(500);
	            
				utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown2());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData2(utilityClass.readDataFromStringExcel(697, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData2(utilityClass.readDataFromStringExcel(698, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData2(utilityClass.readDataFromStringExcel(699, 4, "Sheet2"));
				Thread.sleep(500);
	            
				utilityClass.listBoxHandlingUsingByText("Kind", BookingMask.genderSelectDropdown3());
				Thread.sleep(500);
	            BookingMask.sendlastNameFieldData3(utilityClass.readDataFromStringExcel(701, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendfirstNameFieldData3(utilityClass.readDataFromStringExcel(702, 4, "Sheet2"));
				Thread.sleep(500);
				BookingMask.sendAgeFieldData3(utilityClass.readDataFromStringExcel(703, 4, "Sheet2"));
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
	           String ActualPrice = bookingupdate.getPriceFieldValue1("value");
	           ActualPrices=ActualPrice;
	            
	            utilityClass.implicitlyWaitInMillis(30000);
		        String ResNo=BookingMask.getReservationNoBM("value");
		        String ResVer=BookingMask.getReservationVerNoBM("value");
		        String ActualReservNo= ResNo + ("/"+ResVer);
		        ActualReser=ActualReservNo;
		      
		        Thread.sleep(3000);
	    	    
		        utilityClass.implicitlyWaitInMillis(12000);
		        try {
		        	BookingMask.clickOnViewList();
				} catch (Exception e) {
					// TODO: handle exception
				}
			
				Reporter.log("Clicked on ViewList",true);
		        utilityClass.implicitlyWaitInMillis(8000);
		        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
		        Thread.sleep(22000);
		        salesBookingList.sendtbmCodes(utilityClass.readDataFromStringExcel(610, 1, "Sheet2"));
		        Reporter.log("Send TBM code",true);
		        salesBookingList.clickOnbookingListButton();
		        Reporter.log("Clicked on Booking listButton",true);
		        Thread.sleep(8000);
	            
			     String ExpectedReservationNos = salesBookingList.getSalesBookingColumn1();
			     Assert.assertEquals(ActualReser, ExpectedReservationNos,"Test Case Failed as actual & expected ReservationNo are not matching");
				 Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
	            
	            String expectedPrice = utilityClass.readDataFromStringExcel(713, 4, "Sheet2");
	            Assert.assertEquals(ActualPrices, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	            Reporter.log("Validating Actual price "+ActualPrices+" and Expected Price "+utilityClass.readDataFromStringExcel(713, 4, "Sheet2"),true);
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
	
	
	
	

