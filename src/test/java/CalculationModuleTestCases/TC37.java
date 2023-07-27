package CalculationModuleTestCases;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
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
import POM.tbmCodeMasterPage;
import POM.tbmCodeNewCreatePage;
import utility.UtilityClass;
import utility.utilityPropertyFile;

public class TC37 extends BaseClass {
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
	CalculationSettingRoomsDetailPage CalculationSettingRoomsDetail;
	pricePage price;roomsPage room;allotmentPage allotment;
	String Actualseason_Aallot;	String Allot_Ainitial;String Allot_Acurrent;
	String Allot_ARemaining;String Actualseason_Ballot;String Allot_Binitial;
	String NameA;String NameB;String NameC;String NameD;String NameE;String NameF;String NameG;String NameH;
	String SeasonA;String SeasonB;String SeasonC;String SeasonD;String SeasonE;String SeasonF;String SeasonG;String SeasonH;
	String Season_Aprice1;String Season_Bprice1;String Season_Cprice1;String Season_Dprice1;String Season_Eprice1;
	String Season_Fprice1;String Season_Gprice1;String Season_Hprice1;
	String CostPriceSeasonAA;String CostPriceSeasonBB;String CostPriceSeasonCC;String CostPriceSeasonDD;
	String CostPriceSeasonEE;String CostPriceSeasonFF;String CostPriceSeasonGG;String CostPriceSeasonHH;
	String value11;
	String value12;
	String A_Season;
	String SeasonA_FromDate; String SeasonB_FromDate; String SeasonC_FromDate;String SeasonD_FromDate;
	String SeasonE_FromDate;String SeasonF_FromDate;String SeasonG_FromDate;String SeasonH_FromDate;
	String SeasonA_untilDate;String SeasonB_untilDate;String SeasonC_untilDate;String SeasonD_untilDate;
	String SeasonE_untilDate;String SeasonF_untilDate;String SeasonG_untilDate;String SeasonH_untilDate;
	
	
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
        accommdationList.clickcreateAccommodationButton();
        Reporter.log("Clicked on create Accommodation",true);	
        Thread.sleep(2000);
        
        UtilityClass.listBoxHandlingUsingByText("NG001 - (Test)", accommodationNew.clickOnTBMCodeSelection());
        Reporter.log("Select TBM code from dropdown list",true);	
        Thread.sleep(500);
        accommodationNew.sendstars(UtilityClass.readDataFromStringExcel(5, 1, "Sheet5"));
        Reporter.log("Send hotel stars",true);	
        UtilityClass.implicitlyWaitInsec(60);
        UtilityClass.listBoxHandlingUsingByText("Lagos", accommodationNew.selectStateListBox());
        Reporter.log("Select State from the listBox",true);
        Thread.sleep(1000);
        UtilityClass.listBoxHandlingUsingByText("Abuja", accommodationNew.selectCityListBox());
        Reporter.log("Select City from the listBox",true);
        accommodationNew.sendzipcode(UtilityClass.readDataFromStringExcel(6, 1, "Sheet5"));
        Reporter.log("Send Zip code",true);
        UtilityClass.implicitlyWaitInsec(60);
        accommodationNew.sendstreet(UtilityClass.readDataFromStringExcel(7, 1, "Sheet5"));
        Reporter.log("Send Street",true);
        UtilityClass.implicitlyWaitInsec(60);
        accommodationNew.sendNumber(UtilityClass.readDataFromStringExcel(8, 1, "Sheet5"));
        Reporter.log("Send Number",true);
        UtilityClass.implicitlyWaitInsec(60);
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
        Thread.sleep(4000);
        contractDetail.sendContractName(UtilityClass.readDataFromStringExcel(30, 2, "Sheet5"));
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
        UtilityClass.implicitlyWaitInsec(90);
        Thread.sleep(2000);
        UtilityClass.scrollByAxis(0, 900);
        UtilityClass.implicitlyWaitInMillis(9000);
    	UtilityClass.clickUsingJSE(accommodationNew.clickOnPriceByJSE());
    	Reporter.log("Clicked on Price option",true);
        
