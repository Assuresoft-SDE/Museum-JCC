package assuresoft.com.sciencemuseum2;

import java.util.*;

public class FibonacciSearch {
    private static final int NOT_FOUND = -1;
    private static final int PENULTIMATE_FIBONACCI = 0;
    private static final int PREVIOUS_FIBONACCI = 1;
    /**
     * Returns a valid index location within the list based on the given index and the maximum index.
     *
     * @param indexToCheck  (int) The index to check.
     * @param maxIndex      (int) The maximum index allowed.
     * @return              (int) The valid index location.
     */
    private static int getValidLocation(int indexToCheck, int maxIndex) {
        return Math.min(indexToCheck, maxIndex);
    }

    /**
     * Searches for a specified item in a list using Fibonacci search algorithm.
     *
     * @param list          (List<Integer>)The list to be searched.
     * @param searchItem    (int) The item to search for.
     * @return              (int) The index of the searchItem in the list if it is found, otherwise -1.
     */
    public static int fibonacciSearch(List<Integer> list, int searchItem) {
        int listSize = list.size();
        int penultimateFibonacci = PENULTIMATE_FIBONACCI;
        int previousFibonacci = PREVIOUS_FIBONACCI;
        int currentFibonacci = penultimateFibonacci + previousFibonacci;

        // Find the fibonacci number that is equal or major to the array's size
        while (currentFibonacci < listSize) {
            penultimateFibonacci = previousFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = penultimateFibonacci + previousFibonacci;
        }

        int eliminatedFront = NOT_FOUND;

        while (currentFibonacci > 1) {
            int index = getValidLocation(eliminatedFront + penultimateFibonacci, listSize - 1);

            if (list.get(index) < searchItem) {
                currentFibonacci = previousFibonacci;
                previousFibonacci = penultimateFibonacci;
                penultimateFibonacci = currentFibonacci - previousFibonacci;
                eliminatedFront = index;
            }
            else if (list.get(index) > searchItem) {
                currentFibonacci = penultimateFibonacci;
                previousFibonacci = previousFibonacci - penultimateFibonacci;
                penultimateFibonacci = currentFibonacci - previousFibonacci;
            }
            else {
                return index;
            }
        }

        if (previousFibonacci == PREVIOUS_FIBONACCI && list.get(listSize - 1) == searchItem) {
            return listSize - 1;
        }

        return NOT_FOUND;
    }
}
