package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allotmentPage {
	
@FindBy (xpath ="//a[@data-toggle='dropdown']") private WebElement logoutDropDown;
@FindBy (xpath ="//a[@class='btn-pill btn-shadow btn-shine btn btn-focus']") private WebElement logoutOnAllotment;
	
@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[1]") private WebElement dashboardLink;
@FindBy (xpath ="//div[@class='page-title-heading']//div[2]//li[2]") private WebElement accommodationLink;
	
@FindBy (id ="AllotmentStartDate") private WebElement startDateField;
@FindBy (id ="AllotmentEndDate") private WebElement endDateField;

@FindBy (xpath ="//button[@class='btn btn-primary btn-lg ']") private WebElement loadAllotmentButton;	
@FindBy (xpath ="//button[text()='Change Allotment']") private WebElement changeAllotmentButton;	
@FindBy (id ="accardshowlog") private WebElement showLogButton;

//Load allotment table details for Room1

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[3]") private WebElement initialAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[3]") private WebElement currentAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[3]") private WebElement soldAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[3]") private WebElement stopSalesRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[3]") private WebElement remainingAllotRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[3]") private WebElement soldInPercentageAllotmentRoom1R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[3]") private WebElement releaseDaysAllotRoom1R1C1;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[4]") private WebElement initialAllotRoom1R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[4]") private WebElement currentAllotRoom1R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[4]") private WebElement soldAllotRoom1R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[4]") private WebElement stopSalesRoom1R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[4]") private WebElement remainingAllotRoom1R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[4]") private WebElement soldInPercentageAllotmentRoom1R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[4]") private WebElement releaseDaysAllotRoom1R2C2;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[5]") private WebElement initialAllotRoom1R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[5]") private WebElement currentAllotRoom1R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[5]") private WebElement soldAllotRoom1R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[5]") private WebElement stopSalesRoom1R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[5]") private WebElement remainingAllotRoom1R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[5]") private WebElement soldInPercentageAllotmentRoom1R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[5]") private WebElement releaseDaysAllotRoom1R3C3;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[6]") private WebElement initialAllotRoom1R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[6]") private WebElement currentAllotRoom1R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[6]") private WebElement soldAllotRoom1R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[6]") private WebElement stopSalesRoom1R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[6]") private WebElement remainingAllotRoom1R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[6]") private WebElement soldInPercentageAllotmentRoom1R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[6]") private WebElement releaseDaysAllotRoom1R4C4;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[7]") private WebElement initialAllotRoom1R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[7]") private WebElement currentAllotRoom1R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[7]") private WebElement soldAllotRoom1R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[7]") private WebElement stopSalesRoom1R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[7]") private WebElement remainingAllotRoom1R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[7]") private WebElement soldInPercentageAllotmentRoom1R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[7]") private WebElement releaseDaysAllotRoom1R5C5;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[8]") private WebElement initialAllotRoom1R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[8]") private WebElement currentAllotRoom1R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[8]") private WebElement soldAllotRoom1R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[8]") private WebElement stopSalesRoom1R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[8]") private WebElement remainingAllotRoom1R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[8]") private WebElement soldInPercentageAllotmentRoom1R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[8]") private WebElement releaseDaysAllotRoom1R6C6;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[9]") private WebElement initialAllotRoom1R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[9]") private WebElement currentAllotRoom1R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[9]") private WebElement soldAllotRoom1R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[9]") private WebElement stopSalesRoom1R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[9]") private WebElement remainingAllotRoom1R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[9]") private WebElement soldInPercentageAllotmentRoom1R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[9]") private WebElement releaseDaysAllotRoom1R7C7;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[10]") private WebElement initialAllotRoom1R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[10]") private WebElement currentAllotRoom1R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[10]") private WebElement soldAllotRoom1R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[10]") private WebElement stopSalesRoom1R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[10]") private WebElement remainingAllotRoom1R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[10]") private WebElement soldInPercentageAllotmentRoom1R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[10]") private WebElement releaseDaysAllotRoom1R8C8;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[11]") private WebElement initialAllotRoom1R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[11]") private WebElement currentAllotRoom1R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[11]") private WebElement soldAllotRoom1R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[11]") private WebElement stopSalesRoom1R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[11]") private WebElement remainingAllotRoom1R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[11]") private WebElement soldInPercentageAllotmentRoom1R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[11]") private WebElement releaseDaysAllotRoom1R9C9;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[12]") private WebElement initialAllotRoom1R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[12]") private WebElement currentAllotRoom1R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[12]") private WebElement soldAllotRoom1R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[12]") private WebElement stopSalesRoom1R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[12]") private WebElement remainingAllotRoom1R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[12]") private WebElement soldInPercentageAllotmentRoom1R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[12]") private WebElement releaseDaysAllotRoom1R10C10;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[8]//td[13]") private WebElement initialAllotRoom1R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[9]//td[13]") private WebElement currentAllotRoom1R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[10]//td[13]") private WebElement soldAllotRoom1R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[11]//td[13]") private WebElement stopSalesRoom1R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[12]//td[13]") private WebElement remainingAllotRoom1R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[13]//td[13]") private WebElement soldInPercentageAllotmentRoom1R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[14]//td[13]") private WebElement releaseDaysAllotRoom1R11C11;

