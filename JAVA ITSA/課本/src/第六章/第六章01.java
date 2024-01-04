package 第六章;
import java.io.*;
import java.util.Scanner;
public class 第六章01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total =0;
		for(int a = 1;a<101;a++) {
			if(a%3==0) {
				total=total+a;
			}
		}
		System.out.print("答案:"+total);
	}

}
