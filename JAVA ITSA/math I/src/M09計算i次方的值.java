import java.io.*;
import java.util.Scanner;
public class M09計算i次方的值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		if(i<=31) {
			double a;
			a=Math.pow(2, i);
			System.out.printf("答案:%.0f",a);
		}else
			System.out.println("ERROR");
	}

}
