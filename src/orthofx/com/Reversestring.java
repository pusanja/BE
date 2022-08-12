package orthofx.com;
import java.util.Scanner;
public class Reversestring
{
	public static void main(String[] args)
	{   
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String name= sc.nextLine();
		String revString = "";
		for(int i = name.length() - 1; i >= 0; --i) 
		{
			   revString += name.charAt(i);
		}

			  System.out.println(revString);
			 
	}

}
