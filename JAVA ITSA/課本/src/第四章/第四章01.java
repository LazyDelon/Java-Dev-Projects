package �ĥ|��;
import java.io.*;
import java.util.Scanner;
public class �ĥ|��01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		if(i<31) {
			i=Math.pow(2, i);
			System.out.printf("����:%.0f",i);
		}else
			System.out.print("���~");
	}

}
