package 第五章;
import java.io.*;
import java.util.Scanner;

public class 第五章10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入工作時數:");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		System.out.print("請輸入固定時薪:");
		int m = sc.nextInt();
		if(h<=60) {
			System.out.printf("工資:%.0f"+h*m);
		}else if(h<=120) {
			System.out.printf("工資:%.0f",(60*m+(h-60)*m*1.33));
		}else if(h>120) {
			System.out.printf("工資:%.0f"+(60*m+60*m*1.33+(h-120)*m*1.66));
		}
	}

}
