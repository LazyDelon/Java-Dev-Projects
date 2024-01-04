import java.io.*;
import java.util.Scanner;
public class M04計算總和乘積差商和餘數 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("請輸入數字:");
		int b = sc.nextInt();
		System.out.println("總和:"+ (a+b));
		System.out.println("乘積:"+ (a*b));
		System.out.println("差:"+ (a-b));
		System.out.printf("商%d...%d",a/b,a%b);
		
		

	}

}
