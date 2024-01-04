import java.io.*;
import java.util.Scanner;
public class M250汽車油耗 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("此車油箱容量:");
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		System.out.print("此車每分鐘油耗:");
		double n = sc.nextDouble();
		double h;
		h=m/n/60;
		System.out.printf("可以行使:%.1f",h);
	}

}
