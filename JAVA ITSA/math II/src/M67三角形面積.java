import java.io.*;
import java.util.Scanner;
public class M67三角形面積 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入座標AB:");
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.print("請輸入座標CD:");
		double x2 = sc.nextDouble();
		double y2 =sc.nextDouble();
		double x=0;
		double y=0;
		double a=0;
		double b;
		double m;
		m=(y2-y1)/(x2-x1);
		b=y2-m*x2;
		y=m*x+b;
		if(x==0) {
			y=m*x+b;
			a=y;
		}
		if(y==0) {
			x=(y-b)/m;
		}
		m=a*x/2;
		System.out.println(m);
		
	}

}
