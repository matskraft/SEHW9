package test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints= {2016,2036})
	public void Should_return_true(int year) {
		assertTrue(new Calendar(year).isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= {2011,2017,2021})
	public void Should_return_false(int year) {
		assertFalse((new Calendar(year).isLeapYear()));
	}

	@ParameterizedTest
	@ValueSource(ints = {2011,2016,2017,2021,2036})
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar greg = new GregorianCalendar();
		assertTrue(greg.isLeapYear(year));
	}
	@ParameterizedTest
	@ValueSource(ints = {-2012,-2016})
	public void boundary_testing(int year) {
		assertTrue(new Calendar((int)year).isLeapYear());
	}
}
