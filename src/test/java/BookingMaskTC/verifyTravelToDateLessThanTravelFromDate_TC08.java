package BookingMaskTC;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.baseClass;
import POM.DashboardPage;
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
import utility.utilityClass;

public class verifyTravelToDateLessThanTravelFromDate_TC08 extends baseClass
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
	 
//		WebElement master = driver.findElement(By.xpath("//i[@class='metismenu-icon pe-7s-folder']"));
//		Actions ac = new Actions(driver);
//		Thread.sleep(1000);
//		ac.moveToElement(master).click().build().perform();
//		Reporter.log("Clicked on Master dropdown in dashboard page",true);	
//        Thread.sleep(1000);
//        dashboard.clickOnTbm();
//        Reporter.log("Clicked on TBM dropdown",true);	
//        Thread.sleep(500);
//        dashboard.clickOnTbmCode();
//        Reporter.log("Clicked on TBM code",true);	
//        Thread.sleep(1000);
//        tbmMaster.clickOncreateButtoninTbmMaster();
//        Reporter.log("Clicked on create TBM button",true);	
//        Thread.sleep(1000);
//        utilityClass.listBoxHandlingUsingByText("H", newTbm.selectKindOfservice());
//        Reporter.log("Select kind of service from dropdown",true);	
//        Thread.sleep(500);
//        newTbm.sendTbmCodeMasterName(utilityClass.readDataFromStringExcel(10, 1, "Sheet2"));
//        Reporter.log("Send TBM code",true);	
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("Indien", newTbm.selectCountry());
//        Reporter.log("Select Country from ListBox ",true);	
//        Thread.sleep(500);
//        newTbm.clickOncreateTbmCode();
//        Reporter.log("Clicked on Create TBMcode button",true);	
//        Thread.sleep(1000);
//        
//        tbmMaster.clickOnDashboard();
//        Reporter.log("Clicked on Dashboard button",true);	
//        Thread.sleep(2000);
//		
//        driver.navigate().to("https://zeuscloud.azurewebsites.net/Accommodation");
//        Reporter.log("Clicked on Accommodation dropdown",true);	
//        Thread.sleep(500);
//        accommdationList.clickcreateAccommodationButton();
//        Reporter.log("Clicked on create Accommodation",true);	
//        
//        Thread.sleep(1000);
//        utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", accommodationNew.clickOnTBMCodeSelection());
//        Reporter.log("Select TBM code from dropdown list",true);	
//        Thread.sleep(500);
//        
//        accommodationNew.sendstars(utilityClass.readDataFromStringExcel(15, 1, "Sheet2"));
//        Reporter.log("send hotel stars",true);	
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("Kowloon", accommodationNew.selectStateListBox());
//        Reporter.log("Select state from the listBox",true);
//        Thread.sleep(1000);
//        utilityClass.listBoxHandlingUsingByText("HKSAR", accommodationNew.selectCityListBox());
//        Reporter.log("Select City from the listBox",true);
//        accommodationNew.sendzipcode(utilityClass.readDataFromStringExcel(16, 1, "Sheet2"));
//        Reporter.log("send zip code",true);
//        Thread.sleep(1000);
//        accommodationNew.sendstreet(utilityClass.readDataFromStringExcel(17, 1, "Sheet2"));
//        Reporter.log("send Street",true);
//        Thread.sleep(1000);
//        accommodationNew.sendNumber(utilityClass.readDataFromStringExcel(18, 1, "Sheet2"));
//        Reporter.log("send Number",true);
//        Thread.sleep(1000);
//        accommodationNew.sendhotelEmailField(utilityClass.readDataFromStringExcel(19, 1, "Sheet2"));
//        Reporter.log("send hotel email",true);
//        utilityClass.implicitlyWaitInMillis(1000);
//        accommodationNew.sendphone(utilityClass.readDataFromStringExcel(20, 1, "Sheet2"));
//        Reporter.log("send phone Number",true);
//        utilityClass.implicitlyWaitInMillis(1000);
//        accommodationNew.sendcontractPartner(utilityClass.readDataFromStringExcel(21, 1, "Sheet2"));
//        Reporter.log("send contract partner name",true);
//        utilityClass.implicitlyWaitInMillis(1000);
//        accommodationNew.sendcontractEmailField(utilityClass.readDataFromStringExcel(22, 1, "Sheet2"));
//        Reporter.log("send contract partner Email",true);
//        utilityClass.implicitlyWaitInMillis(1000);
//        accommodationNew.sendreservationEmailField(utilityClass.readDataFromStringExcel(23, 1, "Sheet2"));
//        Reporter.log("send Reservation Email",true);
//        utilityClass.implicitlyWaitInMillis(2000);
//        utilityClass.listBoxHandlingUsingByText("FalkTours AT GmbH", accommodationNew.bankdetailsPurchaseAgencyDropdownList());
//        Reporter.log("Select bank details in purchase agency dropdown",true);
//        Thread.sleep(3000);
//        accommodationNew.clickOncreateAccommodationButton();
//        Reporter.log("Clicked on create AccommdationButton",true);
//        Thread.sleep(11000);
//        utilityClass.implicitlyWaitInMillis(12000);
//           try {
//        	   driver.findElement(By.xpath("//span[text()='Rooms']")).click();
//		} catch (Exception e) {
//			System.out.println("clicked on Rooms");
//		}
//        Reporter.log("Clicked on Rooms button",true);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("(//a[@class='btn-shadow btn btn-primary'])[1]")).click();
//        Reporter.log("clicked on create Room",true);
//        Thread.sleep(2000);
//        utilityClass.listBoxHandlingUsingByText("1 Raum Appartment", roomDetails.dropdownRoomType());
//        Reporter.log("Select Room Type from dropdown",true);
//        Thread.sleep(1000);
//        roomDetails.sendroomName(utilityClass.readDataFromStringExcel(27, 1, "Sheet2"));
//        Reporter.log("send Room name",true);
//        utilityClass.listBoxHandlingUsingByText("without sea view", roomDetails.dropdownseaView());
//        Reporter.log("select the sea view Street",true);
//        Thread.sleep(500);
//        roomDetails.sendroomcode(utilityClass.readDataFromStringExcel(28, 1, "Sheet2"));
//        Reporter.log("send room code",true);
//        Thread.sleep(500);
//        roomDetails.clearMinAdultPerson();
//        roomDetails.sendminAdultPerson(utilityClass.readDataFromStringExcel(29, 1, "Sheet2"));
//        Reporter.log("send minimum adult person",true);
//        Thread.sleep(500);
//        roomDetails.clearMaxAdultPerson();
//        roomDetails.sendmaxAdultPerson(utilityClass.readDataFromStringExcel(30, 1, "Sheet2"));
//        Reporter.log("send maximum adult person",true);
//        Thread.sleep(500);
//        roomDetails.clearMinChildren();
//        roomDetails.sendminChildren(utilityClass.readDataFromStringExcel(31, 1, "Sheet2"));
//        Reporter.log("send minimum children person",true);
//        Thread.sleep(500);
//        roomDetails.clearMaxChildren();
//        roomDetails.sendmaxChildren(utilityClass.readDataFromStringExcel(32, 1, "Sheet2"));
//        Reporter.log("send maximum children person",true);
//        Thread.sleep(1000);
//        roomDetails.clearMaxTotalPerson();
//        roomDetails.sendmaxTotalPerson(utilityClass.readDataFromStringExcel(33, 1, "Sheet2"));
//        Reporter.log("send maximum Total person",true);
//        Thread.sleep(1500);
//        roomDetails.clickOncreateRoomButton();
//        Reporter.log("clicked on CreateRoom button",true);
//        Thread.sleep(1000);
//        utilityClass.scrollByAxis(0, -500);
//        Thread.sleep(6000);
//        driver.findElement(By.xpath("(//span[@class='nav-text'])[3]")).click();
//        Thread.sleep(5000);
//        Reporter.log("clicked on Contract",true);
//        driver.findElement(By.xpath("(//a[@class='btn-shadow btn btn-primary'])[3]")).click();
//        Thread.sleep(1000);
//        Reporter.log("clicked on Create contract",true);
//        contracts.sendContractName(utilityClass.readDataFromStringExcel(37, 1, "Sheet2"));
//        Reporter.log("send contract name",true);
//        Thread.sleep(1000);
//        utilityClass.listBoxHandlingUsingByText("Euro", contracts.selectcurrencydropdown());
//        Reporter.log("select currency in the listBox",true);
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("Winter", contracts.selectcontractSeasondropdown());
//        Reporter.log("select season in the listBox",true);
//        Thread.sleep(500);
//        contracts.sendStartDateField(utilityClass.readDataFromStringExcel(38, 1, "Sheet2"));
//        Reporter.log("send start date of contract",true);
//        Thread.sleep(500);
//        contracts.sendEndDateField(utilityClass.readDataFromStringExcel(39, 1, "Sheet2"));
//        Reporter.log("send End date of contract",true);
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("Per_Night", contracts.priceTypedropdown());
//        Reporter.log("select price type in the listBox",true);
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("Per_Person", contracts.pricecategorydropdown());
//        Reporter.log("select price category in the listBox",true);
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("Live", contracts.contractstatusdropdown());
//        Reporter.log("select status of contract in the ListBox",true);
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("V+", contracts.boardbasisdropdown());
//        Reporter.log("select board basis in the listBox",true);
//        Thread.sleep(500);
//        utilityClass.listBoxHandlingUsingByText("Net", contracts.priceDropdownNetGrossdropdown());
//        Reporter.log("select the Price",true);
//        Thread.sleep(500);
//        
//        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
//        Thread.sleep(500);
//        WebElement ListBox = driver.findElement(By.id("companyids"));
//        Select s=new Select(ListBox);
//        System.out.println(s.isMultiple());
//        Reporter.log("check the listbox is multiselect or not",true);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//li[@class='multiselect-item multiselect-all']")).click();
//        Reporter.log("select the Distributor",true);
//        
//        utilityClass.listBoxHandlingUsingByText("Offline (Agencies) Only", contracts.onlineOfflinedropdown());
//        Reporter.log("select the online or offline mode in listbox",true);
//        Thread.sleep(1000);
//        utilityClass.scrollByAxis(0, 600);
//        Thread.sleep(1000);
//        contracts.sendcancellationFeesUpToDaysBeforeArrival1(utilityClass.readDataFromStringExcel(40, 1, "Sheet2"));
//        Reporter.log("send cancellation Fees upto days",true);
//        Thread.sleep(500);
//        contracts.sendcancellationFeesvalue1(utilityClass.readDataFromStringExcel(41, 1, "Sheet2"));
//        Reporter.log("send cancellation fees value",true);
//        Thread.sleep(1000);
//        utilityClass.listBoxHandlingUsingByText("Percentage", contracts.cancellationFeesdiscountTypeDropdowndropDown1());
//        Reporter.log("select cancellation fees discount type in listbox",true);
//        Thread.sleep(1000);
//        contracts.sendcancellationFeestravelFrom1(utilityClass.readDataFromStringExcel(42, 1, "Sheet2"));
//        Reporter.log("send cancellation fees travel from date",true);
//        Thread.sleep(500);
//        contracts.sendcancellationFeestravelTo1(utilityClass.readDataFromStringExcel(43, 1, "Sheet2"));
//        Reporter.log("send cancellation fees travel To date",true);
//        Thread.sleep(500);
//        contracts.clickOnCreateContract();
//        Reporter.log("clicked on create contract on contract page",true);
//        
//        Thread.sleep(1000);
//
//        //utilityClass.scrollByAxis(0, 900);
//        Thread.sleep(9000);
//        utilityClass.implicitlyWaitInMillis(15000);
//        
//        try {
//        	 Thread.sleep(1000);
//        	 WebElement prices = driver.findElement(By.xpath("//span[text()='Price']"));
//        	 JavascriptExecutor executor = (JavascriptExecutor)driver;
//             executor.executeScript("arguments[0].click();", prices);
//        	
//		} catch (Exception e) {
//			System.out.println("price option is unable to click ");
//		}
//      
//        Thread.sleep(3000);
//        
//        price.sendSeasonFrom_A(utilityClass.readDataFromStringExcel(48, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_A(utilityClass.readDataFromStringExcel(48, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonAallotRoom1_A(utilityClass.readDataFromStringExcel(48, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonApriceRoom1_A(utilityClass.readDataFromStringExcel(48, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_A",true);
//        
//        Thread.sleep(1000);
//        
//        price.sendSeasonFrom_B(utilityClass.readDataFromStringExcel(49, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_B(utilityClass.readDataFromStringExcel(49, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonBallotRoom1_B(utilityClass.readDataFromStringExcel(49, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonBpriceRoom1_B(utilityClass.readDataFromStringExcel(49, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_B",true);
//        
//        Thread.sleep(1000);
//        
//        price.sendSeasonFrom_C(utilityClass.readDataFromStringExcel(50, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_C(utilityClass.readDataFromStringExcel(50, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonCallotRoom1_C(utilityClass.readDataFromStringExcel(50, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonCpriceRoom1_C(utilityClass.readDataFromStringExcel(50, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_C",true);
//        Thread.sleep(1000);
//        
//        price.sendSeasonFrom_D(utilityClass.readDataFromStringExcel(51, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_D(utilityClass.readDataFromStringExcel(51, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonDallotRoom1_D(utilityClass.readDataFromStringExcel(51, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonDpriceRoom1_D(utilityClass.readDataFromStringExcel(51, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_D",true);
//        Thread.sleep(1000);
//        
//        price.sendSeasonFrom_E(utilityClass.readDataFromStringExcel(52, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_E(utilityClass.readDataFromStringExcel(52, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonEallotRoom1_E(utilityClass.readDataFromStringExcel(52, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonEpriceRoom1_E(utilityClass.readDataFromStringExcel(52, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_E",true);
//        Thread.sleep(1000);
//        
//        price.sendSeasonFrom_F(utilityClass.readDataFromStringExcel(53, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_F(utilityClass.readDataFromStringExcel(53, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonFallotRoom1_F(utilityClass.readDataFromStringExcel(53, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonFpriceRoom1_F(utilityClass.readDataFromStringExcel(53, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_F",true);
//        Thread.sleep(1000);
//        
//        price.sendSeasonFrom_G(utilityClass.readDataFromStringExcel(54, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_G(utilityClass.readDataFromStringExcel(54, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonGallotRoom1_G(utilityClass.readDataFromStringExcel(54, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonGpriceRoom1_G(utilityClass.readDataFromStringExcel(54, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_G",true);
//        Thread.sleep(1000);
//        
//        price.sendSeasonFrom_H(utilityClass.readDataFromStringExcel(55, 1, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.seasonUntil_H(utilityClass.readDataFromStringExcel(55, 2, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonHallotRoom1_H(utilityClass.readDataFromStringExcel(55, 3, "Sheet2"));
//        utilityClass.implicitlyWaitInMillis(500);
//        price.sendseasonHpriceRoom1_H(utilityClass.readDataFromStringExcel(55, 4, "Sheet2"));
//        Reporter.log("send all required details for Season_H",true);
//        Thread.sleep(2500);
//        
//        driver.findElement(By.xpath("(//a[@class='btn-lg'])[11]")).click();
//        Reporter.log("Delete the extra created room in Rooms",true);
//        Thread.sleep(1000);
//        utilityClass.scrollByAxis(0, 500);
//        Thread.sleep(1000);
//        price.clickOnUpdatePriceButton();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
//        Reporter.log("Clicked on OK on the popup for Update price",true);
//        Thread.sleep(2000);
//        utilityClass.implicitlyWaitInMillis(9000);
//        price.clickOnGenerateAllotmentButton();
//        Reporter.log("Clicked on generate Allotment",true);
//        Thread.sleep(3500);
//        utilityClass.implicitlyWaitInMillis(6000);
//        try {
//            driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
//		} catch (Exception e) {
//			System.out.println("click on popup");
//		}
//    
//        
//        Thread.sleep(9000);
//        driver.navigate().to("https://zeuscloud.azurewebsites.net/Dashboard");
//        Reporter.log("Navigate to dashboard page",true);
//        
//        Thread.sleep(9000);
//        
//        utilityClass.implicitlyWaitInMillis(12000);
//        
//      // Offer Defination Page
//            dashboard.clickOncalculationList();
//            Thread.sleep(1000);
//            dashboard.clickOnOfferdefination();
//      		Thread.sleep(1000);
//      		Reporter.log("Clicked on offer defination",true);
//      		offerdefination.clickOnFalkToursAG();
//      		Reporter.log("Clicked on FalkToursAG",true);
//      		offerdefination.clickOnTchiboDE();
//      		Thread.sleep(500);
//      		Reporter.log("Clicked on TchiboDE",true);
//      		offerdefination.SendTBMcode(utilityClass.readDataFromStringExcel(58, 1, "Sheet2"));
//      		Thread.sleep(4200);
//      		Reporter.log("Send TBM code ",true);
//      		offerdefination.clickOnCheckBox();
//      		Reporter.log("Clicked on checkBox",true);
//      		Thread.sleep(2000);
//      		offerdefination.clickOnsaveButton();
//      		Reporter.log("Clicked on saveButton",true);
//      		
//      		Thread.sleep(4000);
//      		dashboard.clickOncalculationList();
//      		Reporter.log("Clicked on Calculation dropdown",true);
//      		Thread.sleep(1500);
      		
