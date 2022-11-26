package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class recoverPasswordPage {
	
	@FindBy (id ="LoggedUserName") private WebElement emailField;
	@FindBy (xpath ="//button[@type='submit']") private WebElement sendEmail;
	@FindBy (xpath ="//div[text()='Welcome to Falk Tours,']") WebElement Textget;
	@FindBy (xpath ="//div[@class='text-center text-white opacity-8 mt-3']") private WebElement TextgetCopyright;
	@FindBy (xpath ="//div[text()='Welcome to Falk Tours,']") private WebElement TextWelcomeToFaulkTours;
	@FindBy (xpath ="//*[contains(text(),'Please enter your User Name')]") private WebElement TextDataEnterMessage;

	
	public recoverPasswordPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUName(String UN)
	{
		emailField.sendKeys(UN);
	}
	
	public void clickOnSendEmailButton()
	{
		sendEmail.click();
	}
	
	public String getTextCopyright()
	{
		String ActualText = TextgetCopyright.getText();
		return ActualText;
	}
	public String getWelcomeFalkTourText()
	
	{
		String actualText =TextWelcomeToFaulkTours.getText();
		return actualText;
	}
	
	public String getDataEnterMessage()
	{
		String actualText =TextDataEnterMessage.getText();
		return actualText;
	}
	
}
