import java.io.*;
import java.util.Scanner;

public class hey {

	public static void main(String[] args) {
		System.out.print("請選擇性別:男或女");
		Scanner sc = new Scanner(System.in);
		String gender = sc.next();
		switch(gender) {
		case "男":
			System.out.print("請輸入身高(公分):");
			int tall = sc.nextInt();
			System.out.println("你的標準體重:" + (tall-80)*0.7);break;
		case "女":
			System.out.print("請輸入身高(公分):");
			tall = sc.nextInt();
			System.out.println("你的標準體重:" + (tall-70)*0.6);break;
		}
	}

}
