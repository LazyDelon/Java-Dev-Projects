import java.io.*;
import java.util.Scanner;
public class M258���y�ʮ��~�p�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�п�J�u�@�ɼ�:");
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		if(hr>=150) {
			System.out.print("�~��:"+(100*100+150*(hr-100)));
		}else if(hr>=140){
			System.out.print("�~��:"+(100*100+140*(hr-100)));
		}else if(hr>=130){
			System.out.print("�~��:"+(100*100+130*(hr-100)));
		}else if(hr>=120){
			System.out.print("�~��:"+(100*100+120*(hr-100)));
		}else if(hr>=110){
			System.out.print("�~��:"+100*100+110*(hr-100));
		}else
			System.out.print("�~��:"+100*hr);
	}

}
