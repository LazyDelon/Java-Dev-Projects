package 第五章;
import java.io.*;
import java.util.Scanner;
public class 第五章05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請選擇圖型:  1:三角形   2:矩形   3:梯形");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
			case 1:
				System.out.println("請輸入底:");
				int b = sc.nextInt();
				System.out.println("請輸入高:");
				int c = sc.nextInt();
				System.out.println("面積:"+b*c/2);
				break;
			case 2:
				System.out.println("請輸入寬:");
				int x = sc.nextInt();
				System.out.println("請輸入高:");
				int y = sc.nextInt();
				System.out.println("面積:"+x*y);
				break;
			case 3:
				System.out.println("請輸入上底:");
				int e = sc.nextInt();
				System.out.println("請輸入下底:");
				int f = sc.nextInt();
				System.out.println("請輸入高:");
				int g = sc.nextInt();
				System.out.println("面積:"+(e+f)*g/2);
				break;
				
		}
	}

}
