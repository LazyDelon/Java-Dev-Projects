import java.io.*;
import java.util.Scanner;

public class hey {

	public static void main(String[] args) {
		System.out.print("�п�ܩʧO:�k�Τk");
		Scanner sc = new Scanner(System.in);
		String gender = sc.next();
		switch(gender) {
		case "�k":
			System.out.print("�п�J����(����):");
			int tall = sc.nextInt();
			System.out.println("�A���з��魫:" + (tall-80)*0.7);break;
		case "�k":
			System.out.print("�п�J����(����):");
			tall = sc.nextInt();
			System.out.println("�A���з��魫:" + (tall-70)*0.6);break;
		}
	}

}
