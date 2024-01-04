import java.io.*;
import java.util.Scanner;
public class M07計算平方立方 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入正整數:");
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
		System.out.print("平方:" + integer*integer);
		System.out.print("立方:" + integer*integer*integer);

	}

}
