package orthofx.com;
import java.util.HashMap;
import java.util.Scanner;


public class StudentMarks {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 HashMap<String, Integer> map = new HashMap<>();
		 System.out.println("enter number of students");
		 int a=input.nextInt();
		 
		 System.out.println("enter names and marks");
		 for(int i=0;i<a;i++) {
		 String name=input.next();
		 int mark=input.nextInt();
		 map.put(name, mark);
		 }
		 
		 System.out.println(map);
		 
		 
		 
		 System.out.println("enter name");
		 String n=input.next();		 
		 System.out.println(map.get(n));
		 
		 
		 
		 
		 
		 
		 
		 
		 //		 map.put("vishal", 10);
//	     map.put("sachin", 30);
//	     map.put("vaibhav", 20);
//	     if (map.containsKey("vishal")) {
//	    	  Integer a = map.get("vishal");
//	    	System.out.println("value for key"
//	                               + " \"vishal\" is:- " + a);
	

         }
	 }

