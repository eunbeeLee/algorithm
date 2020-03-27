package hackerrank;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 * [Function Description]
 * Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.
 *
 * hourglassSum has the following parameter(s):
 * arr: an array of integers
 *
 * hourglass defination
 *  a b c
 *   d
 * e f g
 *
 * [Input Format]
 * Each of the 6 lines of inputs arr[i] contains 6 space-separated integers arr[i][j] .
 *
 *[Output Format]
 * Print the largest (maximum) hourglass sum found in arr.
 */
public class TwoDArray {

    static int hourglassSum(int[][] lines) {
        int maxSum = 0;
        
        int[][] hourGlassSum = new int[4][4];

        for (int[] line : lines) {

            for (int number : line) {

            }
        }
        return maxSum;
    }

}
