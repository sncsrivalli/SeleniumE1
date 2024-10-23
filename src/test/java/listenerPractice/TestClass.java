package listenerPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPractice.ListenerImplementation.class)
public class TestClass extends BaseClass {

	@Test(dependsOnMethods = "demo2")
	public void demo1() {
		System.out.println("@Test");
	}
	
	@Test
	public void demo2() {
		System.out.println("@Test");
		Assert.fail();
	}
}
