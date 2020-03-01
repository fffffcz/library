package library.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    public Book(Book entity) {
        this.id=entity.id;
        this.isbn=entity.isbn;
        this.author=entity.author;
        this.position=entity.position;
        this.categoryId=entity.categoryId;
        this.lendable=entity.lendable;
        this.publish=entity.publish;
        this.bookName=entity.bookName;
        this.price=entity.price;
        this.description=entity.description;
    }
    public Book(){}

    @Id   //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自动生成
    private Long id;
    private String bookName;
    private String isbn;
    private String author;
    private double price;
    private String position;
    private int categoryId;
    private byte lendable=1;
    private  String description;
    private  String publish;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", position='" + position + '\'' +
                ", categoryId=" + categoryId +
                ", lendable=" + lendable +
                ", description='" + description + '\'' +
                ", publish='" + publish + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public byte getLendable() {
        return lendable;
    }

    public void setLendable(byte lendable) {
        this.lendable = lendable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }
}

