import java.io.*;
import java.util.Scanner;
public class M24�p���~�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�ɤu�ɼƩM�T�w���~:");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();//�u�ɼ�
		int hours = sc.nextInt();//���~
		if(time<=60) {
			System.out.print("�~��:"+time*hours);
		}else if(time<=120) {
			System.out.print("�~��:"+60*hours+(time-60)*hours*1.33);
		}else if(time>120){
			System.out.print("�~��:"+(60*hours+60*hours*1.33+(time-120)*hours*1.66));
		}
	}

}
