package javalibraryproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private Book b;
	ArrayList<Book> book=new ArrayList();
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book added sucessfully");
	}
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.out.println("there is no bokk");
		}
		else
		{
			for(Book b:book)
			{
				System.out.println(b);
			}
		}
	}
	public void findBook(int bookId)
	{
		for(Book b:book)
		{
			if(b.getId()==bookId)
			{
				System.out.println("Book found:"+b.getTitle());
			}
		}
	}
	int noofBooks=book.size();
	int barrowBookscount=0;
	public void barrowBook(String bookTitle)
	{
		for(Book b:book)
		{
			if(b.getTitle().equals(bookTitle))
			{
				System.out.println("Book is available take it");
				barrowBookscount--;
			}
			else
			{
				System.out.println("Book is not available");
			}
		}
	}
	public void returnBook()
	{
		if(noofBooks!=barrowBookscount)
		{
			System.out.println("please return the book");
		}
		else
		{
			System.out.println("all books are available");
		}
	}

}
