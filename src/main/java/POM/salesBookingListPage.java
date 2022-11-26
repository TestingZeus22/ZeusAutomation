package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salesBookingListPage {

	@FindBy (xpath="(//a[@class='btn-shadow btn btn-primary'])[1]") private WebElement submitButton;
	@FindBy (xpath="(//a[@class='btn-shadow btn btn-primary'])[2]") private WebElement bookingListButton;
	@FindBy (xpath="(//a[@class='btn-shadow btn btn-primary'])[3]") private WebElement createButton;
	@FindBy (xpath="(//li[@class='breadcrumb-item'])[1]") private WebElement textDashboard;
	@FindBy (xpath="(//li[@class='breadcrumb-item'])[2]") private WebElement textSalesBooking;
	@FindBy (id="ddlCompany") private WebElement selectDropdownListInSales;
	@FindBy (id="ReservationNo") private WebElement reservationNoInput;
	
	
	public salesBookingListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnsubmitButton()
	{
		submitButton.click();
	}
	
	public void clickOnbookingListButton()
	{
		bookingListButton.click();
	}
	
	public void clickOncreateButton()
	{
		createButton.click();
	}
	
	public String getTextDashboard()
	{
		String actualText = textDashboard.getText();
		return actualText;
	}
	
	public String getTextSalesBooking()
	{
		String actualText = textSalesBooking.getText();
		return actualText;
	}
	
	public WebElement SelectDropDownListInSalesBooking()
	{
		WebElement Element = selectDropdownListInSales;
		return Element;
	}
	
	public void sendReservationNoInputField(String Reservation)
	{
		reservationNoInput.sendKeys(Reservation);
	}
	
}
