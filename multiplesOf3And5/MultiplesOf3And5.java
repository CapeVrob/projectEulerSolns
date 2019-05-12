package multiplesOf3And5;

public class MultiplesOf3And5 {

	public static void main(String[] args) {
		
		System.out.println((sumMultiplesOf(3,5,1000)));
	}




	public static int sumMultiplesOf(int num, int num2, int maxNum) {
		
		int sumOfMultiples = 0;

		for(int i = 1; i < maxNum; i++) {
			if((i % num) == 0 || (i % num2) == 0) {
				sumOfMultiples += i;
			}
		}
		
		return sumOfMultiples;

	}

}