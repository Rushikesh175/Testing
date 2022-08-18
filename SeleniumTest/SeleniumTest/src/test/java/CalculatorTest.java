import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	static String text;
	static String text2;
	
	@Before
	public void initialize() {
		System.out.println("in initialize");
		text = "hi";
		text2 = "hello";
		
	}
	
	@Test
	public void test1() {
		System.out.println("In test1");
		assertTrue(CalculatorTest.text == "hi");
	}
	
	@Test
	public void test2() {
		System.out.println("In test2");
		assertTrue(CalculatorTest.text2 == "hello");
	}

	@Test
	public void test() {
		System.out.println("In test");
		Calculator calc = new Calculator();
		int actual_result = calc.add(30, 60);
		int expected_result = 91;
		assertTrue(expected_result==actual_result);
	}
	
	public void do_something() {
		
	}

}
