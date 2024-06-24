import static org.junit.Assert.*;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Test;


public class MySorterTest {

	@Test(expected=NullArgumentException.class)
	public void testNullInputs() {
		MySorter.sortInPlace(null, MySorter.OrderDirection.DECREASING, (double[])null);
	}

	@Test(expected=NullArgumentException.class)
	public void testNullList() {
		MySorter.sortInPlace(new double[] {4,3,2}, MySorter.OrderDirection.DECREASING, (double[])null);
	}

	@Test(expected=DimensionMismatchException.class)
	public void testUnequalLength() {
		MySorter.sortInPlace(new double[] {4,3,2}, MySorter.OrderDirection.DECREASING, new double[] {4,3});
	}

	@Test 
	public void testIncreasing() {
		double[] testX = {9,8,7};
		double[] resultX = {7,8,9};
		double[] testY = {6,5,4};
		double[] resultY = {4,5,6};
		MySorter.sortInPlace(testX, MySorter.OrderDirection.DECREASING, testY);
		assertArrayEquals(resultX, testX, 0.0);
		assertArrayEquals(resultY, testY, 0.0);

	}

	@Test 
	public void testDecreasing() {
		double[] resultX = {9,8,7};
		double[] testX = {7,8,9};
		double[] resultY = {6,5,4};
		double[] testY = {4,5,6};
		MySorter.sortInPlace(testX, MySorter.OrderDirection.DECREASING, testY);
		assertArrayEquals(resultX, testX, 0.0);
		assertArrayEquals(resultY, testY, 0.0);
	}
	
}
