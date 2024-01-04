import java.io.*;
import java.util.Scanner;
public class M21ºâ¶¥­¼ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("½Ð¿é¤J¶¥­¼:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//6
		int i=1;
		int total=1;
		if((n>=1) && (n<=20)) {
			while(i<=n) {
				total=total*i;
				i=i+1;
			
			
		}
		System.out.print("µª®×:"+total);
		
		
		
		
		}
	}

}
