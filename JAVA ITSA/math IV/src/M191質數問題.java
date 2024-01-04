import java.io.*;
import java.util.Scanner;
public class M191質數問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i =2;i<x;i++) {
			if(x/i==1) {
				System.out.print("質數");
				break;
			}else if(x%i==0) {
				System.out.print("非質數");
				break;
			}
		}
	}

}
