import java.io.*;
import java.util.Scanner;
public class M184�p��̤j���]�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x==0&&y==0) {
			System.out.print("���~!!");
		}else
			for(int i = x;i>0;i--) {
				if(x%i==0 && y%i==0) {
					System.out.print("�̤j���]��:"+i);
					break;
			}
			
		}
	}

}
