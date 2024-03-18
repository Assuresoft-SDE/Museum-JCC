package assuresoft.com.sciencemuseum2;
import java.util.*;

public class FibonacciSearch {
    private static final int NOT_FOUND = -1;
    private static final int PENULTIMATE_FIBONACCI = 0;
    private static final int PREVIOUS_FIBONACCI = 1;

    private static int checkValidLocation(int indexToCheck, int maxIndex) {
        return Math.min(indexToCheck, maxIndex);
    }

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
            int index = checkValidLocation(eliminatedFront + penultimateFibonacci, listSize - 1);
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

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100);
        int x = 85;
        int index = fibonacciSearch(list, x);
        if (index >= 0)
            System.out.print("Found element " + list. get(index) + " at index: " + index);
        else
            System.out.print(x + " isn't present in the list");
    }
}

