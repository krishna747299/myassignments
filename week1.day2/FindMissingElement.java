package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// Here is the input 0 1 2 3 4 5 6-index
		int arr[] = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);
		int cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			//1st logic
			if (i == arr[cnt]) {
				cnt++;
			}
			else {
				System.out.println("Missing Element:"+i);
			}

		}

	}
}