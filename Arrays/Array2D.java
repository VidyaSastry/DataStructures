// Given a  2D Array, :

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

// a b c
//   d
// e f g
// There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

// Task 
// Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

// Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

// Input Format

// There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

// Constraints

// Output Format

// Print the largest (maximum) hourglass sum found in .

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19
// Explanation

//  contains the following hourglasses:

// 1 1 1   1 1 0   1 0 0   0 0 0
//   1       0       0       0
// 1 1 1   1 1 0   1 0 0   0 0 0

// 0 1 0   1 0 0   0 0 0   0 0 0
//   1       1       0       0
// 0 0 2   0 2 4   2 4 4   4 4 0

// 1 1 1   1 1 0   1 0 0   0 0 0
//   0       2       4       4
// 0 0 0   0 0 2   0 2 0   2 0 0

// 0 0 2   0 2 4   2 4 4   4 4 0
//   0       0       2       0
// 0 0 1   0 1 2   1 2 4   2 4 0
// The hourglass with the maximum sum () is:

// 2 4 4
//   2
// 1 2 4

import java.io.*;
import java.util.*;

class Array2D{
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        System.out.println(maxSum(arr));
    }
        
    public static int maxSum(int[][] arr){
        int max_sum = Integer.MIN_VALUE;
        int prev_sum = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){  
                if(i+2 < 6 && j+2 < 6)
                    prev_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(max_sum < prev_sum)
                    max_sum = prev_sum;
            }
        }
        return max_sum;
    }
}