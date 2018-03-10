package testtt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testclass2 {

	@Test
	public void Dummy_test_to_pass()
	{
		Assert.assertEquals(1, 1);
		
	}
	@Test
	public void Dummy_test_to_fail()
	{
		Assert.assertEquals(1, 2);
		
	}

}
