package CalculationModuleTestCases;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.util.DateFormatConverter;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseClass;
import POM.CalculationSettingRoomsDetailPage;
import POM.DashboardPage;
import POM.accommodationGeneratedPage;
import POM.accommodationListPage;
import POM.accommodationNewPage;
import POM.allotmentPage;
import POM.bookingMaskPage;
import POM.calculationSettingPage;
import POM.contractDetailsPage;
import POM.contractsPage;
import POM.loginPage;
import POM.offerCalculationPage;
import POM.offerDefinationPage;
import POM.pricePage;
import POM.roomDetailsPage;
import POM.roomsPage;
import POM.salesBookingListPage;
import POM.selectCompanyPage;
import utility.UtilityClass;

public class VerifyContractStatus_TC11 extends BaseClass {
	loginPage login;File myFile;DashboardPage dashboard; String formattedNumber;
	selectCompanyPage selectCompany;offerCalculationPage offerCalculation;    
	calculationSettingPage calculationSetting;offerDefinationPage offerdefination;
	salesBookingListPage salesBookingList;bookingMaskPage BookingMask;
	accommodationListPage accommdationList;accommodationNewPage accommodationNew;
	roomDetailsPage roomDetails;contractDetailsPage contractDetail;contractsPage contracts;
	CalculationSettingRoomsDetailPage CalculationSettingRoomsDetail;
	pricePage price;roomsPage room;allotmentPage allotment;
	String CheckStatusLive; String StatusLive;
	
	
	@BeforeClass
	public void launchBrowser(){
		openApplication();
		UtilityClass.implicitlyWaitInMillis(3000);
		Reporter.log("Browser Launch ",true);
		login=new loginPage(driver);
		selectCompany = new selectCompanyPage(driver);
		dashboard = new DashboardPage(driver);
		offerCalculation = new offerCalculationPage(driver);  
		calculationSetting =new calculationSettingPage(driver); 
		offerdefination = new offerDefinationPage(driver); 
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
		accommdationList =new accommodationListPage(driver);
		accommodationNew =new accommodationNewPage(driver);
		roomDetails =new roomDetailsPage(driver);
		contractDetail =new contractDetailsPage(driver);
		contracts =new contractsPage(driver);
		price = new pricePage(driver);
		room = new roomsPage(driver);
		allotment = new allotmentPage(driver);
		CalculationSettingRoomsDetail = new CalculationSettingRoomsDetailPage(driver);
		
	}
	
	@BeforeMethod
	public void loginToAApp() throws EncryptedDocumentException, IOException, InterruptedException, ParseException
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
		
        dashboard.clickOnpurchasebutton();
        Reporter.log("Clicked on purchase option",true);
		Thread.sleep(1000);
        dashboard.clickOnAccommodation();
        Reporter.log("Clicked on accommodation option in list",true);
        Thread.sleep(2000);
    	accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 3, "Sheet5"));
    	Thread.sleep(4000);
    	accommdationList.clickOnEditRow1Column1();
    	Thread.sleep(1000);  
    	accommodationNew.clickOncontracts();
    	Reporter.log("Clicked on Allotment ",true);
    	Thread.sleep(5000);
    	contracts.ClickOneditContract();
    	UtilityClass.scrollByAxis(0, 400);
    	Thread.sleep(8000);
        WebElement contractstatus = driver.findElement(By.xpath("//select[@id='ContractStatus']"));
        Select s = new Select(contractstatus);
        Thread.sleep(2000);
        s.selectByVisibleText("Deactivated");
        String ListBoxText = s.getFirstSelectedOption().getText();
        StatusLive=ListBoxText;
        Thread.sleep(4000);
        UtilityClass.scrollByAxis(0, 1600);
        Thread.sleep(4000);
        contractDetail.clickOnUpdateContractButton();
        Reporter.log("Clicked on Update contract button",true);
        UtilityClass.implicitlyWaitInsec(90);
        Thread.sleep(2000);
        UtilityClass.scrollByAxis(0, 900);
        UtilityClass.implicitlyWaitInMillis(9000);
        Thread.sleep(4000);
        UtilityClass.scrollByAxis(0, -1600);
        dashboard.clickOncalculationList();
        Thread.sleep(1000);
        dashboard.clickOnOfferdefination();
        Thread.sleep(1000);
      	Reporter.log("Clicked on offer defination",true);
      	offerdefination.clickOnFalkToursAG();
      	Reporter.log("Clicked on FalkToursAG option",true);
      	offerdefination.clickOnTchiboDE();
      	Thread.sleep(500);
      	Reporter.log("Clicked on TchiboDE option",true);
      	offerdefination.SendTBMcode(UtilityClass.readDataFromStringExcel(55, 3, "Sheet5"));
      	Thread.sleep(5000);
	}
	
    @Test 
    public void validateAccommodationStatusAsDeactivated() throws EncryptedDocumentException, IOException 
    {
    	String ActualMessage = offerdefination.geterrorMessage();
    	String expectedMessage = UtilityClass.readDataFromStringExcel(3, 1, "Sheet6");
	    Assert.assertEquals(expectedMessage,ActualMessage, "TC failed as Actual message and expected message are not matching ");
	    Reporter.log("Validating Actual message on offer defination page is "+ActualMessage+" and Expected message on offer defination page is "+UtilityClass.readDataFromStringExcel(3, 1, "Sheet6"),true);
    }
  
    @AfterMethod
    public void Logout() throws InterruptedException
    {
      Thread.sleep(3000);
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



