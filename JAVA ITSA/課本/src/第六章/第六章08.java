package �Ĥ���;
import java.io.*;
import java.util.Scanner;
public class �Ĥ���08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�K�X:");
		Scanner sc = new Scanner(System.in);
		int pass = sc.nextInt();
		int password = 1234;
		if(pass==password) {
			System.out.print("BINGO");
			
		}else if(pass!=password){
			System.out.println("ERROR");
			System.out.print("�п�J�K�X:");
			int passw = sc.nextInt();
			if(passw==password) {
				System.out.println("BINGO");
				
			}else if(passw!=password){
				System.out.println("ERROR");
				System.out.print("�п�J�K�X:");
				int passwo = sc.nextInt();
				if(passwo==password) {
					System.out.println("BINGO");
				}else
					System.out.println("ERROR");
			}
		}
				
		
	}

}
