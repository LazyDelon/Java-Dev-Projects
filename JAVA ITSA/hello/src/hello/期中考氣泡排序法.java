package hello;

public class 期中考氣泡排序法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = {1,4,3,2,5,8,7};
		int temp;
		for(int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if(data[j]<data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
			for(int k:data) {
				System.out.print(" "+k);
			}
		System.out.println();
		}
	}

}
