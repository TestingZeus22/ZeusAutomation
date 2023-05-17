package Booking_AllotmentTestCases;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import POM.ChangeAllotmentPage;
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
import POM.tbmCodeMasterPage;
import POM.tbmCodeNewCreatePage;
import utility.UtilityClass;

public class verifyIncreaseDecreaseAllotwithAnyValue_TC06 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	offerCalculationPage offerCalculation;    
	calculationSettingPage calculationSetting; 
	offerDefinationPage offerdefination;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	roomDetailsPage roomDetails;
	contractDetailsPage contractDetail;
	contractsPage contracts;
	ChangeAllotmentPage ChangeAllotment;
	pricePage price;
	roomsPage room;
	allotmentPage allotment;
	String Allot_Cinitial;
	String Allot_Ccurrent;
	String Allot_Cremaining;
	
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
	}
    	
	@Test (priority = 1)
	public void validateIncreaseDecreaseAllotmentWithAnyValue() throws EncryptedDocumentException, IOException, InterruptedException {
	
	allotment.sendStartDate(UtilityClass.readDataFromStringExcel(68, 1, "Sheet5"));
    Reporter.log("Send start date of season_B on allotment page",true);
    allotment.sendendDate(UtilityClass.readDataFromStringExcel(68, 2, "Sheet5"));
    Reporter.log("Send end date of season_B on allotment page",true);
    Thread.sleep(1000);
	allotment.clickOnLoadAllotment();
	Reporter.log("Clicked on load allotment",true);
	 Thread.sleep(1000);
	String initialAllot_C = allotment.getInitialAllotRoom1R1C1();
	Allot_Cinitial=initialAllot_C;
	Thread.sleep(1000);
	allotment.clickOnchangeAllotment();
	Reporter.log("Clicked on Change allotment button",true);
	Thread.sleep(2000);
	UtilityClass.listBoxHandlingUsingByText("Increase_Decrease_Allotment", ChangeAllotment.selectChangeAllotmentDropdown());
	Thread.sleep(3000);  	
	ChangeAllotment.clickOnMultiselectDropdwn();
	Thread.sleep(1000);
	ChangeAllotment.clickOnSelectAllRoomsmultiselectdropdown1();
	Thread.sleep(1000);
	ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(97, 1, "Sheet5"));
	Thread.sleep(2000);
	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(98, 1, "Sheet5"));
	Thread.sleep(2000);
	ChangeAllotment.sendAmount1(UtilityClass.readDataFromStringExcel(99, 1, "Sheet5"));
	Thread.sleep(5000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.body.style.zoom='70%'");
	Thread.sleep(1000);
	
	//ChangeAllotment.clickOnConfirmButtonByJSE();
	WebElement confirmButton=driver.findElement(By.xpath("//button[text()='Confirm']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", confirmButton);
	Reporter.log("Clicked on confirm button",true);
	Thread.sleep(3000);
	    
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
    String currentAllot_C = allotment.getCurrentAllotRoom1R1C1();
    Allot_Ccurrent = currentAllot_C;
    String RemainingAllot_C  =allotment.getRemainingAllotRoom1R1C1();
    Allot_Cremaining = RemainingAllot_C;
    
    String ActualInitialAllot_C = allotment.getInitialAllotRoom1R1C1();
    String expectedInitailAllot_C = UtilityClass.readDataFromStringExcel(100, 1, "Sheet5");
    Assert.assertEquals(ActualInitialAllot_C,expectedInitailAllot_C, "TC failed as Actual message and expected allotment are not matching ");
    Reporter.log("Validating Actual initial allotment is "+ActualInitialAllot_C+" and Expected allotment for season_C is "+UtilityClass.readDataFromStringExcel(100, 1, "Sheet5"),true);  
    
    String ActualCurrentAllot_C = allotment.getCurrentAllotRoom1R1C1();
    String expectedCurrentAllot_C = UtilityClass.readDataFromStringExcel(101, 1, "Sheet5");
    Assert.assertEquals(ActualCurrentAllot_C, expectedCurrentAllot_C,"Test Case Failed as actual & expected current allotment number are not matching");
    Reporter.log("Validating Actual current allotment is "+ActualCurrentAllot_C+" and Expected allotment for season_C is "+UtilityClass.readDataFromStringExcel(101, 1, "Sheet5"),true);
    
    String ActualRemainingAllot_C = allotment.getRemainingAllotRoom1R1C1();
    String expectedRemainingAllot_C = UtilityClass.readDataFromStringExcel(102, 1, "Sheet5");
    Assert.assertEquals(ActualRemainingAllot_C, expectedRemainingAllot_C,"Test Case Failed as actual & expected remaining allotment are not matching");
    Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_C+" and Expected allotment for season_C is "+UtilityClass.readDataFromStringExcel(102, 1, "Sheet5"),true); 
    jse.executeScript("document.body.style.zoom='100%'");
	}
	
    @AfterMethod
    public void Logout() throws InterruptedException
    {
      Thread.sleep(3000);
      allotment.ClickOnLogoutButtonOfAllotment();
   	  Reporter.log("Clicking on Logout Button",true);
   	  Thread.sleep(1000);
   	  allotment.logoutClickOFAllotment();
   	  Reporter.log("Logout from Booking Mask Page",true);
    }
  
   @AfterClass 
   public void closeBrowser()
    {
	 driver.close();
	 Reporter.log("Closing Browser",true);
    }
 
 }





