import java.io.*;
import java.util.Scanner;
public class M36©u¸`§P©w {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("½Ð¿é¤J¤ë¥÷:");
		Scanner sc=new Scanner(System.in);
		int month = sc.nextInt();
		if(month>=3 && month<=5) {
			System.out.print("¬K©u");
		}else if(month>=6 && month<=8) {
			System.out.print("®L©u");
		}else if(month>=9 && month<=11) {
			System.out.print("¬î©u");
		}else 
			System.out.print("¥V©u");
		


	}

}
