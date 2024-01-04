import java.io.*;
import java.util.Scanner;
public class M39判斷是何種三角形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入三角形邊長:");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d=0;
		if(a>b)
			d=a;
			a=b;
			b=d;
		if(a>c)
			d=a;
			a=c;
			c=d;
		if(b>c)
			d=b;
			b=c;
			c=d;
		if(c*c == (a*a)+(b*b)) {
			System.out.print("直角三角形");
		}else if(c*c> (a*a)+(b*b)) {
			System.out.print("鈍角三角形");
		}else 
			System.out.print("銳角三角形");
		

	}

}
