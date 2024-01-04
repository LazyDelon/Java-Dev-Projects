import java.io.*;
import java.util.Scanner;
public class M16判斷座標是否在圓形的範圍內 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入X,Y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		double z = 0;
		z = Math.pow(x*x + y*y, 0.5);
		if(z<=100) {
			System.out.print("inside");
		}else if(z>100) {
			System.out.print("outside");
		}

	}

}
