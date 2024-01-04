import java.io.*;
import java.util.Scanner;
public class M293計算電費 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入使用度數:");
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		if(c>700) {
			System.out.printf("夏月:%.2f",c*5.63);
			System.out.printf("非夏月:%.2f",c*4.5);
		}else if(c>=501) {
			System.out.printf("夏月:%.2f",c*4.97);
			System.out.printf("非夏月:%.2f",c*4.01);
		}else if(c>=331) {
			System.out.printf("夏月:%.2f",c*4.39);
			System.out.printf("非夏月:%.2f",c*3.61);
		}else if(c>=121) {
			System.out.printf("夏月:%.2f",c*3.02);
			System.out.printf("非夏月:%.2f",c*2.68);
		}else if(c<121) {
			System.out.printf("夏月:%.2f",c*2.1);
			System.out.printf("非夏月:%.2f",c*2.1);
		}
	}

}
