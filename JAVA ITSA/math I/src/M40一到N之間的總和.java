import java.io.*;
import java.util.Scanner;
public class M40�@��N�������`�M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�@�ӥ����:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 1;
		int total = 0;
		while(a<x) {
			total=total+a;
			System.out.print(a);
			System.out.print("+");
			a++;
		}
		total=total+a;
		System.out.print(a+"="+total);

	}

}
