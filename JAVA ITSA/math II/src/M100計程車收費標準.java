import java.io.*;
import java.util.Scanner;
public class M100�p�{�����O�з� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�_������:");
		Scanner sc = new Scanner(System.in);
		double S = sc.nextDouble();
		System.out.print("�п�J�@�������X��:");
		double K = sc.nextDouble();
		System.out.print("�W�L�X�����[��K+5��:");
		double M = sc.nextDouble();
		System.out.print("�p�{���}�X����:");
		double D = sc.nextDouble();
		double T=0;
		if(K<1) {
			K=1;
		}
		if(D>M) {
			T=S+M*K+(D-M)*(K+5);
		}else if(D<=M) {
			T=S+D*K;
		}
		System.out.print("�`�M:"+T);
		
		
	}

}
