import java.util.ArrayList;
import java.util.List;

public class Member {
private String name;
private String ID;
private List<Book> issuedBooks;

public Member(String name, String ID){
    this.name = name;
    this.ID = ID;
    this.issuedBooks = new ArrayList<>();
}

//issues a book to anyone who wants to check one out

public void issuedBooks(Book book){
    if(book.isAvailable()){
        issuedBooks.add(book);
        book.setAvailable(false);
        System.out.println("Book was successfully issued");
    }else{
        System.out.println("Book couldn't be checked out");
    }

}

//returning books
public void returnBook(Book book){
if(book.isAvailable()){
    issuedBooks.remove(book);
    book.setAvailable(true);
    System.out.println("Book was successfully returned");
} else{
    System.out.println("This member does not have this book");
    }

    }

    @Override
    public String toString(){
        return "Member [name: " + name + ", Member ID: "+ ID + "]";
    }


}
