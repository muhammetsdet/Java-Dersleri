package j23_Encapsulation.Task.Task05;

public class Book {
 /*   task->
    Book class'ında valuelari girilen bookName ve authorName (String ) İki tane attributes(fields) oluşturunuz.
    Book class'ını datahiding(encapsulated) yapınız. (Encapsulate)->pojo
    BookRunner class'ın içine object  create edip print eden code create ediniz.
            "Book name is BOOKNAME and Author is AUTHORNAME"
  */
   private String bookName;
   private String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return
                "Book name is " + bookName +
                " and Author is  " + authorName ;
    }
}
