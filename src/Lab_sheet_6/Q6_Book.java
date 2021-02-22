package Lab_sheet_6;

public class Q6_Book {
  public static void main(String[] args) {
    Book book = new Book("101",
            "The theory of everything",
            "Steven Hawkings",1500);
    System.out.println("Book "+ book.getName()+"\nBook code "+ book.getBookCode()+
            "\nAuthor "+ book.getAuthor()+"\nPrice "+ book.getPrice());
  }
}
class Book {
  private String bookCode,
                 name,
                 author;
  private int price;

  public Book(String bookCode, String name, String author, int price) {
    this.bookCode = bookCode;
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public String getBookCode() {
    return bookCode;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public int getPrice() {
    return price;
  }
}