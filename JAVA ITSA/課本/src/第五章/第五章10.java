package �Ĥ���;
import java.io.*;
import java.util.Scanner;

public class �Ĥ���10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�u�@�ɼ�:");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		System.out.print("�п�J�T�w���~:");
		int m = sc.nextInt();
		if(h<=60) {
			System.out.printf("�u��:%.0f"+h*m);
		}else if(h<=120) {
			System.out.printf("�u��:%.0f",(60*m+(h-60)*m*1.33));
		}else if(h>120) {
			System.out.printf("�u��:%.0f"+(60*m+60*m*1.33+(h-120)*m*1.66));
		}
	}

}
