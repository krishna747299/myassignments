package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		  int num =29;
		  int count = 0;
		  for (int i = 2; i< num; i++) {
			  if (num%i==0) 
			  {
				  count++;
				  break;
			  }
			
		}
		  if (count==0)
			  System.out.println("Its Prime Number");
		  else
			  System.out.println("its not Prime Number");
	}
	

}
