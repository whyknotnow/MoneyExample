package test;

import static org.junit.Assert.*;

import main.Dollar;

import org.junit.Test;

public class testEquality {

	@Test
	public void test() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}