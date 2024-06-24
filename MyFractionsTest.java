
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.fraction.Fraction;
import org.junit.Test;


public class MyFractionsTest {

	@Test(expected=NullArgumentException.class)
	public void testF1NullF2Null() {
		MyFractions.addSub(null, null, false);
	}


	@Test 
	public void testF1Sub() {
		Fraction f1 = new Fraction(0,1);
		Fraction f2 = new MyFraction(1,1);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(f2.negate(), result);
	}

	@Test 
	public void testF1Add() {
		Fraction f1 = new Fraction(0,1);
		Fraction f2 = new MyFraction(1,1);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(f2, result);
	}

	@Test 
	public void testF2Sub() {
		Fraction f1 = new Fraction(1,1);
		Fraction f2 = new MyFraction(0,1);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(f1, result);
	}

	@Test 
	public void testF2Add() {
		Fraction f1 = new Fraction(1,1);
		Fraction f2 = new MyFraction(0,1);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(f1, result);
	}

	@Test 
	public void testD1Sub() {
		Fraction f1 = new Fraction(5,8);
		Fraction f2 = new MyFraction(1,8);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(new Fraction(3,8), result);
	}

	@Test 
	public void testD1Add() {
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new MyFraction(1,4);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(new Fraction(11,12), result);
	}

	@Test 
	public void testD1Not1Sub() {
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new MyFraction(5,6);
		Fraction result = MyFractions.addSub(f1, f2, false);
		assertEquals(new Fraction(-1,12), result);
	}

	@Test
	public void testD1Not1Add() {
		Fraction f1 = new Fraction(3,5);
		Fraction f2 = new MyFraction(2,7);
		Fraction result = MyFractions.addSub(f1, f2, true);
		assertEquals(new Fraction(29,35), result);
	} 

}
