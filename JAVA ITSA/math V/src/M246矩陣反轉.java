import java.io.*;
import java.util.Scanner;
public class M246�x�}���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("�п�J�}�C���C�B��:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x[][]= new int[a][b];
		System.out.print("�п�J�}�C����:");
		for(int i = 0;i<a;i++) {
			for(int j=0;j<b;j++) {
				int m=sc.nextInt();
				x[a][b]=m;
			}
			System.out.println();
		}
		for(int i =0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(x[a][b]+"  ");
			}
			System.out.println();
		}
	}

}
