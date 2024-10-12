package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.End;

class EndTests {

	@Test
	void permitCategoryTest01() {
		String expected = "Visitor";
		String result = End.categorizePermits(150.0);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void permitCategoryTest02() {
		String expected = "Employee";
		String result = End.categorizePermits(9.92);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void permitCategoryTest03() {
		String expected = "Disabled";
		String result = End.categorizePermits(0.0);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void permitCategoryTest04() {
		String expected = "Employee";
		String result = End.categorizePermits(17.83);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void permitCategoryTest05() {
		String expected = "Student";
		String result = End.categorizePermits(9.91);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void permitCategoryTest06() {
		String expected = "nobody";
		String result = End.categorizePermits(36.45);
		Assertions.assertEquals(expected, result);
	}
	

}
