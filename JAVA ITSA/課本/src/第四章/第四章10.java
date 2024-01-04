package 第四章;
import java.io.*;
import java.util.Scanner;

public class 第四章10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入攝氏溫度:");
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		double f = 0;
		f=c*9/5+32;
		System.out.println("答案:"+f);
	}

}
