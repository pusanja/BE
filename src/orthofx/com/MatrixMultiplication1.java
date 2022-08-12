package orthofx.com;
import java.util.Scanner;

public class MatrixMultiplication1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row of first matrix");
		int a=sc.nextInt();
		System.out.println("enter the coloum of first matrix");
		int b=sc.nextInt();
		int e[][]=new int[a][b];
		System.out.println("enter the row of second matrix");
		int c=sc.nextInt();
		System.out.println("enter the coloum of second matrix");
		int d=sc.nextInt();
		int f[][]=new int[c][d];
		System.out.println("enter the elements of first matrix");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				e[i][j]=sc.nextInt();
			}
		}System.out.println("enter the elements of second matrix");
		for(int i=0;i<c;i++) {
			for(int j=0;j<d;j++) {
				f[i][j]=sc.nextInt();
			}
		}
		int g[][]=new int [10][10];
		 for (int i= 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                for (int k = 0; k < d; k++) {
	                    g[i][j] += e[i][k] * f[k][j];
	                }
	            }
		       }
	            System.out.println("product of matrix is"); 
	            for (int x = 0; x < a; x++) {
	                for (int y = 0; y < d; y++) {
	                    System.out.print(g[x][y] + " ");
	                }
	                System.out.println(); 
	            }
	            
	           
		
		
	   }
	}
	
	


