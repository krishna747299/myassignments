package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		 Arrays.sort(data);
		 int datalen = data.length;
		 System.out.println("2nd Largest Number:"+data[datalen-2]);
	}

}
