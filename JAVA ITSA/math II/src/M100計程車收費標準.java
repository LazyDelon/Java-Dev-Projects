import java.io.*;
import java.util.Scanner;
public class M100計程車收費標準 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入起跳價格:");
		Scanner sc = new Scanner(System.in);
		double S = sc.nextDouble();
		System.out.print("請輸入一公里收幾元:");
		double K = sc.nextDouble();
		System.out.print("超過幾公里加收K+5元:");
		double M = sc.nextDouble();
		System.out.print("計程車開幾公里:");
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
		System.out.print("總和:"+T);
		
		
	}

}
