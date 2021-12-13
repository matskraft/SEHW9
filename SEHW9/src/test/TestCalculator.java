package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(5,calculator.add(2, 3),"should be 5");
	}

	@ParameterizedTest
	@CsvSource({"2,3","1,4"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertEquals(5,calculator.add(valueOne, valueTwo));
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(5,calculator.sub(8, 3),"should be 5");
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(16,calculator.multiply(4, 4),"should be 16");
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(5,calculator.divide(15, 3),"should be 5");
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		assertThrows(ArithmeticException.class, () ->
        calculator.divide(1, 0));
	}
}
