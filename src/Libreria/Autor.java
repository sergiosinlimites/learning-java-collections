package Libreria;

public class Autor extends Persona {
    private String codAutor;

    public Autor(int idPersona, String nombre, String apellido, String codAutor) {
        super(idPersona, nombre, apellido);
        this.codAutor = codAutor;
    }

    public String getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(String codAutor) {
        this.codAutor = codAutor;
    }
}
