/**
 * 
 */

/**
 * Applies the linear scan strategy to counting the number of negative
 * values in an array.
 * @author Nikhil Patel
 */
public class CountNegatives {

    /**
     * Returns the number of negative values in the given array.
     * @return returns amount of negative values in array. 
     * @param a represents the array. 
     */
    public static int countNegatives(int[]a) {
    	
    	int negativeCount = 0; //initializes counter to 0
    	
    	for (int i : a) {
    		if (i < 0) {
    			negativeCount ++; //counter increases by 1 if negative value is found
    		}
    	}
    	
        return negativeCount; // returns value of the counter
    }
}
