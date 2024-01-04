
package hello;
import java.io.*;
import java.util.Scanner;

public class 使用者密碼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入密碼:");
		Scanner sc=new Scanner(System.in);
		int password = sc.nextInt();
		
		if(password == 5487) {
			System.out.print("你好聰明喔!!");
		}else
			System.out.print("你是白癡吧!!");
		
	}

}
