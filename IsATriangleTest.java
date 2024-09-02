package ex;

import static org.junit.Assert.*;


import org.junit.Test;

public class IsATriangleTest {


	@Test
	public void testScaleneTrue() {
		String actual = IsATriangle.checkTriangle(4, 5, 6);
		String expected = "Scalene";
		assertEquals( expected, actual);
	}

	@Test
	public void testValidInputLowerBoundFalse() {
		String actual = IsATriangle.checkTriangle(-4, -5, -6);
		String expected = "Invalid Input Value";
		assertEquals(expected, actual);
	}

	@Test
	public void testValidInputUpperBoundFalseA() {
		String actual = IsATriangle.checkTriangle(201, 200, 200);
		String expected = "Invalid Input Value";
		assertEquals(expected, actual);
	}

	@Test
	public void testValidInputUpperBoundFalseB() {
		String actual = IsATriangle.checkTriangle(200, 201, 200);
		String expected = "Invalid Input Value";
		assertEquals(expected, actual);
	}

	@Test
	public void testIsoscelesTrue() {
		String actual = IsATriangle.checkTriangle(4, 4, 4);
		String expected = "Isosceles";
		assertEquals( expected, actual);
	}

}
