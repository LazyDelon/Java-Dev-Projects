package 第四章;
import java.io.*;
import java.util.Scanner;
public class 第四章02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入車票金額:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 0;
		if(x>=10) {
			y=x/10;
			x=x-y*10;
			System.out.println("十元:"+y);
		}
		if(x>=5) {
			y=x/5;
			x=x-y*5;
			System.out.println("五元:"+y);
		}
		System.out.println("一元:"+x);
	}

}
