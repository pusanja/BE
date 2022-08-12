package orthofx.com;
import java.util.Scanner;

public class Marks
{

	   public static void main(String[] args)
	   {
	      
	      int score ;
	      Scanner sc= new Scanner(System.in);
	      System.out.println("Enter marks");
	      score= sc.nextInt(); 
	      if(score>=90)
	         {
	    	  System.out.println("amazing");
	         }
	      else if(score>=90&&score<=80)
	        {
	    	  System.out.println("good");
	        }
	      else if(score>=80&&score<=70)
	        {
	    	  System.out.println("alright");
	        }
	      else 
	      {	  
	       System.out.println("ok");
	      }
        }
}
	      
	      
	      
