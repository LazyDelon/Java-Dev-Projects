import java.io.*;
import java.util.Scanner;

public class M38判斷3整數是否成為三角形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入三個整數:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d=0;
		if(a<b) {
			d=a;
			a=b;
			b=d;
		}
		if(a<c) {
			d=a;
			a=c;
			c=d;
		}
		if(b<c) {
			d=b;
			b=c;
			c=d;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		if(c<(b+a)) {
			System.out.print("成立");
		}else if(c>=(b+a)) {
			System.out.print("不成立");
		}

	}

}
