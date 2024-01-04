package hello;

public class 期中考陣列 {
	public static void main(String[] args){
		int a[][]={{1,-2},{0,2}}; 
		int b[][]={{2,3,0},{1,-2,3}};
		int c[][]=new int[a.length][b[0].length];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<b[0].length;j++) {
				c[i][j]=0;
				for(int w =0;w<a[0].length;w++) {
					c[i][j]+=a[i][w]*b[w][j];
				}
			}
		}
		System.out.print("a=[");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]);
				if(j<a[0].length-1) {
					System.out.print(",");
				}
			}
			if(i<a.length-1){
				System.out.print(";");
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.print("b=[");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print(b[i][j]);
				if(j<b[0].length-1) {
					System.out.print(",");
				}
			}
			if(i<b.length-1){
				System.out.print(";");
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.print("axb=c=[");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				System.out.print(c[i][j]);
				if(j<c[0].length-1) {
					System.out.print(",");
				}
			}
			if(i<c.length-1){
				System.out.print(";");
			}
		}
		System.out.print("]");
	}
}
		
