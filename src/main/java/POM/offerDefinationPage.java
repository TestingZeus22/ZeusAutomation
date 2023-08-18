package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class offerDefinationPage {
     
	//Reisefalke 
	@FindBy (xpath = "//span[text()='Reisefalke']") private WebElement Reisefalke;
	@FindBy (xpath = "//span[text()='Lidl AT']") private WebElement LidlAT;
	@FindBy (xpath = "//span[text()='Lidl DE']") private WebElement LidlDE;
		
	//Falkensteiner Holiday pauschal
	@FindBy (xpath = "//span[text()='Falkensteiner Holidays']") private WebElement FalkensteinerHolidays;
	@FindBy (xpath = "//span[text()='Falkensteiner Holidays Pauschal']") private WebElement FalkensteinerHolidaysPauschal;

	//Faulk Tours AG
	@FindBy (xpath = "//span[text()='Falk Tours AG']") private WebElement FalkToursAG;
	@FindBy (xpath = "//span[text()='Norma']") private WebElement Norma;
	@FindBy (xpath = "//span[text()='Tchibo DE']") private WebElement TchiboDE;
	@FindBy (xpath = "//span[text()='Tchibo AT']") private WebElement TchiboAT;
	@FindBy (xpath = "//span[text()='Netto']") private WebElement Netto;
	@FindBy (xpath = "//span[text()='Falk Travel öffentlich']") private WebElement FalkTravelöffentlich;
	@FindBy (xpath = "//span[text()='Example B2B Agency']") private WebElement ExampleB2BAgency;
	@FindBy (xpath = "//span[text()='Travelseller']") private WebElement Travelseller;
	@FindBy (xpath = "//span[text()='Testing2']") private WebElement Testing2;
	@FindBy (xpath = "//span[text()='Testing']") private WebElement Testing;
	@FindBy (xpath = "//span[text()='Tester']") private WebElement Tester;
	@FindBy (xpath = "//span[text()='Duplicate']") private WebElement Duplicate;
	@FindBy (xpath = "//span[text()='Alltours']") private WebElement Alltours;
	@FindBy (xpath = "//span[text()='Reisenaktuell']") private WebElement Reisenaktuell;
	
	@FindBy (xpath ="(//input[@type='text'])[1]") private WebElement TBMcodeField;
	@FindBy (xpath ="//td[@class='sorting_1']") private WebElement TBMcodeR1C1;
	@FindBy (xpath ="(//input[@type='text'])[2]") private WebElement accommodationNameField;
	@FindBy (id="accommodationName") private WebElement accommodationR1C1;
	@FindBy (xpath ="(//input[@type='text'])[3]") private WebElement locationField;
	@FindBy (xpath ="(//input[@type='text'])[4]") private WebElement countryField;
	@FindBy (xpath ="(//input[@type='text'])[5]") private WebElement contractNameField;
	@FindBy (id ="contractName") private WebElement contractNameR1C1;
	@FindBy (xpath ="(//input[@type='text'])[6]") private WebElement validFromAndToField;
	@FindBy (id ="Status") private WebElement statusDropdown; 
	@FindBy (xpath ="//div[@class='badge badge-pill badge-success']") private WebElement statusText;
	@FindBy (id ="chkProdID") private WebElement checkBox1;
	@FindBy (xpath = "//a[@class='btn-shadow btn btn-primary']") private WebElement saveButton;
    
	@FindBy (xpath="//td[text()='No data available in table']") private WebElement errorMessage;
	
	public offerDefinationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnReisefalke()
    {
		Reisefalke.click();
    }
	
	public void clickOnLidlAT()
    {
		LidlAT.click();
    }
	
	public void clickOnLidlDE()
    {
		LidlDE.click();
    }
	
	public void clickOnReisenaktuell()
	{
		Reisenaktuell.click();
	}
	
	public void clickOnFalkensteinerHolidays()
	{
		FalkensteinerHolidays.click();
	}
	
	public void clickOnFalkensteinerHolidaysPauschal()
	{
		FalkensteinerHolidaysPauschal.click();
	}
	
	public void clickOnFalkToursAG()
	{
		FalkToursAG.click();
	}
	
	public void clickOnTchiboDE()
	{
		TchiboDE.click();
	}
	
	public void clickOnTchiboAT()
	{
		TchiboAT.click();
	}
	
	public void clickOnNetto()
	{
		Netto.click();
	}
	
	public void clickOnFalkTravelöffentlich()
	{
		FalkTravelöffentlich.click();
	}
	
	public void clickOnExampleB2BAgency()
	{
		ExampleB2BAgency.click();
	}
	
	public void clickOnTravelseller()
	{
		Travelseller.click();
	}
	
	public void clickOnTesting2()
	{
		Testing2.click();
	}
	
	public void clickOnTesting()
	{
		Testing.click();
	}
	
	public void clickOnTester()
	{
		Tester.click();
	}
	
	public void clickOnDuplicate()
	{
		Duplicate.click();
	}
	
	public void clickOnAlltours()
	{
		Alltours.click();
	}
	
	public void SendTBMcode(String tbm)
	{
		TBMcodeField.sendKeys(tbm);
	}
	
	public String getTBMcodeR1C1()
	{
		String actualText = TBMcodeR1C1.getText();
		return actualText;
	}
	

	public void SendAccommodationNameField(String accommodationName)
	{
		accommodationNameField.sendKeys(accommodationName);
	}
	
	public String getAccommodationR1C1()
	{
		String actualText = accommodationR1C1.getText();
		return actualText;
	}
	
	public void SendLocationField(String location)
	{
		locationField.sendKeys(location);
	}
	
	public void SendCountryField(String country)
	{
		countryField.sendKeys(country);
	}
	
	public void SendcontractNameField(String contractName)
	{
		contractNameField.sendKeys(contractName);
	}
	
	public String getContractNameR1C1()
	{
		String actualText = contractNameR1C1.getText();
		return actualText;
	}
	
	public void SendValidFromAndToField(String validFromAndTo)
	{
		validFromAndToField.sendKeys(validFromAndTo);
	}
	
	public WebElement selectStatusDropdown()
	{
		WebElement Element = statusDropdown;
		return Element;
	}
	
	public String getStatusText()
	{
		String actualText = statusText.getText();
		return actualText;
	}
	
	public void clickOnCheckBox()
	{
		checkBox1.click();
	}
	
	public void clickOnsaveButton()
	{
		saveButton.click();
	}
	
	public String geterrorMessage()
	{
		String actualText = errorMessage.getText();
		return actualText;
	}
}
