package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		//System.out.println("Before");
		System.out.println("Login");
	}

	@After
	public void tearDown() throws Exception {
		//System.out.println("After");
		System.out.println("Logout");
	}

	@Test
	public void test1() {
		//System.out.println("Login");
		System.out.println("Test1");
		//System.out.println("Logout");
	}
	
	@Test
	public void test2() {
		//System.out.println("Login");
		System.out.println("Test2");
		//System.out.println("Logout");
	}
	
	@Test
	public void test3() {
		//System.out.println("Login");
		System.out.println("Test3");
		//System.out.println("Logout");
	}
}
