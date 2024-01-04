import java.io.*;
import java.util.Scanner;
import java.math.*;
public class M101糖果紙兌換 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("購買幾顆糖果:");
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
