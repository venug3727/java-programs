import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int numpages;

    public Book(String name, String author, double price, int numpages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numpages = numpages;
    }

    public String getDetails() {
        return "Name: " + name + "\nAuthor: " + author + "\nPrice: $" + price + "\nNumber of pages: " + numpages;
    }

    public String toString() {
        return getDetails();
    }
}

public class Main1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books:");
        int n = sc.nextInt();
        Book[] b = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for book " + (i + 1) + ":");
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Author:");
            String author = sc.next();
            System.out.println("Price: $");
            double price = sc.nextDouble();
            System.out.println("Number of pages:");
            int numpages = sc.nextInt();
            b[i] = new Book(name, author, price, numpages);
        }

        System.out.println("\nDetails of books:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + ":\n" + b[i]);
        }
    }
}