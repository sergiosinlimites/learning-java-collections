package Libreria;

import java.util.List;
import java.util.Properties;

public class Libro {
    private int idLibro = 0;
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(int idLibro, String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.idLibro = idLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public String detalles(){
        Properties properties = new Properties();
        properties.put("Id", this.idLibro);
        properties.put("Titulo", this.titulo);
        properties.put("ISBN", this.isbn);
        properties.put("Autor", this.autor.getNombre());
        properties.put("Editorial", this.editorial.getNombre());
        properties.put("Titulo", this.titulo);
        return properties.toString();
    }
}
