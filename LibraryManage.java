import java.util.Scanner;

public class LibraryManage {
    public static void main(String[] args){
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456");
        library.addBooks(book1);
        Member member1 = new Member("John Doe", "M001");

        boolean running = true;
        while(running){
            System.out.println("1: Add Book");
            System.out.println("2: Issue Book");
            System.out.println("3: Return Book");
            System.out.println("4: Exit");
            int choice = scanner.nextInt();

            switch(choice){
             case 1: 
                System.out.println("Enter title:");
                String title = scanner.next();
                System.out.println("Enter author");
                String author = scanner.next();
                System.out.println("Enter isbn");
                String isbn = scanner.next();
                break;
            case 2:
                System.out.println("Enter isbn to issue:");
                isbn = scanner.next();
                library.issueBook(isbn, member1);
                break;
            case 3:
               System.out.println("Enter isbn to return book");
               isbn = scanner.next();
               for(Book book : library.searchBookByTitle(isbn)){
                if (!book.isAvailable()){
                    member1.returnBook(book);
                    System.out.println("Book was returned");
                }else{
                    System.out.println("The book wasn't issued");
                }
                
               }
               break;
            case 4: 
            running = false;
            break;
            }

        }
        scanner.close();
    }
}
