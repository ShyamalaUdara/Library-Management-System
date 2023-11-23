package javalibraryproject;
import java.util.Scanner;
import java.util.ArrayList;
public class BookDriver {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		boolean start=true;
		while(start)
		{
			System.out.println("choose choice---> \n 1.addBook \n 2.displayBook \n 3.findBook \n 4.barrowBook\n 5.returnBook\n 6.exit\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
			{
			System.out.println("Enter the book title:");
			String title=sc.next();
			System.out.println("Enter the book id");
			int id=sc.nextInt();
			System.out.println("Enter the book cost");
			int cost=sc.nextInt();
			System.out.println("Enter the book author:");
			String author=sc.next();
			System.out.println("Enter the book no of pages");
			int noOfPages=sc.nextInt();
			l.addBook(new Book(title,id,cost,author,noOfPages));
			}
			break;
		case 2 :
				
			{
				l.displayBook();
			}
			break;
			case 3:
			{
				System.out.println("enter book id");
				int bookId=sc.nextInt();
				l.findBook(bookId);
			}
			break;
			case 4:
			{
				System.out.println("enter book title");
				String bookTitle=sc.next();
					 l.barrowBook(bookTitle);	
			}
			break;
			case 5:
			{
				l.returnBook();
			}
			break;
			case 6:
			{
				System.out.println("Thank you.... :)");
				start=false;
			}
			break;
			default:System.out.println("choose correct optoion");
			}
		}
	}
}
