package BookingMaskTC;

import java.io.File;
import java.io.IOException;
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
import Base.baseClass;
import POM.bookingMaskPage;
import POM.DashboardPage;
import POM.calculationSettingPage;
import POM.loginPage;
import POM.offerCalculationPage;
import POM.offerDefination;
import POM.salesBookingListPage;
import POM.selectCompanyPage;

import utility.utilityClass;

public class verifybookingInquiry extends baseClass
 {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	offerCalculationPage offerCalculation;    
	calculationSettingPage calculationSetting; 
	offerDefination offerdefination;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		utilityClass.implicitlyWaitInMillis(3000);
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver);
		offerCalculation = new offerCalculationPage(driver);  
		calculationSetting =new calculationSettingPage(driver); 
		offerdefination = new offerDefination(driver); 
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.SendUserName(utilityClass.readDataFromStringExcel(2, 0, "Sheet1"));
		Reporter.log("Valid Username Entered",true);
		login.SendPassword(utilityClass.readDataFromStringExcel(2, 1, "Sheet1"));
		Reporter.log("Valid Password Entered",true);
		login.ClickOnLoginToDashboard();
		Reporter.log("Clicked on Dashboard button",true);
		
		utilityClass.implicitlyWaitInMillis(1000);
		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", selectCompany.SelectDropDownList());
		Reporter.log("Select the Falk Tours DE GmbH from given list",true);
		utilityClass.implicitlyWaitInMillis(1000);
		selectCompany.ClickOnProceedButton();
		Reporter.log("Clicked on proceed button",true);	
		Thread.sleep(9000); 
		dashboard.clickOncalculationList();
		Reporter.log("Clicked on offer calculationList",true);
		Thread.sleep(1000);
		dashboard.clickOnOffercalculationList();
		Reporter.log("Clicked on offer calculation",true);
		Thread.sleep(2000);
		offerCalculation.clickOnFalkToursAG();
		Reporter.log("Clicked on FalkToursAG",true);
		Thread.sleep(1000);
		offerCalculation.clickOnTchiboDE();
	    Reporter.log("Clicked on TchiboDE",true);
	    Thread.sleep(1000);
	    calculationSetting.clickOnselectautofieldinTichiboDE();
	    utilityClass.implicitlyWaitInMillis(4000);
	    Thread.sleep(3000);
	    calculationSetting.clickOnBlock1();
	    Thread.sleep(1000);
		calculationSetting.clearDbPercentage();
		Thread.sleep(1000);
	    calculationSetting.senddbPercentagevalue(utilityClass.readDataFromStringExcel(28, 1, "Sheet2"));
	    Reporter.log("send DB% Value",true);
	    Thread.sleep(1000);
        calculationSetting.clickOnSaveSetting();  
	    Reporter.log("Clicked on save setting button",true);
	    Thread.sleep(1500);
        calculationSetting.clickOnSaveandCalculate();
		Reporter.log("Clicked on SaveandCalculate button",true);
        Thread.sleep(2500);
        calculationSetting.clickOnpopUpAftersaveAndCalculate();
		Reporter.log("click on Yes button in popup",true);
    	Thread.sleep(1000);  
		calculationSetting.clickOnTransferPriceOnline();
		Reporter.log("click on transfer price",true);
		Thread.sleep(2000);
		calculationSetting.clickOnTransferPriceOnline();
		Thread.sleep(2000); 
		calculationSetting.clickOnselectautoinTichiboDEAfterSavecalculation();
		Reporter.log("clicked on Auto field in TichiboDE after saving of calculation",true);
		Thread.sleep(1000); 
		utilityClass.scrollByAxis(0, 200);
    	calculationSetting.clickOnBlock1();
		Reporter.log("click on Block1",true);
	    Thread.sleep(4000);
		utilityClass.scrollByAxis(0, 400);
		calculationSetting.clickOnsavePrice();
		Thread.sleep(3000);
		
		driver.navigate().to("https://zeuscloud.azurewebsites.net/Dashboard");
		Thread.sleep(9800);
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
		utilityClass.listBoxHandlingUsingByText("IN014 - (TestNG)", BookingMask.productCodeDropDownMethod());
		Reporter.log("Selected IN014 - (TestNG) from dropdown list",true);
		Thread.sleep(1000);
		utilityClass.scrollByAxis(0, 300);
		Thread.sleep(1000);
		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
		Reporter.log("Select TFT1 in TravelType dropdownList",true);
		utilityClass.implicitlyWaitInMillis(1000);
		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
		
		BookingMask.clearNoOfPax();
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(2, 1, "Sheet2"));
		Reporter.log("Send number of passenger",true);
		Thread.sleep(1000);
		
		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(6, 1, "Sheet2"));
		Reporter.log("Send correct KOS in input field",true);
		utilityClass.implicitlyWaitInMillis(1000);
		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(7, 1, "Sheet2"));
		Reporter.log("Send correct ProductCode in input field",true);
		utilityClass.implicitlyWaitInMillis(1000);
		
		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(8, 1, "Sheet2"));
		Reporter.log("Send roomcode in input field",true);
		
		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(9, 1, "Sheet2"));
		Reporter.log("Send correct boardName",true);
		
		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(10, 1, "Sheet2"));
		Reporter.log("Send Occupancy",true);
	
		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(11, 1, "Sheet2"));
		Reporter.log("Send bookinglines ",true);
		
		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(21, 1, "Sheet2"));
		Reporter.log("Send Travel from date",true);
		
		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(22, 1, "Sheet2"));
		Reporter.log("Send Travel To date",true);
		
		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
		Reporter.log("Select Number of passenger",true);

        BookingMask.clickOnSendbookingButton();
        Reporter.log("Clicked on sendbookingButton",true);
        utilityClass.scrollByAxis(0, 600);
        Thread.sleep(1000);
	}

    @Test
    public void validatePriceFieldWithBookingInquiry() throws EncryptedDocumentException, IOException 
    {
      String Actual = BookingMask.getPriceFieldValue1("value");
	  String expected = utilityClass.readDataFromStringExcel(23, 1, "Sheet2");
	  Assert.assertEquals(Actual, expected,"Test Case Failed as actual & expected Price are not matching");
	  Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+utilityClass.readDataFromStringExcel(23, 1, "Sheet2"),true);
    }
  
    @AfterMethod
    public void Logout() throws InterruptedException
    {
      Thread.sleep(3500);
      BookingMask.ClickOnLogoutButtonOFBookingMask();
	  Reporter.log("Clicking on Logout Button in Booking Mask page",true);
	  Thread.sleep(1000);
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


