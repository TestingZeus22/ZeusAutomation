package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accommodationNewPage {
	
	@FindBy (xpath ="//span[text()='Rooms']") private WebElement rooms;	
	@FindBy (xpath ="(//span[@class='nav-text'])[3]") private WebElement contracts;
	@FindBy (xpath ="//span[text()='Price']") private WebElement price;
	@FindBy (xpath ="//span[text()='Allotment']") private WebElement allotment;
	
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]") private WebElement accommodationNewHeadingAndBreadcrumbs;;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[2]") private WebElement accommodationLink;
	@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[3]") private WebElement accommodationCreate;
	
	@FindBy (id ="AccommodationModel_LocalityModel_PurchaserID") private WebElement purchaserListBox;
	
	@FindBy (id ="select2-lc_hotelChain-container") private WebElement hotelChainListbox;
	@FindBy (id ="AccommodationModel_LocalityModel_TBMCode") private WebElement TBMCodeEnterListBox;
	
	@FindBy (id ="AccommodationModel_LocalityModel_LocalityLegalName") private WebElement accommodationLegalNameField;
	@FindBy (id ="AccommodationModel_LocalityModel_Stars") private WebElement starsField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_CountryID") private WebElement CountryDropdown;
	@FindBy (id ="AccommodationModel_LocalityModel_StateID") private WebElement stateDropdown;
	@FindBy (id ="AccommodationModel_LocalityModel_CityID") private WebElement cityDropdown;
	@FindBy (id ="AccommodationModel_LocalityModel_CAP") private WebElement zipcodeField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_Street") private WebElement streetField;
	@FindBy (id ="AccommodationModel_LocalityModel_Number") private WebElement numberField;
	@FindBy (id ="AccommodationModel_LocalityModel_Email") private WebElement hotelEmailField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_Phone") private WebElement phoneField;
	@FindBy (id ="AccommodationModel_LocalityModel_Fax") private WebElement faxField;
	@FindBy (id ="AccommodationModel_LocalityModel_HotelOwner") private WebElement hotelownerField;
	@FindBy (id ="AccommodationModel_LocalityModel_NeedToUpdateRadix") private WebElement needToUpdateOnRadixcheckBox;
	
	@FindBy (id ="AccommodationModel_LocalityModel_GeneralContact") private WebElement contractPartnerField;
	@FindBy (id ="AccommodationModel_LocalityModel_GeneralTelephone") private WebElement contractTelephoneField;
	@FindBy (id ="AccommodationModel_LocalityModel_GeneralEmail") private WebElement contractEmailField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_Reservation") private WebElement reservationField;
	@FindBy (id ="AccommodationModel_LocalityModel_ReservationTelephone") private WebElement reservationTelephoneField;
	@FindBy (id ="AccommodationModel_LocalityModel_ReservationEmail") private WebElement reservationEmailField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_InvoiceStreet") private WebElement additionalContractField;
	@FindBy (id ="AccommodationModel_LocalityModel_InvoiceNumber") private WebElement additionalContractTelephoneField;
	@FindBy (id ="AccommodationModel_LocalityModel_InvoiceCAP") private WebElement additionalContractEmailField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_InvoiceStreet") private WebElement tecSupportField;
	@FindBy (id ="AccommodationModel_LocalityModel_InvoiceNumber") private WebElement tecSupportTelephoneField;
	@FindBy (id ="AccommodationModel_LocalityModel_InvoiceCAP") private WebElement tecSupportEmailField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_AllotmentContact") private WebElement allotmentContactField;
	@FindBy (id ="AccommodationModel_LocalityModel_AllotmentTelephone") private WebElement allotmentTelephoneField;
	@FindBy (id ="AccommodationModel_LocalityModel_AllotmentEmail") private WebElement allotmentEmailField;
	@FindBy (id ="AccommodationModel_LocalityModel_AllotmentAutoMail") private WebElement allotmentAutoMailAllowedcheckBox;
	@FindBy (id ="AccommodationModel_LocalityModel_RoomListByEmail") private WebElement roomListByEmailcheckBox;
	
	@FindBy (id ="AccommodationModel_LocalityModel_DaysBeforeArrival") private WebElement daysBeforeArrivalField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_PurchaseAgencyID") private WebElement BankdetailsPurchaseAgencyDropdownList;
	
	@FindBy (id ="AccommodationModel_LocalityModel_CodiceDestinatario1") private WebElement codiceDestinatarioField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_TaxNumber1") private WebElement taxNumberInPaymentDetailsField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_PaymentTarget") private WebElement paymentTargetField;
	@FindBy (id ="AccommodationModel_LocalityModel_Commission") private WebElement commission;
	
	@FindBy (xpath ="//a[@class='btn-shadow btn btn-success']") private WebElement viewListButton;
	@FindBy (id ="btn_CreateAccommodation") private WebElement createAccommodationButton;

	
	public accommodationNewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnrooms()
	{
		rooms.click();
	}
	
	public void clickOncontracts()
	{
		contracts.click();
	}
	
	public WebElement clickOnPriceByJSE()
	{
		return price;
	}
	
	public void clickOnAllotment()
	{
		allotment.click();
	}
	
	public WebElement clickOnAllotmentByJSE()
	{
		return allotment;
	}
	
	public String getAccommodationNewHeadingAndBreadcrumbs()
	{
		String actualText = accommodationNewHeadingAndBreadcrumbs.getText();
		return actualText;
	}
	
	public void clickOnDashboardLink()
	{
		dashboardLink.click();
	}
	
	public String getdashboardText()
	{
		String actualText = dashboardLink.getText();
		return actualText;
	}
	
	public void clickOnAccommodationLink()
	{
		accommodationLink.click();
	}
	
	public String getAccommodationText()
	{
		String actualText = accommodationLink.getText();
		return actualText;
	}
	
	public String getAccommodationCreateText()
	{
		String actualText = accommodationCreate.getText();
		return actualText;
	}
	
	public WebElement selectPurchaserDropdown()
	{
		WebElement Element = purchaserListBox;
		return Element;
	}
	
	public WebElement clickOnHotelChainListbox()
	{
		WebElement Element = hotelChainListbox;
		return Element;
	}
	
	public WebElement clickOnTBMCodeSelection()
	{
		WebElement Element = TBMCodeEnterListBox;
		return Element;
	}
	
	public void sendAccommodationLegalNameField(String AccommodationName)
	{
		accommodationLegalNameField.sendKeys(AccommodationName);
	}
	
	public void sendstars(String star)
	{
		starsField.sendKeys(star);
	}
	
	public WebElement selectCountryListBox()
	{
		WebElement Element = CountryDropdown;
		return Element;
	}
	
	public WebElement selectStateListBox()
	{
		WebElement Element = stateDropdown;
		return Element;
	}
	
	public WebElement selectCityListBox()
	{
		WebElement Element = cityDropdown;
		return Element;
	}
	
	public void sendzipcode(String zip)
	{
		zipcodeField.sendKeys(zip);
	}
	
	public void sendstreet(String Street)
	{
		streetField.sendKeys(Street);
	}
	
	public void sendNumber(String Num)
	{
		numberField.sendKeys(Num);
	}
	
	public void sendhotelEmailField(String HotelEmail)
	{
		hotelEmailField.sendKeys(HotelEmail);
	}
	
	public void sendphone(String Phone)
	{
		phoneField.sendKeys(Phone);
	}
	
	public void sendfax(String Fax)
	{
		faxField.sendKeys(Fax);
	}
	
	public void sendhotelowner(String HotelOwner)
	{
		hotelownerField.sendKeys(HotelOwner);
	}
	
	public void clickOnNeedToUpdateOnRadixcheckBox()
	{
		needToUpdateOnRadixcheckBox.click();
	}
	
	public void sendcontractPartner(String contractPartner)
	{
		contractPartnerField.sendKeys(contractPartner);
	}
	
	public void sendcontractTelephone(String ContractTele)
	{
		contractTelephoneField.sendKeys(ContractTele);
	}
	
	public void sendcontractEmailField(String contractEmail)
	{
		contractEmailField.sendKeys(contractEmail);
	}
	
	public void sendreservationField(String ReservationPartner)
	{
		reservationField.sendKeys(ReservationPartner);
	}
	
	public void sendreservationTelephoneField(String ReservationTele)
	{
		reservationTelephoneField.sendKeys(ReservationTele);
	}
	
	public void sendreservationEmailField(String ReservationEmail)
	{
		reservationEmailField.sendKeys(ReservationEmail);
	}
	
	public void sendadditionalContractField(String AdditionalContract)
	{
		additionalContractField.sendKeys(AdditionalContract);
	}
	
	public void sendadditionalContractTelephoneField(String AdditionalContractTele)
	{
		additionalContractTelephoneField.sendKeys(AdditionalContractTele);
	}
	
	public void sendadditionalContractEmailField(String AdditionalContractEmail)
	{
		additionalContractEmailField.sendKeys(AdditionalContractEmail);
	}
	
	public void sendTecSupportField(String TecSupportField)
	{
		tecSupportField.sendKeys(TecSupportField);
	}
	
	public void sendTecSupportTelephoneField(String TecSupportTelephoneField)
	{
		tecSupportTelephoneField.sendKeys(TecSupportTelephoneField);
	}
	
	public void sendTecSupportEmailField(String TecSupportEmailField)
	{
		tecSupportEmailField.sendKeys(TecSupportEmailField);
	}
	
	public void sendAllotmentContactField(String AllotmentContactField)
	{
		allotmentContactField.sendKeys(AllotmentContactField);
	}
	
	public void sendAllotmentTelephoneField(String AllotmentTelephoneField)
	{
		allotmentTelephoneField.sendKeys(AllotmentTelephoneField);
	}
	
	public void sendAllotmentEmailField(String AllotmentEmailField)
	{
		allotmentEmailField.sendKeys(AllotmentEmailField);
	}
	
	public void clickOnallotmentAutoMailcheckBox()
	{
		allotmentAutoMailAllowedcheckBox.click();
	}
	
	public void clickOnroomListByEmailcheckBox()
	{
		roomListByEmailcheckBox.click();
	}
	
	public void senddaysBeforeArrivalField(String DaysBeforeArrivalField)
	{
		daysBeforeArrivalField.sendKeys(DaysBeforeArrivalField);
	}
	
	public WebElement bankdetailsPurchaseAgencyDropdownList()
	{
		WebElement Element = BankdetailsPurchaseAgencyDropdownList;
		return Element;
	}
	
	public void sendCodiceDestinatario(String CodiceDesti)
	{
		codiceDestinatarioField.sendKeys(CodiceDesti);
	}

	public void sendTaxNumberInPaymentDetails(String TaxNUM)
	{
		taxNumberInPaymentDetailsField.sendKeys(TaxNUM);
	}
	
	public void clickOnrviewList()
	{
		viewListButton.click();
	}
	
	public void clickOncreateAccommodationButton()
	{
		createAccommodationButton.click();
	}

}
