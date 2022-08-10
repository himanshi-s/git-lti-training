package Testing;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class PrimenumTest {




	@RunWith(Parameterized.class)
	public class PrimeCheckerTest {

		private Integer input;
		private Boolean expectedResult;
		Primenum p;
		
		public PrimeCheckerTest(Integer num, Boolean expectedResult)
		{
			this.input = num;
			this.expectedResult = expectedResult;
		}
		
		@Before
		public void initialize() {
			p = new Primenum();
		}
		
		@Test
		public void testValidate() {
			assertEquals(expectedResult, p.isPrime(input));
		}
		
		@Parameterized.Parameters
		public static Collection pNums() {
			return Arrays.asList(new Object[][] {
				{2,true},
				{3,true},
				{4,false},
				{5, true},
				{6,false}
			});
		}

	}

}

