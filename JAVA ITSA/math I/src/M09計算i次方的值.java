import java.io.*;
import java.util.Scanner;
public class M09�p��i���誺�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		if(i<=31) {
			double a;
			a=Math.pow(2, i);
			System.out.printf("����:%.0f",a);
		}else
			System.out.println("ERROR");
	}

}
