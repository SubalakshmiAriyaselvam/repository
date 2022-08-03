package practice_project_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Email_validation {

	public static void main(String[] args) {
		ArrayList<String> emailID = new ArrayList<String>();
	       
	       emailID.add("suba.17@yahoo.com");
	       emailID.add("dhiviya.5@gmail.com");
	       emailID.add("varshu.s@gmail.com");
	       emailID.add("sweatha.4@yahoo.com");
	       emailID.add("thenu.8@gmail.com");
	       
	       String searchEmail = null;
	       System.out.println("Enter the email address which is to search");
	       
	       try (Scanner sc = new Scanner(System.in)) 
	       {
	    	   System.out.println("Enter email Id : ");
	    	   searchEmail = sc.nextLine();
	       }
	       if(emailID.contains(searchEmail)){
	           System.out.println("Your given email ID :  " + searchEmail + " is found");
	       }
	       else{
	           System.out.println( "Your given email ID " + searchEmail + " is not found!");
	       }


	}

}
