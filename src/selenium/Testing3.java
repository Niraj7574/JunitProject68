package selenium;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testing3 {
	
	
	@Rule //we always need to add Rule annotation for ErrorCollector
	public ErrorCollector err = new ErrorCollector();
	
	@Test
	public void test6() {
		String expected  = "abc";
		String actual  = "abc1";
		System.out.println("Before Assert");
		Assert.assertEquals(expected, actual);  //Hard or regular assert which we use in industry.
		System.out.println("After 1st Assert");
		Assert.assertTrue("Verifying 2>3", 4>3);
		System.out.println("After 2st Assert");
	}
	
	@Test
	public void test7() {
		String expected  = "abc";
		String actual  = "abc1";
		System.out.println("Before Assert");
		//try and catch can be use to run the test even after the line has failed.
		//try will  be always checked. if the try is fails then only it will go to catch.
		//only try and catch is not sufficient because it will pass the code even if the code is failed. for that we have to use ErrorCollectore in the catch.
		try {
		Assert.assertEquals(expected, actual);   
		}catch(Throwable t) {
			System.out.println("I'm in 1st catch");
			err.addError(t);
		}
		
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("Verifying 2>3", 2>3);
		}catch(Throwable t) {
			System.out.println("I'm in 2nd catch");
			err.addError(t);
		}
		System.out.println("After 2st Assert");
		
	}

}
