package movie_ticket_booking;

import java.util.Scanner;

public class Login 
{
	public static String passWord="admin@123";
	public static void adminLogin() 
	{
		String userName="admin";
		System.out.println("Enter your username and password:");
		Scanner sc = new Scanner(System.in);
		System.out.println("username:");
		String username = sc.next();
		System.out.println("password:");
		String password = sc.next();
		boolean passwordflag = true;
		while (passwordflag){
		        if(username.equals(userName) && password.equals(passWord)){
        			passwordflag = false;
        			System.out.println("The password is correct");
        			System.out.println("Logged in");
        			System.out.println("-----------------------------");
		        }
		        else{
        			System.out.println("Yourpassword is wrong...");
        			System.out.println("Enter your password again:");
		            password = sc.next();
		            System.out.println("-----------------------------");
		        }
		}
		
		System.out.println("Do you want to update your password\nPlease enter 'yes' or 'no':");
		String passwordUpdate = sc.next();
		if(passwordUpdate.equals("yes")){
			updatePassword();
			Booking.bookTicket();
			System.out.println("Thank you for choosing SPI Cinemas");
		}
		else{
			System.out.println("Exit");
			System.out.println("-----------------------------");
			Booking.bookTicket();
			System.out.println("Thank you for choosing SPI Cinemas");
		}
		
		
		

	}
	public static void updatePassword(){
		System.out.println("Enter your new password:");
		Scanner sc = new Scanner(System.in);
		passWord = sc.next();
		System.out.println("Your password has been succesfully updated!!");
		System.out.println("-----------------------------");
	}

}
