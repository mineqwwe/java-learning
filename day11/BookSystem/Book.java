package day11.BookSystem;

public class Book {
    private String ID;
    private String name;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String iD, String name, String author, int price) {
        ID = iD;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [ID=" + ID + ", name=" + name + ", author=" + author + ", price=" + price + "]";
    }
}
