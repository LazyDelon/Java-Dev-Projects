package 第五章;
import java.io.*;
import java.util.Scanner;
public class 第五章08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入性別:1.男生2.女生");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.print("請輸入身高:");
			int t = sc.nextInt();
			System.out.print("標準體重:"+(t-80)*0.7);
			break;
		case 2:
			System.out.print("請輸入身高:");
			int g = sc.nextInt();
			System.out.print("標準體重:"+(g-70)*0.6);
			break;
		}
	}

}
