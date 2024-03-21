package assuresoft.com.sciencemuseum2;

import java.util.*;

public class FibonacciSearch<T extends Comparable<T>>{
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
     * @param list          (List<T> list) The list to be searched. Must be sorted in ascending order.
     * @param searchItem    (int) The item to search for.
     * @param <T>           The type of elements in the list, which must implement the Comparable interface.
     * @return              (int) The index of the searchItem in the list if it is found, otherwise -1.
     */
    public static <T extends Comparable<T>> int fibonacciSearch(List<T> list,T searchItem) {
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
            /**
             * "compareTo" will compare string in alphabetical order
             * In this case:
             *  similar to "list.get(index) < searchItem", when the list item is less than the searchItem
             *  compareTo will return a negative number
             */
            if (list.get(index).compareTo(searchItem) < 0) {
                currentFibonacci = previousFibonacci;
                previousFibonacci = penultimateFibonacci;
                penultimateFibonacci = currentFibonacci - previousFibonacci;
                eliminatedFront = index;
            }
            /**
             * In this case:
             *  similar to "list.get(index) > searchItem", when the list item is greater than the searchItem
             *  compareTo will return a positive number
             */
            else if (list.get(index).compareTo(searchItem) > 0) {
                    currentFibonacci = penultimateFibonacci;
                    previousFibonacci = previousFibonacci - penultimateFibonacci;
                    penultimateFibonacci = currentFibonacci - previousFibonacci;
            }
            /**
             * In this case:
             *  if the list item is equal than the searchItem
             *  compareTo will return zero
             */
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
