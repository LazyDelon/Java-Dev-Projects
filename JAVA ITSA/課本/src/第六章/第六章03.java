package �Ĥ���;
import java.io.*;
import java.util.Scanner;	
public class �Ĥ���03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("�п�J�Ʀr:");
		int y = sc.nextInt();
		int total = 0;
		if(x>y) {
			for(int z = y;z<x+1;z++) {
				total=total+z;
			}
		}else if(x<y) {
			for(int z = x;z<y+1;z++) {
				total=total+z;
			}
		}
		System.out.print(total);
	}

}
