package TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	@Test
	public void hardassert() {
		Assert.assertTrue(false);//fail
	}
	private static void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void softassert()
	{
		SoftAssert obj=new SoftAssert();
		obj.assertTrue(false);//pass
}
}