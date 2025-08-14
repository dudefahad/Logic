// /*5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection. */

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters & Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> al = new ArrayList<>();
        al.add(new Book("Verity", "Colleen", "123"));
        al.add(new Book("Physics", "Kafka", "1345"));
        al.add(new Book("Cosmos", "Helen", "544"));

        // Show current books
        System.out.println("\n--- Current Book Collection ---");
        for (Book b : al) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", ISBN: " + b.getIsbn());
        }

        // Operations
        System.out.println("\nSelect operation:");
        System.out.println("1 - Add a Book");
        System.out.println("2 - Remove a Book using ISBN");
        System.out.print("Please provide your input: ");

        int input = sc.nextInt();
        sc.nextLine(); // consume newline

        if (input == 1) {
            System.out.println("You have chosen to add a book.");
            System.out.print("Enter the Title: ");
            String title = sc.nextLine();
            System.out.print("Enter the Author: ");
            String author = sc.nextLine();
            System.out.print("Enter the ISBN: ");
            String isbn = sc.nextLine();

            al.add(new Book(title, author, isbn));
            System.out.println("Book added successfully!");
        } else if (input == 2) {
            System.out.print("Enter ISBN to remove: ");
            String isbnToRemove = sc.nextLine();

            boolean found = false;
            for (Book b : al) {
                if (b.getIsbn().equals(isbnToRemove)) {
                    al.remove(b);
                    found = true;
                    System.out.println("Book with ISBN " + isbnToRemove + " removed successfully.");
                    break;
                    
                }
                
            }
            if (!found) {
                System.out.println("Book with ISBN " + isbnToRemove + " not found.");
            }
        } else {
            System.out.println("Invalid input.");
        }

        // Final List
        System.out.println("\n--- Final Book Collection ---");
        for (Book b : al) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", ISBN: " + b.getIsbn());
            sc.close();
        }
        
    }
}



    //CHAT GPT PROGRAM

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Book {
//     private String title;
//     private String author;
//     private String isbn;

//     // Constructor
//     public Book(String title, String author, String isbn) {
//         this.title = title;
//         this.author = author;
//         this.isbn = isbn;
//     }

//     // Getters
//     public String getTitle() { return title; }
//     public String getAuthor() { return author; }
//     public String getIsbn() { return isbn; }

//     // Setters
//     public void setTitle(String title) { this.title = title; }
//     public void setAuthor(String author) { this.author = author; }
//     public void setIsbn(String isbn) { this.isbn = isbn; }

//     // Method to add a book
//     public static void addBook(ArrayList<Book> books, Scanner sc) {
//         System.out.print("Enter Title: ");
//         String title = sc.nextLine();
//         System.out.print("Enter Author: ");
//         String author = sc.nextLine();
//         System.out.print("Enter ISBN: ");
//         String isbn = sc.nextLine();

//         books.add(new Book(title, author, isbn));
//         System.out.println("✅ Book added successfully!");
//     }

//     // Method to remove a book by ISBN
//     public static void removeBook(ArrayList<Book> books, Scanner sc) {
//         System.out.print("Enter ISBN to remove: ");
//         String isbnToRemove = sc.nextLine();

//         boolean found = false;
//         for (Book b : books) {
//             if (b.getIsbn().equals(isbnToRemove)) {
//                 books.remove(b);
//                 System.out.println("✅ Book with ISBN " + isbnToRemove + " removed successfully.");
//                 found = true;
//                 break;
//             }
//         }

//         if (!found) {
//             System.out.println("❌ Book with ISBN " + isbnToRemove + " not found.");
//         }
//     }

//     // Method to display all books
//     public static void displayBooks(ArrayList<Book> books) {
//         if (books.isEmpty()) {
//             System.out.println("📚 No books in the collection.");
//         } else {
//             System.out.println("\n📖 Book Collection:");
//             for (Book b : books) {
//                 System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", ISBN: " + b.getIsbn());
//             }
//         }
//     }

//     // Main method with menu
//     public static void main(String[] args) {
//         ArrayList<Book> bookList = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);

//         // Add initial books
//         bookList.add(new Book("Verity", "Colleen", "123"));
//         bookList.add(new Book("Physics", "Kafka", "1345"));
//         bookList.add(new Book("Cosmos", "Helen", "544"));

//         int choice;
//         do {
//             System.out.println("\n📚 Book Manager Menu:");
//             System.out.println("1. Display all books");
//             System.out.println("2. Add a book");
//             System.out.println("3. Remove a book by ISBN");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");

//             while (!sc.hasNextInt()) {
//                 System.out.print("Please enter a valid number: ");
//                 sc.next(); // skip invalid input
//             }
//             choice = sc.nextInt();
//             sc.nextLine(); // consume leftover newline

//             switch (choice) {
//                 case 1:
//                     displayBooks(bookList);
//                     break;
//                 case 2:
//                     addBook(bookList, sc);
//                     break;
//                 case 3:
//                     removeBook(bookList, sc);
//                     break;
//                 case 4:
//                     System.out.println("👋 Exiting the program. Goodbye!");
//                     break;
//                 default:
//                     System.out.println("❌ Invalid choice. Please try again.");
//             }

//         } while (choice != 4);

//         sc.close();
//     }
// }
