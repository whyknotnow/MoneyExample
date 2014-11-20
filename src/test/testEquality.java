package test;

import static org.junit.Assert.*;
import main.Dollar;
import main.Franc;
import main.Money;

import org.junit.Test;

public class testEquality {

	@Test
	public void test() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}

}
