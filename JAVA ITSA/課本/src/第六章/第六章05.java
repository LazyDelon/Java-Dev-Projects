package 第六章;
import java.io.*;
import java.util.Scanner;
public class 第六章05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 100;
		for(x=1;x<y+1;x++) {
			if(x%5==0 || x%7==0) {
				System.out.println(x);
			}
		}
	}

}
