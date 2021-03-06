// A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example, if left rotations are performed on array , then the array would become .

// Given an array of  integers and a number, , perform  left rotations on the array. Then print the updated array as a single line of space-separated integers.

// Input Format

// The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform). 
// The second line contains  space-separated integers describing the respective elements of the array's initial state.

// Output Format

// Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.

import java.io.*;
import java.util.*;

class LeftRotation{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[(i+n-d)%n] = scan.nextInt();
 		}
 		
 		for(int ele : arr)
 			System.out.print(ele + " ");
	}
	
}