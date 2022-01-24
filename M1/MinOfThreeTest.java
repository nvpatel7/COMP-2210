import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinOfThreeTest {

	/** test for min1. **/
	@Test public void min1Test() {
		int expected = 1;
	    int actual = MinOfThree.min1(3, 1, 2);
	    assertEquals(expected, actual);
	   }
	
	/** test for min1. **/
	@Test public void min2Test() {
		int expected = 1;
	    int actual = MinOfThree.min2(3, 1, 2);
	    assertEquals(expected, actual);
	   }

}