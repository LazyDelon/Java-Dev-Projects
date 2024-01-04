package 第五章;
import java.io.*;
import java.util.Scanner;
public class 第五章09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入得分:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("請輸入助攻:");
		int b = sc.nextInt();
		System.out.print("請輸入籃板:");
		int c = sc.nextInt();
		System.out.print("請輸入抄截:");
		int d = sc.nextInt();
		System.out.print("請輸入失誤:");
		int e = sc.nextInt();
		int x = 0;
		x = (a*1+b*2+c*2+d*2)-(e*2);
		if(x>44) {
			System.out.print("A級球員");
		}else if(x>34) {
			System.out.print("B級球員");
		}else if(x>24) {
			System.out.print("C級球員");
		}else
			System.out.print("D級球員");
	}

}
