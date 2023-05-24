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

public class verifyReleaseDaysTC19 extends BaseClass {
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
	String Allot_Finitial;
	
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

	@Test (priority = 1)  //TC_19
	public void validateReleaseDays() throws EncryptedDocumentException, IOException, InterruptedException {
	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(147, 1, "Sheet5"));
	    Reporter.log("Send start date of season_F on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(148, 1, "Sheet5"));
	    Reporter.log("Send end date of season_F on allotment page",true);
	    Thread.sleep(1000);
 	    allotment.clickOnLoadAllotment();
 	    Reporter.log("Clicked on load allotment",true);
 	    Thread.sleep(1000);
 	    String initialAllot_F = allotment.getInitialAllotRoom1R1C1();
 	    Allot_Finitial=initialAllot_F;
 		Thread.sleep(2000);	
    	allotment.clickOnchangeAllotment();
    	Reporter.log("Clicked on Change allotment button",true);
    	Thread.sleep(2000);
    	UtilityClass.listBoxHandlingUsingByText("Release_Days", ChangeAllotment.selectChangeAllotmentDropdown());
    	Thread.sleep(3000); 	    
    	WebElement clickOnDropdown = driver.findElement(By.xpath("(//div[@class='btn-group'])[2]//span"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", clickOnDropdown);
    	Thread.sleep(1000);  	
   	    ChangeAllotment.clickOnSelectAllRoomsmultiselectdropdown1();
   	    Thread.sleep(2000);
   	    ChangeAllotment.sendDateFromForRoom1Field(UtilityClass.readDataFromStringExcel(147, 1, "Sheet5"));
   	    Reporter.log("Enter start date for room1",true);
   	    Thread.sleep(500);
    	ChangeAllotment.sendDateUntilTo1Field(UtilityClass.readDataFromStringExcel(148, 1, "Sheet5"));
    	Reporter.log("Enter until date for room1",true);
    	Thread.sleep(1000);
    	UtilityClass.implicitlyWaitInsec(70);
    	ChangeAllotment.sendReleaseDaysField(UtilityClass.readDataFromStringExcel(149, 1, "Sheet5"));
    	Thread.sleep(500);
    	
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("document.body.style.zoom='70%'"); 
    	UtilityClass.implicitlyWaitInsec(70);
    	
    	Thread.sleep(1000);  
    	//ChangeAllotment.clickOnConfirmButtonByJSE();
    	WebElement confirmButton=driver.findElement(By.xpath("//button[text()='Confirm']"));
     	js.executeScript("arguments[0].click();", confirmButton);
    	Thread.sleep(6000);
    	    
    	//ChangeAllotment.clickOnOkPopUPByJSE();
    	WebElement OkButton = driver.findElement(By.xpath("//button[text()='OK']"));
    	js.executeScript("arguments[0].click();", OkButton);
    	Thread.sleep(1000);
    	
    	//ChangeAllotment.clickOncloseButtonByJSE();
    	WebElement closeButton = driver.findElement(By.id("closeImageFeature"));
    	js.executeScript("arguments[0].click();", closeButton);
    	Thread.sleep(1000);
        
    	jse.executeScript("document.body.style.zoom='100%'");
    	Thread.sleep(1000);
    	
		allotment.sendStartDate(UtilityClass.readDataFromStringExcel(147, 1, "Sheet5"));
	    Reporter.log("Send start date of season_E on allotment page",true);
	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(148, 1, "Sheet5"));
	    Reporter.log("Send end date of season_E on allotment page",true);
	    allotment.clickOnLoadAllotment();
    	
    	String expectedInitialAllot_F = UtilityClass.readDataFromStringExcel(150, 1, "Sheet5");
    	Assert.assertEquals(Allot_Finitial,expectedInitialAllot_F, "TC failed as Actual allotment and expected allotment are not matching ");
    	Reporter.log("Validating Actual initial allotment is "+Allot_Finitial+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(150, 1, "Sheet5"),true);  
    	    
    	String ActualCurrentAllot_F = allotment.getCurrentAllotRoom1R1C1();
    	String expectedCurrentAllot_F = UtilityClass.readDataFromStringExcel(151, 1, "Sheet5");
    	Assert.assertEquals(ActualCurrentAllot_F, expectedCurrentAllot_F,"Test Case Failed as actual and expected current allotment are not matching");
    	Reporter.log("Validating Actual current allotment is "+ActualCurrentAllot_F+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(151, 1, "Sheet5"),true);
    	    
    	String ActualSoldAllot_F = allotment.getSoldAllotRoom1R1C1();
    	String expectedSoldAllot_F = UtilityClass.readDataFromStringExcel(152, 1, "Sheet5");
    	Assert.assertEquals(ActualSoldAllot_F, expectedSoldAllot_F,"Test Case Failed as actual and expected current allotment are not matching");
    	Reporter.log("Validating Actual current allotment is "+ActualSoldAllot_F+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(152, 1, "Sheet5"),true);
    	    
    	String ActualRemainingAllot_F = allotment.getRemainingAllotRoom1R1C1();
    	String expectedRemainingAllot_F = UtilityClass.readDataFromStringExcel(154, 1, "Sheet5");
    	Assert.assertEquals(ActualRemainingAllot_F, expectedRemainingAllot_F,"Test Case Failed as actual & expected remaining allotment are not matching");
    	Reporter.log("Validating Actual remaining allotment is "+ActualRemainingAllot_F+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(154, 1, "Sheet5"),true); 
    		
    	String ActualReleaseDaysAllot_F = allotment.getReleaseDaysAllotRoom1R1C1();
    	String expectedReleaseDaysAllot_F = UtilityClass.readDataFromStringExcel(155, 1, "Sheet5");
    	Assert.assertEquals(ActualReleaseDaysAllot_F, expectedReleaseDaysAllot_F,"Test Case Failed as actual & expected remaining allotment are not matching");
    	Reporter.log("Validating Actual Release days allotment is "+ActualReleaseDaysAllot_F+" and Expected allotment for season_F is "+UtilityClass.readDataFromStringExcel(155, 1, "Sheet5"),true); 
	}
	
    @AfterMethod
    public void Logout() throws InterruptedException
    {
      Thread.sleep(3000);
      allotment.ClickOnLogoutButtonOfAllotment();
   	  Reporter.log("Clicking on Logout Button",true);
   	  Thread.sleep(1000);
   	  allotment.logoutClickOFAllotment();
   	  Reporter.log("Logout from allotment",true);
    }
  
   @AfterClass 
   public void closeBrowser()
    {
	 driver.close();
	 Reporter.log("Closing Browser",true);
    }
 
 }






