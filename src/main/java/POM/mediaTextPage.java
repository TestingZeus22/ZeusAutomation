package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mediaTextPage {

	@FindBy (id ="AccommodationModel_LocalityModel_ImageFor") private WebElement seasonDropdown;
	
	@FindBy (xpath ="//span[text()='Hotel Image Summer']") private WebElement hotelImageSummer;
	@FindBy (xpath ="//span[text()='Hotel Image Winter']") private WebElement hotelImageWinter;
	@FindBy (xpath ="//span[text()='Hotel Text Winter']") private WebElement hotelTextWinter;
	@FindBy (xpath ="//span[text()='Hotel Amenities']") private WebElement hotelAmenities;
	@FindBy (xpath ="//span[text()='Hotel Text Summer']") private WebElement hotelTextSummer;
	
	
	public mediaTextPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement seasonDropdownselect()
	{
		WebElement Element = seasonDropdown;
		return Element;
	}
	
	public void clickOnhotelImageSummer()
	{
		hotelImageSummer.click();
	}
	
	public void clickOnhotelImageWinter()
	{
		hotelImageWinter.click();
	}
	
	public void clickOnhotelTextWinter()
	{
		hotelTextWinter.click();
	}
	
	public void clickOnhotelAmenities()
	{
		hotelAmenities.click();
	}
	
	public void clickOnhotelTextSummer()
	{
		hotelTextSummer.click();
	}
}
