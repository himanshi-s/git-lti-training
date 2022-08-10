package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProg {

	@Test
	public void test() {
//		fail("Not yet implemented");
		String s1="hello";
		String s2= "admin";
		
		String s3 = new String("hello");
		String s4= new String("hello");
		String sn= null;
//		assertEquals(s3,s4);
//		assertFalse(s1.length()>s2.length());
		assertNull(sn);
	}

}
