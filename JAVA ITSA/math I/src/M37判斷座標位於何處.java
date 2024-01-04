import java.io.*;
import java.util.Scanner;
public class M37判斷座標位於何處 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入x座標:");
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("請輸入y座標:");
		int y = sc.nextInt();
		if(x==0 &&y==0) {
			System.out.print("原點");
		}else if(y==0) {
			System.out.print("在x軸");
		}else if(x==0) {
			System.out.print("在y軸");
		}
		if(x>0&&y>0) {
			System.out.print("第一象限");
		}else if(x<0&&y>0) {
			System.out.print("第二象限");
		}else if(x<0&&y<0) {
			System.out.print("第三象限");
		}else if(x>0&&y<0) {
			System.out.print("第四象限");
		}

	}

}
