package 第四章;
import java.io.*;
import java.util.Scanner;
public class 第四章03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入被除數:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("請輸入除數:");
		int b = sc.nextInt();
		int c=0;
		c=a/b;
		System.out.print("商:"+c);
		c=a%b;
		System.out.print("餘數"+c);
	}

}
