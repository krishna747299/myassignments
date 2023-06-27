package week1.day2;

public class PrintDuplicatesinArray {
	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20,14};

		// get the length of the array
		int arrlen = arr.length;

		// declare an int variable named count
		    int count;

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arrlen-1; i++) {
			// assign 0 to count 
			count = 0;
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int j = i+1; j < arrlen; j++) {
				if (arr[i]==arr[j]) {
					count++;
//					System.out.println("Duplicate Values are:"+arr[i]);

				}
				
			}
			if (count!=0) {
				System.out.println("Duplicate Values are:"+arr[i]+" Frequency is "+count);}
		}


	}

}
