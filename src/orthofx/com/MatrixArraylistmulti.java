package orthofx.com;
import java.util.Scanner;
import java.util.ArrayList;

public class MatrixArraylistmulti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        
        System.out.println("enter the row of first matrix");
		int a=sc.nextInt();
		System.out.println("enter the coloum of first matrix");
		int b=sc.nextInt();
        ArrayList<ArrayList<Integer>> m1 = new ArrayList<ArrayList<Integer>>();
        System.out.println("enter the row of second matrix");
		int c=sc.nextInt();
		System.out.println("enter the coloum of second matrix");
		int d=sc.nextInt();
        ArrayList<ArrayList<Integer>> m2 = new ArrayList<ArrayList<Integer>>();
        
        ArrayList<ArrayList<Integer>> mul = new ArrayList<ArrayList<Integer>>();
        
        
        System.out.println("enter elements of matrix 1");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(m1.size() < i + 1) {
                    m1.add(i, new ArrayList<>());
                }
                m1.get(i).add(j, sc.nextInt());
            }
        }
        
        
        
        System.out.println("enter elements of matrix 2");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                if(m2.size() < i + 1) {
                    m2.add(i, new ArrayList<>());
                }
                m2.get(i).add(j, sc.nextInt());
            }
        }
        
        
        
        //matrix multiplication
        for (int i= 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
            	int tem=0;
                for (int k = 0; k < d; k++) {
                	if(mul.size() < i + 1) {
                        mul.add(i, new ArrayList<>());
                    }
                	tem+=m1.get(i).get(k)*m2.get(k).get(j);
                	 mul.get(i).add(j, tem);
                }
                }
            }
        
        
        System.out.println("product of matrix is"); 
        for (int i = 0; i < a; i++) {
            for (int j= 0; j < d; j++) {
            	System.out.print(mul.get(i).get(j) + "    ");
            }
            System.out.println();
            }
            System.out.println(); 
        }
        
	          
	
	
	}
	
	
	
        
        
        
        
	


