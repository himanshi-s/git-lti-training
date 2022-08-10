package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AllAnnotateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after ");
	}

	@Ignore
	@Test
	public void test() {
		System.out.println("in test method 1");
	}
	
	@Test
	public void test2() {
		System.out.println("in test method 2");
	}

}
