package 第六章;
import java.io.*;
import java.util.Scanner;	
public class 第六章03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("請輸入數字:");
		int y = sc.nextInt();
		int total = 0;
		if(x>y) {
			for(int z = y;z<x+1;z++) {
				total=total+z;
			}
		}else if(x<y) {
			for(int z = x;z<y+1;z++) {
				total=total+z;
			}
		}
		System.out.print(total);
	}

}
