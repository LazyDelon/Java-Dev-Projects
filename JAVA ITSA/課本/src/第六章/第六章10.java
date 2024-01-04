package 第六章;
import java.io.*;
import java.util.Scanner;
public class 第六章10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("請輸入數字:");
		int n = sc.nextInt();
		double total = 0;
		for(x=x+1;x<x+n+1;x++) {
			for(int m=n;m>=1;m--) {
				total = total+x/m;
				System.out.print("答案:"+total);
			}
		}
		
	}

}
