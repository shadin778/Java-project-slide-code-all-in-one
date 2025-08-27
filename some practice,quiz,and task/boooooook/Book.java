import java.lang.*;
public class Book 

{
    private String bookName;
    private String bookAuthor;
    private String bookId;
    private String bookType;
    private int bookCopy;
    private static int bookCounter = 0;

    public Book() 
	{
		System.out.println("empty  Constructor");
    }

    public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) 
	{
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookType = bookType;
        this.bookCopy = bookCopy;
        bookCounter++;
		System.out.println("Parameterized constructor");
    }

    public String getBookName() 
	{
        return bookName;
    }

    public void setBookName(String bookName) 
	{
        this.bookName = bookName;
    }

    public String getBookAuthor() 
	{
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) 
	{
        this.bookAuthor = bookAuthor;
    }

    public String getBookId() 
	{
        return bookId;
    }

    public void setBookId(String bookId) 
	{
        this.bookId = bookId;
    }

    public String getBookType()
	{
        return bookType;
    }

    public void setBookType(String bookType)
	{
        this.bookType = bookType;
    }

    public int getBookCopy()
	{
        return bookCopy;
    }

    public void setBookCopy(int bookCopy) 
	{
        this.bookCopy = bookCopy;
    }

    public void ShowBookInfo() 
	{
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Type: " + bookType);
        System.out.println("Book Copies: " + bookCopy);
   }

    public void AddBookCopy(int x) 
	{
        bookCopy += x;
    }

    public static void totalNumberOfUniqueBooks() 
	{
        System.out.println("Total number of unique books: " + bookCounter);
    }

    public static void main(String[] args) 
	{
		Book b1=new Book("abcd", "efgh", "124-3-16", "Novel", 5);
		Book b2=new Book("ijk", "lmn", "343-3-16", "Novel", 3);
		Book b3=new Book("opq", "rst", "22-4861-4", "Novel", 2);
		Book b4=new Book("1984", "George Orwell", "978-3-16-148413-0", "Science Fiction", 4);
		Book b5=new Book();
		
        Book[] books = new Book[4];

        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        books[3] = b4;

        for (int i = 0; i < books.length; i++) 
		{
            books[i].ShowBookInfo();
            System.out.println();
        }

        Book.totalNumberOfUniqueBooks();
		
    }
}
