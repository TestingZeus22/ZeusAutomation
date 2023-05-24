package Booking_AllotmentTestCases;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
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
import POM.allotmentPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class createNewMultisalesLineBookingTC42 extends BaseClass
{
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	salesBookingListPage salesBookingList;
    bookingMaskPage BookingMask;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	allotmentPage allotment;
	String ActualPriceRoom1;
	String ActualPriceRoom2;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		UtilityClass.implicitlyWaitInMillis(3000);
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver); 
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
		accommdationList =new accommodationListPage(driver);	
		accommodationNew =new accommodationNewPage(driver);
		allotment = new allotmentPage(driver);
	}
	
	 @Test
	 public void validateMultisalesLineBookingWhenAllotIsAvailable() throws EncryptedDocumentException, IOException, InterruptedException {
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
    		
    		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		UtilityClass.implicitlyWaitInMillis(3000);
    		Thread.sleep(2000);
    		
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    	
    		UtilityClass.implicitlyWaitInMillis(1000);
     		BookingMask.ClearbookingActionfield();
     		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(262, 1, "Sheet5"));
     		Reporter.log("Send Booking action",true);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(263, 1, "Sheet5"));
    		Reporter.log("Send number of passengers",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(264, 1, "Sheet5"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(265, 1, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(266, 1, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(267, 1, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(268, 1, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(269, 1, "Sheet5"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(270, 1, "Sheet5"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(271, 1, "Sheet5"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000);
    		BookingMask.sendKOS2(UtilityClass.readDataFromStringExcel(264, 2, "Sheet5"));
    		Reporter.log("Send correct KOS2 in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode2(UtilityClass.readDataFromStringExcel(265, 2, "Sheet5"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode2(UtilityClass.readDataFromStringExcel(266, 2, "Sheet5"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard2(UtilityClass.readDataFromStringExcel(267, 2, "Sheet5"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy2(UtilityClass.readDataFromStringExcel(268, 2, "Sheet5"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax2(UtilityClass.readDataFromStringExcel(269, 2, "Sheet5"));
    		Reporter.log("Send bookinglines",true);
    		
    		BookingMask.sendTravelFromDate2(UtilityClass.readDataFromStringExcel(270, 2, "Sheet5"));
    		Reporter.log("Send Travel from date to second line",true);
    		
    		BookingMask.sendTravelToDate2(UtilityClass.readDataFromStringExcel(271, 2, "Sheet5"));
    		Reporter.log("Send Travel To date to second line",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_3")).sendKeys("1-2");
    		Reporter.log("Send Number of passenger",true);
    		
    		UtilityClass.listBoxHandlingUsingByText("Boy", BookingMask.ListBoxTitleGender());
    		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendLastName(UtilityClass.readDataFromStringExcel(273, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendFirstName(UtilityClass.readDataFromStringExcel(274, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendCityName(UtilityClass.readDataFromStringExcel(275, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendZipCode(UtilityClass.readDataFromStringExcel(276, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendStreetNo(UtilityClass.readDataFromStringExcel(277, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendPhoneNum(UtilityClass.readDataFromStringExcel(278, 1, "Sheet5"));
     		UtilityClass.implicitlyWaitInsec(30);
     		BookingMask.sendEmail(UtilityClass.readDataFromStringExcel(279, 1, "Sheet5"));
     		UtilityClass.scrollByAxis(0, 900);
     		UtilityClass.implicitlyWaitInMillis(20000);
     		UtilityClass.clickUsingJSE(BookingMask.clickOnSendbookingButtonByJSE());
     		Reporter.log("Click on sendBookingButton",true);
     		
     		String ActualPriceRoom1 = BookingMask.getPriceFieldValue1("value");
     		String expectedPriceRoom1 = UtilityClass.readDataFromStringExcel(280, 1, "Sheet5");
     		Assert.assertEquals(ActualPriceRoom1,expectedPriceRoom1, "TC failed as Actual Prices and expected prices are not matching ");
     		Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected price is "+UtilityClass.readDataFromStringExcel(280, 1, "Sheet5"),true);
   
     		String ActualPriceRoom2 = BookingMask.getPriceFieldValue2("value");
     		String expectedPriceRoom2 = UtilityClass.readDataFromStringExcel(281, 1, "Sheet5");
     		Assert.assertEquals(ActualPriceRoom2,expectedPriceRoom2, "TC failed as Actual Prices and expected prices are not matching ");
     		Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue2("value")+" and Expected price is "+UtilityClass.readDataFromStringExcel(281, 1, "Sheet5"),true);
     		Thread.sleep(1000);
  
     		BookingMask.clickOndashboardLink();
     		Reporter.log("Clicked on dashboardLink",true);
     		
     		Thread.sleep(9700);
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
       
        	allotment.sendStartDate(UtilityClass.readDataFromStringExcel(270, 1, "Sheet5"));
     	    Reporter.log("Send start date of season_E on allotment page",true);
     	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(271, 1, "Sheet5"));
     	    Reporter.log("Send end date of season_E on allotment page",true);
        	
     	    Thread.sleep(1000);
     	    allotment.clickOnLoadAllotment();
     	    Reporter.log("Clicked on load allotment",true);
		
     		String ActualSoldAllot_E = allotment.getSoldAllotRoom1R1C1();
        	String expectedSoldAllot_E = UtilityClass.readDataFromStringExcel(282, 1, "Sheet5");
        	Assert.assertEquals(ActualSoldAllot_E, expectedSoldAllot_E,"Test Case Failed as actual and expected sold allotment are not matching");
        	Reporter.log("Validating Actual sold allotment is "+ActualSoldAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(282, 1, "Sheet5"),true);
        	    
        	String ActualRemainingAllot_E = allotment.getRemainingAllotRoom1R1C1();
        	String expectedRemainingAllot_E = UtilityClass.readDataFromStringExcel(283, 1, "Sheet5");
        	Assert.assertEquals(ActualRemainingAllot_E, expectedRemainingAllot_E,"Test Case Failed as actual & expected remaining allotment are not matching");
        	Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_E+" and Expected allotment for season_E is "+UtilityClass.readDataFromStringExcel(283, 1, "Sheet5"),true); 
     		
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











