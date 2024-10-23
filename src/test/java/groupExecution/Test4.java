package groupExecution;

import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void demo1() {
		System.out.println("Test4 - demo1");
	}
	
	@Test(groups = {"smoke", "sanity", "regression"})
	public void demo2() {
		System.out.println("Test4 - demo2 - smoke, sanity and regression");
	}
	
}
