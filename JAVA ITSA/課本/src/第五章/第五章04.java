package �Ĥ���;
import java.io.*;
import java.util.Scanner;
public class �Ĥ���04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a+">"+b);
		}else if(a<b) {
			System.out.println(a+"<"+b);
		}
		System.out.print("�п�ܥ[:1    ��:2   ��: 3   ��:4");
		int c = sc.nextInt();
		switch(c) {
			case 1:
				System.out.print(a+"+"+b+"="+a+b);
				break;
			case 2:
				System.out.print(a+"-"+b+"="+(a-b));
				break;
			case 3:
				System.out.print(a+"*"+b+"="+a*b);
				break;
			case 4:
				System.out.print(a+"/"+b+"="+a/b);
				break;
		}
	}

}
