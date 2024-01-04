import java.io.*;
import java.util.Scanner;
public class M192三角形邊長問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入邊長:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = 0;
		if(x>y) {
			a=x;
			x=y;
			y=a;
		}
		if(x>z) {
			a=x;
			x=z;
			z=a;
		}
		if(y>z) {
			a=y;
			y=z;
			z=a;
		}
		if(z<x+y) {
			System.out.print("成立");
			
		}else if(z>=x+y) {
			System.out.print("不成立");
		}
	}

}
