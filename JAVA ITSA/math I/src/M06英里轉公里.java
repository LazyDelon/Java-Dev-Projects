import java.io.*;
import java.util.Scanner;
public class M06英里轉公里 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入英里:");
		Scanner sc = new Scanner(System.in);
		double mile = sc.nextDouble();
		double km;
		km=1.6*mile;
		System.out.print(km+"公里");

	}

}
