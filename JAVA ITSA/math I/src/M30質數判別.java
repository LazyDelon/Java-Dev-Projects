import java.util.Scanner;

public class M30��ƧP�O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		if(x==2) {
			System.out.print("���");
		}else
			for(int y = 2;y<x;y++) {
				if(x%y==0) {
					System.out.print("�D���");
					break;
				}else if(x/y==1) {
					System.out.print("���");
					break;
				}
		}
		}
	}

