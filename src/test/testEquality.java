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
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(new Dollar(5)));		
	}

}
