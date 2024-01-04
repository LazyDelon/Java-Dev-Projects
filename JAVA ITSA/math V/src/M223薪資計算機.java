import java.io.*;
import java.util.Scanner;
public class M223薪資計算機 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入員工人數:");
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		for(int i=0;i<P;i++) {
			System.out.print("請輸入起始小時:");
			int H = sc.nextInt();
			System.out.print("請輸入起始分鐘:");
			int M = sc.nextInt();
			System.out.print("請輸入結束小時:");
			int h = sc.nextInt();
			System.out.print("請輸入結束分鐘:");
			int m = sc.nextInt();
			System.out.print("請輸入時薪:");
			int a = sc.nextInt();
			System.out.print("請輸入工作天數:");
			int d = sc.nextInt();
			h=h-H;
			if(m-M>0) {
				h=h+1;
			}
			int total;
			total=h*a*d;
			System.out.println("總共:"+total);
		}
	}

}
