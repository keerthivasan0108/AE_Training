package Junit_practice;

public class Sum_Even {

	public int sum_of_digits(int num) {
		// TODO Auto-generated method stub
		 int sum = 0,rem,n=num;
		while(num > 0) {
			rem = num % 10;
			if(rem % 2 == 0) {
				sum = sum + rem;
			}
			
			num = num / 10;
		}
		System.out.println("Sum of even digits of "+n+ " = "+sum);
		return sum;
	}

}
