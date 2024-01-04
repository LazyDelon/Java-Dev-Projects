import java.io.*;
import java.util.Scanner;
public class M01計算梯形面積 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入上底:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("請輸入下底:");
		int b = sc.nextInt();
		System.out.print("請輸入高:");
		int c = sc.nextInt();
		System.out.println("梯形面積:" + (a+b)*c/2);

	}

}