package week1.day1;

public class FibbinocciSeries {
	public static void main(String[] args) {
	 int firstNum = 0;
	 int secondNum = 1;
	 int sum = 0;
	 for (int i = 0; i <= 12; i++) {
		sum = sum + firstNum;
		firstNum = secondNum;
		secondNum = sum;
		System.out.println(sum);
		
	}
		
	}

}
