package �Ĥ���;
import java.io.*;
import java.util.Scanner;
public class �Ĥ���05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�ܹϫ�:  1:�T����   2:�x��   3:���");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
			case 1:
				System.out.println("�п�J��:");
				int b = sc.nextInt();
				System.out.println("�п�J��:");
				int c = sc.nextInt();
				System.out.println("���n:"+b*c/2);
				break;
			case 2:
				System.out.println("�п�J�e:");
				int x = sc.nextInt();
				System.out.println("�п�J��:");
				int y = sc.nextInt();
				System.out.println("���n:"+x*y);
				break;
			case 3:
				System.out.println("�п�J�W��:");
				int e = sc.nextInt();
				System.out.println("�п�J�U��:");
				int f = sc.nextInt();
				System.out.println("�п�J��:");
				int g = sc.nextInt();
				System.out.println("���n:"+(e+f)*g/2);
				break;
				
		}
	}

}
