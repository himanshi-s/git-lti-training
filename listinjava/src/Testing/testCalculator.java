package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {

	@Test
	public void test() {
		Calculator c = new Calculator();
		assertEquals(24,c.fact(4));
	}

}
