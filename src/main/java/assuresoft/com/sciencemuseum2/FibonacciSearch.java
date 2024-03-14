package assuresoft.com.sciencemuseum2;
import java.util.*;

public class FibonacciSearch {

    public static int checkValidLocation(int indexToCheck, int maxIndex) {
        return Math.min(indexToCheck, maxIndex);
    }

    public static int fibonacciSearch(List<Integer> list, int x) {
        int n = list.size();
        int twoFibonaccisAgo = 0;
        int previousFibonacci = 1;
        int currentFibonacci = twoFibonaccisAgo + previousFibonacci;

        while (currentFibonacci < n) {
            twoFibonaccisAgo = previousFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = twoFibonaccisAgo + previousFibonacci;
        }

        int eliminatedFront = -1;

        while (currentFibonacci > 1) {
            int i = checkValidLocation(eliminatedFront + twoFibonaccisAgo, n - 1);
            if (list.get(i) < x) {
                currentFibonacci = previousFibonacci;
                previousFibonacci = twoFibonaccisAgo;
                twoFibonaccisAgo = currentFibonacci - previousFibonacci;
                eliminatedFront = i;
            }
            else if (list.get(i) > x) {
                currentFibonacci = twoFibonaccisAgo;
                previousFibonacci = previousFibonacci - twoFibonaccisAgo;
                twoFibonaccisAgo = currentFibonacci - previousFibonacci;
            }
            else
                return i;
        }

        if (previousFibonacci == 1 && list.get(n - 1) == x)
            return n - 1;

        return -1;
    }

}
