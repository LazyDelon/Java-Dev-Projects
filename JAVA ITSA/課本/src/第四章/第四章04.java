package 第四章;
import java.io.*;
import java.util.Scanner;
public class 第四章04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print("請輸入數字:");
		int j = sc.nextInt();
		i=(i+j)*(i+j);
		System.out.print("答案:"+i);
	}

}
