import java.io.*;
import java.util.Scanner;
public class M65找零錢問題 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("小明有幾元:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.print("小明買了幾顆蘋果:");
		int a = sc.nextInt();
		System.out.print("小明買了幾顆柳丁:");
		int b = sc.nextInt();
		System.out.print("小明買了幾顆桃子:");
		int c = sc.nextInt();
		if(m>=a*15+b*20+c*30) {
			if(a*15+b*20+c*30<400) {
				int r = 0;
				r=m/100;
				m=m-r*100;
				int x = 0;
				x = m-a*15-b*20-c*30;
				if(x>=50) {
					int y=0;
					y=x%50;
					x=x-y*50;
					System.out.println("50元:"+y);
				}
				if(x>=5) {
					int z = 0;
					z=x%5;
					x=x-z*5;
					System.out.println("5元:"+z);
				}
				System.out.println("1元:"+x);
			}else if(a*15+b*20+c*30>=400) {
				int x = 0;
				x = m-a*15-b*20-c*30;
				if(x>=50) {
					int y=0;
					y=x%50;
					x=x-y*50;
					System.out.println("50元:"+y);
				}
				if(x>=5) {
					int z = 0;
					z=x%5;
					x=x-z*5;
					System.out.println("5元:"+z);
				}
				System.out.println("1元:"+x);
			
				
			
		}else
			System.out.print(0);
	}
	}
}
