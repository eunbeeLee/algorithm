package hackerrank;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 *
 * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some.
 * There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend,
 * and he wants to maximize the number of toys he buys with this money.
 *
 * Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy? For example,
 * if prices = [1,2,3,4] and Mark has k = 7 to spend, he can buy items [1,2,3] for 6, or [3,4] for 7 units of currency. He would choose the first group of 3 items.
 */

public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        int toyCount = 0;

        quickSort(prices, 0, prices.length-1);

        for (int price : prices){
            int bubget = k - price;

            if (bubget < 0){
                break;
            }

            toyCount ++;
            k = bubget;
        }

        return toyCount;
    }

    static void quickSort(int[] unSortedArr, int start, int end){
        int part2 = dividePartition(unSortedArr, start, end);

        if (start < part2 -1){
            quickSort(unSortedArr, start, part2 - 1);
        }
        if (part2 < end){
            quickSort(unSortedArr, part2, end);
        }
    }

    static int dividePartition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];

        while (start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start <= end){
                swap(arr, start, end);
                start ++;
                end--;
            }
        }
        return start;
    }

    static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }


}
