import java.io.*;
import java.util.Scanner;
public class M27�p����ƶ��Ҧ���ƪ��`�M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�Ʀr:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int total = 0;
		if(a<b) 
			while(a<=b){
				total=total+a;
				a++;
			}
		else if(a>b)
			while(b<=a){
				total=total+b;
				b++;
			}
		System.out.print("�`�M:"+total);

	}

}
