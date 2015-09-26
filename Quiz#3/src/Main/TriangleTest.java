package Main;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	
	Triangle test;
	Triangle test2;
	Triangle test3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		test = new Triangle(3, 4, 5);
		test2 = new Triangle( 5, 6, Math.sqrt(61));
		test3 = new Triangle(6, 8, 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testArea(){
		test.getArea();
		assertEquals("The area of a triangle with sides 3, 4, 5 is 6 square units.",
				(double) 6, (double) test.getArea(), .0001);
	}
	
	@Test
	public final void test2Area(){
		test2.getArea();
		assertEquals("The area of a triangle with sides 5, 6, and square root of 61"
				+ " units is 15 square units.",
				(double) 15, (double) test2.getArea(), .0001);
	}
	
	@Test
	public final void test3Area(){
		test3.getArea();
		assertEquals("The area of a triangle with sides 6, 8, 10 is 24 square units.",
				(double) 24, (double) test3.getArea(), .0001);
	}
	
	@Test
	public final void testPerimeter(){
		test.getPerimeter();
		assertEquals("The perimeter of a triangle with sides 3, 4, 5 is 12 units.", 
				(double) 12, (double) test.getPerimeter(), .0001);
	}
	
	
	@Test
	public final void test2Perimeter(){
		test2.getPerimeter();
		assertEquals("The perimeter of a triangle with sides 5, 6, and square root"
				+ " of 61 units is 11 square root of 61 square units.", 
				(double) (11 + Math.sqrt(61)), (double) test2.getPerimeter(), .0001);
	}
	
	@Test
	public final void test3Perimeter(){
		test3.getPerimeter();
		assertEquals("The perimeter of a triangle with sides 6, 8, 10 is 24 square "
				+ "units.", (double) 24, (double) test3.getPerimeter(), .0001);
	}
	
	
	
}