//Load allotment table details for Room1

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[3]") private WebElement initialAllotRoom2R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[3]") private WebElement currentAllotRoom2R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[3]") private WebElement soldAllotRoom2R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[3]") private WebElement stopSalesRoom2R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[3]") private WebElement remainingAllotRoom2R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[3]") private WebElement soldInPercentageAllotmentRoom2R1C1;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[3]") private WebElement releaseDaysAllotRoom2R1C1;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[4]") private WebElement initialAllotRoom2R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[4]") private WebElement currentAllotRoom2R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[4]") private WebElement soldAllotRoom2R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[4]") private WebElement stopSalesRoom2R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[4]") private WebElement remainingAllotRoom2R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[4]") private WebElement soldInPercentageAllotmentRoom2R2C2;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[4]") private WebElement releaseDaysAllotRoom2R2C2;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[5]") private WebElement initialAllotRoom2R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[5]") private WebElement currentAllotRoom2R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[5]") private WebElement soldAllotRoom2R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[5]") private WebElement stopSalesRoom2R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[5]") private WebElement remainingAllotRoom2R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[5]") private WebElement soldInPercentageAllotmentRoom2R3C3;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[5]") private WebElement releaseDaysAllotRoom2R3C3;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[6]") private WebElement initialAllotRoom2R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[6]") private WebElement currentAllotRoom2R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[6]") private WebElement soldAllotRoom2R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[6]") private WebElement stopSalesRoom2R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[6]") private WebElement remainingAllotRoom2R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[6]") private WebElement soldInPercentageAllotmentRoom2R4C4;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[6]") private WebElement releaseDaysAllotRoom2R4C4;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[7]") private WebElement initialAllotRoom2R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[7]") private WebElement currentAllotRoom2R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[7]") private WebElement soldAllotRoom2R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[7]") private WebElement stopSalesRoom2R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[7]") private WebElement remainingAllotRoom2R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[7]") private WebElement soldInPercentageAllotmentRoom2R5C5;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[7]") private WebElement releaseDaysAllotRoom2R5C5;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[8]") private WebElement initialAllotRoom2R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[8]") private WebElement currentAllotRoom2R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[8]") private WebElement soldAllotRoom2R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[8]") private WebElement stopSalesRoom2R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[8]") private WebElement remainingAllotRoom2R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[8]") private WebElement soldInPercentageAllotmentRoom2R6C6;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[8]") private WebElement releaseDaysAllotRoom2R6C6;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[9]") private WebElement initialAllotRoom2R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[9]") private WebElement currentAllotRoom2R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[9]") private WebElement soldAllotRoom2R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[9]") private WebElement stopSalesRoom2R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[9]") private WebElement remainingAllotRoom2R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[9]") private WebElement soldInPercentageAllotmentRoom2R7C7;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[9]") private WebElement releaseDaysAllotRoom2R7C7;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[10]") private WebElement initialAllotRoom2R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[10]") private WebElement currentAllotRoom2R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[10]") private WebElement soldAllotRoom2R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[10]") private WebElement stopSalesRoom2R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[10]") private WebElement remainingAllotRoom2R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[10]") private WebElement soldInPercentageAllotmentRoom2R8C8;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[10]") private WebElement releaseDaysAllotRoom2R8C8;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[11]") private WebElement initialAllotRoom2R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[11]") private WebElement currentAllotRoom2R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[11]") private WebElement soldAllotRoom2R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[11]") private WebElement stopSalesRoom2R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[11]") private WebElement remainingAllotRoom2R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[11]") private WebElement soldInPercentageAllotmentRoom2R9C9;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[11]") private WebElement releaseDaysAllotRoom2R9C9;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[12]") private WebElement initialAllotRoom2R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[12]") private WebElement currentAllotRoom2R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[12]") private WebElement soldAllotRoom2R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[12]") private WebElement stopSalesRoom2R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[12]") private WebElement remainingAllotRoom2R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[12]") private WebElement soldInPercentageAllotmentRoom2R10C10;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[12]") private WebElement releaseDaysAllotRoom2R10C10;

