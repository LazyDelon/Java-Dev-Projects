import java.io.*;
import java.util.Scanner;
public class M05計算正方形面積 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入邊長:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.printf("正方形面積:%.1f",a*a);

	}

}
