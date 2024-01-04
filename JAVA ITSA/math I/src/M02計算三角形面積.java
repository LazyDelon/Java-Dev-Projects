import java.io.*;
import java.util.Scanner;
public class M02計算三角形面積 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入底");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.print("請輸入高");
		int b = sc.nextInt();
		System.out.println("此三角形面積:" + a*b/2);

	}

}
