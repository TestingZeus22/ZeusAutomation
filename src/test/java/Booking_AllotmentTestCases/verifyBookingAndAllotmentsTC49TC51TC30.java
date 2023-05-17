package Booking_AllotmentTestCases;

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
import Base.BaseClass;
import POM.bookingMaskPage;
import POM.ChangeAllotmentPage;
import POM.DashboardPage;
import POM.accommodationListPage;
import POM.accommodationNewPage;
import POM.allotmentPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class verifyBookingAndAllotmentsTC49TC51TC30 extends BaseClass
{
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
    bookingMaskPage BookingMask;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	ChangeAllotmentPage ChangeAllotment;
	allotmentPage allotment;
	String ActualErrorMsg;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		UtilityClass.implicitlyWaitInMillis(3000);
		Reporter.log("Browser Launch ",true);
		login = new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver); 
		salesBookingList =new salesBookingListPage(driver);
		BookingMask = new bookingMaskPage(driver);
		accommdationList = new accommodationListPage(driver);	
		accommodationNew = new accommodationNewPage(driver);
		allotment = new allotmentPage(driver);
		ChangeAllotment = new ChangeAllotmentPage(driver);
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
	}
	
	 @Test  //TC49
	 public void validateBookingCancellationAndAllotment() throws EncryptedDocumentException, IOException, InterruptedException {
    		dashboard.SalesClick();
    		Reporter.log("Clicked on sales dropdown in Dashboard",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		dashboard.salesBookingClick();
    		Reporter.log("Clicked on sales Booking in Dashboard",true);
    		Thread.sleep(5000);
    		UtilityClass.scrollByAxis(100, 0);
    		salesBookingList.clickOncreateButton();
    		Reporter.log("Clicked on create Button in sales Booking page",true);
    		Thread.sleep(6500);
    		
    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(433, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(434, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(435, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(436, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(437, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(438, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(439, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(440, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(441, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(442, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
           
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(435, 2, "Sheet5"));
    		Reporter.log("Send correct KOS2 in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(436, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(437, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(438, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(439, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(440, 2, "Sheet5"));
    		Reporter.log("Send bookinglines",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(441, 2, "Sheet5"));
    		Reporter.log("Send Travel from date to second line",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(442, 2, "Sheet5"));
    		Reporter.log("Send Travel To date to second line",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(444, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(445, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(446, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(447, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(448, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(449, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(450, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		Thread.sleep(2000);
     		UtilityClass.scrollByAxis(0, -400);
     		UtilityClass.implicitlyWaitInMillis(12000);
			BookingMask.clickOnViewList();
			Reporter.log("Clicked on ViewList",true);
	        UtilityClass.implicitlyWaitInMillis(8000);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(436, 1, "Sheet5"));
	        Reporter.log("Clicked on sendTBMcode to verify booking is done or not",true);
	        Thread.sleep(1000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInsec(80);
	        salesBookingList.sendtbmCodes(UtilityClass.readDataFromStringExcel(436, 1, "Sheet5"));
	        Reporter.log("Send TBM code",true);
	        Thread.sleep(14000);
	        salesBookingList.clickOnbookingListButton();
	        Reporter.log("Clicked on Booking listButton",true);
	        UtilityClass.implicitlyWaitInMillis(10000);
	        UtilityClass.scrollByAxis(0, -400);
	        salesBookingList.clickOneditBooking1();
	        Reporter.log("Clicked on edit booking1",true);
     		
	        UtilityClass.implicitlyWaitInMillis(40000);
            BookingMask.ClearbookingActionfield();
            UtilityClass.implicitlyWaitInMillis(40000);
    		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(433, 2, "Sheet5"));
	        
	        UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true); 
     		
     		UtilityClass.implicitlyWaitInMillis(20000);
     		BookingMask.clickOndashboardLink();
     		Reporter.log("Clicked on dashboardLink",true);
     		
     		Thread.sleep(9500);
            dashboard.clickOnpurchasebutton();
            Reporter.log("Clicked on purchase option",true);
     	    Thread.sleep(1000);
            dashboard.clickOnAccommodation();
            Reporter.log("Clicked on accommodation option in list",true);
            Thread.sleep(2000);
        	   
        	accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
        	Thread.sleep(4000);
        	accommdationList.clickOnEditRow1Column1();
        	Thread.sleep(1000);
        	
        	accommodationNew.clickOnAllotment();
        	Reporter.log("Clicked on Allotment ",true);
        	Thread.sleep(2000);
       
        	allotment.sendStartDate(UtilityClass.readDataFromStringExcel(451, 1, "Sheet5"));
     	    Reporter.log("Send start date on allotment page",true);
     	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(452, 1, "Sheet5"));
     	    Reporter.log("Send end date on allotment page",true);
     	    Thread.sleep(1000);
     	    allotment.clickOnLoadAllotment();
     	    Reporter.log("Clicked on load allotment",true);
		
     		String ActualSoldAllotRoom1 = allotment.getSoldAllotRoom1R1C1();
        	String expectedSoldAllotRoom1 = UtilityClass.readDataFromStringExcel(453, 1, "Sheet5");
        	Assert.assertEquals(ActualSoldAllotRoom1, expectedSoldAllotRoom1,"Test Case Failed as actual and expected sold allotment are not matching");
        	Reporter.log("Validating Actual sold allotment for Room1 is "+ActualSoldAllotRoom1+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(453, 1, "Sheet5"),true);
        	    
        	String ActualRemainingAllotRoom1 = allotment.getRemainingAllotRoom1R1C1();
        	String expectedRemainingAllotRoom1 = UtilityClass.readDataFromStringExcel(454, 1, "Sheet5");
        	Assert.assertEquals(ActualRemainingAllotRoom1, expectedRemainingAllotRoom1,"Test Case Failed as actual & expected remaining allotment are not matching");
        	Reporter.log("Validating Actual remaining allotment for Room1 is "+ActualRemainingAllotRoom1+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(454, 1, "Sheet5"),true); 
     		
        	String ActualSoldAllotRoom2 = allotment.getSoldAllotRoom2R1C1();
        	String expectedSoldAllotRoom2 = UtilityClass.readDataFromStringExcel(453, 2, "Sheet5");
        	Assert.assertEquals(ActualSoldAllotRoom2, expectedSoldAllotRoom2,"Test Case Failed as actual and expected sold allotment are not matching");
        	Reporter.log("Validating Actual sold allotment for Room2 is "+ActualSoldAllotRoom2+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(453, 2, "Sheet5"),true);
        	    
        	String ActualRemainingAllotRoom2 = allotment.getRemainingAllotRoom2R1C1();
        	String expectedRemainingAllotRoom2 = UtilityClass.readDataFromStringExcel(454, 2, "Sheet5");
        	Assert.assertEquals(ActualRemainingAllotRoom2, expectedRemainingAllotRoom2,"Test Case Failed as actual & expected remaining allotment are not matching");
        	Reporter.log("Validating Actual remaining allotment for Room2 is "+ActualRemainingAllotRoom2+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(454, 2, "Sheet5"),true); 		
	 }
   
	 @Test //TC51
	 public void validateBookingAfterIncreaseInAllotment() throws EncryptedDocumentException, IOException, InterruptedException {
			
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
    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
   
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(458, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(459, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(460, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(461, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(462, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(463, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(464, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(465, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(466, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(467, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
           
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(460, 2, "Sheet5"));
    		Reporter.log("Send correct KOS2 in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(461, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(462, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(463, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(464, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(465, 2, "Sheet5"));
    		Reporter.log("Send bookinglines",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(466, 2, "Sheet5"));
    		Reporter.log("Send Travel from date for second line",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(467, 2, "Sheet5"));
    		Reporter.log("Send Travel To date for second line",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(469, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(470, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(471, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(472, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(473, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(474, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(475, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		
     		UtilityClass.implicitlyWaitInMillis(20000);
     		BookingMask.clickOndashboardLink();
     		Reporter.log("Clicked on dashboardLink",true);
     		
     		Thread.sleep(9500);
            dashboard.clickOnpurchasebutton();
            Reporter.log("Clicked on purchase option",true);
     	    Thread.sleep(1000);
            dashboard.clickOnAccommodation();
            Reporter.log("Clicked on accommodation option in list",true);
            Thread.sleep(2000);
        	   
        	accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
        	Thread.sleep(4000);
        	accommdationList.clickOnEditRow1Column1();
        	Thread.sleep(1000);
        	
        	accommodationNew.clickOnAllotment();
        	Reporter.log("Clicked on Allotment ",true);
        	Thread.sleep(2000);
       
        	allotment.clickOnchangeAllotment();
        	Reporter.log("Clicked on Change allotment button",true);
        	Thread.sleep(2000);

        	UtilityClass.listBoxHandlingUsingByText("Increase_Decrease_Allotment", ChangeAllotment.selectChangeAllotmentDropdown());
        	Thread.sleep(3000);
        	    	
        	ChangeAllotment.clickOnMultiselectDropdwn();
        	Thread.sleep(1000);
        	    
        	ChangeAllotment.clickOnSelectAllRoomsmultiselectdropdown1();
        	Thread.sleep(1000);

        	ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(476, 1, "Sheet5"));
        	Thread.sleep(2000);
        	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(477, 1, "Sheet5"));
        	Thread.sleep(2000);
        	ChangeAllotment.sendAmount1(UtilityClass.readDataFromStringExcel(478, 1, "Sheet5"));
        	Thread.sleep(5000);

        	JavascriptExecutor jse = (JavascriptExecutor)driver;
        	jse.executeScript("document.body.style.zoom='70%'");
        	Thread.sleep(1000);
        	
        	//ChangeAllotment.clickOnConfirmButtonByJSE();
        	WebElement confirmButton=driver.findElement(By.xpath("//button[text()='Confirm']"));
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	js.executeScript("arguments[0].click();", confirmButton);
        	Reporter.log("Clicked on confirm button",true);
        	Thread.sleep(1000);
        	    
        	//ChangeAllotment.clickOnOkPopUPByJSE();
        	WebElement OkButton = driver.findElement(By.xpath("//button[text()='OK']"));
        	js.executeScript("arguments[0].click();", OkButton);
        	Reporter.log("Clicked on Ok popup",true);
        	Thread.sleep(1000);
        	    
        	//ChangeAllotment.clickOncloseButtonByJSE();
        	WebElement closeButton = driver.findElement(By.id("closeImageFeature"));
        	js.executeScript("arguments[0].click();", closeButton);
        	Reporter.log("Clicked on close button",true);
        	Thread.sleep(1000);
        	
        	driver.navigate().to("https://zeuscloud.azurewebsites.net/SalesBooking/SalesBookingCreate");
        	Thread.sleep(5000);
    		
    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    	
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(458, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);

    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(459, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(460, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(461, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(462, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(463, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(464, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(465, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(479, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(480, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
           
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(460, 2, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(461, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(462, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(463, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(464, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(465, 2, "Sheet5"));
    		Reporter.log("Send bookinglines",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(479, 2, "Sheet5"));
    		Reporter.log("Send Travel from date ",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(480, 2, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
     	    Thread.sleep(500);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(469, 1, "Sheet5"));
     		Thread.sleep(500);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(470, 1, "Sheet5"));
     		Thread.sleep(500);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(471, 1, "Sheet5"));
     		Thread.sleep(500);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(472, 1, "Sheet5"));
     		Thread.sleep(500);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(473, 1, "Sheet5"));
     		Thread.sleep(500);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(474, 1, "Sheet5"));
     		Thread.sleep(500);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(475, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
 
     		String ActualPriceForRoom1 = BookingMask.getPriceFieldValue1("value");
     		String expectedPriceForRoom1 = UtilityClass.readDataFromStringExcel(481, 1, "Sheet5");
			Assert.assertEquals(ActualPriceForRoom1, expectedPriceForRoom1,"Test Case Failed as actual & expected Price are not matching");
			Reporter.log("Validating Actual price for room1 is "+BookingMask.getPriceFieldValue1("value")+" and Expected Price for room1 is "+UtilityClass.readDataFromStringExcel(481, 1, "Sheet5"),true);
	   
			String ActualPriceForRoom2 = BookingMask.getPriceFieldValue2("value");
			String expectedPriceForRoom2 = UtilityClass.readDataFromStringExcel(481, 2, "Sheet5");
			Assert.assertEquals(ActualPriceForRoom2, expectedPriceForRoom2,"Test Case Failed as actual & expected Price are not matching");
			Reporter.log("Validating Actual price for room2 is "+BookingMask.getPriceFieldValue2("value")+" and Expected Price for room2 is "+UtilityClass.readDataFromStringExcel(481, 2, "Sheet5"),true);
	   }
	 
	 @Test   //TC30
	 public void validateBookingMoreThanRemainingAllotment() throws EncryptedDocumentException, IOException, InterruptedException {
	
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
    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(238, 2, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(239, 2, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(240, 2, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(241, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(242, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(243, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(244, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(245, 2, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(246, 2, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(247, 2, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
           
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(240, 3, "Sheet5"));
    		Reporter.log("Send correct KOS2 in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(241, 3, "Sheet5"));
    		Reporter.log("Send correct ProductCode2 for salesline1 in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(242, 3, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(243, 3, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(244, 3, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(245, 3, "Sheet5"));
    		Reporter.log("Send bookinglines",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(246, 3, "Sheet5"));
    		Reporter.log("Send Travel from date for second line ",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(247, 3, "Sheet5"));
    		Reporter.log("Send Travel To date for second line",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger for second line",true);
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(249, 2, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(250, 2, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(251, 2, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(252, 2, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(253, 2, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(254, 2, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(255, 2, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		Thread.sleep(2000);
     		UtilityClass.scrollByAxis(0, -400); 
     		String ActualErrorMsg = BookingMask.getInvalidTravelDurationMsg();
     		System.out.println(ActualErrorMsg);
     		
     		UtilityClass.implicitlyWaitInMillis(20000);
     		BookingMask.clickOndashboardLink();
     		Reporter.log("Clicked on dashboardLink",true);
     		Thread.sleep(9500);
            dashboard.clickOnpurchasebutton();
            Reporter.log("Clicked on purchase option",true);
     	    Thread.sleep(1000);
            dashboard.clickOnAccommodation();
            Reporter.log("Clicked on accommodation option in list",true);
            Thread.sleep(2000);
        	   
        	accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
        	Thread.sleep(4000);
        	accommdationList.clickOnEditRow1Column1();
        	Thread.sleep(1000);
        	
        	accommodationNew.clickOnAllotment();
        	Reporter.log("Clicked on Allotment ",true);
        	Thread.sleep(2000);
       
        	allotment.sendStartDate(UtilityClass.readDataFromStringExcel(249, 3, "Sheet5"));
     	    Reporter.log("Send start date on allotment page",true);
     	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(250, 3, "Sheet5"));
     	    Reporter.log("Send end date on allotment page",true);
     	    Thread.sleep(1000);
     	    allotment.clickOnLoadAllotment();
     	    Reporter.log("Clicked on load allotment",true);
		
     	    String expectedErroMsg = UtilityClass.readDataFromStringExcel(256, 2, "Sheet5");
     	    Assert.assertEquals(ActualErrorMsg,expectedErroMsg, "TC failed as Actual message and expected prices are not matching ");
     	    Reporter.log("Validating Actual Message is "+ActualErrorMsg+" and Expected Message is "+UtilityClass.readDataFromStringExcel(256, 2, "Sheet5"),true);  
     	   
     	    String ActualInitalAllotRoom2 = allotment.getInitialAllotRoom2R1C1();
     	    String expectedInitialAllotRoom2 = UtilityClass.readDataFromStringExcel(257, 2, "Sheet5");
     	    Assert.assertEquals(ActualInitalAllotRoom2, expectedInitialAllotRoom2,"Test Case Failed as actual and expected sold allotment are not matching");
     	    Reporter.log("Validating Actual initial allotment for Room2 is "+ActualInitalAllotRoom2+" and Expected allotment for room2 is "+UtilityClass.readDataFromStringExcel(257, 2, "Sheet5"),true);
       	    
     	    String ActualCurrentAllotRoom2 = allotment.getCurrentAllotRoom2R1C1();
     	    String expectedCurrentAllotRoom2 = UtilityClass.readDataFromStringExcel(258, 2, "Sheet5");
     	    Assert.assertEquals(ActualCurrentAllotRoom2, expectedCurrentAllotRoom2,"Test Case Failed as actual and expected sold allotment are not matching");
     	    Reporter.log("Validating Actual current allotment for Room2 is "+ActualCurrentAllotRoom2+" and Expected allotment for room2 is "+UtilityClass.readDataFromStringExcel(258, 2, "Sheet5"),true);
      	    
     		String ActualSoldAllotRoom2 = allotment.getSoldAllotRoom2R1C1();
        	String expectedSoldAllotRoom2 = UtilityClass.readDataFromStringExcel(259, 2, "Sheet5");
        	Assert.assertEquals(ActualSoldAllotRoom2, expectedSoldAllotRoom2,"Test Case Failed as actual and expected sold allotment are not matching");
        	Reporter.log("Validating Actual sold allotment for Room2 is "+ActualSoldAllotRoom2+" and Expected allotment for room2 is "+UtilityClass.readDataFromStringExcel(259, 2, "Sheet5"),true);
	 }
	    @AfterMethod
	    public void Logout() throws InterruptedException
	    { 	
       Thread.sleep(2000);
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











