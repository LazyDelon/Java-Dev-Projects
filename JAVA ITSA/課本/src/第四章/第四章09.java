package 第四章;
import java.io.*;
import java.util.Scanner;
public class 第四章09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.print("偶數");
		}else
			System.out.print("基數");
	}

}
