import java.io.*;
import java.util.Scanner;
public class M17�̤j���]�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x<y) {
			int d=0;
			d=x;
			x=y;
			y=d;
		}
		for (int a = x; a > 0; a--) {
			if (x % a == 0 && y % a == 0) {
					System.out.println(a);
					break;
				}
			}

	}

}
