import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Unit test class to test the methods of the ParallelSumThreads class.
 *
 */
public class ParallelSumThreadsTest {

	@Test
	/**
	 * Unit test for the createRandomArray method. Here we created a sorted array
	 * and verify that the created array is different from the created array.
	 */
	public void test1() {

		int[] arrayOfNumbers = { 1, 2, 3, 4, 5, 6 };
		assertNotEquals(arrayOfNumbers, ParallelSumThreads.createRandomArray(6));

	}

	@Test
	/**
	 * Unit test for the concurrentSum class in which we provide and array for which
	 * we know the sum of its values and verify if the method returns the correct
	 * sum amount
	 */
	public void test2() {

		int[] arrayOfNumbers = { 1, 1, 2, 2, 3, 3 };
		assertEquals(12, ParallelSumThreads.concurrentSum(arrayOfNumbers, 4));

	}

}
