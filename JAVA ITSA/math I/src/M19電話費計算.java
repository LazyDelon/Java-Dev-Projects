import java.io.*;
import java.util.Scanner;
public class M19�q�ܶO�p�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�q�ܤ�����:");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		if(time>=1500) {
			System.out.print("�q�ܶO��:"+time*0.9*0.79);
		}else if(time>800) {
			System.out.print("�q�ܶO��:"+time*0.9*0.9);
		}else
			System.out.print("�q�ܶO��:"+time*0.9);

	}

}
