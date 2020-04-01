package hackerrank;

/**
 * https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 *
 *
 */
public class SortingBubbleSort {

    static void countSwaps(int[] a) {
        int swapCount = 0;
        boolean sortedFlag = false;

        while(!sortedFlag){
            sortedFlag = true;
            for (int i = 0 ; i < a.length-1; i++) {
                if (a[i] > a[i+1]){
                    int bigNumner = a[i];
                    a[i] = a[i+1];
                    a[i+1] = bigNumner;
                    swapCount++;
                    sortedFlag = false;
                }
            }

        }
        printResult(swapCount, a);
    }
    static void printResult(int swapCount, int[] sortedArr){

        System.out.println("Array is sorted in "+ swapCount +" swaps.");

        System.out.println("First Element: " + sortedArr[0]);
        System.out.println("Last Element: " + sortedArr[sortedArr.length-1]);
    }

}
