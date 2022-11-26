package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contractsPage {

	
	@FindBy (xpath ="(//a[@class='btn-shadow btn btn-success pull-right'])[4]") private WebElement viewContractList;			
			
	@FindBy (xpath ="(//select[@name='LocalityID'])[3]") private WebElement localityDropdown;	
	@FindBy (id ="contractname") private WebElement contractNames;
	@FindBy (id ="currencyid") private WebElement currencyDropdown;
	@FindBy (id ="ContractSeasonType") private WebElement contractSeasonDropdown;	
	
	@FindBy (id ="StartDate1") private WebElement startDateField;
	@FindBy (id ="EndDate1") private WebElement endDateField;
	@FindBy (id ="useallotmentofcontract") private WebElement useAllotmentOfContractDropdown;
	@FindBy (id ="additionaldoc") private WebElement additionalDocumentcheckBox;
	
	@FindBy (id ="pricetype") private WebElement priceTypeDropDown;
	@FindBy (id ="pricecategory") private WebElement pricecategoryDropDown;
	@FindBy (id ="contractstatus") private WebElement contractstatusDropdown;
	@FindBy (id ="boardbasis") private WebElement boardbasisDropDown;
	@FindBy (id ="price") private WebElement priceDropdownNetGross;
	
   // Distributor selection x
	@FindBy (id ="companyids") private WebElement multiselectDropdown;
	
	
	
	
	@FindBy (id ="steeringopt") private WebElement onlineOfflineDropdown;
	@FindBy (id ="sterringinfo") private WebElement informationField;
	
	//competitors field xpath pending
	
	
	@FindBy (id ="mcamount") private WebElement marketingContributionAmountField;
	@FindBy (id ="mccurrencyid") private WebElement marketingContributionCurrencyDropdown;
	@FindBy (id ="fromsalevolume") private WebElement marketingContributionSaleValuePercentageField;
	@FindBy (id ="perminamt") private WebElement marketingContributionPerMinAmountField;
	@FindBy (id ="permincurrecyid") private WebElement marketingContributionPerMinCurrencyDropDown;
	@FindBy (id ="willbeinvoice") private WebElement marketingContributionwillbeinvoicedCheckBox;
	@FindBy (id ="InvoiceDate1") private WebElement invoiceDateField;
	@FindBy (id ="salesvolume") private WebElement salesvolumeField;
	@FindBy (id ="mcinfo") private WebElement marketingContributionInformation;
	
	@FindBy (id ="btn_addfees") private WebElement addRowButton;
	
	@FindBy (xpath ="(//input[@id='incentivemodel_UptoDaysArrival'])[1]") private WebElement cancellationFeesUpToDaysBeforeArrivalField1;
	@FindBy (xpath ="(//input[@id='incentivemodel_FeesValue'])[1]") private WebElement cancellationFeesvalueField1;
	@FindBy (id ="incentivemodel_FeesType_2") private WebElement cancellationFeesdiscountTypeDropdown1;
	@FindBy (xpath ="(//input[@class='form-control datepicker'])[1]") private WebElement cancellationFeestravelFromField1;
	@FindBy (xpath ="(//input[@class='form-control datepicker'])[2]") private WebElement cancellationFeestravelToField1;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[2]") private WebElement cancellationFeesDeleteAction1;
	
	@FindBy (xpath ="(//input[@id='incentivemodel_UptoDaysArrival'])[2]") private WebElement cancellationFeesUpToDaysBeforeArrivalField2;
	@FindBy (xpath ="(//input[@id='incentivemodel_FeesValue'])[2]") private WebElement cancellationFeesvalueField2;
	@FindBy (id ="incentivemodel_FeesType_3") private WebElement cancellationFeesdiscountTypeDropdown2;
	@FindBy (xpath ="(//input[@class='form-control datepicker'])[3]") private WebElement cancellationFeestravelFromField2;
	@FindBy (xpath ="(//input[@class='form-control datepicker'])[4]") private WebElement cancellationFeestravelToField2;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[3]") private WebElement cancellationFeesDeleteAction2;
	
	@FindBy (xpath ="(//input[@class='form-control'])[58]") private WebElement cancellationFeesUpToDaysBeforeArrivalField3;
	@FindBy (xpath ="(//input[@class='form-control'])[59]") private WebElement cancellationFeesvalueField3;
	@FindBy (id ="incentivemodel_FeesType_4") private WebElement cancellationFeesdiscountTypeDropdown3;
	@FindBy (xpath ="(//input[@class='form-control datepicker'])[5]") private WebElement cancellationFeestravelFromField3;
	@FindBy (xpath ="(//input[@class='form-control datepicker'])[6]") private WebElement cancellationFeestravelToField3;
	@FindBy (xpath ="(//i[@class='pe-7s-trash btn-icon-wrapper'])[4]") private WebElement cancellationFeesDeleteAction3;
	
	@FindBy (id ="contractterms") private WebElement contractTermsField;
	
	@FindBy (xpath ="//button[text()='Create Contract']") private WebElement createContractButton;
	
	
	public contractsPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnviewContractList()
	{
		viewContractList.click();
	}
	
	
	public WebElement localitydropdown()
	{
		WebElement Element = localityDropdown;
		return Element;
	}
	
	public void sendContractName(String ContractName)
	
	{
		contractNames.sendKeys(ContractName);
	}
	
	public WebElement selectcurrencydropdown()
	{
		WebElement Element = currencyDropdown;
		return Element;
	}
	
	public WebElement selectcontractSeasondropdown()
	{
		WebElement Element = contractSeasonDropdown;
		return Element;
	}
	
	public void sendStartDateField(String StartDate)
	
	{
		startDateField.sendKeys(StartDate);
	}

	public void sendEndDateField(String EndDate)

   {
		endDateField.sendKeys(EndDate);
   }
	
	public WebElement useAllotmentOfContractDropdown()
	{
		WebElement Element = useAllotmentOfContractDropdown;
		return Element;
	}
	
	public void clickOnadditionalDocumentcheckBox()
	{
		additionalDocumentcheckBox.click();
	}
	
	public WebElement priceTypedropdown()
	{
		WebElement Element = priceTypeDropDown;
		return Element;
	}
	
	public WebElement pricecategorydropdown()
	{
		WebElement Element = pricecategoryDropDown;
		return Element;
	}
	
	public WebElement contractstatusdropdown()
	{
		WebElement Element = contractstatusDropdown;
		return Element;
	}
	
	public WebElement boardbasisdropdown()
	{
		WebElement Element = boardbasisDropDown;
		return Element;
	}
	
	public WebElement priceDropdownNetGrossdropdown()
	{
		WebElement Element = priceDropdownNetGross;
		return Element;
	}
	
	public WebElement multiselectdropdown()
	{
		WebElement Element = multiselectDropdown;
		return Element;
	}

	
	public WebElement onlineOfflinedropdown()
	{
		WebElement Element = onlineOfflineDropdown;
		return Element;
	}
	
	public void sendinformation(String Information)
	
	{
		informationField.sendKeys(Information);
	}
	
	public void sendmarketingContributionAmount(String Amount)
	
	{
		marketingContributionAmountField.sendKeys(Amount);
	}
	
	public WebElement marketingContributionCurrencyDropdown()
	{
		WebElement Element = marketingContributionCurrencyDropdown;
		return Element;
	}
	
	public void sendmarketingContributionSaleValuePercentage(String Percentage)
	
	{
		marketingContributionAmountField.sendKeys(Percentage);
	}
	
	public void sendmarketingContributionPerMinAmount(String PerMinamount)
	
	{
		marketingContributionPerMinAmountField.sendKeys(PerMinamount);
	}
	
	public WebElement marketingContributionpeRMinCurrencyDropDown()
	{
		WebElement Element = marketingContributionPerMinCurrencyDropDown;
		return Element;
	}
	
	public void clickOnmarketingContributionwillBeinvoicedCheckBox()
	{
		marketingContributionwillbeinvoicedCheckBox.click();
	}
	
	public void sendinvoiceDateField(String Invoice)
	
	{
		invoiceDateField.sendKeys(Invoice);
	}
	
	public void sendsalesvolumeField(String SalesVol)
	
	{
		salesvolumeField.sendKeys(SalesVol);
	}
	
	public void sendmarketingContributionInformation(String Info)
	
	{
		marketingContributionInformation.sendKeys(Info);
	}
	
	public void clickOnAddRowButton()
	{
		addRowButton.click();
	}
	
	public void sendcancellationFeesUpToDaysBeforeArrival1(String CfDayBeforeArrival1)
	
	{
		cancellationFeesUpToDaysBeforeArrivalField1.sendKeys(CfDayBeforeArrival1);
	}
	
	public void sendcancellationFeesvalue1(String cancellatinFees1)
	
	{
		cancellationFeesvalueField1.sendKeys(cancellatinFees1);
	}
	
	public WebElement cancellationFeesdiscountTypeDropdowndropDown1()
	{
		WebElement Element = cancellationFeesdiscountTypeDropdown1;
		return Element;
	}
	
	public void sendcancellationFeestravelFrom1(String TravelFrom1)
	
	{
		cancellationFeestravelFromField1.sendKeys(TravelFrom1);
	}
	
	public void sendcancellationFeestravelTo1(String TravelTO1)
	
	{
		cancellationFeestravelToField1.sendKeys(TravelTO1);
	}
	
	public void clickOncancellationFeesDeleteAction1()
	{
		cancellationFeesDeleteAction1.click();
	}
	
	public void sendcancellationFeesUpToDaysBeforeArriva2(String CfDayBeforeArrival2)
	
	{
		cancellationFeesUpToDaysBeforeArrivalField2.sendKeys(CfDayBeforeArrival2);
	}
	
	public void sendcancellationFeesvalue2(String cancellatinFees2)
	
	{
		cancellationFeesvalueField2.sendKeys(cancellatinFees2);
	}
	
	public WebElement cancellationFeesdiscountTypeDropdowndropDown2()
	{
		WebElement Element = cancellationFeesdiscountTypeDropdown2;
		return Element;
	}
	
	public void sendcancellationFeestravelFrom2(String TravelFrom2)
	
	{
		cancellationFeestravelFromField2.sendKeys(TravelFrom2);
	}
	
	public void sendcancellationFeestravelTo2(String TravelTO2)
	
	{
		cancellationFeestravelToField2.sendKeys(TravelTO2);
	}
	
	public void clickOncancellationFeesDeleteAction2()
	{
		cancellationFeesDeleteAction2.click();
	}
	
	public void sendcancellationFeesUpToDaysBeforeArrival3(String CfDayBeforeArrival3)
	
	{
		cancellationFeesUpToDaysBeforeArrivalField3.sendKeys(CfDayBeforeArrival3);
	}
	
	public void sendcancellationFeesvalue3(String cancellatinFees3)
	
	{
		cancellationFeesvalueField3.sendKeys(cancellatinFees3);
	}
	
	public WebElement cancellationFeesdiscountTypeDropdowndropDown3()
	{
		WebElement Element = cancellationFeesdiscountTypeDropdown3;
		return Element;
	}
	
	public void sendcancellationFeestravelFrom3(String TravelFrom3)
	
	{
		cancellationFeestravelFromField3.sendKeys(TravelFrom3);
	}
	
	public void sendcancellationFeestravelTo3(String TravelTO3)
	
	{
		cancellationFeestravelToField3.sendKeys(TravelTO3);
	}
	
	public void clickOncancellationFeesDeleteAction3()
	{
		cancellationFeesDeleteAction3.click();
	}
	
	public void sendContractTerm(String ContractTerm)
	
	{
		contractTermsField.sendKeys(ContractTerm);
	}
	
	public void clickOnCreateContract()
	{
		createContractButton.click();
	}
	

}
