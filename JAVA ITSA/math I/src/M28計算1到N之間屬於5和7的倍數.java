import java.io.*;
import java.util.Scanner;

public class M28�p��1��N�����ݩ�5�M7������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n=0;
		int b=0;
		int total = 1;
		if(a>=35) {//100
			b=a/35;//b=2
			while(total<=b) {
				n=35*total;
				total++;
				System.out.println(n);
			}
		}else if(a<35) {
			System.out.print("Error");
		}

	}

}
