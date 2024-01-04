package 第五章;
import java.io.*;
import java.util.Scanner;
public class 第五章06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入密碼:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a==5148) {
			System.out.print("BINGO");
		}else
			System.out.print("ERROR");
	}

}
