package com.orthofx;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class MobileClass {
	static MobileClass Mobile=new MobileClass();
	static Samsung samsung=new Samsung();
	static Nokia nokia=new Nokia();
	static HashMap<String,ArrayList> map=new HashMap<String,ArrayList>();
	public static void main(String[]args) {
		 int p;
		do {
			
			  Scanner read = new Scanner(System.in);
			  System.out.println("enter 1 to enter information");
			  System.out.println("enter 2 to read information");
			  System.out.println("enter 3 to edit information");
			  System.out.println("enter 4 to delete information");
			  int s=read.nextInt();
			  switch(s){
			  case 1:   
				        
			            System.out.println("enter which mobile(samsung or nokia)");
			            String a=read.next();
			            switch(a){
			            case "samsung":
			            	samsung.enter();
			            	break;
			            case "nokia":
			            	nokia.enter();
			            	break;
			            	    
			            default:
			            	System.out.println("inavalid option");
			            	
			              }
			            break;
			  case 2:   
			        
		            System.out.println("enter which mobile(samsung or nokia");
		            String b=read.next();
		            switch(b){
		            case "samsung":
		            	samsung.read();
		            	break;
		            case "nokia":
		            	nokia.read();
		            	break;
		            	    
		            default:
		            	System.out.println("inavalid option");
		            	
		                   
		            
		            } 
		            break;
			  case 3:   
			        
		            System.out.println("enter which mobile(samsung or nokia");
		            String c=read.next();
		            switch(c){
		            case "samsung":
		            	samsung.edit();
		            	break;
		            case "nokia":
		            	nokia.edit();
		            	break;
		            	    
		            default:
		            	System.out.println("inavalid option");
		            	
		                     }
		            break;
			  case 4:   
			        
		            System.out.println("enter which mobile(samsung or nokia");
		            String d=read.next();
		            switch(d){
		            case "samsung":
		            	samsung.remove();
		            	break;
		            case "nokia":
		            	nokia.remove();
		            	break;
		            	    
		            default:
		            	System.out.println("inavalid option");
		            	
		                    }
		                break;
			           }
			  System.out.println("press 1  to continue");

                p = read.nextInt();
			  
			  } while(p==1);
		
		       
		
		}
		}
			
			
			
		
