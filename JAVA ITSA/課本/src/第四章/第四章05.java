package �ĥ|��;
import java.io.*;
import java.util.Scanner;
import java.math.*;
public class �ĥ|��05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J��H�Z��:");
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		m=m*100;
		//1s=100cm��
		//1s=30*2.54cm�p��
		//�C��Ĺ100-30*2.54
		double s = 0;
		s=m/(100-30*2.54);
		
		System.out.print("����:"+Math.ceil(s));
		
	}

}
