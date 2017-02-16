// An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  (you may also see it written as ).

// Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

// Input Format

// The first line contains an integer,  (the number of integers in ). 
// The second line contains  space-separated integers describing .

// Constraints

// 1 <= N <= 10^3
// 1 <= A(i) <= 10^4

// Output Format

// Print all  integers in  in reverse order as a single line of space-separated integers.

import java.io.*;
import java.util.*;

class ArraysDS{

	 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for(int j = n-1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }
    }
	
}