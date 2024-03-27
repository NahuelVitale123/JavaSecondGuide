import java.util.Random;

public class Client {
    String id;
    String name;
    String email;
    Double discount;
    public Client() {
        this.id = randomId();
    }

    public String randomId() {
        Random aleatorio = new Random();
        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadena = "";
        int numero;
        int forma;
        int forma2;
        forma = (int) (aleatorio.nextDouble() * alfa.length() - 1 + 0);
        forma2 = (int) (aleatorio.nextDouble() * alfa.length() - 5 + 0);
        numero = (int) (aleatorio.nextDouble() * 99 + 100);
        cadena = cadena + alfa.charAt(forma) + alfa.charAt(forma2) + numero;
        return cadena;
    }
    public void showClient(){
        System.out.println(id);
    }
}
