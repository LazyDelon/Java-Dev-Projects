import java.io.*;
import java.util.Scanner;
public class M250�T���o�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�����o�c�e�q:");
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		System.out.print("�����C�����o��:");
		double n = sc.nextDouble();
		double h;
		h=m/n/60;
		System.out.printf("�i�H���:%.1f",h);
	}

}
