import java.util.Scanner;

public class M69����u {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�JA�y��:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("�п�JB�y��:");
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.print("�п�JC�y��:");
		int e = sc.nextInt();
		int f = sc.nextInt();
		int z=0;
		int y=0;
		z=(a-b)/(c-d);
		y=z*e-f;
		System.out.print("y="+z+"x+"+y);

	}

}
