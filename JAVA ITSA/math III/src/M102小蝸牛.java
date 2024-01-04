import java.io.*;
import java.util.Scanner;
public class M102小蝸牛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入竹竿高度:");
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		System.out.print("請輸入晚上爬多高:");
		double r = sc.nextDouble();
		System.out.print("請輸入白天下降多少:");
		double d = sc.nextDouble();
		double a = 0;
		a=n/(r-d);
		System.out.print(a);
	}

}
