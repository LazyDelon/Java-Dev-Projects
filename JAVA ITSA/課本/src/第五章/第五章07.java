package �Ĥ���;
import java.io.*;
import java.util.Scanner;
public class �Ĥ���07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�q�ܤ���:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		if(m>1500) {
			System.out.print("�O��:"+m*0.9*0.79);
		}else if(m>800) {
			System.out.print("�O��:"+m*0.9*0.9);
		}else
			System.out.print("�O��:"+m*0.9);
	}

}
