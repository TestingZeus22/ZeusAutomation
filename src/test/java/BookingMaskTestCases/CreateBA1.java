package BookingMaskTestCases;

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
import Base.BaseClass;
import POM.DashboardPage;
import POM.accommodationGeneratedPage;
import POM.accommodationListPage;
import POM.accommodationNewPage;
import POM.bookingMaskPage;
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

public class CreateBA1 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	offerCalculationPage offerCalculation;    
	calculationSettingPage calculationSetting; 
	offerDefination offerdefination;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	tbmCodeNewCreatePage newTbm;
	tbmCodeMasterPage tbmMaster;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	roomDetailsPage roomDetails;
	contractsPage contracts;
	pricePage price;
	
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
		offerdefination = new offerDefination(driver); 
		salesBookingList =new salesBookingListPage(driver);
		BookingMask =new bookingMaskPage(driver);
		newTbm =new tbmCodeNewCreatePage(driver);
		tbmMaster=new tbmCodeMasterPage(driver);
		accommdationList =new accommodationListPage(driver);
		accommodationNew =new accommodationNewPage(driver);
		roomDetails =new roomDetailsPage(driver);
		contracts =new contractsPage(driver);
		price = new pricePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.SendUserName(UtilityClass.readDataFromStringExcel(2, 0, "Sheet1"));
		Reporter.log("Valid Username Entered",true);
		login.SendPassword(UtilityClass.readDataFromStringExcel(2, 1, "Sheet1"));
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
	 
		WebElement master = driver.findElement(By.xpath("//i[@class='metismenu-icon pe-7s-folder']"));
		Actions ac = new Actions(driver);
		Thread.sleep(1000);
		ac.moveToElement(master).click().build().perform();
		Reporter.log("Clicked on Master dropdown in dashboard page",true);	
        Thread.sleep(1000);
        dashboard.ClickOnTBM();
        Reporter.log("Clicked on TBM dropdown",true);	
        Thread.sleep(500);
        dashboard.ClickOnTbmCode();
        Reporter.log("Clicked on TBM code",true);	
        Thread.sleep(1000);
        tbmMaster.clickOncreateButtoninTbmMaster();
        Reporter.log("Clicked on create TBM button",true);	
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("H", newTbm.selectKindOfservice());
        Reporter.log("Select kind of service from dropdown",true);	
        Thread.sleep(500);
        newTbm.sendTbmCodeMasterName(UtilityClass.readDataFromStringExcel(34, 1, "Sheet2"));
        Reporter.log("Send TBM code",true);	
        Thread.sleep(500);
        UtilityClass.listBoxHandlingUsingByText("Honkong", newTbm.selectCountry());
        Reporter.log("Select Country from ListBox ",true);	
        Thread.sleep(500);
        newTbm.clickOncreateTbmCode();
        Reporter.log("Clicked on Create TBMcode button",true);	
        Thread.sleep(1000);
        tbmMaster.clickOnDashboard();
        Reporter.log("Clicked on Dashboard button",true);	
        Thread.sleep(2000);
       
        driver.navigate().to("https://zeuscloud.azurewebsites.net/Accommodation");
        Reporter.log("Clicked on Accommodation dropdown",true);	
        Thread.sleep(2000);
        accommdationList.clickcreateAccommodationButton();
        Reporter.log("Clicked on create Accommodation",true);	
        Thread.sleep(2000);
        UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", accommodationNew.clickOnTBMCodeSelection());
        Reporter.log("Select TBM code from dropdown list",true);	
        Thread.sleep(500);
        
        accommodationNew.sendstars(UtilityClass.readDataFromStringExcel(15, 1, "Sheet2"));
        Reporter.log("Send hotel stars",true);	
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("Kowloon", accommodationNew.selectStateListBox());
        Reporter.log("Select State from the listBox",true);
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("HKSAR", accommodationNew.selectCityListBox());
        Reporter.log("Select City from the listBox",true);
        accommodationNew.sendzipcode(UtilityClass.readDataFromStringExcel(16, 1, "Sheet2"));
        Reporter.log("Send Zip code",true);
        Thread.sleep(1000);
        accommodationNew.sendstreet(UtilityClass.readDataFromStringExcel(17, 1, "Sheet2"));
        Reporter.log("Send Street",true);
        Thread.sleep(1000);
        accommodationNew.sendNumber(UtilityClass.readDataFromStringExcel(18, 1, "Sheet2"));
        Reporter.log("Send Number",true);
        Thread.sleep(1000);
        accommodationNew.sendhotelEmailField(UtilityClass.readDataFromStringExcel(19, 1, "Sheet2"));
        Reporter.log("Send hotel email",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendphone(UtilityClass.readDataFromStringExcel(20, 1, "Sheet2"));
        Reporter.log("Send phone Number",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendcontractPartner(UtilityClass.readDataFromStringExcel(21, 1, "Sheet2"));
        Reporter.log("Send contract partner name",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendcontractEmailField(UtilityClass.readDataFromStringExcel(22, 1, "Sheet2"));
        Reporter.log("Send contract partner Email",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendreservationEmailField(UtilityClass.readDataFromStringExcel(23, 1, "Sheet2"));
        Reporter.log("Send Reservation Eamil",true);
        UtilityClass.implicitlyWaitInMillis(2000);
        UtilityClass.listBoxHandlingUsingByText("FalkTours AT GmbH", accommodationNew.bankdetailsPurchaseAgencyDropdownList());
        Reporter.log("Select bank details in purchase agency dropdown",true);
        Thread.sleep(3000);
        accommodationNew.clickOncreateAccommodationButton();
        Reporter.log("Clicked on create AccommdationButton",true);
        Thread.sleep(11000);
        UtilityClass.implicitlyWaitInMillis(12000);
        //
          try {
        	   driver.findElement(By.xpath("//span[text()='Rooms']")).click();
		} catch (Exception e) {
			System.out.println("clicked on Rooms");
		}
        Reporter.log("Clicked on Rooms button",true);
        Thread.sleep(3000);
        //
        driver.findElement(By.xpath("(//a[@class='btn-shadow btn btn-primary'])[1]")).click();
        Reporter.log("Clicked on create Room",true);
        Thread.sleep(2000);
        UtilityClass.listBoxHandlingUsingByText("1 Raum Appartment", roomDetails.dropdownRoomType());
        Reporter.log("Select Room Type from dropdown",true);
        Thread.sleep(1000);
        roomDetails.sendroomName(UtilityClass.readDataFromStringExcel(27, 1, "Sheet2"));
        Reporter.log("Send Room name",true);
        UtilityClass.listBoxHandlingUsingByText("without sea view", roomDetails.dropdownseaView());
        Reporter.log("Select the sea view Street",true);
        Thread.sleep(500);
        roomDetails.sendroomcode(UtilityClass.readDataFromStringExcel(28, 1, "Sheet2"));
        Reporter.log("Send room code",true);
        Thread.sleep(500);
        roomDetails.clearMinAdultPerson();
        roomDetails.sendminAdultPerson(UtilityClass.readDataFromStringExcel(29, 1, "Sheet2"));
        Reporter.log("Send minimum adult person",true);
        Thread.sleep(500);
        roomDetails.clearMaxAdultPerson();
        roomDetails.sendmaxAdultPerson(UtilityClass.readDataFromStringExcel(30, 1, "Sheet2"));
        Reporter.log("Send maximum adult person",true);
        Thread.sleep(500);
        roomDetails.clearMinChildren();
        roomDetails.sendminChildren(UtilityClass.readDataFromStringExcel(31, 1, "Sheet2"));
        Reporter.log("Send minimum children person",true);
        Thread.sleep(500);
        roomDetails.clearMaxChildren();
        roomDetails.sendmaxChildren(UtilityClass.readDataFromStringExcel(32, 1, "Sheet2"));
        Reporter.log("Send maximum children person",true);
        Thread.sleep(1000);
        roomDetails.clearMaxTotalPerson();
        roomDetails.sendmaxTotalPerson(UtilityClass.readDataFromStringExcel(33, 1, "Sheet2"));
        Reporter.log("Send maximum Total person",true);
        Thread.sleep(1500);
        roomDetails.clickOncreateRoomButton();
        Reporter.log("Clicked on CreateRoom button",true);
        Thread.sleep(1000);
        UtilityClass.scrollByAxis(0, -500);
        Thread.sleep(6000);
        driver.navigate().refresh();
        //
        try {
     	   driver.findElement(By.xpath("//span[text()='Rooms']")).click();
		} catch (Exception e) {
			System.out.println("clicked on Rooms");
		}
        //
        driver.findElement(By.xpath("(//a[@class='btn-shadow btn btn-primary'])[1]")).click();
        Reporter.log("Clicked on create Room",true);
        Thread.sleep(4000);
        //
        try {
        	UtilityClass.listBoxHandlingUsingByText("2 Raum Appartment", roomDetails.dropdownRoomType());
		} catch (Exception e) {
			System.out.println("Unable to click on textBox");
		}
        Reporter.log("Select Room Type from dropdown",true);
        Thread.sleep(3000);
        roomDetails.sendroomName(UtilityClass.readDataFromStringExcel(27, 2, "Sheet2"));
        Reporter.log("Send Room name",true);
        UtilityClass.listBoxHandlingUsingByText("without sea view", roomDetails.dropdownseaView());
        Reporter.log("Select the sea view Street",true);
        Thread.sleep(500);
        roomDetails.sendroomcode(UtilityClass.readDataFromStringExcel(28, 2, "Sheet2"));
        Reporter.log("Send room code",true);
        Thread.sleep(500);
        roomDetails.clearMinAdultPerson();
        roomDetails.sendminAdultPerson(UtilityClass.readDataFromStringExcel(29, 2, "Sheet2"));
        Reporter.log("Send minimum adult person",true);
        Thread.sleep(500);
        roomDetails.clearMaxAdultPerson();
        roomDetails.sendmaxAdultPerson(UtilityClass.readDataFromStringExcel(30, 2, "Sheet2"));
        Reporter.log("Send maximum adult person",true);
        Thread.sleep(500);
        roomDetails.clearMinChildren();
        roomDetails.sendminChildren(UtilityClass.readDataFromStringExcel(31, 2, "Sheet2"));
        Reporter.log("Send minimum children person",true);
        Thread.sleep(500);
        roomDetails.clearMaxChildren();
        roomDetails.sendmaxChildren(UtilityClass.readDataFromStringExcel(32, 2, "Sheet2"));
        Reporter.log("Send maximum children person",true);
        Thread.sleep(1000);
        roomDetails.clearMaxTotalPerson();
        roomDetails.sendmaxTotalPerson(UtilityClass.readDataFromStringExcel(33, 2, "Sheet2"));
        Reporter.log("Send maximum Total person",true);
        Thread.sleep(1500);
        roomDetails.clickOncreateRoomButton();
        Reporter.log("Clicked on CreateRoom button",true);
        Thread.sleep(1000);
        UtilityClass.scrollByAxis(0, -500);
        Thread.sleep(6000);
        //
        driver.findElement(By.xpath("(//span[@class='nav-text'])[3]")).click();
        Thread.sleep(5000);
        Reporter.log("Clicked on Contract",true);
        driver.findElement(By.xpath("(//a[@class='btn-shadow btn btn-primary'])[3]")).click();
        Thread.sleep(1000);
        Reporter.log("Clicked on Create contract",true);
        contracts.sendContractName(UtilityClass.readDataFromStringExcel(37, 1, "Sheet2"));
        Reporter.log("Send contract name",true);
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("Euro", contracts.selectcurrencydropdown());
        Reporter.log("Select currency in the listBox",true);
        Thread.sleep(500);
        UtilityClass.listBoxHandlingUsingByText("Winter", contracts.selectcontractSeasondropdown());
        Reporter.log("Select season in the listBox",true);
        Thread.sleep(500);
        contracts.sendStartDateField(UtilityClass.readDataFromStringExcel(38, 1, "Sheet2"));
        Reporter.log("Send start date of contract",true);
        Thread.sleep(500);
        contracts.sendEndDateField(UtilityClass.readDataFromStringExcel(39, 1, "Sheet2"));
        Reporter.log("Send End date of contract",true);
        Thread.sleep(500);
        UtilityClass.listBoxHandlingUsingByText("Per_Night", contracts.priceTypedropdown());
        Reporter.log("Select price type in the listBox",true);
        Thread.sleep(500);
        UtilityClass.listBoxHandlingUsingByText("Per_Person", contracts.pricecategorydropdown());
        Reporter.log("Select price category in the listBox",true);
        Thread.sleep(500);
        UtilityClass.listBoxHandlingUsingByText("Live", contracts.contractstatusdropdown());
        Reporter.log("Select status of contract in the ListBox",true);
        Thread.sleep(500);
        UtilityClass.listBoxHandlingUsingByText("V+", contracts.boardbasisdropdown());
        Reporter.log("Select board basis in the listBox",true);
        Thread.sleep(500);
        UtilityClass.listBoxHandlingUsingByText("Net", contracts.priceDropdownNetGrossdropdown());
        Reporter.log("Select the Price",true);
        Thread.sleep(500);
        //
        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
        Thread.sleep(500);
        WebElement ListBox = driver.findElement(By.id("companyids"));
        Select s=new Select(ListBox);
        System.out.println(s.isMultiple());
        Reporter.log("Check the listbox is multiselect or not",true);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='multiselect-item multiselect-all']")).click();
        Reporter.log("Select the Distributor",true);
        UtilityClass.listBoxHandlingUsingByText("Offline (Agencies) Only", contracts.onlineOfflinedropdown());
        Reporter.log("Select the online or offline mode in listbox",true);
        Thread.sleep(1000);
        UtilityClass.scrollByAxis(0, 600);
        Thread.sleep(1000);
        contracts.sendcancellationFeesUpToDaysBeforeArrival1(UtilityClass.readDataFromStringExcel(40, 1, "Sheet2"));
        Reporter.log("Send cancellation Fees upto days",true);
        Thread.sleep(500);
        contracts.sendcancellationFeesvalue1(UtilityClass.readDataFromStringExcel(41, 1, "Sheet2"));
        Reporter.log("Send cancellation fees value",true);
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("Percentage", contracts.cancellationFeesdiscountTypeDropdowndropDown1());
        Reporter.log("select cancellation fees discount type in listbox",true);
        Thread.sleep(1000);
        contracts.sendcancellationFeestravelFrom1(UtilityClass.readDataFromStringExcel(42, 1, "Sheet2"));
        Reporter.log("Send cancellation fees travel from date",true);
        Thread.sleep(500);
        contracts.sendcancellationFeestravelTo1(UtilityClass.readDataFromStringExcel(43, 1, "Sheet2"));
        Reporter.log("Send cancellation fees travel To date",true);
        Thread.sleep(500);
        contracts.clickOnCreateContract();
        Reporter.log("Clicked on create contract on contract page",true);
        Thread.sleep(1000);
        UtilityClass.implicitlyWaitInMillis(10000);
        Thread.sleep(2000);
        UtilityClass.scrollByAxis(0, 900);
        Thread.sleep(9000);
        UtilityClass.implicitlyWaitInMillis(9000);
        // Need a method for Price of locator methods are pending in POM class. 
        try {
        	 Thread.sleep(1000);
        	 WebElement prices = driver.findElement(By.xpath("//span[text()='Price']"));
        	 JavascriptExecutor executor = (JavascriptExecutor)driver;
             executor.executeScript("arguments[0].click();", prices);
        	
		} catch (Exception e) {
			System.out.println("Price option is unable to click ");
		}
        Thread.sleep(3000);
        price.sendSeasonFrom_A(UtilityClass.readDataFromStringExcel(48, 1, "Sheet2"));
        Thread.sleep(1000);
        price.seasonUntil_A(UtilityClass.readDataFromStringExcel(48, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonAallotRoom1_A(UtilityClass.readDataFromStringExcel(48, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonApriceRoom1_A(UtilityClass.readDataFromStringExcel(48, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_A",true);
        Thread.sleep(1000);
        
        price.sendSeasonFrom_B(UtilityClass.readDataFromStringExcel(49, 1, "Sheet2"));
        Thread.sleep(500);
        price.seasonUntil_B(UtilityClass.readDataFromStringExcel(49, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonBallotRoom1_B(UtilityClass.readDataFromStringExcel(49, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonBpriceRoom1_B(UtilityClass.readDataFromStringExcel(49, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_B",true);
        Thread.sleep(1000);
        
        price.sendSeasonFrom_C(UtilityClass.readDataFromStringExcel(50, 1, "Sheet2"));
        Thread.sleep(500);
        price.seasonUntil_C(UtilityClass.readDataFromStringExcel(50, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonCallotRoom1_C(UtilityClass.readDataFromStringExcel(50, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonCpriceRoom1_C(UtilityClass.readDataFromStringExcel(50, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_C",true);
        Thread.sleep(1000);
        
        price.sendSeasonFrom_D(UtilityClass.readDataFromStringExcel(51, 1, "Sheet2"));
        Thread.sleep(500);
        price.seasonUntil_D(UtilityClass.readDataFromStringExcel(51, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonDallotRoom1_D(UtilityClass.readDataFromStringExcel(51, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonDpriceRoom1_D(UtilityClass.readDataFromStringExcel(51, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_D",true);
        Thread.sleep(1000);
        
        price.sendSeasonFrom_E(UtilityClass.readDataFromStringExcel(52, 1, "Sheet2"));
        Thread.sleep(500);
        price.seasonUntil_E(UtilityClass.readDataFromStringExcel(52, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonEallotRoom1_E(UtilityClass.readDataFromStringExcel(52, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonEpriceRoom1_E(UtilityClass.readDataFromStringExcel(52, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_E",true);
        Thread.sleep(1000);
        
        price.sendSeasonFrom_F(UtilityClass.readDataFromStringExcel(53, 1, "Sheet2"));
        Thread.sleep(500);
        price.seasonUntil_F(UtilityClass.readDataFromStringExcel(53, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonFallotRoom1_F(UtilityClass.readDataFromStringExcel(53, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonFpriceRoom1_F(UtilityClass.readDataFromStringExcel(53, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_F",true);
        Thread.sleep(1000);
        
        price.sendSeasonFrom_G(UtilityClass.readDataFromStringExcel(54, 1, "Sheet2"));
        Thread.sleep(500);
        price.seasonUntil_G(UtilityClass.readDataFromStringExcel(54, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonGallotRoom1_G(UtilityClass.readDataFromStringExcel(54, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonGpriceRoom1_G(UtilityClass.readDataFromStringExcel(54, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_G",true);
        Thread.sleep(1000);
        
        price.sendSeasonFrom_H(UtilityClass.readDataFromStringExcel(55, 1, "Sheet2"));
        Thread.sleep(500);
        price.seasonUntil_H(UtilityClass.readDataFromStringExcel(55, 2, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonHallotRoom1_H(UtilityClass.readDataFromStringExcel(55, 3, "Sheet2"));
        Thread.sleep(500);
        price.sendseasonHpriceRoom1_H(UtilityClass.readDataFromStringExcel(55, 4, "Sheet2"));
        Reporter.log("Send all required details for Season_H",true);
        Thread.sleep(2500);
        
        UtilityClass.listBoxHandlingUsingByText("802 room2", price.room2Dropdown2());
        Reporter.log("Select another room from the dropdown");
        
        price.sendseasonAallotRoom2_A(UtilityClass.readDataFromStringExcel(48, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonApriceRoom2_A(UtilityClass.readDataFromStringExcel(48, 4, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonBallotRoom2_B(UtilityClass.readDataFromStringExcel(49, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonBpriceRoom2_B(UtilityClass.readDataFromStringExcel(49, 4, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonCallotRoom2_C(UtilityClass.readDataFromStringExcel(50, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonCpriceRoom2_C(UtilityClass.readDataFromStringExcel(50, 4, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonDallotRoom2_D(UtilityClass.readDataFromStringExcel(51, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonDpriceRoom2_D(UtilityClass.readDataFromStringExcel(51, 4, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonEallotRoom2_E(UtilityClass.readDataFromStringExcel(52, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonEpriceRoom2_E(UtilityClass.readDataFromStringExcel(52, 4, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonFallotRoom2_F(UtilityClass.readDataFromStringExcel(53, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonFpriceRoom2_F(UtilityClass.readDataFromStringExcel(53, 4, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonGallotRoom2_G(UtilityClass.readDataFromStringExcel(54, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonGpriceRoom2_G(UtilityClass.readDataFromStringExcel(54, 4, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonHallotRoom2_H(UtilityClass.readDataFromStringExcel(55, 3, "Sheet2"));
        Thread.sleep(300);
        price.sendseasonHpriceRoom2_H(UtilityClass.readDataFromStringExcel(55, 4, "Sheet2"));
        Thread.sleep(300);
        UtilityClass.scrollByAxis(0, 400);
        price.clickOnUpdatePriceButton();
        Thread.sleep(2000);
        //
        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
        Reporter.log("Clicked on OK on the popup for Update price",true);
        Thread.sleep(2000);
        UtilityClass.implicitlyWaitInMillis(9000);
        price.clickOnGenerateAllotmentButton();
        Reporter.log("Clicked on generate Allotment",true);
        Thread.sleep(4000);
        UtilityClass.implicitlyWaitInMillis(6000);
        //
        try {
        	driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
		} catch (Exception e) {
			System.out.println("PopUp is not handled ");
		}
        Thread.sleep(9000);
        driver.navigate().to("https://zeuscloud.azurewebsites.net/Dashboard");
        Reporter.log("Navigate to dashboard page",true);
        Thread.sleep(9000);
        UtilityClass.implicitlyWaitInMillis(12000);
        
       // Offer Defination Page
            dashboard.clickOncalculationList();
            Thread.sleep(1000);
            dashboard.clickOnOfferdefination();
      		Thread.sleep(1000);
      		Reporter.log("Clicked on offer defination",true);
      		offerdefination.clickOnFalkToursAG();
      		Reporter.log("Clicked on FalkToursAG",true);
      		offerdefination.clickOnTchiboDE();
      		Thread.sleep(500);
      		Reporter.log("Clicked on TchiboDE",true);
      		offerdefination.SendTBMcode(UtilityClass.readDataFromStringExcel(58, 3, "Sheet2"));
      		Thread.sleep(4200);
      		Reporter.log("Send TBM code ",true);
      		offerdefination.clickOnCheckBox();
      		Reporter.log("Clicked on checkBox",true);
      		Thread.sleep(2000);
      		offerdefination.clickOnsaveButton();
      		Reporter.log("Clicked on saveButton",true);
      		Thread.sleep(4000);
      		dashboard.clickOncalculationList();
      		Reporter.log("Clicked on Calculation dropdown",true);
      		Thread.sleep(1500);
      		
      		// Offer calculation Page
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
    	    Thread.sleep(3000);
    	    //
    	    driver.findElement(By.xpath("//a[@id='j1_40_anchor']")).click();
            Reporter.log("Clicked on Testing in calaculation page",true);
    	    //calculationSetting.clickOnselectautofieldinTichiboDE();
    	    
    	    Thread.sleep(4000);
    	    UtilityClass.clickUsingJSE(calculationSetting.clickOnRoom1ByJSE());
    	    Reporter.log("Clicked on Room1",true);
    	    Thread.sleep(1000);
    		calculationSetting.clearDbPercentage();
    		Thread.sleep(1000);
    	    calculationSetting.senddbPercentagevalue(UtilityClass.readDataFromStringExcel(62, 1, "Sheet2"));
    	    Reporter.log("Send DB% Value",true);
    	    Thread.sleep(1000);
            calculationSetting.clickOnSaveSetting();  
    	    Reporter.log("Clicked on save setting button",true);
    	    Thread.sleep(1500);
            calculationSetting.clickOnSaveandCalculate();
    		Reporter.log("Clicked on SaveandCalculate button",true);
            Thread.sleep(2500);
            calculationSetting.clickOnpopUpAftersaveAndCalculate();
    		Reporter.log("Clicked on Yes button in popup",true);
        	Thread.sleep(1000);  
    		calculationSetting.clickOnTransferPriceOnline();
    		Reporter.log("Clicked on transfer price",true);
    		Thread.sleep(2000);
    		calculationSetting.clickOnTransferPriceOnline();
    		Reporter.log("Clicked on Transfer price online",true);
    		Thread.sleep(3000);
            //
    		driver.findElement(By.xpath("//a[@id='j3_40_anchor']")).click();
    		Reporter.log("Clicked on TESTING option in TichiboDE after saving of calculation",true);
    		Thread.sleep(5000); 
    		UtilityClass.implicitlyWaitInMillis(5000);
    		UtilityClass.clickUsingJSE(calculationSetting.clickOnRoom1ByJSE());
    		Reporter.log("Clicked on Room1",true);
    	    Thread.sleep(4000);
    		UtilityClass.scrollByAxis(0, 400);
    		calculationSetting.clickOnsavePrice();
    		Reporter.log("Clicked on Save price",true);
    		Thread.sleep(3000);
    	    UtilityClass.implicitlyWaitInMillis(3000);
    		
    		// Booking mask
    		driver.navigate().to("https://zeuscloud.azurewebsites.net/Dashboard");
    		Thread.sleep(9800);
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
    		Thread.sleep(1000);
    		UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK004 - (TEST) from dropdown list",true);
    		Thread.sleep(1000);
    		UtilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		UtilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		BookingMask.clearNoOfPax();
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(UtilityClass.readDataFromStringExcel(67, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(UtilityClass.readDataFromStringExcel(68, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendproductCode(UtilityClass.readDataFromStringExcel(58, 3, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		UtilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(UtilityClass.readDataFromStringExcel(70, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(UtilityClass.readDataFromStringExcel(71, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(UtilityClass.readDataFromStringExcel(72, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(UtilityClass.readDataFromStringExcel(73, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(UtilityClass.readDataFromStringExcel(96, 1, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(UtilityClass.readDataFromStringExcel(97, 1, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);
    		Thread.sleep(2000); 
            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            UtilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000); 
	}
 
    @Test
    public void validatePriceFieldWithBA() throws EncryptedDocumentException, IOException 
    {
      String ActualPrice = BookingMask.getPriceFieldValue1("value");
	  String expectedPrice = UtilityClass.readDataFromStringExcel(98, 1, "Sheet2");
	  Assert.assertEquals(ActualPrice, expectedPrice,"Test Case Failed as actual & expected Price are not matching");
	  Reporter.log("Validating Actual price "+BookingMask.getPriceFieldValue1("value")+" and Expected Price "+UtilityClass.readDataFromStringExcel(98, 1, "Sheet2"),true);
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

