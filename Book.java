package javalibraryproject;

public class Book {
	private String title;
	private int id;
	private int cost;
	private String author;
	private int noOfPages;
	public Book()
	{
		
	}
	public Book(String title, int id, int cost, String author, int noOfPages) {
		this.title = title;
		this.id = id;
		this.cost = cost;
		this.author = author;
		this.noOfPages = noOfPages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", id=" + id + ", cost=" + cost + ", author=" + author + ", noOfPages="
				+ noOfPages + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	

}
