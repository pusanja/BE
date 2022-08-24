package com.orthofx;
import java.util.ArrayList;
import java.util.Scanner;

public class Nokia extends MobileClass {
	String keypad;
	public void enter() {
	Scanner read = new Scanner(System.in);
	System.out.println("eneter the model of nokia");
     model=read.next();
     map.put(model, new ArrayList<String>());
     System.out.println("enter the storage of nokia");
     storage=read.next();
     map.get(model).add(storage);
     System.out.println("enter the colour of nokia");
     colour=read.next();
     map.get(model).add(colour);
     
	
   }
   public void read() {	
	   Scanner read = new Scanner(System.in);
	   System.out.println("eneter the model of nokia");
	   model = read.next();
	   if(map.containsKey(model)) {
	        System.out.println("storage of the  nokia phone is");
	        System.out.println(map.get(model).get(0));
	        System.out.println("color of nokia phone is");
	        System.out.println(map.get(model).get(1));
	        }
	        else
	            System.out.println("model of the phone doesnot exist");
	}
   public void edit() {
	   Scanner read=new Scanner(System.in);
	   System.out.println("enter the diplay of nokia");
	   model=read.next();
	   if(map.containsKey(model)) {
		   System.out.println("press 1 for editing storage of nokia");
		   System.out.println("press 2 for editing colour of nokia");
		   int s=read.nextInt();
		   switch(s) {
		   case 1:
			     System.out.println("enter the new storage of nokia");
			     storage=read.next();
			     map.get(model).add(0, storage);
			     break;
		   case 2:
			   System.out.println("enter the new colour of nokia");
			   colour=read.next();
			   map.get(model).add(1, colour);
			   break;
			 default:
				 System.out.println("not a valid option");
		   }
		   
		   }
		   
	   }
   public void remove() {
	   Scanner read=new Scanner(System.in);
	   System.out.println("enter the  nokia model to remove");
	   model=read.next();
	   if(map.containsKey(model));
	   map.remove(model);
   }
	   
	   
	   
	   
	

}
