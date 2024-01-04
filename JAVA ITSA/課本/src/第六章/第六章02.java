package 第六章;
import java.io.*;
import java.util.Scanner;
public class 第六章02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a = 1;a<n+1;a++) {
			System.out.println(a*a);
		}
	}

}
