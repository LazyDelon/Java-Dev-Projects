package �Ĥ���;
import java.io.*;
import java.util.Scanner;
public class �Ĥ���08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�ʧO:1.�k��2.�k��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.print("�п�J����:");
			int t = sc.nextInt();
			System.out.print("�з��魫:"+(t-80)*0.7);
			break;
		case 2:
			System.out.print("�п�J����:");
			int g = sc.nextInt();
			System.out.print("�з��魫:"+(g-70)*0.6);
			break;
		}
	}

}
