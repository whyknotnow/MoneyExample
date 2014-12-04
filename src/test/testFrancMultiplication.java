package test;

import static org.junit.Assert.*;

import main.Franc;

import org.junit.Test;

public class testFrancMultiplication {

	@Test
	public void test() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}

}
