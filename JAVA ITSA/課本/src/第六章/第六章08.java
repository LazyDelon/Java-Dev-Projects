package 第六章;
import java.io.*;
import java.util.Scanner;
public class 第六章08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入密碼:");
		Scanner sc = new Scanner(System.in);
		int pass = sc.nextInt();
		int password = 1234;
		if(pass==password) {
			System.out.print("BINGO");
			
		}else if(pass!=password){
			System.out.println("ERROR");
			System.out.print("請輸入密碼:");
			int passw = sc.nextInt();
			if(passw==password) {
				System.out.println("BINGO");
				
			}else if(passw!=password){
				System.out.println("ERROR");
				System.out.print("請輸入密碼:");
				int passwo = sc.nextInt();
				if(passwo==password) {
					System.out.println("BINGO");
				}else
					System.out.println("ERROR");
			}
		}
				
		
	}

}
