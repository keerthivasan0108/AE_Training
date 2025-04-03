package pkg1;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 94382,sum = 0,rem,n=num,i=1;
		while(num > 0) {
			rem = num % 10;
			if(i%2!=0)
				sum = sum + rem;
			
			num = num / 10;
			i++;
		}
		System.out.println("Sum of odd position of "+n+ " = "+sum);
	}

}
