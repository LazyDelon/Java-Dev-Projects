import java.io.*;
import java.util.Scanner;
public class M39�P�_�O��ؤT���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�T�������:");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d=0;
		if(a>b)
			d=a;
			a=b;
			b=d;
		if(a>c)
			d=a;
			a=c;
			c=d;
		if(b>c)
			d=b;
			b=c;
			c=d;
		if(c*c == (a*a)+(b*b)) {
			System.out.print("�����T����");
		}else if(c*c> (a*a)+(b*b)) {
			System.out.print("�w���T����");
		}else 
			System.out.print("�U���T����");
		

	}

}
