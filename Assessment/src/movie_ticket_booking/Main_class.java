package movie_ticket_booking;

import java.util.Scanner;

public class Main_class 
{
	public static void main(String[] args) 
	{
		Welcome.welcomeMessage();
		System.out.println("Are you a user or admin?\nPlease enter 'user' or 'admin':");
		Scanner sc = new Scanner(System.in);
		String loginOption = sc.next();
		if(loginOption.equals("admin")){
			Login.adminLogin();
		}
		else if(loginOption.equals("user")){
			Booking.bookTicket();
			System.out.println("Thank you");
		}
		

	}

}
