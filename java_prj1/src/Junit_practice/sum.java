package Junit_practice;

public class sum {
	int sum =0;
	public int getSum(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
