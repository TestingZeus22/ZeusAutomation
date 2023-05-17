package Booking_AllotmentTestCases;

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

public class verifyLoadAllotmentForTwoSeasons_TC03 extends BaseClass {
	loginPage login;
	File myFile;
	selectCompanyPage selectCompany;
	DashboardPage dashboard;
	offerCalculationPage offerCalculation;    
	calculationSettingPage calculationSetting; 
	offerDefinationPage offerdefination;
	salesBookingListPage salesBookingList;
	bookingMaskPage BookingMask;
	tbmCodeNewCreatePage newTbm;
	tbmCodeMasterPage tbmMaster;
	accommodationListPage accommdationList;
	accommodationNewPage accommodationNew;
	roomDetailsPage roomDetails;
	contractDetailsPage contractDetail;
	contractsPage contracts;
	pricePage price;
	roomsPage room;
	allotmentPage allotment;
	String Actualseason_Aallot;
	String Allot_Ainitial;
	String Allot_Acurrent;
	String Allot_ARemaining;
	String Actualseason_Ballot;
	String Allot_Binitial;
	
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
		newTbm =new tbmCodeNewCreatePage(driver);
		tbmMaster=new tbmCodeMasterPage(driver);
		accommdationList =new accommodationListPage(driver);
		accommodationNew =new accommodationNewPage(driver);
		roomDetails =new roomDetailsPage(driver);
		contractDetail =new contractDetailsPage(driver);
		contracts =new contractsPage(driver);
		price = new pricePage(driver);
		room = new roomsPage(driver);
		allotment = new allotmentPage(driver);
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
		
        dashboard.clickOnpurchasebutton();
        Reporter.log("Clicked on purchase option",true);
		Thread.sleep(1000);
        dashboard.clickOnAccommodation();
        Reporter.log("Clicked on accommodation option in list",true);
        Thread.sleep(2000);
        accommdationList.clickcreateAccommodationButton();
        Reporter.log("Clicked on create Accommodation",true);	
        Thread.sleep(2000);
        
