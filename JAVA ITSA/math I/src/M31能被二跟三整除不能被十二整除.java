import java.io.*;
import java.util.Scanner;
public class M31能被二跟三整除不能被十二整除 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入正整數:");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		a=n/2;
		b=n/3;
		c=n/6;
		d=n/12;
		n=a+b-c-d;
		System.out.print(n);

	}

}
