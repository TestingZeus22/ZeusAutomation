package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationSettingRoomsDetailPage {
	
 // Season and A,B,C,D.
	
	@FindBy (xpath ="//th[text()='Season']") private WebElement seasonName;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[1]") private WebElement textA;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[2]") private WebElement textB;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[3]") private WebElement textC;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[4]") private WebElement textD;
	
	//CheckBox Selection 
	
	@FindBy (xpath ="(//input[@id='IsAll'])[1]") private WebElement seasonA_AllDayCheckBox1;
//	@FindBy (xpath ="(//input[@id='IsMonday'])[1]") private WebElement seasonA_MondayCheckBox2;
//	@FindBy (xpath ="(//input[@id='IsTuesday'])[1]") private WebElement seasonA_TuesdayCheckBox3;
//	@FindBy (xpath ="(//input[@id='IsWednesday'])[1]") private WebElement seasonA_WednesdayCheckBox4;
//	@FindBy (xpath ="(//input[@id='IsThursday'])[1]") private WebElement seasonA_ThursdayCheckBox5;
//	@FindBy (xpath ="(//input[@id='IsFriday'])[1]") private WebElement seasonA_FridayCheckBox6;
//	@FindBy (xpath ="(//input[@id='IsSaturday'])[1]") private WebElement seasonA_SaturdayCheckBox7;
//	@FindBy (xpath ="(//input[@id='IsSunday'])[1]") private WebElement seasonA_SundayCheckBox8;
	

	
	//CostPrice(EUR)
	
	@FindBy (xpath ="(//label[@id='NetPrice'])[1]") private WebElement costPriceInEURforSeasonA;
	@FindBy (xpath ="(//label[@id='NetPrice'])[2]") private WebElement costPriceInEURforSeasonB;
	@FindBy (xpath ="(//label[@id='NetPrice'])[3]") private WebElement costPriceInEURforSeasonC;
	@FindBy (xpath ="(//label[@id='NetPrice'])[4]") private WebElement costPriceInEURforSeasonD;
	
	
	//DB% value check
	
	@FindBy (xpath ="(//input[@id='DB1'])[1]") private WebElement DB1value;

	
	public CalculationSettingRoomsDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getSeasonName()
	{
		String actualText = seasonName.getText();
		return actualText;
	}
	
	public String getTextA()
	{
		String actualText = textA.getText();
		return actualText;
	}
	
	public String getTextB()
	{
		String actualText = textB.getText();
		return actualText;
	}
	
	public String getTextC()
	{
		String actualText = textC.getText();
		return actualText;
	}
	
	public String getTextD()
	{
		String actualText = textD.getText();
		return actualText;
	}
	
	public String getCostPriceInEURforSeasonA()
	{
		String actualText = costPriceInEURforSeasonA.getText();
		return actualText;
	}
	
	public String getCostPriceInEURforSeasonB()
	{
		String actualText = costPriceInEURforSeasonB.getText();
		return actualText;
	}
	
	public String getCostPriceInEURforSeasonC()
	{
		String actualText = costPriceInEURforSeasonC.getText();
		return actualText;
	}
	
	public String getCostPriceInEURforSeasonD()
	{
		String actualText = costPriceInEURforSeasonD.getText();
		return actualText;
	}
	
	public String getDB1value1(String DB1Value)
	{
		String actualText = DB1value.getAttribute(DB1Value);
		return actualText;
	}
	
	
	public Boolean isSeasonA_AllDayCheckBox1()
	{
		return seasonA_AllDayCheckBox1.isSelected();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}