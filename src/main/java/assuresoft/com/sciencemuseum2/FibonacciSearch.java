package assuresoft.com.sciencemuseum2;
import java.util.*;

public class FibonacciSearch {

    private static int checkValidLocation(int indexToCheck, int maxIndex) {
        return Math.min(indexToCheck, maxIndex);
    }

    public static int fibonacciSearch(List<Integer> list, int searchItem) {
        int listSize = list.size();
        int penultimateFibonacci = 0;
        int previousFibonacci = 1;
        int currentFibonacci = penultimateFibonacci + previousFibonacci;

        // Find the fibonacci number that is equal or major to the array's size
        while (currentFibonacci < listSize) {
            penultimateFibonacci = previousFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = penultimateFibonacci + previousFibonacci;
        }

        int eliminatedFront = -1;

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
                else
                    return index;
        }
            if (previousFibonacci == 1 && list.get(listSize - 1) == searchItem)
                return listSize - 1;

        return -1;
    }
}
