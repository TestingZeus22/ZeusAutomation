package TestNgListeners;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void New3()
	
	{
		Reporter.log("New3 is running",true);
	}
	
	@Test
	public void New4()
	
	{
		Reporter.log("New4 is running",true);
	}
}
