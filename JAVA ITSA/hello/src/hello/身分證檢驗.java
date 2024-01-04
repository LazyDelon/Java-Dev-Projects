package hello;
import java.io.*;
import java.util.Scanner;
public class 身分證檢驗 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入英文字:");
		Scanner sc = new Scanner(System.in);
		String an = sc.next();
		
		int number1=0;
		int number2=0;
		switch(an) {
			case "A":
				number1=1;
				number2=0;
				break;
			case "B":
				number1=1;
				number2=1;
				break;
			case "C":
				number1=1;
				number2=2;
				break;
			case "D":
				number1=1;
				number2=3;
				break;
			case "E":
				number1=1;
				number2=4;
				break;
			case "F":
				number1=1;
				number2=5;
				break;
			case "G":
				number1=1;
				number2=6;
				break;
			case "H":
				number1=1;
				number2=7;
				break;
			case "I":
				number1=3;
				number2=4;
				break;
			case "J":
				number1=1;
				number2=8;
				break;
			case "K":
				number1=1;
				number2=9;
				break;
			case "L":
				number1=2;
				number2=0;
				break;
			case "M":
				number1=2;
				number2=1;
				break;
			case "N":
				number1=2;
				number2=2;
				break;
			case "O":
				number1=3;
				number2=5;
				break;
			case "P":
				number1=2;
				number2=3;
				break;
			case "Q":
				number1=2;
				number2=4;
				break;
			case "R":
				number1=2;
				number2=5;
				break;
			case "S":
				number1=2;
				number2=6;
				break;
			case "T":
				number1=2;
				number2=7;
				break;
			case "U":
				number1=2;
				number2=8;
				break;
			case "V":
				number1=2;
				number2=9;
				break;
			case "W":
				number1=3;
				number2=2;
				break;
			case "X":
				number1=3;
				number2=0;
				break;
			case "Y":
				number1=3;
				number2=1;
				break;
			case "Z":
				number1=3;
				number2=3;
				break;
		}
		System.out.print("請輸入數字:");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		int a5 = sc.nextInt();
		int a6 = sc.nextInt();
		int a7 = sc.nextInt();
		int a8 = sc.nextInt();
		int a9 = sc.nextInt();
		int total = 0;
		total=(number1+number2*9+a1*8+a2*7+a3*6+a4*5+a5*4+a6*3+a7*2+a8*1+a9)%10;
		if(total==0) {
			System.out.print("real");
		}else
			System.out.print("fake");
		

	}

}
