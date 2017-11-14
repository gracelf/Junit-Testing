package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountAtest {

	@Test
	public void test() {
		SquareCount testCount = new SquareCount() ;
		int output = testCount.count("aaap");
		assertEquals(3,output);
		
	}

}
