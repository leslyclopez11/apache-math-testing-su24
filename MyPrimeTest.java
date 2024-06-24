
import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

public class MyPrimeTest {

	@Test
	public void test2() {
		assertEquals(2, MyPrime.nextPrime(1));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNegativeN() {
		MyPrime.nextPrime(-1);
	}

	@Test 
	public void testPrime2() {
		int prime = MyPrime.nextPrime(2);
		assertEquals(2, prime);
	}

	@Test 
	public void testPrime11() {
		int prime = MyPrime.nextPrime(11);
		assertEquals(11, prime);
	}

	@Test 
	public void testRemainder0() {
		int prime = MyPrime.nextPrime(11);
		assertEquals(13, prime);
	}

	@Test 
	public void testNonPrime1() {
		int prime = MyPrime.nextPrime(10);
		assertEquals(13, prime);
	}

	@Test 
	public void testNonPrime2() {
		int prime = MyPrime.nextPrime(30);
		assertEquals(31, prime);
	}

	@Test 
	public void testNonPrime3() {
		int prime = MyPrime.nextPrime(33);
		assertEquals(37, prime);
	}

}