@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[15]//td[13]") private WebElement initialAllotRoom2R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[16]//td[13]") private WebElement currentAllotRoom2R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[17]//td[13]") private WebElement soldAllotRoom2R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[18]//td[13]") private WebElement stopSalesRoom2R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[19]//td[13]") private WebElement remainingAllotRoom2R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[20]//td[13]") private WebElement soldInPercentageAllotmentRoom2R11C11;
@FindBy (xpath ="//table[@id='newAllotment']/tbody/tr[21]//td[13]") private WebElement releaseDaysAllotRoom2R11C11;


	public allotmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogoutButtonOfAllotment()
	
	{
		logoutDropDown.click();
	}
	
	public void logoutClickOFAllotment()
	
	{
		logoutOnAllotment.click();
	}
	
	public void clickOnDashboardLink()
	
	{
		dashboardLink.click();
	}
	
	public void clickOnAccommodationLink()
	
	{
		accommodationLink.click();
	}

	public void sendStartDate(String Start)
	
	{
		startDateField.sendKeys(Start);
	}
	
	public void sendendDate(String End)
	
	{
		endDateField.sendKeys(End);
	}
	
	public void clickOnLoadAllotment()
	{
		loadAllotmentButton.click();
	}
	
	public void clickOnchangeAllotment()
	{
		changeAllotmentButton.click();
	}
	
	public void clickOnshowLogButton()
	{
		showLogButton.click();
	}
	
	public String getInitialAllotRoom1R1C1()
	{
		String actualText = initialAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R1C1()
	{
		String actualText = currentAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R1C1()
	{
		String actualText = soldAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R1C1()
	{
		String actualText = stopSalesRoom1R1C1.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R1C1()
	{
		String actualText = remainingAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R1C1()
	{
		String actualText = soldInPercentageAllotmentRoom1R1C1.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R1C1()
	{
		String actualText = releaseDaysAllotRoom1R1C1.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom1R2C2()
	{
		String actualText = initialAllotRoom1R2C2.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R2C2()
	{
		String actualText = currentAllotRoom1R2C2.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R2C2()
	{
		String actualText = soldAllotRoom1R2C2.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R2C2()
	{
		String actualText = stopSalesRoom1R2C2.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R2C2()
	{
		String actualText = remainingAllotRoom1R2C2.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R2C2()
	{
		String actualText = soldInPercentageAllotmentRoom1R2C2.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R2C2()
	{
		String actualText = releaseDaysAllotRoom1R2C2.getText();
		return actualText;
	}

	public String getInitialAllotRoom1R3C3()
	{
		String actualText = initialAllotRoom1R3C3.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R3C3()
	{
		String actualText = currentAllotRoom1R3C3.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R3C3()
	{
		String actualText = soldAllotRoom1R3C3.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R3C3()
	{
		String actualText = stopSalesRoom1R3C3.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R3C3()
	{
		String actualText = remainingAllotRoom1R3C3.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R3C3()
	{
		String actualText = soldInPercentageAllotmentRoom1R3C3.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R3C3()
	{
		String actualText = releaseDaysAllotRoom1R3C3.getText();
		return actualText;
	}
	public String getInitialAllotRoom1R4C4()
	{
		String actualText = initialAllotRoom1R4C4.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R4C4()
	{
		String actualText = currentAllotRoom1R4C4.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R4C4()
	{
		String actualText = soldAllotRoom1R4C4.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R4C4()
	{
		String actualText = stopSalesRoom1R4C4.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R4C4()
	{
		String actualText = remainingAllotRoom1R4C4.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R4C4()
	{
		String actualText = soldInPercentageAllotmentRoom1R4C4.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R4C4()
	{
		String actualText = releaseDaysAllotRoom1R4C4.getText();
		return actualText;
	}

	public String getInitialAllotRoom1R5C5()
	{
		String actualText = initialAllotRoom1R5C5.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R5C5()
	{
		String actualText = currentAllotRoom1R5C5.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R5C5()
	{
		String actualText = soldAllotRoom1R5C5.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R5C5()
	{
		String actualText = stopSalesRoom1R5C5.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R5C5()
	{
		String actualText = remainingAllotRoom1R5C5.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R5C5()
	{
		String actualText = soldInPercentageAllotmentRoom1R2C2.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R5C5()
	{
		String actualText = releaseDaysAllotRoom1R5C5.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom1R6C6()
	{
		String actualText = initialAllotRoom1R6C6.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R6C6()
	{
		String actualText = currentAllotRoom1R6C6.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R6C6()
	{
		String actualText = soldAllotRoom1R6C6.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R6C6()
	{
		String actualText = stopSalesRoom1R6C6.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R6C6()
	{
		String actualText = remainingAllotRoom1R6C6.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R6C6()
	{
		String actualText = soldInPercentageAllotmentRoom1R6C6.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R6C6()
	{
		String actualText = releaseDaysAllotRoom1R6C6.getText();
		return actualText;
	}

	public String getInitialAllotRoom1R7C7()
	{
		String actualText = initialAllotRoom1R7C7.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R7C7()
	{
		String actualText = currentAllotRoom1R7C7.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R7C7()
	{
		String actualText = soldAllotRoom1R7C7.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R7C7()
	{
		String actualText = stopSalesRoom1R7C7.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R7C7()
	{
		String actualText = remainingAllotRoom1R7C7.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R7C7()
	{
		String actualText = soldInPercentageAllotmentRoom1R7C7.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R7C7()
	{
		String actualText = releaseDaysAllotRoom1R7C7.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom1R8C8()
	{
		String actualText = initialAllotRoom1R8C8.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R8C8()
	{
		String actualText = currentAllotRoom1R8C8.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R8C8()
	{
		String actualText = soldAllotRoom1R8C8.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R8C8()
	{
		String actualText = stopSalesRoom1R8C8.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R8C8()
	{
		String actualText = remainingAllotRoom1R8C8.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R8C8()
	{
		String actualText = soldInPercentageAllotmentRoom1R8C8.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R8C8()
	{
		String actualText = releaseDaysAllotRoom1R8C8.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom1R9C9()
	{
		String actualText = initialAllotRoom1R9C9.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R9C9()
	{
		String actualText = currentAllotRoom1R9C9.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R9C9()
	{
		String actualText = soldAllotRoom2R9C9.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R9C9()
	{
		String actualText = stopSalesRoom1R9C9.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R9C9()
	{
		String actualText = remainingAllotRoom1R9C9.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R9C9()
	{
		String actualText = soldInPercentageAllotmentRoom1R9C9.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R9C9()
	{
		String actualText = releaseDaysAllotRoom1R9C9.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom1R10C10()
	{
		String actualText = initialAllotRoom1R10C10.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R10C10()
	{
		String actualText = currentAllotRoom1R10C10.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R10C10()
	{
		String actualText = soldAllotRoom1R10C10.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R10C10()
	{
		String actualText = stopSalesRoom1R10C10.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom10C10()
	{
		String actualText = remainingAllotRoom1R10C10.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R10C10()
	{
		String actualText = soldInPercentageAllotmentRoom1R8C8.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R10C10()
	{
		String actualText = releaseDaysAllotRoom1R10C10.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom1R11C11()
	{
		String actualText = initialAllotRoom1R11C11.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom1R11C11()
	{
		String actualText = currentAllotRoom1R11C11.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom1R11C11()
	{
		String actualText = soldAllotRoom1R11C11.getText();
		return actualText;
	}
	
	public String getstopSalesRoom1R11C11()
	{
		String actualText = stopSalesRoom1R11C11.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom1R11C11()
	{
		String actualText = remainingAllotRoom1R11C11.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom1R11C11()
	{
		String actualText = soldInPercentageAllotmentRoom1R11C11.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom1R11C11()
	{
		String actualText = releaseDaysAllotRoom1R11C11.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom2R1C1()
	{
		String actualText = initialAllotRoom2R1C1.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R1C1()
	{
		String actualText = currentAllotRoom2R1C1.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R1C1()
	{
		String actualText = soldAllotRoom2R1C1.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R1C1()
	{
		String actualText = stopSalesRoom2R1C1.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R1C1()
	{
		String actualText = remainingAllotRoom2R1C1.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R1C1()
	{
		String actualText = soldInPercentageAllotmentRoom2R1C1.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R1C1()
	{
		String actualText = releaseDaysAllotRoom2R1C1.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom2R2C2()
	{
		String actualText = initialAllotRoom2R2C2.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R2C2()
	{
		String actualText = currentAllotRoom2R2C2.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R2C2()
	{
		String actualText = soldAllotRoom2R2C2.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R2C2()
	{
		String actualText = stopSalesRoom2R2C2.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R2C2()
	{
		String actualText = remainingAllotRoom2R2C2.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R2C2()
	{
		String actualText = soldInPercentageAllotmentRoom2R2C2.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R2C2()
	{
		String actualText = releaseDaysAllotRoom2R2C2.getText();
		return actualText;
	}

	public String getInitialAllotRoom2R3C3()
	{
		String actualText = initialAllotRoom2R3C3.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R3C3()
	{
		String actualText = currentAllotRoom2R3C3.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R3C3()
	{
		String actualText = soldAllotRoom2R3C3.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R3C3()
	{
		String actualText = stopSalesRoom2R3C3.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R3C3()
	{
		String actualText = remainingAllotRoom2R3C3.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R3C3()
	{
		String actualText = soldInPercentageAllotmentRoom2R3C3.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R3C3()
	{
		String actualText = releaseDaysAllotRoom2R3C3.getText();
		return actualText;
	}
	public String getInitialAllotRoom2R4C4()
	{
		String actualText = initialAllotRoom2R4C4.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R4C4()
	{
		String actualText = currentAllotRoom2R4C4.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R4C4()
	{
		String actualText = soldAllotRoom2R4C4.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R4C4()
	{
		String actualText = stopSalesRoom2R4C4.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R4C4()
	{
		String actualText = remainingAllotRoom2R4C4.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R4C4()
	{
		String actualText = soldInPercentageAllotmentRoom2R4C4.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R4C4()
	{
		String actualText = releaseDaysAllotRoom2R4C4.getText();
		return actualText;
	}

	public String getInitialAllotRoom2R5C5()
	{
		String actualText = initialAllotRoom2R5C5.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R5C5()
	{
		String actualText = currentAllotRoom2R5C5.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R5C5()
	{
		String actualText = soldAllotRoom2R5C5.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R5C5()
	{
		String actualText = stopSalesRoom2R5C5.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R5C5()
	{
		String actualText = remainingAllotRoom2R5C5.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R5C5()
	{
		String actualText = soldInPercentageAllotmentRoom2R2C2.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R5C5()
	{
		String actualText = releaseDaysAllotRoom2R5C5.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom2R6C6()
	{
		String actualText = initialAllotRoom2R6C6.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R6C6()
	{
		String actualText = currentAllotRoom2R6C6.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R6C6()
	{
		String actualText = soldAllotRoom2R6C6.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R6C6()
	{
		String actualText = stopSalesRoom2R6C6.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R6C6()
	{
		String actualText = remainingAllotRoom2R6C6.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R6C6()
	{
		String actualText = soldInPercentageAllotmentRoom2R6C6.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R6C6()
	{
		String actualText = releaseDaysAllotRoom2R6C6.getText();
		return actualText;
	}

	public String getInitialAllotRoom2R7C7()
	{
		String actualText = initialAllotRoom2R7C7.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R7C7()
	{
		String actualText = currentAllotRoom2R7C7.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R7C7()
	{
		String actualText = soldAllotRoom2R7C7.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R7C7()
	{
		String actualText = stopSalesRoom2R7C7.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R7C7()
	{
		String actualText = remainingAllotRoom2R7C7.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R7C7()
	{
		String actualText = soldInPercentageAllotmentRoom2R7C7.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R7C7()
	{
		String actualText = releaseDaysAllotRoom2R7C7.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom2R8C8()
	{
		String actualText = initialAllotRoom2R8C8.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R8C8()
	{
		String actualText = currentAllotRoom2R8C8.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R8C8()
	{
		String actualText = soldAllotRoom2R8C8.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R8C8()
	{
		String actualText = stopSalesRoom2R8C8.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R8C8()
	{
		String actualText = remainingAllotRoom2R8C8.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R8C8()
	{
		String actualText = soldInPercentageAllotmentRoom2R8C8.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R8C8()
	{
		String actualText = releaseDaysAllotRoom2R8C8.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom2R9C9()
	{
		String actualText = initialAllotRoom2R9C9.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R9C9()
	{
		String actualText = currentAllotRoom2R9C9.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R9C9()
	{
		String actualText = soldAllotRoom2R9C9.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R9C9()
	{
		String actualText = stopSalesRoom2R9C9.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R9C9()
	{
		String actualText = remainingAllotRoom2R9C9.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R9C9()
	{
		String actualText = soldInPercentageAllotmentRoom2R9C9.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R9C9()
	{
		String actualText = releaseDaysAllotRoom2R9C9.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom2R10C10()
	{
		String actualText = initialAllotRoom2R10C10.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R10C10()
	{
		String actualText = currentAllotRoom2R10C10.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R10C10()
	{
		String actualText = soldAllotRoom2R10C10.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R10C10()
	{
		String actualText = stopSalesRoom2R10C10.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R10C10()
	{
		String actualText = remainingAllotRoom2R10C10.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R10C10()
	{
		String actualText = soldInPercentageAllotmentRoom2R8C8.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R10C10()
	{
		String actualText = releaseDaysAllotRoom2R10C10.getText();
		return actualText;
	}
	
	public String getInitialAllotRoom2R11C11()
	{
		String actualText = initialAllotRoom2R11C11.getText();
		return actualText;
	}
	
	public String getCurrentAllotRoom2R11C11()
	{
		String actualText = currentAllotRoom2R11C11.getText();
		return actualText;
	}
	
	public String getSoldAllotRoom2R11C11()
	{
		String actualText = soldAllotRoom2R11C11.getText();
		return actualText;
	}
	
	public String getstopSalesRoom2R11C11()
	{
		String actualText = stopSalesRoom2R11C11.getText();
		return actualText;
	}
	
	public String getRemainingAllotRoom2R11C11()
	{
		String actualText = remainingAllotRoom2R11C11.getText();
		return actualText;
	}
	
	public String getSoldInPercentageAllotmentRoom2R11C11()
	{
		String actualText = soldInPercentageAllotmentRoom2R11C11.getText();
		return actualText;
	}
	
	public String getReleaseDaysAllotRoom2R11C11()
	{
		String actualText = releaseDaysAllotRoom2R11C11.getText();
		return actualText;
	}
	
}
