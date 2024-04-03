import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Book {
    private String title;
    private Integer price;
    private Integer stock;
    private List<Autor> authors;

    public Book(String title, Integer price, Integer stock, List<Autor> authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public List<Autor> getAuthors() {
        return authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setAuthors(List<Autor> authors) {
        this.authors = authors;
    }

    public String printText()
    {
        String chain = "Title: " + title + "\nAuthor: ";
        for (int i = 0;i<authors.size();i++){
            chain += authors.get(i).showAuthor() + "\n       ------------------------";
        }
       chain += "\nPrice: $" + price + "\nStock: " + stock;

        return chain;
    }
}
