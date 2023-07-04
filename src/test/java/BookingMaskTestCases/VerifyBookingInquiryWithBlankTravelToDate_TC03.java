package BookingMaskTestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseClass;
import POM.DashboardPage;
import POM.accommodationListPage;
import POM.bookingMaskPage;
import POM.loginPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class VerifyBookingInquiryWithBlankTravelToDate_TC03 extends BaseClass {

loginPage login;
File myFile;
selectCompanyPage selectCompany;
DashboardPage dashboard;
salesBookingListPage salesBookingList;
bookingMaskPage BookingMask;
accommodationListPage accommdationList;

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
		Reporter.log("Clicked on Sales Booking in Dashboard",true);
		Thread.sleep(5000);
		UtilityClass.scrollByAxis(100, 0);
		salesBookingList.clickOncreateButton();
		Reporter.log("Clicked on Create Button in Sales Booking",true);
		Thread.sleep(1000);
		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		Thread.sleep(1000);
		UtilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		Thread.sleep(1000);
		UtilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
		Thread.sleep(1000);
		UtilityClass.scrollByAxis(0, 300);
		Thread.sleep(1000);
		UtilityClass.implicitlyWaitInMillis(1000);
		BookingMask.ClearbookingActionfield();
		BookingMask.sendBookingAction(UtilityClass.readDataFromStringExcel(101, 1, "Sheet2"));
		Reporter.log("Send Booking Action");
		BookingMask.clearNoOfPax();
		UtilityClass.implicitlyWaitInMillis(1000);
		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(102, 1, "Sheet2"));
		Reporter.log("Send number of passenger",true);
		Thread.sleep(1000);
		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(103, 1, "Sheet2"));
		Reporter.log("Send correct KOS in input field",true);
		UtilityClass.implicitlyWaitInMillis(1000);
		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(104, 1, "Sheet2"));
		Reporter.log("Send correct ProductCode in input field",true);
		UtilityClass.implicitlyWaitInMillis(1000);
		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(105, 1, "Sheet2"));
		Reporter.log("Send roomcode in input field",true);
		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(106, 1, "Sheet2"));
		Reporter.log("Send correct boardName",true);
		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(107, 1, "Sheet2"));
		Reporter.log("Send Occupancy",true);
		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(108, 1, "Sheet2"));
		Reporter.log("Send bookinglines ",true);
		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(109, 1, "Sheet2"));
		Reporter.log("Send Travel from date for Season-A",true);
		UtilityClass.implicitlyWaitInMillis(1000);
		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		Reporter.log("Send Number of passenger",true);
		UtilityClass.implicitlyWaitInMillis(1000);
        BookingMask.clickOnSendbookingButton();
        Reporter.log("Clicked on sendbookingButton",true);
        UtilityClass.scrollByAxis(0, 600);
        Thread.sleep(1000);
 	}

	@Test
   public void validateBookingInquiryWithBlankTravelToDate() throws EncryptedDocumentException, IOException 
   {
	   String ActualMessage = BookingMask.getTravelFromAndToPopUpMsg();
	   String expectedMessage = UtilityClass.readDataFromStringExcel(111, 1, "Sheet2");
	   Assert.assertEquals(ActualMessage, expectedMessage,"Test Case Failed as actual & expected PopUp messages are not matching");
	   Reporter.log("Validating actual Error message "+BookingMask.getTravelFromAndToPopUpMsg()+" and Expected Error Message "+UtilityClass.readDataFromStringExcel(111, 1, "Sheet2"),true);
   }
 
  @AfterClass 
  public void closeBrowser()
   {
	 driver.close();
	 Reporter.log("Closing Browser",true);
   }

}
