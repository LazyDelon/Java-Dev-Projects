import java.io.*;
import java.util.Scanner;
public class M201立方和魔數 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入三位數:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=n/100;
		int b=(n-a*100)/10;
		int c=n-a*100-b*10;
		if(n==a*a*a+b*b*b+c*c*c) {
			System.out.print("是!");
		}
		else
			System.out.print("否!");
		
	}

}
