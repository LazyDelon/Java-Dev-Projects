import java.io.*;
import java.util.Scanner;
public class M191��ư��D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i =2;i<x;i++) {
			if(x/i==1) {
				System.out.print("���");
				break;
			}else if(x%i==0) {
				System.out.print("�D���");
				break;
			}
		}
	}

}
