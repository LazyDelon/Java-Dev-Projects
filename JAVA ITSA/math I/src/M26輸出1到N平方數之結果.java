import java.io.*;
import java.util.Scanner;
public class M26��X1��N����Ƥ����G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		int b=0;
		while(a<=n) {
			b=a*a;			
			System.out.printf("%d*%d=%d\n",a,a,b);
			a++;
		}

	}

}
