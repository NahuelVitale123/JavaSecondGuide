import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Autor aut = new Autor("joshua", "bloch","m", "joshua@email.com");
        aut.showAuthor();
        Book bookN1 = new Book("Effective java", 450, 150, aut);
        bookN1.setPrice(bookN1.getPrice()+500);
        bookN1.setStock(bookN1.getStock()+50);
        bookN1.printText();
        bookN1.getAutor().showAuthor();
         */

        List<Autor> authors = new ArrayList<Autor>();
        authors.add(new Autor("joshua", "bloch","m", "joshua@email.com"));
        authors.add(new Autor("jose", "vitale","m", "jose@email.com"));
        authors.add(new Autor("julian", "filartiga","m", "julian@email.com"));

        Book bookN1 = new Book("Effective java", 450, 150, authors);
        String show = bookN1.printText();
        System.out.println(show);
    }
}

/*Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Dog dog = (Dog) o;
    return Objects.equals(name, dog.name) && Objects.equals(species, dog.species);
} */