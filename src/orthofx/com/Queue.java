package orthofx.com;
import java.util.Scanner;
import java.util.ArrayList;

public class Queue {
	static int t1=-1;
	static int t2=-1;
	static int[]s1=new int [10];
	static int[]s2=new int[10];
    static int max_size=100;
     static int data;
     static int status=-1;
	
    static int isfull()
    {
        if(t1==(max_size-1))
            return 1;
        else
            return 0;
    }
    static int isempty()
    {
        if(t1==-1 && t2==-1) 
            return -1;
        else
            return 0;
    }
     static void push(int data)
    {
        t1=t1+1;
        s1[t1]=data;
    }
     static int pop()
    {
       int data;
        if(t2==-1){
    while(t1!=-1){
        t2 = t2 + 1;
        s2[t2] = s1[t1];
        t1 = t1 - 1;
        }
        data=s2[t2];
        t2 = t2 - 1;
        return data;
        
        }
       else{
            data=s2[t2];
            t2-=1;
            return data;
            }
        }

     static void displayS1(int s[]){
         for(int i=0;i<=t1;i++)
             System.out.println("\t"+s[i]);
             
     }
            	
        
          static void displayS2(int s[]){
            	  if(t2!=-1){
            	        for(int i=t2;i>=0;i--) 
            	        System.out.println("\t"+ s[i]);
            	    }
         }

        
                 
     
     public static void main(String[]args) {
	 Scanner sc= new Scanner(System.in);
	 String newline = System.lineSeparator();
	  int option=0;
	 
	 do {
	 System.out.println("enter 1 to push" +newline+ "enter 2 to pop" +newline+ "enter 3 to display");
	 int s=sc.nextInt();
	 switch(s) {
	 case 1:
		    status=isfull();
		    if(status==1) {
		    	System.out.println("the queue is full");
		    }
		    else {
		    	System.out.println(" enter the value to insert");
		    	int a=sc.nextInt();
		    	push(a);
		    	}
		    break;
	 case 2:
		    status=isempty();
		    if(status==-1) {
		    	System.out.println("the Queue is empty");
		          }
		    else {
		    	  data=pop();
		    	  System.out.println("poped data is/n"+data);
		    	 
		          }
		    break;
	 case 3:
		     status=isempty();
		     if(status==-1) {
		     System.out.println("the queue is empty");
		     }
		     else {
		    	 System.out.println("the Queue is" );
		    	 displayS1(s1);
		    	 displayS2(s2);
		     }
		     break;
	 default:
		     System.out.println("the option you entered is wrong");
		    break;
	 }
		  System.out.println("press 1 to continue");
		   option=sc.nextInt();
	}while( option==1);
	 
		    
		    
     }
}
     
    
	 
   
  
     
     
     
     
     
     	 
	 

			
         
         
         
 
			
	
			
			
		
				
	


