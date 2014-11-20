package test;

import static org.junit.Assert.*;
import main.Money;

import org.junit.Test;

public class testCurrency {

	@Test
	public void test() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.dollar(1).currency());
	}

}
