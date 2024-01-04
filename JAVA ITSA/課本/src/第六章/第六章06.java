package 第六章;
import java.io.*;
import java.util.Scanner;
public class 第六章06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("請輸入數字:");
		int y = sc.nextInt();
		for(int z = 1;z<x+1;z++) {
			
			for(int a = 1;a<y;a++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
