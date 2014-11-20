package test;

import static org.junit.Assert.assertEquals;
import main.Money;

import org.junit.Test;

public class testMultiplication {

	@Test
	public void test() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

}
