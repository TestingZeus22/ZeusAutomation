package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accommodationNewPage {
	
	@FindBy (xpath ="//span[text()='Rooms']") private WebElement rooms;	
	
	@FindBy (xpath ="//div[@style='font-size:small;']//li[1]") private WebElement dashboard;
	@FindBy (xpath ="//div[@style='font-size:small;']//li[2]") private WebElement accommodation;
	@FindBy (xpath ="//div[@style='font-size:small;']//li[3]") private WebElement accommodationCreate;
	 
	@FindBy (id ="AccommodationModel_LocalityModel_PurchaserID") private WebElement selectPurchaserListBox;
	
	//@FindBy (id ="select2-lc_hotelChain-container") private WebElement selecthotelChainContainerListBox;
	@FindBy (id ="AccommodationModel_LocalityModel_TBMCode") private WebElement TBMCodeCcontainerListBox;
	
	@FindBy (id ="AccommodationModel_LocalityModel_Stars") private WebElement starsField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_CountryID") private WebElement selectCountry;
	@FindBy (id ="AccommodationModel_LocalityModel_StateID") private WebElement selectstate;
	@FindBy (id ="AccommodationModel_LocalityModel_CityID") private WebElement selectCity;
	@FindBy (id ="AccommodationModel_LocalityModel_CAP") private WebElement zipcodeField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_Street") private WebElement streetField;
	@FindBy (id ="AccommodationModel_LocalityModel_Number") private WebElement numberField;
	@FindBy (id ="AccommodationModel_LocalityModel_Email") private WebElement hotelEmailField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_Phone") private WebElement phoneField;
	@FindBy (id ="AccommodationModel_LocalityModel_Fax") private WebElement faxField;
	@FindBy (id ="AccommodationModel_LocalityModel_HotelOwner") private WebElement hotelownerField;
	@FindBy (id ="AccommodationModel_LocalityModel_NeedToUpdateRadix") private WebElement checkBoxRadix;
	
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
	@FindBy (id ="AccommodationModel_LocalityModel_AllotmentAutoMail") private WebElement allotmentAutoMailcheckBox;
	@FindBy (id ="AccommodationModel_LocalityModel_RoomListByEmail") private WebElement roomListByEmailcheckBox;
	
	@FindBy (id ="AccommodationModel_LocalityModel_DaysBeforeArrival") private WebElement daysBeforeArrivalField;
	
	@FindBy (id ="AccommodationModel_LocalityModel_PurchaseAgencyID") private WebElement BankdetailsPurchaseAgencyDropdownList;
	
	@FindBy (id ="AccommodationModel_LocalityModel_TaxNumber1") private WebElement TaxNumberInPaymentDetails;
	
	@FindBy (xpath ="//a[@class='btn-shadow btn btn-success']") private WebElement viewList;
	@FindBy (id ="btn_CreateAccommodation") private WebElement createAccommodationButton;

	
	public accommodationNewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnroom()
	{
		rooms.click();
	}
	
	public void clickOnDashboard()
	{
		dashboard.click();
	}
	
	public String getdashboardText()
	{
		String actualText = dashboard.getText();
		return actualText;
	}
	
	public void clickOnAccommodation()
	{
		accommodation.click();
	}
	
	public String getAccommodationText()
	{
		String actualText = accommodation.getText();
		return actualText;
	}
	
	public WebElement clickOnselectPurchaser()
	{
		WebElement Element = selectPurchaserListBox;
		return Element;
	}
	
	public WebElement clickOnTBMCodeSelection()
	{
		WebElement Element = TBMCodeCcontainerListBox;
		return Element;
	}
	
	public void sendstars(String star)
	{
		starsField.sendKeys(star);
	}
	
	public WebElement selectCountryListBox()
	{
		WebElement Element = selectCountry;
		return Element;
	}
	
	public WebElement selectStateListBox()
	{
		WebElement Element = selectstate;
		return Element;
	}
	
	public WebElement selectCityListBox()
	{
		WebElement Element = selectCity;
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
	
	public void clickOncheckBoxRadix()
	{
		checkBoxRadix.click();
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
	
	public void sendallotmentContactField(String AllotmentContactField)
	{
		allotmentContactField.sendKeys(AllotmentContactField);
	}
	
	public void sendallotmentTelephoneField(String AllotmentTelephoneField)
	{
		allotmentTelephoneField.sendKeys(AllotmentTelephoneField);
	}
	
	public void sendallotmentEmailField(String AllotmentEmailField)
	{
		allotmentEmailField.sendKeys(AllotmentEmailField);
	}
	
	public void clickOnallotmentAutoMailcheckBox()
	{
		allotmentAutoMailcheckBox.click();
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
	
	public void sendTaxNumberInPaymentDetails(String TaxNUM)
	{
		TaxNumberInPaymentDetails.sendKeys(TaxNUM);
	}
	
	public void clickOnrviewList()
	{
		viewList.click();
	}
	
	public void clickOncreateAccommodationButton()
	{
		createAccommodationButton.click();
	}

}
