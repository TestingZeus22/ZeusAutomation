package TestNgListeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	
	@Test
	public void New1()
	
	{
		Reporter.log("New1 is running",true);
	}
	
	@Test
	public void New2()
	
	{
		Reporter.log("New2 is running",true);
	}
}