//      		// Offer calculation Page
//      		dashboard.clickOncalculationList();
//    		Reporter.log("Clicked on offer calculationList",true);
//    		Thread.sleep(1000);
//    		dashboard.clickOnOffercalculationList();
//    		Reporter.log("Clicked on offer calculation",true);
//    		Thread.sleep(2000);
//    		offerCalculation.clickOnFalkToursAG();
//    		Reporter.log("Clicked on FalkToursAG",true);
//    		Thread.sleep(1000);
//    		offerCalculation.clickOnTchiboDE();
//    	    Reporter.log("Clicked on TchiboDE",true);
//    	    Thread.sleep(1000);
//    	    
//    	    driver.findElement(By.xpath("(//ul[@class='jstree-children']//a)[30]")).click();
//            Reporter.log("clicked on testNg in calaculation page",true);
//    	    //calculationSetting.clickOnselectautofieldinTichiboDE();
//    	    
//    	    Thread.sleep(2500);
//    	    
//    	    calculationSetting.clickOnRoom1(); 
//    	    Reporter.log("clicked on Room1",true);
//    	    
//    	    Thread.sleep(1000);
//    		calculationSetting.clearDbPercentage();
//    		Thread.sleep(1000);
//    	    calculationSetting.senddbPercentagevalue(utilityClass.readDataFromStringExcel(62, 1, "Sheet2"));
//    	    Reporter.log("send DB% Value",true);
//    	    Thread.sleep(1000);
//            calculationSetting.clickOnSaveSetting();  
//    	    Reporter.log("Clicked on save setting button",true);
//    	    Thread.sleep(1500);
//            calculationSetting.clickOnSaveandCalculate();
//    		Reporter.log("Clicked on SaveandCalculate button",true);
//            Thread.sleep(2500);
//            calculationSetting.clickOnpopUpAftersaveAndCalculate();
//    		Reporter.log("click on Yes button in popup",true);
//        	Thread.sleep(1000);  
//    		calculationSetting.clickOnTransferPriceOnline();
//    		Reporter.log("click on transfer price",true);
//    		Thread.sleep(2000);
//    		calculationSetting.clickOnTransferPriceOnline();
//    		Reporter.log("clicked on Transfer price online",true);
//    		Thread.sleep(2000);
//    		
//    		driver.findElement(By.xpath("(//ul[@class='jstree-children']//a)[30]")).click();
//    		//driver.findElement(By.xpath("(//a[@class='jstree-anchor'])[31]")).click();
//    		//calculationSetting.clickOnselectautoinTichiboDEAfterSavecalculation();
//    		Reporter.log("clicked on TESTING option in TichiboDE after saving of calculation",true);
//    		Thread.sleep(1200); 
//    		utilityClass.implicitlyWaitInMillis(5000);
//    		//utilityClass.scrollByAxis(0, 500);
//    	
//        	calculationSetting.clickOnRoom1();
//    		Reporter.log("click on Room1",true);
//    	    Thread.sleep(4000);
//    		utilityClass.scrollByAxis(0, 400);
//    		calculationSetting.clickOnsavePrice();
//    		Reporter.log("clicked on save price",true);
//    		Thread.sleep(3000);
//    	    utilityClass.implicitlyWaitInMillis(3000);
//    		
//    		// Booking mask
//    		driver.navigate().to("https://zeuscloud.azurewebsites.net/Dashboard");
//    		Thread.sleep(9800);
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
    		
    		utilityClass.listBoxHandlingUsingByText("TFT1", BookingMask.TravelTypeDropDownMethod());
    		Reporter.log("Select TFT1 in TravelType dropdownList",true);
    		
    		Thread.sleep(1000);
    		
    		utilityClass.listBoxHandlingUsingByText("HK001 - (TESTING)", BookingMask.productCodeDropDownMethod());
    		Reporter.log("Selected HK001 - (TESTING) from dropdown list",true);
    		Thread.sleep(1000);
    		utilityClass.scrollByAxis(0, 300);
    		Thread.sleep(1000);
    		utilityClass.implicitlyWaitInMillis(1000);
    		utilityClass.listBoxHandlingUsingByText("Falk Tours AG", BookingMask.companyIDDropDownMethod());
    		Reporter.log("Select Falk Tours AG in CompanyID dropdownList",true);
    		
    		BookingMask.clearNoOfPax();
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendNoOfPax(utilityClass.readDataFromStringExcel(67, 1, "Sheet2"));
    		Reporter.log("Send number of passenger",true);
    		Thread.sleep(1000);
    		
    		BookingMask.sendKOS(utilityClass.readDataFromStringExcel(68, 1, "Sheet2"));
    		Reporter.log("Send correct KOS in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		BookingMask.sendproductCode(utilityClass.readDataFromStringExcel(69, 1, "Sheet2"));
    		Reporter.log("Send correct ProductCode in input field",true);
    		utilityClass.implicitlyWaitInMillis(1000);
    		
    		BookingMask.sendRoomCode(utilityClass.readDataFromStringExcel(70, 1, "Sheet2"));
    		Reporter.log("Send roomcode in input field",true);
    		
    		BookingMask.sendBoard(utilityClass.readDataFromStringExcel(71, 1, "Sheet2"));
    		Reporter.log("Send correct boardName",true);
    		
    		BookingMask.sendOccupancy(utilityClass.readDataFromStringExcel(72, 1, "Sheet2"));
    		Reporter.log("Send Occupancy",true);
    	
    		BookingMask.sendTotalPax(utilityClass.readDataFromStringExcel(73, 1, "Sheet2"));
    		Reporter.log("Send bookinglines ",true);
    		
    		BookingMask.sendTravelFromDate(utilityClass.readDataFromStringExcel(114, 1, "Sheet2"));
    		Reporter.log("Send Travel from date",true);
    		
    		BookingMask.sendTravelToDate(utilityClass.readDataFromStringExcel(115, 1, "Sheet2"));
    		Reporter.log("Send Travel To date",true);
    		
    		driver.findElement(By.id("bookinglines_PassengerNo_2")).sendKeys("1-2");
    		Reporter.log("Select Number of passenger",true);

            BookingMask.clickOnSendbookingButton();
            Reporter.log("Clicked on sendbookingButton",true);
            utilityClass.scrollByAxis(0, 600);
            Thread.sleep(1000); 
	}
 
    @Test
    public void validateTravelToDateLessThanTravelFromDatePopUpMessageonBM() throws EncryptedDocumentException, IOException 
    {
      String ActualMessage = BookingMask.getTravelFromDateLessThanTravelToDatePopUpMsg();
	  String expectedMessage = utilityClass.readDataFromStringExcel(113, 1, "Sheet2");
	  Assert.assertEquals(ActualMessage, expectedMessage,"Test Case Failed as actual & expected Text are not matching");
	  Reporter.log("Validating Actual Message "+BookingMask.getTravelFromDateLessThanTravelToDatePopUpMsg()+" and Expected Message "+utilityClass.readDataFromStringExcel(113, 1, "Sheet2"),true);
    }
  
   @AfterClass 
   public void closeBrowser()
    {
	 driver.close();
	 Reporter.log("Closing Browser",true);
    }
}
 
