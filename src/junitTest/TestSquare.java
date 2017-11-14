package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSquare {

	@Test
	public void test() {
		SquareCount test =new SquareCount();
		int output = test.square(5);
		assertEquals(25,output);
	}

}
