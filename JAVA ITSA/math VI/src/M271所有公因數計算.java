import java.io.*;
import java.util.Scanner;
public class M271�Ҧ����]�ƭp�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J��ӼƦr:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 1;i<a+1;i++) {
			if(a%i==0 && b%i==0) {
				System.out.print(i+"  ");
			}
		}
	}

}
