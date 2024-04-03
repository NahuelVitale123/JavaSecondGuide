public class Autor {
    private String nombre;
    private String apellido;
    private String genero;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Autor(String nombre, String apellido, String genero, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String showAuthor(){
        String chain ="\n       Name: " + nombre + "\n       LastName: " + apellido + "\n       Gender: " + genero + "\n       Email: " + email;
        return chain;
    }
}
