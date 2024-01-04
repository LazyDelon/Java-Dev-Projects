import java.util.Scanner;

public class M69平行線 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入A座標:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("請輸入B座標:");
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.print("請輸入C座標:");
		int e = sc.nextInt();
		int f = sc.nextInt();
		int z=0;
		int y=0;
		z=(a-b)/(c-d);
		y=z*e-f;
		System.out.print("y="+z+"x+"+y);

	}

}
