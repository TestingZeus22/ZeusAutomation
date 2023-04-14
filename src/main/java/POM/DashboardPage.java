package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy (xpath ="//a[text()='Dashboard']") private WebElement dashboard;
	@FindBy (xpath ="//a[@class='p-0 btn']") private WebElement logoutButton;
	@FindBy (xpath ="//a[text()='Logout ']") private WebElement logoutclick;
	@FindBy (xpath ="//a[text()='Dashboard']") private WebElement getDashboardText;
	
	//Master Dropdown
	@FindBy (xpath = "//i[@class='metismenu-icon pe-7s-folder']") private WebElement masterOption;
	
	//company
	@FindBy (xpath="(//label[text()='Company'])[1]")private WebElement Company;
	@FindBy (xpath="(//label[text()='Travel Types'])[1]")private WebElement traveltypes;
	
	//Users
	@FindBy (xpath ="//label[text()='Users']") private WebElement users;
	@FindBy (xpath ="//label[text()='Roles']") private WebElement roles;
	@FindBy (xpath ="//label[text()='Department']") private WebElement department;
	
	//setting
	@FindBy (xpath ="//label[text()='Settings']") private WebElement settings;
	@FindBy (xpath ="//label[text()='Currency']") private WebElement currency;
	@FindBy (xpath ="//label[text()='Language']") private WebElement language;
	@FindBy (xpath ="//label[text()='Extra Costs']") private WebElement ExtraCosts;
	@FindBy (xpath ="//label[text()='Taxes & Fees']") private WebElement TaxesAndFees;
	@FindBy (xpath ="//label[text()='Global Type']") private WebElement globalType;
	@FindBy (xpath ="//label[text()='Sea View Master']") private WebElement SeaViewMaster;
	@FindBy (xpath ="//label[text()='Customer Document']") private WebElement customerDocument;
	@FindBy (xpath ="//label[text()='Amadeus Action Codes']") private WebElement amadeusActionCodes;
	
	//Geography
	@FindBy (xpath ="//label[text()='Geography']") private WebElement geography;
	@FindBy (xpath ="//label[text()='Country']") private WebElement country;
	@FindBy (xpath ="//label[text()='State']") private WebElement state;
	@FindBy (xpath ="//label[text()='Region']") private WebElement region;
	@FindBy (xpath ="//label[text()='City']") private WebElement city;
	
	//Accommodation
	@FindBy (xpath ="//label[text()='Accommodation']") private WebElement accommodationInMaster;
	@FindBy (xpath ="//label[text()='Board Type']") private WebElement boardType;
	@FindBy (xpath ="//label[text()='Room Type']") private WebElement roomType;
		
	//tbm
	@FindBy (xpath = "//label[text()='TBM']") private WebElement Tbm;
	@FindBy (xpath = "//label[text()='Kind Of Services']") private WebElement kindOfServices;
	@FindBy (xpath = "//label[text()='TBM Code']") private WebElement TbmCode;
	@FindBy (xpath = "//label[text()='Ancillary Classification']") private WebElement ancillaryClassification;
	@FindBy (xpath = "//label[text()='Hotel Chain']") private WebElement hotelChain;
		
	//Agency master
	@FindBy (xpath = "//label[text()='Agency Master']") private WebElement agencyMaster;
	@FindBy (xpath = "//label[text()='Purchase Agency']") private WebElement purchaseAgency;
	@FindBy (xpath = "//label[text()='Sales Agency']") private WebElement salesAgency;
	
	 // settlement 
	@FindBy (xpath ="//label[text()='Settlement']") private WebElement settlement;
	@FindBy (xpath ="//label[text()='Cost Center']") private WebElement costCenter;
	@FindBy (xpath ="//label[text()='VAT']") private WebElement VAT;
	@FindBy (xpath ="//label[text()='OffSet Account']") private WebElement offSetAccount;
		
	//Data management
	@FindBy (xpath ="//label[text()='Data Management']") private WebElement dataManagement;
	@FindBy (xpath ="//label[text()='Settings']") private WebElement Settings;
		
	//Airlines
	@FindBy (xpath ="//label[text()='Airlines']") private WebElement airlines;
	@FindBy (xpath ="//label[text()='Alliance']") private WebElement alliance;
	@FindBy (xpath ="//label[text()='Airport Codes']") private WebElement airportCodes;
		
	//rate plans
	@FindBy (xpath ="//label[text()='RatePlan']") private WebElement ratePlan;
	@FindBy (xpath ="//label[text()='Channel Manager']") private WebElement channelManager;
		
	//Purchase
	@FindBy (xpath = "//i[@class='metismenu-icon lnr-cart']") private WebElement purchasebutton;
	@FindBy (xpath = "(//label[@style='vertical-align: middle !important;'])[45]") private WebElement accommodation;
	@FindBy (xpath = "//label[text()='Free Customer Voucher']") private WebElement freeCustomerVoucher;
	@FindBy (xpath = "//label[text()='Accommodation Channel Manager']") private WebElement accommodationChannelManager;
	
	//Calculation
	@FindBy (xpath ="//i[@class='metismenu-icon pe-7s-calculator']") private WebElement calculationList;
	@FindBy (xpath ="//label[text()='Offer Definition']") private WebElement offerDefination;
	@FindBy (xpath ="(//label[text()='Extra Costs'])[2]") private WebElement extraCosts;
	@FindBy (xpath ="//label[text()='Offer Calculation']") private WebElement offerCalculation;
	@FindBy (xpath ="//label[text()='Sales Price Storage']") private WebElement salesPriceStorage;
	@FindBy (xpath ="//label[text()='Currency Exchange']") private WebElement currencyExchange;
	@FindBy (xpath ="//label[text()='Hotel Packages']") private WebElement hotelPackages;
	
	// Sales
	@FindBy (xpath ="//i[@class='metismenu-icon pe-7s-shopbag']") private WebElement sales;
	@FindBy (xpath ="//label[text()='Sales Booking']") private WebElement salesBooking;
	@FindBy (xpath ="//label[text()='Reports']") private WebElement reports;
	@FindBy (xpath ="//label[text()='Peakwork Booking']") private WebElement PeakworkBooking;
	
	//Connectivity
	@FindBy (xpath ="//i[@class='metismenu-icon pe-7s-network']") private WebElement connectivity;
	@FindBy (xpath ="//label[text()='Country Mapping']") private WebElement countryMapping;
	@FindBy (xpath ="//label[text()='Board Mapping']") private WebElement boardMapping;
	@FindBy (xpath ="//label[text()='Location Mapping']") private WebElement locationMapping;
	@FindBy (xpath ="//label[text()='RoomCode Mapping']") private WebElement roomCodeMapping;
	@FindBy (xpath ="//label[text()='Purchase Agency Mapping']") private WebElement purchaseAgencyMapping;
	@FindBy (xpath ="//label[text()='Portfolio Manager']") private WebElement portfolioManager;
	
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getText(String DashboardText)
	{
		dashboard.getText();
	}
	
	public void ClickOnLogoutButton()
	{
		logoutButton.click();
	}
	
	public void logoutClick()
	{
		logoutclick.click();
	}
	
	public String getActualTextOnDashboard()
	{
		String actualText=getDashboardText.getText();
		return actualText;
	}
	
	public void ClickOnmasterOption()
	{
		masterOption.click();
	}
	
	public void ClickOnCompany()
	{
		Company.click();
	}
	
	public void ClickOnTraveltypes()
	{
		traveltypes.click();
	}
	
	public void ClickOnUsers()
	{
		users.click();
	}
	
	public void ClickOnRoles()
	{
		roles.click();
	}
	
	public void ClickOnDepartment()
	{
		department.click();
	}
	
	public void ClickOnsettings()
	{
		settings.click();
	}
	
	public void ClickOnCurrency()
	{
		currency.click();
	}
	
	public void ClickOnlanguage()
	{
		language.click();
	}
	
	public void ClickOnExtraCosts()
	{
		ExtraCosts.click();
	}
	
	public void ClickOnTaxesAndFees()
	{
		TaxesAndFees.click();
	}
	
	public void ClickOnglobalType()
	{
		globalType.click();
	}
	
	public void ClickOnSeaViewMaster()
	{
		SeaViewMaster.click();
	}
	
	public void ClickOncustomerDocument()
	{
		customerDocument.click();
	}
	
	public void ClickOnAmadeusActionCodes()
	{
		amadeusActionCodes.click();
	}
	
	
	public void ClickOngeography()
	{
		geography.click();
	}
	
	public void ClickOnCountry()
	{
		country.click();
	}
	
	public void ClickOnstate()
	{
		state.click();
	}
	
	public void ClickOnRegion()
	{
		region.click();
	}
	
	public void ClickOnCity()
	{
		city.click();
	}
	
	public void ClickOnAccommodationInMaster()
	{
		accommodationInMaster.click();
	}
	
	public void ClickOnboardType()
	{
		boardType.click();
	}
	
	public void ClickOnRoomType()
	{
		roomType.click();
	}
	
	
	public void ClickOnTBM()
	{
		Tbm.click();
	}
	
	public void ClickOnkindOfServices()
	{
		kindOfServices.click();
	}
	
	public void ClickOnTbmCode()
	{
		TbmCode.click();
	}
	
	public void ClickOnancillaryClassification()
	{
		ancillaryClassification.click();
	}
	
	public void ClickOnhotelChain()
	{
		hotelChain.click();
	}
	
	public void ClickOnagencyMaster()
	{
		agencyMaster.click();
	}
	
	public void ClickOnPurchaseAgency()
	{
		purchaseAgency.click();
	}
	
	public void ClickOnSalesAgency()
	{
		salesAgency.click();
	}
	
	
	public void ClickOnSettlement()
	{
		settlement.click();
	}
	
	public void ClickOnCostCenter()
	{
		costCenter.click();
	}
	
	public void ClickOnVAT()
	{
		VAT.click();
	}
	
	public void ClickOnoffSetAccount()
	{
		offSetAccount.click();
	}
	
	public void ClickOnDataManagement()
	{
		dataManagement.click();
	}
	
	public void ClickOnSettings()
	{
		settings.click();
	}
	
	public void ClickOnAirlines()
	{
		airlines.click();
	}
	
	public void ClickOnAlliance()
	{
		alliance.click();
	}
	
	public void ClickOnAirportCodes()
	{
		airportCodes.click();
	}
	
	public void ClickOnRatePlan()
	{
		ratePlan.click();
	}
	
	public void ClickOnChannelManager()
	{
		channelManager.click();
	}
	
	public void clickOnpurchasebutton()
	{
		purchasebutton.click();
	}
	
	public WebElement clickOnPurchaseButtonByJSE()
	{
		return purchasebutton;
	}
	
	public void clickOnAccommodation()
	{
		accommodation.click();
	}
	
	public void clickOnFreeCustomerVoucher()
	{
		freeCustomerVoucher.click();
	}
	
	public void clickOnAccommodationChannelManager()
	{
		accommodationChannelManager.click();
	}
	
	public void clickOncalculationList()
	{
		calculationList.click();
	}
	
	public void clickOnOfferdefination()
	{
		offerDefination.click();
    }
	
	public void clickOnextraCosts()
	{
		extraCosts.click();
    }
	public void clickOnOffercalculationList()
	{
		offerCalculation.click();
	}
	
	public void clickOnsalesPriceStorage()
	{
		salesPriceStorage.click();
    }
	
	public void clickOnCurrencyExchange()
	{
		currencyExchange.click();
    }
	
	public void clickOnHotelPackages()
	{
		hotelPackages.click();
    }
	
	public void SalesClick()
	{
		sales.click();
	}
	
	public void salesBookingClick()
	{
		salesBooking.click();
	}
	
	public void ClickOnReports()
	{
		reports.click();
	}
	
	public void clickOnPeakworkBooking()
	{
		PeakworkBooking.click();
	}
	
	public void clickOnConnectivity()
	{
		connectivity.click();
    }
	
	public void clickOnCountryMapping()
	{
		countryMapping.click();
    }
	
	public void clickOnboardMapping()
	{
		boardMapping.click();
    }
	
	public void ClickOnlocationMapping()
	{
		locationMapping.click();
	}
	
	public void ClickOnroomCodeMapping()
	{
		roomCodeMapping.click();
	}
	
	public void ClickOnpurchaseAgencyMapping()
	{
		purchaseAgencyMapping.click();
	}
	
	public void clickOnportfolioManager()
	{
		portfolioManager.click();
	}
}