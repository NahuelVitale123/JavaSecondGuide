public class Book {
    private String title;
    private Integer price;
    private Integer stock;
    private Autor autor;

    public Book(String title, Integer price, Integer stock, Autor autor) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.autor = autor;
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

    public Autor getAutor() {
        return autor;
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

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void printText()
    {
        System.out.println("El libro " + getTitle() + " de " + getAutor().getNombre() + " se vende a " + getPrice() + " pesos");
    }
}
