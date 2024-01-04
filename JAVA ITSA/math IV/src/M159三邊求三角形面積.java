import java.io.*;
import java.util.Scanner;
public class M159三邊求三角形面積 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入邊長:");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.print("請輸入邊長:");
		double y = sc.nextDouble();
		System.out.print("請輸入邊長:");
		double z = sc.nextDouble();
		double S = 0;
		double s =(x+y+z)/2;
		S=s*(s-x)*(s-y)*(s-z);
		double a = S;
		S=Math.pow(S, 0.5);
		System.out.print("面積:"+S);
	}

}
