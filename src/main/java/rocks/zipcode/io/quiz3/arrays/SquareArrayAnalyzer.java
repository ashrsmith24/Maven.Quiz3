package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        // create a new array to hold the squared values of the input
        int numberOfValueInArray = input.length;
        Integer[] inputSquared = new Integer[numberOfValueInArray];
        for (int i = 0; i < inputSquared.length; i++) {
            Integer currentValue = inputSquared[i];
            inputSquared[i] = currentValue * currentValue;
            {

                if (inputSquared == squaredValues) {
                    return true;
                }
            }

        }
        return false;
    }
}