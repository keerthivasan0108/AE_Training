package pkg1;

import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[5][2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int t = sc.nextInt();
			mat[i][0] =t;
		}
		
		for(int i=0;i<5;i++) {
			int temp = 1;
			for(int j=1;j<=mat[i][0];j++) {
				temp = temp*j;
			}
			mat[i][1] = temp;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(mat[i][0]+" "+mat[i][1]);
		}
		sc.close();
	}
	
	

}
