import java.io.*;
import java.util.Scanner;
public class M179�̤j���]�Ƴ̤p������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		System.out.print("�п�J�Ʀr:");
		int x = sc.nextInt();
		System.out.print("�п�J�Ʀr:");
		int y = sc.nextInt();
		System.out.print("�п�J�Ʀr:");
		int z = sc.nextInt();
		for(int i = w;i>1;i--) {
			for(i=x;i>1;i--) {
				for(i=y;i>1;i--) {
					for(i=z;i>1;i--) {
						if(w%i==0||x%i==0||y%i==0||z%i==0) {
							System.out.print("�̤j���]��:"+i);
							break;
						}
					}
				}
			}
		}
	}

}
