package test;

import static org.junit.Assert.*;

import main.Dollar;

import org.junit.Test;

public class testMultiplication {

	@Test
	public void test() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

}
