	package SalesBookingListTestCases;
	
	import java.io.File;
	import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import Base.BaseClass;
	import POM.bookingMaskPage;
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
	import utility.UtilityClass;
	
	public class TC11 extends BaseClass
	{
		loginPage login;
		File myFile;
		selectCompanyPage selectCompany;
		DashboardPage dashboard;
		salesBookingListPage salesBookingList;
	    bookingMaskPage BookingMask;
	    
	    String price;
		String SalesBookingNo;
		String ActualReser;
		
		@BeforeClass
		public void launchBrowser(){
			openApplication();
			Reporter.log("Browser Launch ",true);
			UtilityClass.implicitlyWaitInMillis(3000);
			login=new loginPage(driver);
			selectCompany = new selectCompanyPage(driver);
			dashboard = new DashboardPage(driver);
			salesBookingList =new salesBookingListPage(driver);
			BookingMask =new bookingMaskPage(driver);
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
//	    	salesBookingList.clickOncreateButton();
//	    	Reporter.log("Clicked on create Button in sales Booking page",true);
//	    	Thread.sleep(6000);
	    	
	    	
	    List<WebElement> Column1=driver.findElements(By.xpath("//table[@id='SalesBookingTable']/tbody/tr[1]"));
	    System.out.println(Column1.size());
	    
	    for(WebElement col : Column1)
	    {
	    	System.out.println(col.getText()+ " | ");
	    }
	    
	    System.out.println("===================================");
		

		
		List<WebElement> Column2=driver.findElements(By.xpath("//table[@id='SalesBookingTable']/tbody/tr[2]"));
	    System.out.println(Column2.size());
	    
	    for(WebElement co2 : Column2)
	    {
	    	System.out.println(co2.getText()+ " | ");
	    }
	    
	    
	    System.out.println("===================================");
		
		List<WebElement> Column3=driver.findElements(By.xpath("//table[@id='SalesBookingTable']/tbody/tr[3]"));
	    System.out.println(Column3.size());
	    
	    for(WebElement co3 : Column3)
	    {
	    	System.out.print(co3.getText()+ " | ");
	    }
	    
	    System.out.println();
		
	    System.out.println("-------------------------===============");
	    
	    List<WebElement> Column4=driver.findElements(By.xpath("//table[@id='SalesBookingTable']/tbody/tr[4]"));
	    System.out.println(Column4.size());
	    
	    for(WebElement co4 : Column4)
	    {
	    	System.out.print(co4.getText()+ " | ");
	    }
	    
		}
		
		
	    	@Test (priority = 1)  //TC-11 
	  	    public void validateReservationNoField() throws EncryptedDocumentException, IOException, InterruptedException 
	    	{
//	    		
//	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
//	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
//	    		UtilityClass.implicitlyWaitInMillis(3000);
//	    		Thread.sleep(1000);
//	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
//	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
//	    		Thread.sleep(1000);
//	    		UtilityClass.scrollByAxis(0, 300);
//	    		Thread.sleep(1000);
//	    		BookingMask.ClearbookingActionfield();
//	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(20, 2, "Sheet4"));
//	    		Reporter.log("Send booking action");
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
//	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
//	    		BookingMask.clearNoOfPax();
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(21, 2, "Sheet4"));
//	    		Reporter.log("Send number of passenger",true);
//	    		Thread.sleep(1000);
//	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(22, 2, "Sheet4"));
//	    		Reporter.log("Send correct KOS in input field",true);
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(23, 2, "Sheet4"));
//	    		Reporter.log("Send correct ProductCode in input field",true);
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(24, 2, "Sheet4"));
//	    		Reporter.log("Send roomcode in input field",true);
//	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(25, 2, "Sheet4"));
//	    		Reporter.log("Send correct boardName",true);
//	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(26, 2, "Sheet4"));
//	    		Reporter.log("Send Occupancy",true);
//	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(27, 2, "Sheet4"));
//	    		Reporter.log("Send bookinglines ",true);
//	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(28, 2, "Sheet4"));
//	    		Reporter.log("Send Travel from date",true);
//	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(29, 2, "Sheet4"));
//	    		Reporter.log("Send Travel To date",true);
//	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
//	    		Reporter.log("Select Number of passengers",true);
//	            UtilityClass.scrollByAxis(0, 600);
//	            Thread.sleep(1000);
//	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
//	            Thread.sleep(500);
//				BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(3, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(4, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(5, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(6, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(7, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(8, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(9, 4, "Sheet4"));
//				UtilityClass.scrollByAxis(0, 900);
//				UtilityClass.implicitlyWaitInMillis(20000);
//				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
//	    		Reporter.log("Click on SendBookingButton",true);
//	            UtilityClass.implicitlyWaitInMillis(30000);
////	            String ActualPrice = BookingMask.getPriceFieldValue1("value");
////	            price = ActualPrice;
//	            
//	            //ReserNo.
//	            String ResNo=BookingMask.getReservationNoBM("value");
//	            String ResVer=BookingMask.getReservationVerNoBM("value");
//	            String ActualReservNo= ResNo + ("/"+ResVer);
//	            ActualReser=ActualReservNo;
//	            //LastNAME
//	            String lastNAME = driver.findElement(By.id("LastName_New")).getAttribute("value");
//	            System.out.println(lastNAME);
//	            //companyType
//	            String Type=driver.findElement(By.id("SalesBookingHeaderNewModel_TravelTypeID")).getAttribute("value");
//	            System.out.println(Type);
//	            
//	            //TBM Codes
//	            String tbmcodeonBM = driver.findElement(By.id("bookinglines_TBMCodeID_1")).getAttribute("value");
//	            System.out.println(tbmcodeonBM);
//	            
//	            //Arrival / Departure not possible because of dot before and after the date on sales booking List page.
//	            
//	            
//	            //Status OK booking
//	            String statusOnBM =driver.findElement(By.id("bookinglines_AmadeusStatus_1")).getAttribute("value");
//	            System.out.println(statusOnBM);
//	            
//	          
//	            
//	            
//	            
//	            
//	            
//	            
//	            
//	            
//	            //Booked date is not posssible because difference in both the pages like 15 march 23 on SB page and 15/03/23 in BM page.
//	            
//	            UtilityClass.implicitlyWaitInMillis(12000);
//				BookingMask.clickOnViewList();
//				Reporter.log("Clicked on ViewList",true);
//		        UtilityClass.implicitlyWaitInMillis(8000);
//		        Thread.sleep(3000);
//		        
//	            WebElement textB = driver.findElement(By.id("ContractStatusDD"));
//	            Select s = new Select(textB);
//	            s.selectByVisibleText("RQ");
//		        
//		        
////		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 2, "Sheet4"));
////		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
////		        Thread.sleep(2000);
////		        salesBookingList.clickOnbookingListButton();
////		        Reporter.log("Clicked on Booking listButton",true);
////		        Thread.sleep(22000);
////		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 2, "Sheet4"));
////		        Reporter.log("Send TBM code",true);
////		        Thread.sleep(8000);
////		        salesBookingList.clickOnbookingListButton();
////		        Reporter.log("Clicked on Booking listButton",true);
////		        UtilityClass.implicitlyWaitInMillis(10000);
////		 
////		        String expectedPrice = UtilityClass.readDataFromStringExcel(31, 2, "Sheet4");
////		        Assert.assertEquals(price, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
////		        Reporter.log("Validating Actual price is "+price+" and Expected Price is "+UtilityClass.readDataFromStringExcel(31, 2, "Sheet4"),true);
//		        String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
//		        Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
//		        Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
//	   }
//	    
//	    	@Test (enabled=false)  //TC-10
//	  	    public void validateReservationNoFieldS() throws EncryptedDocumentException, IOException, InterruptedException {
//	    		
//	    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
//	    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
//	    		UtilityClass.implicitlyWaitInMillis(3000);
//	    		Thread.sleep(1000);
//	    		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
//	    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
//	    		Thread.sleep(1000);
//	    		UtilityClass.scrollByAxis(0, 300);
//	    		Thread.sleep(1000);
//	    		BookingMask.ClearbookingActionfield();
//	    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(20, 3, "Sheet4"));
//	    		Reporter.log("Send booking action");
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
//	    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
//	    		BookingMask.clearNoOfPax();
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(21, 3, "Sheet4"));
//	    		Reporter.log("Send number of passenger",true);
//	    		Thread.sleep(1000);
//	    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(22, 3, "Sheet4"));
//	    		Reporter.log("Send correct KOS in input field",true);
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(23, 3, "Sheet4"));
//	    		Reporter.log("Send correct ProductCode in input field",true);
//	    		UtilityClass.implicitlyWaitInMillis(1000);
//	    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(24, 3, "Sheet4"));
//	    		Reporter.log("Send roomcode in input field",true);
//	    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(25, 3, "Sheet4"));
//	    		Reporter.log("Send correct boardName",true);
//	    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(26, 3, "Sheet4"));
//	    		Reporter.log("Send Occupancy",true);
//	    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(27, 3, "Sheet4"));
//	    		Reporter.log("Send bookinglines ",true);
//	    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(28, 3, "Sheet4"));
//	    		Reporter.log("Send Travel from date",true);
//	    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(29, 3, "Sheet4"));
//	    		Reporter.log("Send Travel To date",true);
//	    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
//	    		Reporter.log("Select Number of passengers",true);
//	            UtilityClass.scrollByAxis(0, 600);
//	            Thread.sleep(1000);
//	            UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
//	            Thread.sleep(500);
//				BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(3, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(4, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(5, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(6, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(7, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(8, 4, "Sheet4"));
//				Thread.sleep(500);
//				BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(9, 4, "Sheet4"));
//				UtilityClass.scrollByAxis(0, 900);
//				UtilityClass.implicitlyWaitInMillis(20000);
//				UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
//	    		Reporter.log("Click on SendBookingButton",true);
//	            UtilityClass.implicitlyWaitInMillis(30000);
//	            String ActualPrice = BookingMask.getPriceFieldValue1("value");
//	            price = ActualPrice;
//	            String ResNo=BookingMask.getReservationNoBM("value");
//	            String ResVer=BookingMask.getReservationVerNoBM("value");
//	            String ActualReservNo= ResNo + ("/"+ResVer);
//	            ActualReser=ActualReservNo;
//	            UtilityClass.implicitlyWaitInMillis(12000);
//				BookingMask.clickOnViewList();
//				Reporter.log("Clicked on ViewList",true);
//		        UtilityClass.implicitlyWaitInMillis(8000);
//		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 3, "Sheet4"));
//		        Reporter.log("Clicked on SendTBMcode to verify booking is done or not",true);
//		        Thread.sleep(2000);
//		        salesBookingList.clickOnbookingListButton();
//		        Reporter.log("Clicked on Booking listButton",true);
//		        Thread.sleep(22000);
//		        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(23, 3, "Sheet4"));
//		        Reporter.log("Send TBM code",true);
//		        Thread.sleep(8000);
//		        salesBookingList.clickOnbookingListButton();
//		        Reporter.log("Clicked on Booking listButton",true);
//		        UtilityClass.implicitlyWaitInMillis(10000);
//		        UtilityClass.implicitlyWaitInMillis(1000);
//	
//		        String expectedPrice = UtilityClass.readDataFromStringExcel(31, 3, "Sheet4");
//		        Assert.assertEquals(price, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
//		        Reporter.log("Validating Actual price is "+price+" and Expected Price is "+UtilityClass.readDataFromStringExcel(31, 2, "Sheet4"),true);
//		        String ExpectedReservationNo = salesBookingList.getSalesBookingColumn1();
//		        Assert.assertEquals(ActualReser, ExpectedReservationNo,"Test Case Failed as actual & expected ReservationNo are not matching");
//		        Reporter.log("Validating Expected ReservationNo "+ActualReser+" and Actual ReservationNo is "+salesBookingList.getSalesBookingColumn1(),true);
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
	
	////table[@id='SalesBookingTable']//tr[1]//td[3]
	
	

