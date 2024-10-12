package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Middle;

class MiddleTests {

	@Test
	void forSumTest01() {
		int[] arr = {69, 100, 124, 204, 232, 260, 286, 333, 464, 468};
		int expected = 2540;
		int result = Middle.forSum(arr);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void forSumTest02() {
		int[] arr = {44, 92, 117, 155, 216, 232, 292, 294, 346, 369};
		int expected = 2157;
		int result = Middle.forSum(arr);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void forSumTest03() {
		int[] arr = {3, 7, 9, 15, 16, 25, 33, 34, 37, 46};
		int expected = 225;
		int result = Middle.forSum(arr);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void whileSumTest01() {
		int[] arr = {69, 100, 124, 204, 232, 260, 286, 333, 464, 468};
		int expected = 2540;
		int result = Middle.whileSum(arr);
		Assertions.assertEquals(expected, result);
	}

	@Test
	void whileSumTest02() {
		int[] arr = {44, 92, 117, 155, 216, 232, 292, 294, 346, 369};
		int expected = 2157;
		int result = Middle.whileSum(arr);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	void whileSumTest03() {
		int[] arr = {3, 7, 9, 15, 16, 25, 33, 34, 37, 46};
		int expected = 225;
		int result = Middle.whileSum(arr);
		Assertions.assertEquals(expected, result);
	}
}
