import java.io.*;
import java.util.Scanner;
public class M107�P�O��ư��D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		for(int b=2;b<a;b++) {
			if(a%b==0) {
				System.out.print("�D���");
				break;
			}else if(a/b==1) {
				System.out.print("���");
				break;
			}
		}
	}

}
