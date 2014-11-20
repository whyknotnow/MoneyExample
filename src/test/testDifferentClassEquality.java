package test;

import static org.junit.Assert.*;
import main.Franc;
import main.Money;

import org.junit.Test;

public class testDifferentClassEquality {

	@Test
	public void test() {
		assertTrue(new Money(10,"CHF").equals(new Franc(10,"CHF")));
	}

}
