import java.io.*;
import java.util.Scanner;
public class M201�ߤ�M�]�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�T���:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=n/100;
		int b=(n-a*100)/10;
		int c=n-a*100-b*10;
		if(n==a*a*a+b*b*b+c*c*c) {
			System.out.print("�O!");
		}
		else
			System.out.print("�_!");
		
	}

}
