package orthofx.com;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class ArraySorting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter the names");
		for(int i=0;i<10;i++)
			
		{
			String abc=input.next();
			list.add(abc);
		}
        Collections.sort(list);
        System.out.println("After Sorting : " + list);
    }
 }


