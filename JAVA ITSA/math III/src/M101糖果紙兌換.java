import java.io.*;
import java.util.Scanner;
import java.math.*;
public class M101�}�G�ȧI�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�ʶR�X���}�G:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = 3;
		double total=a;
		if(a>=3) {
			while(3<=a) {
				a=a/3;
				total=total+a;
				
			}
			
		}else if(a<3) {
			
			total=a;
			
		}

		System.out.print(Math.floor(total*1.0));
	}	

}
