package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (listeners.TestNGlisteners.class)
public class TestNGlistenerZeus {

	@Test
	public void test1()
	{
		System.out.println("I am inside test 1");
	}
	
	@Test
    public void test2()
	
	{
		System.out.println("I am inside test 2");
		//Assert.fail();
	}
	
	@Test
    public void test3()

    {
	System.out.println("I am inside test 3");
    }
	
	@Test
    public void test4()

    {
	System.out.println("I am inside test 4");
    }
	}
