import java.util.Scanner;

class Book
{
	private String name;
	private String author;
	private double price;
	private int numPages;


        public Book(String name,String author,double price,int numPages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.numPages=numPages;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}

	public void setPrice(double Price)
	{
		this.price=price;
	}

	public void setNumPages(int numPages)
	{
		this.numPages=numPages;
	}

	public String getName()
	{
		return name;
	}

	public String getAuthor()
	{
		return author;
	}

	public double getPrice()
	{
		return price;
	}

	public int getNumPages()
	{
		return numPages;
	}

	public String toString()
	{
		return "\nBook Details:\nName:"+name+"\nAuthor:"+author+"\nPrice:Rs"+price+"\nNumber of pages:"+numPages;
	}
}


public class BookTest
{
	public static void main(String [] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Manvi 1BM22CS149");
		System.out.println("Enter number of books:");
		int n=s1.nextInt();

		Book[] books=new Book[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details for book"+(i+1)+":");
			s1.nextLine();

			System.out.println("enter book name:");
			String name=s1.nextLine();
			System.out.println("Enter author name:");
			String author=s1.nextLine();

			System.out.println("enter price:$");
			double price = s1.nextDouble();

			System.out.println("enter number of pages:");
			int numPages=s1.nextInt();

			books[i]=new Book(name,author,price,numPages);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("\n Details of Book"+(i+1)+ ":"+ books[i]);
		}
		s1.close();

	}
}