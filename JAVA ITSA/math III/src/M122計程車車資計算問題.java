import java.io.*;
import java.util.Scanner;
public class M122�p�{������p����D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J���ؼ�:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int t = 70;
		if(m>1500) {
			t=t+((m-1500)/500+1)*5;
			System.out.print("�O��:"+t);
		}else
			System.out.print("�O��:"+t);
	}

}
