import java.io.*;
import java.util.Scanner;
public class M159�T��D�T���έ��n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J���:");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.print("�п�J���:");
		double y = sc.nextDouble();
		System.out.print("�п�J���:");
		double z = sc.nextDouble();
		double S = 0;
		double s =(x+y+z)/2;
		S=s*(s-x)*(s-y)*(s-z);
		double a = S;
		S=Math.pow(S, 0.5);
		System.out.print("���n:"+S);
	}

}
