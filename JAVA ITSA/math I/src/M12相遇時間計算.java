import java.io.*;
import java.util.Scanner;

public class M12相遇時間計算 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入兩人距離公尺數:");
		Scanner sc = new Scanner(System.in);
		double m = sc.nextInt(); 
		double a = 1-30*2.54*0.01;
		double s = 0;
		s = m/a;
		System.out.printf("%.0f",Math.ceil(s));

	}

}
