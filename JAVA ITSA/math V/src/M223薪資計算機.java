import java.io.*;
import java.util.Scanner;
public class M223�~��p��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J���u�H��:");
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		for(int i=0;i<P;i++) {
			System.out.print("�п�J�_�l�p��:");
			int H = sc.nextInt();
			System.out.print("�п�J�_�l����:");
			int M = sc.nextInt();
			System.out.print("�п�J�����p��:");
			int h = sc.nextInt();
			System.out.print("�п�J��������:");
			int m = sc.nextInt();
			System.out.print("�п�J���~:");
			int a = sc.nextInt();
			System.out.print("�п�J�u�@�Ѽ�:");
			int d = sc.nextInt();
			h=h-H;
			if(m-M>0) {
				h=h+1;
			}
			int total;
			total=h*a*d;
			System.out.println("�`�@:"+total);
		}
	}

}
