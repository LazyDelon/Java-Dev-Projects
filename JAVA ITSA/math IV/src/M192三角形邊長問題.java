import java.io.*;
import java.util.Scanner;
public class M192�T����������D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J���:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = 0;
		if(x>y) {
			a=x;
			x=y;
			y=a;
		}
		if(x>z) {
			a=x;
			x=z;
			z=a;
		}
		if(y>z) {
			a=y;
			y=z;
			z=a;
		}
		if(z<x+y) {
			System.out.print("����");
			
		}else if(z>=x+y) {
			System.out.print("������");
		}
	}

}
