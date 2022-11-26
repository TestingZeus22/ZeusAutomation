package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	@FindBy(id ="loginmodel_UserName") private WebElement UserName;
	@FindBy(id ="loginmodel_Password") private WebElement Password;
	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']") private WebElement LoginToDashboard;
	@FindBy(xpath ="//a[@class='btn-lg btn btn-link']") private WebElement RecoverPassword;
	@FindBy(xpath ="//div[text()='Copyright  © Zeus 2022 ']") private WebElement CopyrightZeusText;
	@FindBy(id ="swal2-title") private WebElement CredentialInvalid;
	@FindBy(xpath ="//div[text()='Welcome back,']") private WebElement getWelcomeBackText;
	@FindBy(xpath ="//a[@class='btn-lg btn btn-link']") private WebElement RecoverPasswordLink;
	
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SendUserName(String UN)
	{
		UserName.sendKeys(UN);
	}
	
	public void SendPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void ClickOnLoginToDashboard()
	{
		LoginToDashboard.click();
	}
	
	public void ClickOnRecoverPassword()
	{
		RecoverPassword.click();
	}
	
	public String getCredentialsInvalidTextOnPasswordField()
	{
		String actualText = CredentialInvalid.getText();
		return actualText;
	}
	
	public String getCredentialsInvalidTextOnUserNameField()
	{
		String actualText = CredentialInvalid.getText();
		return actualText;
	}
	
	public String getCopyrightZeusText()
	{
		String actualText = CopyrightZeusText.getText();
		return actualText;
	}
	
	public String getWelcomeBackText()
	{
		String actualText = getWelcomeBackText.getText();
		return actualText;
	}
	
	public String getRecoverPasswordLink()
	{
		String actualText = RecoverPasswordLink.getText();
		return actualText;
	}
}
	
	
	

