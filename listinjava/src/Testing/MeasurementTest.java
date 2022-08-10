package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeasurementTest {


	@Test
	public void test() {
	//fail("Not yet implemented");
	Measurement m1 = new Measurement(5);
	Measurement m2 = new Measurement(3);
	assertEquals(5,m1.getValue());
	m1.add(m2);
	assertEquals(8,m1.getValue());
	m1.sub(m2);
	assertEquals(5,m1.getValue());
	}
	
	}
	
