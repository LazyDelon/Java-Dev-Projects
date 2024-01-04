package 第四章;
import java.io.*;
import java.util.Scanner;
import java.math.*;
public class 第四章05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入兩人距離:");
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		m=m*100;
		//1s=100cm我
		//1s=30*2.54cm小華
		//每秒贏100-30*2.54
		double s = 0;
		s=m/(100-30*2.54);
		
		System.out.print("答案:"+Math.ceil(s));
		
	}

}