    	Thread.sleep(1000);
        price.sendSeasonFrom_A(UtilityClass.readDataFromStringExcel(42, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        driver.findElement(By.id("seasonModel_SeasonAUntil")).click();
        UtilityClass.implicitlyWaitInsec(60);
        price.seasonUntil_A(UtilityClass.readDataFromStringExcel(42, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonAallotRoom1_A(UtilityClass.readDataFromStringExcel(42, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonApriceRoom1_A(UtilityClass.readDataFromStringExcel(42, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_A",true);
        UtilityClass.implicitlyWaitInsec(40);
        
        price.sendSeasonFrom_B(UtilityClass.readDataFromStringExcel(43, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.seasonUntil_B(UtilityClass.readDataFromStringExcel(43, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonBallotRoom1_B(UtilityClass.readDataFromStringExcel(43, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonBpriceRoom1_B(UtilityClass.readDataFromStringExcel(43, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_B",true);
        UtilityClass.implicitlyWaitInsec(40);
        
        price.sendSeasonFrom_C(UtilityClass.readDataFromStringExcel(44, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.seasonUntil_C(UtilityClass.readDataFromStringExcel(44, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonCallotRoom1_C(UtilityClass.readDataFromStringExcel(44, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonCpriceRoom1_C(UtilityClass.readDataFromStringExcel(44, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_C",true);
        UtilityClass.implicitlyWaitInsec(40);
        
        price.sendSeasonFrom_D(UtilityClass.readDataFromStringExcel(45, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.seasonUntil_D(UtilityClass.readDataFromStringExcel(45, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonDallotRoom1_D(UtilityClass.readDataFromStringExcel(45, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonDpriceRoom1_D(UtilityClass.readDataFromStringExcel(45, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_D",true);
        UtilityClass.implicitlyWaitInsec(40);
        
        price.sendSeasonFrom_E(UtilityClass.readDataFromStringExcel(46, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.seasonUntil_E(UtilityClass.readDataFromStringExcel(46, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonEallotRoom1_E(UtilityClass.readDataFromStringExcel(46, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonEpriceRoom1_E(UtilityClass.readDataFromStringExcel(46, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_E",true);
        UtilityClass.implicitlyWaitInsec(40);
        
        price.sendSeasonFrom_F(UtilityClass.readDataFromStringExcel(47, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.seasonUntil_F(UtilityClass.readDataFromStringExcel(47, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonFallotRoom1_F(UtilityClass.readDataFromStringExcel(47, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonFpriceRoom1_F(UtilityClass.readDataFromStringExcel(47, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_F",true);
        UtilityClass.implicitlyWaitInsec(40);
        
        price.sendSeasonFrom_G(UtilityClass.readDataFromStringExcel(48, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.seasonUntil_G(UtilityClass.readDataFromStringExcel(48, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonGallotRoom1_G(UtilityClass.readDataFromStringExcel(48, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonGpriceRoom1_G(UtilityClass.readDataFromStringExcel(48, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_G",true);
        UtilityClass.implicitlyWaitInsec(40);
        
        price.sendSeasonFrom_H(UtilityClass.readDataFromStringExcel(49, 1, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.seasonUntil_H(UtilityClass.readDataFromStringExcel(49, 2, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonHallotRoom1_H(UtilityClass.readDataFromStringExcel(49, 3, "Sheet5"));
        UtilityClass.implicitlyWaitInsec(40);
        price.sendseasonHpriceRoom1_H(UtilityClass.readDataFromStringExcel(49, 4, "Sheet5"));
        Reporter.log("Send all required details for Season_H",true);
        Thread.sleep(1000);
        price.clickOnDeleteRoom2();
        Reporter.log("Delete the extra created room on price page",true);
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
     
        //Season Prices get in Contract.
        
        String Season_Aprice = price.getSeasonApriceRoom1_A("value");
        Season_Aprice1=Season_Aprice;
        
        String Season_Bprice = price.getseasonBpriceRoom1_B("value");
        Season_Bprice1=Season_Bprice;
        
        String Season_Cprice = price.getseasonCpriceRoom1_C("value");
        Season_Cprice1=Season_Cprice;
        
        String Season_Dprice = price.getseasonDpriceRoom1_D("value");
        Season_Dprice1=Season_Dprice;
        
        String Season_Eprice = price.getseasonEpriceRoom1_E("value");
        Season_Eprice1=Season_Eprice;
        
        String Season_Fprice = price.getseasonFpriceRoom1_F("value");
        Season_Fprice1=Season_Fprice;
        
        String Season_Gprice = price.getseasonGpriceRoom1_G("value");
        Season_Gprice1=Season_Gprice;
        
        String Season_Hprice = price.getseasonHpriceRoom1_H("value");
        Season_Hprice1=Season_Hprice;
        
        
        //Season Names get in Price.
        
        String Season_AName = price.getSeasonAtext();
        NameA=Season_AName;
        
        String Season_BName = price.getSeasonBtext();
        NameB=Season_BName;
        
        String Season_CName = price.getSeasonCtext();
        NameC=Season_CName;
        
        String Season_DName = price.getSeasonDtext();
        NameD=Season_DName;
        
        String Season_EName = price.getSeasonEtext();
        NameE=Season_EName;
        
        String Season_FName = price.getSeasonFtext();
        NameF=Season_FName;
        
        String Season_GName = price.getSeasonGtext();
        NameG=Season_GName;
        
        String Season_HName = price.getSeasonHtext();
        NameH=Season_HName;
        
        // From and To dates get
        
        String Season_AFrom = price.getSeason_AfromDate("value"); 
        SeasonA_FromDate = Season_AFrom;
        String Season_Auntil = price.getSeason_AuntilDate("value");
        SeasonA_untilDate = Season_Auntil;
        
        String Season_BFrom = price.getSeason_BfromDate("value");
        SeasonB_FromDate = Season_BFrom;
        String Season_Buntil = price.getSeason_BuntilDate("value");
        SeasonB_untilDate = Season_BFrom;
       
        String Season_CFrom = price.getSeason_CfromDate("value");
        SeasonC_FromDate = Season_CFrom;
        String Season_Cuntil = price.getSeason_CuntilDate("value");
        SeasonC_untilDate = Season_Cuntil;
        
        String Season_Dfrom = price.getSeason_DfromDate("value");
        SeasonD_FromDate = Season_Dfrom;
        String Season_Duntil = price.getSeason_DuntilDate("value");
        SeasonD_untilDate = Season_Duntil;
        
        String Season_EFrom = price.getSeason_EfromDate("value");
        SeasonE_FromDate = Season_EFrom;
        String Season_Euntil = price.getSeason_EuntilDate("value");
        SeasonE_untilDate = Season_Euntil;
        
        String Season_FFrom = price.getSeason_FfromDate("value");
        SeasonF_FromDate = Season_FFrom;
        String Season_Funtil = price.getSeason_FuntilDate("value");
        SeasonF_untilDate = Season_Funtil;
        
        String Season_GFrom = price.getSeason_GfromDate("value");
        SeasonG_FromDate = Season_GFrom;
        String Season_Guntil = price.getSeason_GuntilDate("value");
        SeasonG_untilDate = Season_Guntil;
        
        String Season_HFrom = price.getSeason_HfromDate("value");
        SeasonH_FromDate = Season_HFrom;
        String Season_Huntil = price.getSeason_HuntilDate("value");
        SeasonH_untilDate = Season_Huntil;
        
        //Season_A date conversion
        SimpleDateFormat Season_AfromoriginalDateFormat = new SimpleDateFormat("dd.MM.yy", Locale.ENGLISH);
        Date SeasonFromA_originalDate = Season_AfromoriginalDateFormat.parse(Season_AFrom);
        SimpleDateFormat Season_AfrommonthNameFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        String monthNameSeasonFrom_A = Season_AfrommonthNameFormat.format(SeasonFromA_originalDate);
        SimpleDateFormat formattedDateFormatSeasonFromA = new SimpleDateFormat("dd MMMM yy", Locale.ENGLISH);
        
        String SeasonFromA_ConvertedDate = formattedDateFormatSeasonFromA.format(SeasonFromA_originalDate);
        System.out.println("Converted date: " + SeasonFromA_ConvertedDate);
        
        SimpleDateFormat Season_AuntiloriginalDateFormat = new SimpleDateFormat("dd.MM.yy", Locale.ENGLISH);
        Date SeasonUntilA_originalDate = Season_AfromoriginalDateFormat.parse(Season_Auntil);
        SimpleDateFormat Season_AuntilmonthNameFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        String monthNameSeasonUntil_A = Season_AfrommonthNameFormat.format(SeasonFromA_originalDate);
        SimpleDateFormat formattedDateFormatSeasonUntilA = new SimpleDateFormat("dd MMMM yy", Locale.ENGLISH);
        
        String SeasonUntilA_ConvertedDate = formattedDateFormatSeasonUntilA.format(SeasonUntilA_originalDate);
        System.out.println("Converted date: " + SeasonUntilA_ConvertedDate);
        
        //Season_B date conversion
        SimpleDateFormat Season_BfromoriginalDateFormat = new SimpleDateFormat("dd.MM.yy", Locale.ENGLISH);
        Date SeasonFromB_originalDate = Season_BfromoriginalDateFormat.parse(Season_AFrom);
        SimpleDateFormat Season_BfrommonthNameFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        String monthNameSeasonFrom_B = Season_BfrommonthNameFormat.format(SeasonFromA_originalDate);
        SimpleDateFormat formattedDateFormatSeasonFromB = new SimpleDateFormat("dd MMMM yy", Locale.ENGLISH);
        
        String SeasonFromB_ConvertedDate = formattedDateFormatSeasonFromB.format(SeasonFromA_originalDate);
        System.out.println("Converted date: " + SeasonFromB_ConvertedDate);
        
        SimpleDateFormat Season_BuntiloriginalDateFormat = new SimpleDateFormat("dd.MM.yy", Locale.ENGLISH);
        Date SeasonUntilB_originalDate = Season_AfromoriginalDateFormat.parse(Season_Auntil);
        SimpleDateFormat Season_BuntilmonthNameFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        String monthNameSeasonUntil_B = Season_AfrommonthNameFormat.format(SeasonFromB_originalDate);
        SimpleDateFormat formattedDateFormatSeasonUntilB = new SimpleDateFormat("dd MMMM yy", Locale.ENGLISH);
        
        String SeasonUntilB_ConvertedDate = formattedDateFormatSeasonUntilA.format(SeasonUntilB_originalDate);
        System.out.println("Converted date: " + SeasonUntilB_ConvertedDate);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
      	offerdefination.SendTBMcode(UtilityClass.readDataFromStringExcel(55, 3, "Sheet5"));
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
    	
    	WebElement ClickBefore = driver.findElement(By.xpath("//a[text()='New']"));
    	ClickBefore.click();

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
      
    	String value1 = calculationSetting.getDBvalue("value");
    	value11=value1;
    	System.out.println("The DB value in offer calculation page "+value1);
   
    	WebElement clickAfterSave = driver.findElement(By.xpath("//a[text()='New']"));
    	clickAfterSave.click();
    	
    	Thread.sleep(5000); 
    	UtilityClass.clickUsingJSE(calculationSetting.clickOnRoom1ByJSE());
    	Reporter.log("Clicked on Room1",true);
    	Thread.sleep(4000);
    	    
    	String value2 = CalculationSettingRoomsDetail.getDB1value1("value");
    	value12 = value2;
    	System.out.println("The value2 in the Rooms page is "+value2);
    	
    	Boolean CheckBox2 = CalculationSettingRoomsDetail.isSeasonA_AllDayCheckBox1();
    	System.out.println("The checkbox2 is selected  "+CheckBox2);
    	Thread.sleep(1000); 
    	UtilityClass.scrollByAxis(0, 400);
    	calculationSetting.clickOnsavePrice();
    	Reporter.log("Clicked on Save price",true);
    	Thread.sleep(3000);
    		
    	// Season prices in offer calculation.
    	    
    	String CostPriceSeasosn_A1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonA();
        CostPriceSeasonAA=CostPriceSeasosn_A1;
    	    
    	String CostPriceSeasosn_B1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonB();
    	CostPriceSeasonBB=CostPriceSeasosn_B1;
    	    
    	String CostPriceSeasosn_C1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonC();
    	CostPriceSeasonCC=CostPriceSeasosn_C1;
    	    
    	String CostPriceSeasosn_D1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonD();
    	CostPriceSeasonDD=CostPriceSeasosn_D1;
    	    
    	String CostPriceSeasosn_E1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonE();
    	CostPriceSeasonEE=CostPriceSeasosn_E1;
     	
    	String CostPriceSeasosn_F1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonF();
    	CostPriceSeasonFF=CostPriceSeasosn_F1;
    	    
    	String CostPriceSeasosn_G1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonG();
    	CostPriceSeasonGG=CostPriceSeasosn_G1;
    	    
    	String CostPriceSeasosn_H1 =CalculationSettingRoomsDetail.getCostPriceInEURforSeasonH();
    	CostPriceSeasonHH=CostPriceSeasosn_H1;
    	    
    	 //Season names with Calculation Page.
    	    
    	String SeasonName = CalculationSettingRoomsDetail.getSeasonName();
    	String A = CalculationSettingRoomsDetail.getTextA();
    	String Season_A= SeasonName + (" " +A);
    	SeasonA = Season_A;
          
    	String B = CalculationSettingRoomsDetail.getTextB();
    	String Season_B= SeasonName + (" " +B);
    	SeasonB = Season_B;
    	    
    	String C = CalculationSettingRoomsDetail.getTextC();
    	String Season_C= SeasonName + (" " +C);
    	SeasonC = Season_C;
    	    
    	String D = CalculationSettingRoomsDetail.getTextD();
    	String Season_D = SeasonName + (" "+D);
    	SeasonD = Season_D;
    	    
    	String E = CalculationSettingRoomsDetail.getTextE();
    	String Season_E = SeasonName + (" "+E);
    	SeasonE = Season_E;
    	    
    	String F = CalculationSettingRoomsDetail.getTextF();
    	String Season_F = SeasonName + (" "+F);
    	SeasonF = Season_F;
    	    
    	String G = CalculationSettingRoomsDetail.getTextG();
    	String Season_G = SeasonName + (" "+G);
    	SeasonG = Season_G;
    	    
    	String H = CalculationSettingRoomsDetail.getTextH();
    	String Season_H = SeasonName + (" "+H);
    	SeasonH = Season_H;
    	    
    
	}
    @Test 
    public void validateOfferCalculationWithRoomDetails() throws EncryptedDocumentException, IOException 
    {
    	
     //Season Name Assertions
	  Assert.assertEquals(SeasonA, NameA,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is "+SeasonA+" and Expected season name calculation page is "+NameA,true);
	  
	  Assert.assertEquals(SeasonB, NameB,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is "+SeasonB+" and Expected season name calculation page is "+NameB,true);
	  
	  Assert.assertEquals(SeasonC, NameC,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is "+SeasonC+" and Expected season name calculation page is "+NameC,true);
	  
	  Assert.assertEquals(SeasonD, NameD,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is"+SeasonD+" and Expected season name calculation page is "+NameD,true);
	  
	  Assert.assertEquals(SeasonE, NameE,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is"+SeasonE+" and Expected season name calculation page is "+NameE,true);
	  
	  Assert.assertEquals(SeasonF, NameF,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is"+SeasonF+" and Expected season name calculation page is "+NameF,true);
	  
	  Assert.assertEquals(SeasonG, NameG,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is"+SeasonG+" and Expected season name calculation page is "+NameG,true);
	  
	  Assert.assertEquals(SeasonH, NameH,"Test Case Failed as actual & expected Season name are not matching");
	  Reporter.log("Validating actual season name on contracts page is"+SeasonH+" and Expected season name calculation page is "+NameH,true);
	  
	  
	  // Season Prices Assertions
	  Assert.assertEquals(Season_Aprice1, CostPriceSeasonAA,"Test Case Failed as actual & expected prices number are not matching for season_A");
	  Reporter.log("Validating actual price on contracts page is "+Season_Aprice1+" and Expected price on calculation page is "+CostPriceSeasonAA,true);
	  
	  Assert.assertEquals(Season_Bprice1, CostPriceSeasonBB,"Test Case Failed as actual & expected Prices are not matching for season_B");
	  Reporter.log("Validating actual price on contracts page is  "+Season_Bprice1+" and Expected price on calculation page is "+CostPriceSeasonBB,true);
	  
	  Assert.assertEquals(Season_Cprice1, CostPriceSeasonCC,"Test Case Failed as actual & expected Prices are not matching for season_C");
	  Reporter.log("Validating actual price on contracts page is  "+Season_Cprice1+" and Expected price on calculation page is  "+CostPriceSeasonCC,true);
	  
	  Assert.assertEquals(Season_Dprice1, CostPriceSeasonDD,"Test Case Failed as actual & expected Prices are not matching for season_D");
	  Reporter.log("Validating actual price on contracts page is  "+Season_Dprice1+" and Expected price on calculation page is  "+CostPriceSeasonDD,true);
	  
	  Assert.assertEquals(Season_Eprice1, CostPriceSeasonEE,"Test Case Failed as actual & expected Prices are not matching for season_D");
	  Reporter.log("Validating actual price on contracts page is  "+Season_Eprice1+" and Expected price on calculation page is  "+CostPriceSeasonEE,true);
	  
	  Assert.assertEquals(Season_Fprice1, CostPriceSeasonFF,"Test Case Failed as actual & expected Prices are not matching for season_D");
	  Reporter.log("Validating actual price on contracts page is  "+Season_Fprice1+" and Expected price on calculation page is  "+CostPriceSeasonFF,true);
	  
	  Assert.assertEquals(Season_Gprice1, CostPriceSeasonGG,"Test Case Failed as actual & expected Prices are not matching for season_D");
	  Reporter.log("Validating actual price on contracts page is  "+Season_Gprice1+" and Expected price on calculation page is  "+CostPriceSeasonGG,true);
	  
	  Assert.assertEquals(Season_Hprice1, CostPriceSeasonHH,"Test Case Failed as actual & expected Prices are not matching for season_D");
	  Reporter.log("Validating actual price on contracts page is  "+Season_Hprice1+" and Expected price on calculation page is  "+CostPriceSeasonHH,true);
	 
	
	  
	  
	  
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

