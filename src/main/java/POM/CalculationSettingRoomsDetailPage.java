package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationSettingRoomsDetailPage {
	
	@FindBy (xpath ="//th[text()='Season']") private WebElement seasonName;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[1]") private WebElement textA;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[2]") private WebElement textB;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[3]") private WebElement textC;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[4]") private WebElement textD;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[5]") private WebElement textE;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[6]") private WebElement textF;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[7]") private WebElement textG;
	@FindBy (xpath ="(//span[@class='badge badge-info mr-2'])[8]") private WebElement textH;
	
	@FindBy (xpath ="(//input[@id='IsAll'])[1]") private WebElement seasonA_AllDayCheckBox1;

	@FindBy (xpath ="(//label[@id='NetPrice'])[1]") private WebElement costPriceInEURforSeasonA;
	@FindBy (xpath ="(//label[@id='NetPrice'])[2]") private WebElement costPriceInEURforSeasonB;
	@FindBy (xpath ="(//label[@id='NetPrice'])[3]") private WebElement costPriceInEURforSeasonC;
	@FindBy (xpath ="(//label[@id='NetPrice'])[4]") private WebElement costPriceInEURforSeasonD;
	@FindBy (xpath ="(//label[@id='NetPrice'])[5]") private WebElement costPriceInEURforSeasonE;
	@FindBy (xpath ="(//label[@id='NetPrice'])[6]") private WebElement costPriceInEURforSeasonF;
	@FindBy (xpath ="(//label[@id='NetPrice'])[7]") private WebElement costPriceInEURforSeasonG;
	@FindBy (xpath ="(//label[@id='NetPrice'])[8]") private WebElement costPriceInEURforSeasonH;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[1]//td[2]//label[1]") private WebElement SeasonFrom_A;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[1]//td[2]//label[2]") private WebElement SeasonUntil_A;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[2]//td[2]//label[1]") private WebElement SeasonFrom_B;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[2]//td[2]//label[2]") private WebElement SeasonUntil_B;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[3]//td[2]//label[1]") private WebElement SeasonFrom_C;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[3]//td[2]//label[2]") private WebElement SeasonUntil_C;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[4]//td[2]//label[1]") private WebElement SeasonFrom_D;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[4]//td[2]//label[2]") private WebElement SeasonUntil_D;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[5]//td[2]//label[1]") private WebElement SeasonFrom_E;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[5]//td[2]//label[2]") private WebElement SeasonUntil_E;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[6]//td[2]//label[1]") private WebElement SeasonFrom_F;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[6]//td[2]//label[2]") private WebElement SeasonUntil_F;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[7]//td[2]//label[1]") private WebElement SeasonFrom_G;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[7]//td[2]//label[2]") private WebElement SeasonUntil_G;
	
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[8]//td[2]//label[1]") private WebElement SeasonFrom_H;
	@FindBy (xpath ="//table[@id='SeasonPriceList']//tr[8]//td[2]//label[2]") private WebElement SeasonUntil_H;

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
	
	public String getTextE()
	{
		String actualText = textE.getText();
		return actualText;
	}
	
	public String getTextF()
	{
		String actualText = textF.getText();
		return actualText;
	}
	
	public String getTextG()
	{
		String actualText = textG.getText();
		return actualText;
	}
	
	public String getTextH()
	{
		String actualText = textH.getText();
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
	
	public String getCostPriceInEURforSeasonE()
	{
		String actualText = costPriceInEURforSeasonE.getText();
		return actualText;
	}
	
	public String getCostPriceInEURforSeasonF()
	{
		String actualText = costPriceInEURforSeasonF.getText();
		return actualText;
	}
	
	public String getCostPriceInEURforSeasonG()
	{
		String actualText = costPriceInEURforSeasonG.getText();
		return actualText;
	}
	
	public String getCostPriceInEURforSeasonH()
	{
		String actualText = costPriceInEURforSeasonH.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Adate()
	{
		String actualText = SeasonFrom_A.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Adate()
	{
		String actualText = SeasonUntil_A.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Bdate()
	{
		String actualText = SeasonFrom_B.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Bdate()
	{
		String actualText = SeasonUntil_B.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Cdate()
	{
		String actualText = SeasonFrom_C.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Cdate()
	{
		String actualText = SeasonUntil_C.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Ddate()
	{
		String actualText = SeasonFrom_D.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Ddate()
	{
		String actualText = SeasonUntil_D.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Edate()
	{
		String actualText = SeasonFrom_E.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Edate()
	{
		String actualText = SeasonUntil_E.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Fdate()
	{
		String actualText = SeasonFrom_F.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Fdate()
	{
		String actualText = SeasonUntil_F.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Gdate()
	{
		String actualText = SeasonFrom_G.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Gdate()
	{
		String actualText = SeasonUntil_G.getText();
		return actualText;
	}
	
	public String getSeasonFrom_Hdate()
	{
		String actualText = SeasonFrom_H.getText();
		return actualText;
	}
	
	public String getSeasonUntil_Hdate()
	{
		String actualText = SeasonUntil_H.getText();
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