        UtilityClass.listBoxHandlingUsingByText("HK004 - (TEST)", accommodationNew.clickOnTBMCodeSelection());
        Reporter.log("Select TBM code from dropdown list",true);	
        Thread.sleep(500);
        accommodationNew.sendstars(UtilityClass.readDataFromStringExcel(5, 1, "Sheet5"));
        Reporter.log("Send hotel stars",true);	
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("Kowloon", accommodationNew.selectStateListBox());
        Reporter.log("Select State from the listBox",true);
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("HKSAR", accommodationNew.selectCityListBox());
        Reporter.log("Select City from the listBox",true);
        accommodationNew.sendzipcode(UtilityClass.readDataFromStringExcel(6, 1, "Sheet5"));
        Reporter.log("Send Zip code",true);
        Thread.sleep(1000);
        accommodationNew.sendstreet(UtilityClass.readDataFromStringExcel(7, 1, "Sheet5"));
        Reporter.log("Send Street",true);
        Thread.sleep(1000);
        accommodationNew.sendNumber(UtilityClass.readDataFromStringExcel(8, 1, "Sheet5"));
        Reporter.log("Send Number",true);
        Thread.sleep(1000);
        accommodationNew.sendhotelEmailField(UtilityClass.readDataFromStringExcel(9, 1, "Sheet5"));
        Reporter.log("Send hotel email",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendphone(UtilityClass.readDataFromStringExcel(10, 1, "Sheet5"));
        Reporter.log("Send phone Number",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendcontractPartner(UtilityClass.readDataFromStringExcel(11, 1, "Sheet5"));
        Reporter.log("Send contract partner name",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendcontractEmailField(UtilityClass.readDataFromStringExcel(12, 1, "Sheet5"));
        Reporter.log("Send contract partner Email",true);
        UtilityClass.implicitlyWaitInMillis(1000);
        accommodationNew.sendreservationEmailField(UtilityClass.readDataFromStringExcel(13, 1, "Sheet5"));
        Reporter.log("Send Reservation Eamil",true);
        UtilityClass.implicitlyWaitInMillis(2000);
        UtilityClass.listBoxHandlingUsingByText("FalkTours AT GmbH", accommodationNew.bankdetailsPurchaseAgencyDropdownList());
        Reporter.log("Select bank details in purchase agency dropdown",true);
        Thread.sleep(3000);
        accommodationNew.clickOncreateAccommodationButton();
        Reporter.log("Clicked on create AccommdationButton",true);
        Thread.sleep(11000);
        UtilityClass.implicitlyWaitInMillis(12000);
        accommodationNew.clickOnrooms();
        Reporter.log("Clicked on Rooms button",true);
        room.clickOnCreateButton();
        Reporter.log("Clicked on create roomButton");
        Thread.sleep(2000);
        UtilityClass.listBoxHandlingUsingByText("1 Raum Appartment", roomDetails.dropdownRoomType());
        Reporter.log("Select Room Type from dropdown",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.sendroomName(UtilityClass.readDataFromStringExcel(18, 1, "Sheet5"));
        Reporter.log("Send Room name",true);
        UtilityClass.listBoxHandlingUsingByText("without sea view", roomDetails.dropdownseaView());
        Reporter.log("Select the sea view Street",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.sendroomcode(UtilityClass.readDataFromStringExcel(19, 1, "Sheet5"));
        Reporter.log("Send room code",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.clearMinAdultPerson();
        roomDetails.sendminAdultPerson(UtilityClass.readDataFromStringExcel(20, 1, "Sheet5"));
        Reporter.log("Send minimum adult person",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.clearMaxAdultPerson();
        roomDetails.sendmaxAdultPerson(UtilityClass.readDataFromStringExcel(21, 1, "Sheet5"));
        Reporter.log("Send maximum adult person",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.clearMinChildren();
        roomDetails.sendminChildren(UtilityClass.readDataFromStringExcel(22, 1, "Sheet5"));
        Reporter.log("Send minimum children person",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.clearMaxChildren();
        roomDetails.sendmaxChildren(UtilityClass.readDataFromStringExcel(23, 1, "Sheet5"));
        Reporter.log("Send maximum children person",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.clearMaxTotalPerson();
        roomDetails.sendmaxTotalPerson(UtilityClass.readDataFromStringExcel(24, 1, "Sheet5"));
        Reporter.log("Send maximum Total person",true);
        UtilityClass.implicitlyWaitInsec(60);
        roomDetails.clickOncreateRoomButton();
        Reporter.log("Clicked on CreateRoom button",true);
        Thread.sleep(2000);
      
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.scrollByAxis(0, -500);
        accommodationNew.clickOncontracts();
        Reporter.log("Clicked on contract ",true);
        Thread.sleep(6000);
        contracts.clickOncreateContractButton();
        Reporter.log("Clicked on create contract",true);
        Thread.sleep(2000);
        contractDetail.sendContractName(UtilityClass.readDataFromStringExcel(30, 1, "Sheet5"));
        Reporter.log("Send contract name",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Euro", contractDetail.selectcurrencydropdown());
        Reporter.log("Select currency in the listBox",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Winter", contractDetail.selectcontractSeasondropdown());
        Reporter.log("Select season in the listBox",true);
        UtilityClass.implicitlyWaitInsec(80);
        contractDetail.sendStartDateField(UtilityClass.readDataFromStringExcel(31, 1, "Sheet5"));
        Reporter.log("Send start date of contract",true);
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.sendEndDateField(UtilityClass.readDataFromStringExcel(32, 1, "Sheet5"));
        Reporter.log("Send End date of contract",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Per_Night", contractDetail.priceTypedropdown());
        Reporter.log("Select price type in the listBox",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Per_Person", contractDetail.pricecategorydropdown());
        Reporter.log("Select price category in the listBox",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Live", contractDetail.contractstatusdropdown());
        Reporter.log("Select status of contract in the ListBox",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("V+", contractDetail.boardbasisdropdown());
        Reporter.log("Select board basis in the listBox",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Net", contractDetail.priceDropdownNetGrossdropdown());
        Reporter.log("Select the Price",true);
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.clickOnDistributorCheckBox();
        Reporter.log("Clicked on distributor checkbox");
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.clickOnMultiselectDistributorCheckBox();
        Reporter.log("Clicked on all the checkboxes");
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Offline (Agencies) Only", contractDetail.onlineOfflinedropdown());
        Reporter.log("Select the online or offline mode in listbox",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.scrollByAxis(0, 600);
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.sendcancellationFeesUpToDaysBeforeArrival1(UtilityClass.readDataFromStringExcel(33, 1, "Sheet5"));
        Reporter.log("Send cancellation Fees upto days",true);
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.sendcancellationFeesvalue1(UtilityClass.readDataFromStringExcel(34, 1, "Sheet5"));
        Reporter.log("Send cancellation fees value",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Percentage", contractDetail.cancellationFeesdiscountTypeDropdowndropDown1());
        Reporter.log("select cancellation fees discount type in listbox",true);
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.sendcancellationFeestravelFrom1(UtilityClass.readDataFromStringExcel(35, 1, "Sheet5"));
        Reporter.log("Send cancellation fees travel from date",true);
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.sendcancellationFeestravelTo1(UtilityClass.readDataFromStringExcel(36, 1, "Sheet5"));
        Reporter.log("Send cancellation fees travel To date",true);
        UtilityClass.implicitlyWaitInsec(60);
        contractDetail.clickOnCreateContract();
        Reporter.log("Clicked on create contract on contract page",true);
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.implicitlyWaitInMillis(10000);
        Thread.sleep(2000);
        UtilityClass.scrollByAxis(0, 900);
        UtilityClass.implicitlyWaitInMillis(9000);
    	UtilityClass.clickUsingJSE(accommodationNew.clickOnPriceByJSE());
    	Reporter.log("Clicked on Price option");
        
    	UtilityClass.implicitlyWaitInsec(90);
        price.sendSeasonFrom_A(UtilityClass.readDataFromStringExcel(42, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_A(UtilityClass.readDataFromStringExcel(42, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonAallotRoom1_A(UtilityClass.readDataFromStringExcel(42, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonApriceRoom1_A(UtilityClass.readDataFromStringExcel(42, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_A",true);
        UtilityClass.implicitlyWaitInsec(10);
        
        price.sendSeasonFrom_B(UtilityClass.readDataFromStringExcel(43, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_B(UtilityClass.readDataFromStringExcel(43, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonBallotRoom1_B(UtilityClass.readDataFromStringExcel(43, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonBpriceRoom1_B(UtilityClass.readDataFromStringExcel(43, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_B",true);
        UtilityClass.implicitlyWaitInsec(10);
        
        price.sendSeasonFrom_C(UtilityClass.readDataFromStringExcel(44, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_C(UtilityClass.readDataFromStringExcel(44, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonCallotRoom1_C(UtilityClass.readDataFromStringExcel(44, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonCpriceRoom1_C(UtilityClass.readDataFromStringExcel(44, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_C",true);
        UtilityClass.implicitlyWaitInsec(10);
        
        price.sendSeasonFrom_D(UtilityClass.readDataFromStringExcel(45, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_D(UtilityClass.readDataFromStringExcel(45, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonDallotRoom1_D(UtilityClass.readDataFromStringExcel(45, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonDpriceRoom1_D(UtilityClass.readDataFromStringExcel(45, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_D",true);
        UtilityClass.implicitlyWaitInsec(10);
        
        price.sendSeasonFrom_E(UtilityClass.readDataFromStringExcel(46, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_E(UtilityClass.readDataFromStringExcel(46, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonEallotRoom1_E(UtilityClass.readDataFromStringExcel(46, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonEpriceRoom1_E(UtilityClass.readDataFromStringExcel(46, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_E",true);
        UtilityClass.implicitlyWaitInsec(10);
        
        price.sendSeasonFrom_F(UtilityClass.readDataFromStringExcel(47, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_F(UtilityClass.readDataFromStringExcel(47, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonFallotRoom1_F(UtilityClass.readDataFromStringExcel(47, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonFpriceRoom1_F(UtilityClass.readDataFromStringExcel(47, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_F",true);
        UtilityClass.implicitlyWaitInsec(10);
        
        price.sendSeasonFrom_G(UtilityClass.readDataFromStringExcel(48, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_G(UtilityClass.readDataFromStringExcel(48, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonGallotRoom1_G(UtilityClass.readDataFromStringExcel(48, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonGpriceRoom1_G(UtilityClass.readDataFromStringExcel(48, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_G",true);
        UtilityClass.implicitlyWaitInsec(10);
        
        price.sendSeasonFrom_H(UtilityClass.readDataFromStringExcel(49, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.seasonUntil_H(UtilityClass.readDataFromStringExcel(49, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonHallotRoom1_H(UtilityClass.readDataFromStringExcel(49, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(10);
        price.sendseasonHpriceRoom1_H(UtilityClass.readDataFromStringExcel(49, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_H",true);
        Thread.sleep(1000);
        price.clickOnDeleteRoom2();
        Reporter.log("Delete the extra created room on price page",true);
        Thread.sleep(1000);
        price.clickOnUpdatePriceButton();
        Reporter.log("Clicked on update price button",true);
        Thread.sleep(2000);
        price.clickOnOkPopUp();
        Reporter.log("Clicked on simple popup as OK ",true);
        Thread.sleep(2000);
        price.clickOnGenerateAllotmentButton();
        Reporter.log("Clicked on generate Allotment",true);
        Thread.sleep(4000);
        UtilityClass.implicitlyWaitInMillis(6000);
        price.clickOnOkPopUp();
        Thread.sleep(9000);
        price.clickOnOkPopUp();
        Thread.sleep(1000);
       
        String seasonA_allot= price.getSeasonAallotRoom1_A("value");
        System.out.println("The Allotment in Price page for season_A is "+seasonA_allot);
        Actualseason_Aallot=seasonA_allot;
        System.out.println(Actualseason_Aallot);
        String seasonB_allot= price.getseasonBallotRoom1_B("value");
        System.out.println("The Allotment in Price page for season_A is "+seasonB_allot);
        Actualseason_Ballot=seasonB_allot;
        System.out.println(Actualseason_Ballot);
        price.clickOnDashboardLinkByJSE();
        Reporter.log("Clicked on dashboardLink to navigate to dashboard page",true);
        UtilityClass.implicitlyWaitInMillis(12000);
        
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
      		offerdefination.SendTBMcode(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
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
    	    Thread.sleep(3500);
    	    
    	    calculationSetting.clickOnTestNGoption();
    	    Reporter.log("Clicked on TestNG option",true);
    	    Thread.sleep(4200);
    	    UtilityClass.clickUsingJSE(calculationSetting.clickOnRoom1ByJSE());
    	    Reporter.log("Clicked on Room1",true);
    	    Thread.sleep(1000);
    		calculationSetting.clearDbPercentage();
    		Thread.sleep(1000);
    	    calculationSetting.senddbPercentagevalue(UtilityClass.readDataFromStringExcel(60, 1, "Sheet5"));
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
       
    		calculationSetting.clickOntestNGOptionAfterSave();
    		Reporter.log("Clicked on testng option to see the rooms",true);
    		Thread.sleep(5000); 
    		UtilityClass.clickUsingJSE(calculationSetting.clickOnRoom1ByJSE());
    		Reporter.log("Clicked on Room1",true);
    	    Thread.sleep(4000);
    		UtilityClass.scrollByAxis(0, 400);
    		calculationSetting.clickOnsavePrice();
    		Reporter.log("Clicked on Save price",true);
    		Thread.sleep(3000);
    	    UtilityClass.implicitlyWaitInMillis(3000);
    	    
    	    calculationSetting.clickOnDashboardLinkByJSE();
    	    UtilityClass.implicitlyWaitInsec(70);
    	    dashboard.clickOnpurchasebutton();
            Reporter.log("Clicked on purchase option",true);
    		Thread.sleep(1000);
            dashboard.clickOnAccommodation();
            Reporter.log("Clicked on accommodation option in list",true);
            Thread.sleep(2000);
    	    
    	    accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
    	    Thread.sleep(1500);
    	    accommdationList.clickOnEditRow1Column1();
    	    Thread.sleep(1000);
    	    accommodationNew.clickOnAllotment();
    	    Reporter.log("Clicked on Allotment ",true);
    	    allotment.sendStartDate(UtilityClass.readDataFromStringExcel(66, 1, "Sheet5"));
    	    Reporter.log("Send start date of season_A on allotment page",true);
    	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(66, 2, "Sheet5"));
    	    Reporter.log("Send end date of season_A on allotment page",true);
    	    Thread.sleep(1000);
    	    allotment.clickOnLoadAllotment();
    	    Reporter.log("Clicked on load allotment",true);
    	    Thread.sleep(5000);
    		UtilityClass.scrollByAxis(0, 300);
    		
    		String initialAllot_A = allotment.getInitialAllotRoom1R1C1();
            Allot_Ainitial=initialAllot_A;
            String currentAllot_A = allotment.getCurrentAllotRoom1R1C1();
            Allot_Acurrent=currentAllot_A;
            String remainingAllot_A=allotment.getRemainingAllotRoom1R1C1();
            Allot_ARemaining =remainingAllot_A;
            Thread.sleep(1000);
            
            driver.navigate().to("https://zeuscloud.azurewebsites.net/Accommodation");
            Thread.sleep(1000);
            accommdationList.sendTbmCodeField(UtilityClass.readDataFromStringExcel(55, 1, "Sheet5"));
            Reporter.log("Send Tbm code in accommodation list page",true);
    	    Thread.sleep(2500);
    	    accommdationList.clickOnEditRow1Column1();
    	    Reporter.log("Clicked on edit selected accommodation in list",true);
    	    Thread.sleep(1000);
    	    accommodationNew.clickOnAllotment();
    	    Reporter.log("Clicked on allotment button",true);
            Thread.sleep(1000);
            UtilityClass.scrollByAxis(0, 700);
   
            allotment.sendStartDate(UtilityClass.readDataFromStringExcel(67, 1, "Sheet5"));
            Reporter.log("Send start date of season_B on allotment page",true);
    	    allotment.sendendDate(UtilityClass.readDataFromStringExcel(67, 2, "Sheet5"));
    	    Reporter.log("Send end date of season_B on allotment page",true);
    	    Thread.sleep(1000);
    	    allotment.clickOnLoadAllotment();
    	    UtilityClass.scrollByAxis(0, 350);
    	    Thread.sleep(1000);
    	    String initialAllot_B = allotment.getInitialAllotRoom1R1C1();
    	    String currentAllot_B = allotment.getCurrentAllotRoom1R1C1();
            String remainingAllot_B = allotment.getRemainingAllotRoom1R1C1();   
	}
 
    @Test 
    public void validateAllotmentForTwoSeasonDates() throws EncryptedDocumentException, IOException 
    {
	  Assert.assertEquals(Actualseason_Aallot, Allot_Ainitial,"Test Case Failed as actual & expected allotment number are not matching for season_A");
	  Reporter.log("Validating Actual allotment number on Price page for season_A in contracts is "+Actualseason_Aallot+" and Expected initial allotment number for season_A in Allotment page is "+Allot_Ainitial,true);
	  
	  Assert.assertEquals(Actualseason_Aallot, Allot_Acurrent,"Test Case Failed as actual & expected allotment number are not matching for season_A");
	  Reporter.log("Validating Actual allotment number on Price page for season_A in contracts is "+Actualseason_Aallot+" and Expected current allotment number for season_A in Allotment page is "+Allot_Acurrent,true);
	  
	  Assert.assertEquals(Actualseason_Aallot, Allot_ARemaining,"Test Case Failed as actual & expected allotment number are not matching for season_A");
	  Reporter.log("Validating Actual allotment number on Price page for season_A in contracts is "+Actualseason_Aallot+" and Expected Remaining allotment number for season_A in Allotment page is "+Allot_ARemaining,true);
	  
	  String ExpectedInitailAllotSeason_B = allotment.getInitialAllotRoom1R1C1();
	  Assert.assertEquals(Actualseason_Ballot, ExpectedInitailAllotSeason_B,"Test Case Failed as actual & expected allotments are not matching form season_B");
	  Reporter.log("Validating Actual allotment number on Price page for season_B in contracts is "+Actualseason_Ballot+" and Expected initial allotment number for season_B in Allotment page is "+allotment.getInitialAllotRoom1R1C1(),true); 
	  
	  String ExpectedCurrentAllotSeason_B = allotment.getCurrentAllotRoom1R1C1();
	  Assert.assertEquals(Actualseason_Ballot, ExpectedCurrentAllotSeason_B,"Test Case Failed as actual & expected allotments are not matching form season_B");
	  Reporter.log("Validating Actual allotment number on Price page for season_B in contracts is "+Actualseason_Ballot+" and Expected current allotment number for season_B in Allotment page is "+allotment.getCurrentAllotRoom1R1C1(),true); 
	  
	  String ExpectedRemainingAllotSeason_B = allotment.getRemainingAllotRoom1R1C1();
	  Assert.assertEquals(Actualseason_Ballot, ExpectedRemainingAllotSeason_B,"Test Case Failed as actual & expected allotments are not matching form season_B");
	  Reporter.log("Validating Actual allotment number on Price page for season_B in contracts is "+Actualseason_Ballot+" and Expected Remaining allotment number for season_B in Allotment page is "+allotment.getRemainingAllotRoom1R1C1(),true); 
	 
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


