package �Ĥ���;
import java.io.*;
import java.util.Scanner;
public class �Ĥ���09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�o��:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("�п�J�U��:");
		int b = sc.nextInt();
		System.out.print("�п�J�x�O:");
		int c = sc.nextInt();
		System.out.print("�п�J�ۺI:");
		int d = sc.nextInt();
		System.out.print("�п�J���~:");
		int e = sc.nextInt();
		int x = 0;
		x = (a*1+b*2+c*2+d*2)-(e*2);
		if(x>44) {
			System.out.print("A�Ųy��");
		}else if(x>34) {
			System.out.print("B�Ųy��");
		}else if(x>24) {
			System.out.print("C�Ųy��");
		}else
			System.out.print("D�Ųy��");
	}

}
