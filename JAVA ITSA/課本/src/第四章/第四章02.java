package �ĥ|��;
import java.io.*;
import java.util.Scanner;
public class �ĥ|��02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�������B:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 0;
		if(x>=10) {
			y=x/10;
			x=x-y*10;
			System.out.println("�Q��:"+y);
		}
		if(x>=5) {
			y=x/5;
			x=x-y*5;
			System.out.println("����:"+y);
		}
		System.out.println("�@��:"+x);
	}

}
