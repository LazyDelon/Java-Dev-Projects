import java.util.Scanner;

public class M30質數判別 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入數字:");
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		if(x==2) {
			System.out.print("質數");
		}else
			for(int y = 2;y<x;y++) {
				if(x%y==0) {
					System.out.print("非質數");
					break;
				}else if(x/y==1) {
					System.out.print("質數");
					break;
				}
		}
		}
	}

