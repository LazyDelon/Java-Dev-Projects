package 第五章;
import java.io.*;
import java.util.Scanner;
public class 第五章02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入成績:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>89) {
			System.out.print("A");
		}else if(n>79){
			System.out.print("B");
		}else if(n>69) {
			System.out.print("C");
		}else if(n>=60) {
			System.out.print("D");
		}else
			System.out.print("E");
		
	}

}
