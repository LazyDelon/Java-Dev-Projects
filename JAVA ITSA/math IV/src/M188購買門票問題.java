import java.io.*;
import java.util.Scanner;
public class M188�ʶR�������D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�ʲ��i��:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x>=100) {
			System.out.println("������"+x*400*0.6);
		}else if(x>=30) {
			System.out.println("���C��"+x*400*0.7);
		}else if(x>=20) {
			System.out.println("���K��"+x*400*0.8);
		}else if(x>=10) {
			System.out.println("���E��"+x*400*0.9);
		}else
			System.out.println("�L����"+x*400);
	}

}
