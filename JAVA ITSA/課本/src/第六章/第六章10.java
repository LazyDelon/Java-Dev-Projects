package �Ĥ���;
import java.io.*;
import java.util.Scanner;
public class �Ĥ���10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("�п�J�Ʀr:");
		int n = sc.nextInt();
		double total = 0;
		for(x=x+1;x<x+n+1;x++) {
			for(int m=n;m>=1;m--) {
				total = total+x/m;
				System.out.print("����:"+total);
			}
		}
		
	}

}
