package 第四章;
import java.io.*;
import java.util.Scanner;
public class 第四章01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		if(i<31) {
			i=Math.pow(2, i);
			System.out.printf("答案:%.0f",i);
		}else
			System.out.print("錯誤");
	}

}
