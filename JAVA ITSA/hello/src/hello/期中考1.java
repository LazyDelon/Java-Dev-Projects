package hello;

public class ´Á¤¤¦Ò1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,-2},{0,2}};
		int b[][]= {{2,3,0},{1,-2,3}};
		int c[][]= new int[a.length][b[0].length];
		for(int i = 0;i<a.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				for(int w=0;w<a[0].length;w++) {
					c[i][j]+=a[i][w]*b[w][j];
					
				}
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
