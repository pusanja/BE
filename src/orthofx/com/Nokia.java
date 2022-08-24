package com.orthofx;
import java.util.ArrayList;
import java.util.Scanner;

public class Nokia extends MobileClass {
	String display,storage,colour;
	public void enter() {
	Scanner read = new Scanner(System.in);
	System.out.println("eneter the display of nokia");
     display=read.next();
     map.put(display, new ArrayList<String>());
     System.out.println("enter the storage of nokia");
     storage=read.next();
     map.get(display).add(storage);
     System.out.println("enter the colour of nokia");
     colour=read.next();
     map.get(display).add(colour);
	
   }
   public void read() {	
	   Scanner read = new Scanner(System.in);
	   System.out.println("eneter the display of nokia");
	   display = read.next();
	   if(map.containsKey(display)) {
	        System.out.println("storage of the  nokia phone is");
	        System.out.println(map.get(display).get(0));
	        System.out.println("color of nokia phone is");
	        System.out.println(map.get(display).get(1));
	        }
	        else
	            System.out.println("display of the phone doesnot exist");
	}
   public void edit() {
	   Scanner read=new Scanner(System.in);
	   System.out.println("enter the diplay of nokia");
	   display=read.next();
	   if(map.containsKey(display)) {
		   System.out.println("press 1 for editing storage of nokia");
		   System.out.println("press 2 for editing colour of nokia");
		   int s=read.nextInt();
		   switch(s) {
		   case 1:
			     System.out.println("enter the new storage of nokia");
			     storage=read.next();
			     map.get(display).add(0, storage);
			     break;
		   case 2:
			   System.out.println("enter the new colour of nokia");
			   colour=read.next();
			   map.get(display).add(1, colour);
			   break;
			 default:
				 System.out.println("not a valid option");
		   }
		   
		   }
		   
	   }
   public void remove() {
	   Scanner read=new Scanner(System.in);
	   System.out.println("enter the  nokia display to remove");
	   display=read.next();
	   if(map.containsKey(display));
	   map.remove(display);
   }
	   
	   
	   
	   
	

}
