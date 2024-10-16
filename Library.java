import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    //adding books to the library

    public void addBooks(Book book){
        books.add(book);
        System.out.println("Book was added to the library");
    }

    //removing books from library
    public void removeBooks(String isbn){
        books.removeIf(book-> book.getIsbn().equals(isbn));
        System.out.println("Book was removed");
    }

    //search for the books by name
    public List<Book> searchBookByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){    //if the title of the book is equal to the title of a book from the list, then it will result in the book being added to the search
                result.add(book);
            }
        }
        return result;
    }

    //issuing a book to a member
    public void issueBook(String isbn, Member member){
    for(Book book : books){
        if(book.getIsbn().equals(isbn) && book.isAvailable()){
            member.issuedBooks(book);
            return ;
        }
    }
    System.out.println("Book wasn't found or isn't available");
}

}
