package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class offerCalculationPage {

	
	@FindBy (xpath= "//span[text()='Falk Tours AG']") private WebElement FalkToursAG;
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
	
	@FindBy (xpath= "//span[text()='Falkensteiner Holidays']") private WebElement FalkensteinerHolidays;
	@FindBy (xpath= "//span[text()='Falkensteiner Holidays Pauschal']") private WebElement 	FalkensteinerHolidaysPauschal;

	@FindBy (xpath= "//span[text()='Reisefalke']") private WebElement Reisefalke;
	@FindBy (xpath= "//span[text()='Lidl AT']") private WebElement LidlAT;
	@FindBy (xpath= "//span[text()='Lidl DE']") private WebElement LidlDE;
	
	
	
	
	public offerCalculationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
	
	
}
