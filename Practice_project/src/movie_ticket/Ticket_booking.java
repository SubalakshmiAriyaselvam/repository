package movie_ticket;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ticket_booking 
{
	static Map<Integer, String> a = new LinkedHashMap<Integer, String>();
	static Map<Integer, String> b = new LinkedHashMap<Integer, String>();
	static Map<Integer, String> c = new LinkedHashMap<Integer, String>();
	static Map<Integer, String> d = new LinkedHashMap<Integer, String>();
	static Map<Integer, String> e = new LinkedHashMap<Integer, String>();
	static Map<Integer, String> f = new LinkedHashMap<Integer, String>();
	public static void admin()
	{
		System.out.println("\nPlease enter your username : ");
		Scanner sc= new Scanner(System.in);
		String s1 = sc.next();
		if(Pattern.matches("assessment",s1))
			{
			changepw();
			}
			else
			{
				System.out.println("\nEnter valid input!");
				exit();
			}
		
	}
	public static void changepw() 
	{
		System.out.println("\nPlease enter your password : ");
		Scanner sc2 = new Scanner(System.in);
		String s2 = sc2.next();
		if(Pattern.matches("user@123",s2))
		{
			System.out.println("\nDo you want to change the password? Type yes or no :");
			String s3 = sc2.next();
			if(Pattern.matches("yes",s3))
			{
				System.out.println("\nEnter new password : ");
				String s33 = sc2.next();
				Pattern.matches("^[a-zA-Z0-9]$\\W{10}", s33);
				System.out.println("\nYour password is updated");
			}
			else
			{
				System.out.println("\nEnter valid input!");
				exit();
			}
		}
		else
		{
			System.out.println("\nEnter valid input!");
			exit();
		}
	}
	
	public static void exit() 
	{
			System.exit(0);
	}
	public static void payment(int numberofSeats)
	{
		int ticketPrice = 120;
		int price = numberofSeats*ticketPrice;
		System.out.println("The total payable amount is:Rs "+price);
		System.out.println("-----------------------------------");
		
	}
	public static void showtime1()
	{
		System.out.println("\nPlease select the row (A to F) : ");
		System.out.println("a. A row \nb. B row \nc. C row \nd. D row \ne. E row \nf. F row");
		Scanner sc=new Scanner(System.in);
		char s5 =sc.next().charAt(0);
			switch(s5)
			{
			case 'a': a_row((LinkedHashMap) a);
			break;
			case 'b': b_row((LinkedHashMap) b);
			break;
			case 'c': c_row((LinkedHashMap) c);
			break;
			case 'd': d_row((LinkedHashMap) d);
			break;
			case 'e': e_row((LinkedHashMap) e);
			break;
			case 'f': f_row((LinkedHashMap) f);
			break;
			default : System.out.println("Please enter valid input\n");
    		 exit();
    		 return;
			}
			System.out.println("\nRow_number : "+s5);
	}
		
	public static void showtime2()
	{
		System.out.println("\nPlease select the row (A to F) : ");
		System.out.println("a. A row \nb. B row \nc. C row \nd. D row \ne. E row \nf. F row");
		Scanner sc=new Scanner(System.in);
		char s5 =sc.next().charAt(0);
			switch(s5)
			{
			case 'a': a_row((LinkedHashMap) a);
			break;
			case 'b': b_row((LinkedHashMap) b);
			break;
			case 'c': c_row((LinkedHashMap) c);
			break;
			case 'd': d_row((LinkedHashMap) d);
			break;
			case 'e': e_row((LinkedHashMap) e);
			break;
			case 'f': f_row((LinkedHashMap) f);
			break;
			default : System.out.println("Please enter valid input\n");
    		 exit();
    		 return;
			}
			System.out.println("\nRow_number : "+s5);
	}
		
	public static void showtime3()
	{
		System.out.println("\nPlease select the row (A to F) : ");
		System.out.println("a. A row \nb. B row \nc. C row \nd. D row \ne. E row \nf. F row");
		Scanner sc=new Scanner(System.in);
		char s5 =sc.next().charAt(0);
			switch(s5)
			{
			case 'a': a_row((LinkedHashMap) a);
			break;
			case 'b': b_row((LinkedHashMap) b);
			break;
			case 'c': c_row((LinkedHashMap) c);
			break;
			case 'd': d_row((LinkedHashMap) d);
			break;
			case 'e': e_row((LinkedHashMap) e);
			break;
			case 'f': f_row((LinkedHashMap) f);
			break;
			default : System.out.println("Please enter valid input\n");
    		 exit();
    		 return;
			}
			System.out.println("\nRow_number : "+s5);
	}
	public static void a_row(LinkedHashMap a) 
	{ 
		System.out.println("Please select the seat number (1 - 10) :\n");
	    Scanner sc6=new Scanner(System.in);
		int s6 = sc6.nextInt();
		System.out.println("\nYou have selected your seat");
		System.out.println("\nPlease enter your name :\n");
		String s7 = sc6.next();
		
		if(a.containsKey(s6))
		  {
			  System.out.println("sorry!! This seat is already booked \nPlease book another seat");
			  a_row(a);
		  }
		else 
		  { 
			a.put(s6,s7);
			System.out.println("Your booking details\n");
			System.out.println("Seat_number : "+s6);
		  }
		  
	}
	public static void b_row(LinkedHashMap b) 
	{ 
		System.out.println("Please select the seat number (1 - 10) :\n");
	    Scanner sc6=new Scanner(System.in);
		int s6 = sc6.nextInt();
		System.out.println("\nYou have selected your seat");
		System.out.println("\nPlease enter your name :\n");
		String s7 = sc6.next();
		
		if(b.containsKey(s6))
		  {
			  System.out.println("sorry!! This seat is already booked \nPlease book another seat");
			  b_row(b);
		  }
		else 
		  { 
			b.put(s6,s7);
			System.out.println("Your booking details\n");
			System.out.println("Seat_number : "+s6);
		  }
		  
	}
	public static void c_row(LinkedHashMap c) 
	{ 
		System.out.println("Please select the seat number (1 - 10) :\n");
	    Scanner sc6=new Scanner(System.in);
		int s6 = sc6.nextInt();
		System.out.println("\nYou have selected your seat");
		System.out.println("\nPlease enter your name :\n");
		String s7 = sc6.next();
		
		if(c.containsKey(s6))
		  {
			  System.out.println("sorry!! This seat is already booked \nPlease book another seat");
			  c_row(c);
		  }
		else 
		  { 
			c.put(s6,s7);
			System.out.println("Your booking details\n");
			System.out.println("Seat_number : "+s6);
		  }
		  
	}
	public static void d_row(LinkedHashMap d) 
	{ 
		System.out.println("Please select the seat number (1 - 10) :\n");
	    Scanner sc6=new Scanner(System.in);
		int s6 = sc6.nextInt();
		System.out.println("\nYou have selected your seat");
		System.out.println("\nPlease enter your name :\n");
		String s7 = sc6.next();
		
		if(d.containsKey(s6))
		  {
			  System.out.println("sorry!! This seat is already booked \nPlease book another seat");
			  d_row(d);
		  }
		else 
		  { 
			d.put(s6,s7);
			System.out.println("Your booking details\n");
			System.out.println("Seat_number : "+s6);
		  }
		  
	}
	public static void e_row(LinkedHashMap e) 
	{ 
		System.out.println("Please select the seat number (1 - 10) :\n");
	    Scanner sc6=new Scanner(System.in);
		int s6 = sc6.nextInt();
		System.out.println("\nYou have selected your seat");
		System.out.println("\nPlease enter your name :\n");
		String s7 = sc6.next();
		
		if(e.containsKey(s6))
		  {
			  System.out.println("sorry!! This seat is already booked \nPlease book another seat");
			  e_row(e);
		  }
		else 
		  { 
			e.put(s6,s7);
			System.out.println("Your booking details\n");
			System.out.println("Seat_number : "+s6);
		  }
		  
	}
	public static void f_row(LinkedHashMap f) 
	{ 
		System.out.println("Please select the seat number (1 - 10) :\n");
	    Scanner sc6=new Scanner(System.in);
		int s6 = sc6.nextInt();
		System.out.println("\nYou have selected your seat");
		System.out.println("\nPlease enter your name :\n");
		String s7 = sc6.next();
		
		if(f.containsKey(s6))
		  {
			  System.out.println("sorry!! This seat is already booked \nPlease book another seat");
			  f_row(f);
		  }
		else 
		  { 
			a.put(s6,s7);
			System.out.println("Your booking details\n");
			System.out.println("Seat_number : "+s6);
		  }
		  
	}
		

	public static void main(String[] args) 
	{
		System.out.println("Are you a \n1. Admin \n2. User : ");
		Scanner sc= new Scanner(System.in);
		int s = sc.nextInt();	
		if(s==1)
		{
			admin();
		}
		else 
		{
			System.out.println("Movie name : success\n"+"\nPlease enter the showtime you prefer\n"+"1. 9am to 12pm \n2. 1pm to 4pm \n3. 6pm to 9pm");
			int s4 = sc.nextInt();
			if(s4==1)
				showtime1();
			if(s4==2)
				showtime2();
			if(s4==3)
				showtime3();
			System.out.println("\nHurray!! Your seat is booked");
			System.out.println("\nIf you want to start booking again (y/n)?: ");
			   char ch=sc.next().charAt(0);
			   if(ch=='y')
			   {
			   main(args);
			   }
			  else
			  {
			   System.out.println("\nThank You for booking tickets ");
			   System.out.println("/nPlease enter how many tickets are booked by the customer");
				int n = sc.nextInt();
				payment(n);
			  }
			
		}
	}
	

}
