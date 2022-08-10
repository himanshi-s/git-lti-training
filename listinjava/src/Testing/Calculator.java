package Testing;

import java.util.Scanner;

public class Calculator {

	public int fact(int n) {
		int res=1;
		for(int i=2;i<=n;i++)
			res=res*i;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		Calculator obj = new Calculator();
		System.out.println(obj.fact(num));
	}

}
