/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.*;

/**
 *
 * @author ESTUDIANTE
 */
public class Coleccion {
    static String[] inicioCodigos = {"CO", "US"};

    public static String generarCodigoAutor(int numAutor){
        return inicioCodigos[0] + numAutor;
    }

    public static List<Editorial> obtenerEditoriales(){
        Editorial miEditorial1 = new Editorial(1, "Pretince Hall");
        Editorial miEditorial2 = new Editorial(2, "Wiley");
        Editorial miEditorial3 = new Editorial(3, "Wrox");
        Editorial miEditorial4 = new Editorial(4, "Addison Wesley");
        Editorial miEditorial5 = new Editorial(5, "O ́Reilly");
        
        List<Editorial> listaEditoriales = new ArrayList<Editorial>();
        
        listaEditoriales.add(miEditorial1);
        listaEditoriales.add(miEditorial2);
        listaEditoriales.add(miEditorial3);
        listaEditoriales.add(miEditorial4);
        listaEditoriales.add(miEditorial5);
        
        return listaEditoriales;
    }

    public static List<Editorial> obtenerEditorialesLinked(){
        Editorial miEditorial1 = new Editorial(1, "Pretince Hall");
        Editorial miEditorial2 = new Editorial(2, "Wiley");
        Editorial miEditorial3 = new Editorial(3, "Wrox");
        Editorial miEditorial4 = new Editorial(4, "Addison Wesley");
        Editorial miEditorial5 = new Editorial(5, "O´Reilly");

        List<Editorial> lista = new LinkedList<Editorial>();
        lista.add(miEditorial1);
        lista.add(miEditorial2);
        lista.add(miEditorial3);
        lista.add(miEditorial4);
        lista.add(miEditorial5);
        return lista;
    }

    public static Editorial buscarEditorial(ArrayList<Editorial> editoriales, int idEditorial){
        Iterator<Editorial> it = editoriales.iterator();
        Editorial editorialEncontrada = null;
        while(it.hasNext()){
            editorialEncontrada = (Editorial) it.next();
            if(editorialEncontrada.getIdEditorial() == idEditorial){
                return editorialEncontrada;
            }
        }
        return null;
    }

    public static Editorial buscarEditorialPorId(ArrayList<Editorial> editoriales, int id){
        Iterator<Editorial> it = editoriales.iterator();
        Editorial editorialEncontrada = null;
        while(it.hasNext()){
            editorialEncontrada = (Editorial) it.next();
            if(editorialEncontrada.getIdEditorial() == id){
                return editorialEncontrada;
            }
        }
        return null;
    }

    public static Editorial buscarEditorialPorNombre(ArrayList<Editorial> editoriales, String nombre){
        Iterator<Editorial> it = editoriales.iterator();
        Editorial editorialEncontrada = null;
        while(it.hasNext()){
            editorialEncontrada = (Editorial) it.next();
            if(editorialEncontrada.getNombre().equals(nombre)){
                return editorialEncontrada;
            }
        }
        return null;
    }

    public static List<Autor> obtenerAutores(){
        Autor nuevoAutor1 = new Autor(1,"Bruce","Eckel", generarCodigoAutor(1));
        Autor nuevoAutor2 = new Autor(2,"James","McGovern", generarCodigoAutor(2));
        Autor nuevoAutor3 = new Autor(3,"Ivor","Horton", generarCodigoAutor(3));
        Autor nuevoAutor4 = new Autor(4,"Joshua","Bloch", generarCodigoAutor(4));
        Autor nuevoAutor5 = new Autor(5,"Jonathan","Knudsen", generarCodigoAutor(5));

        ArrayList<Autor> listaAutores = new ArrayList<Autor>();

        listaAutores.add(nuevoAutor1);
        listaAutores.add(nuevoAutor2);
        listaAutores.add(nuevoAutor3);
        listaAutores.add(nuevoAutor4);
        listaAutores.add(nuevoAutor5);

        return listaAutores;
    }

    public static Autor buscarAutorPorNombreCompleto(ArrayList<Autor> autores, String nombre, String apellido){
        Iterator<Autor> it = autores.iterator();
        Autor autorEncontrado = null;
        while(it.hasNext()){
            autorEncontrado = (Autor) it.next();
            if(autorEncontrado.getNombre().equals(nombre) && autorEncontrado.getApellido().equals(apellido)){
                return autorEncontrado;
            }
        }
        return null;
    }

    public static List<Libro> obtenerLibros(){
        ArrayList<Editorial> editoriales = (ArrayList<Editorial>) obtenerEditoriales();
        ArrayList<Autor> autores = (ArrayList<Autor>) obtenerAutores();

        Libro nuevoLibro1 = new Libro(
                1,
                "Thinking in Java",
                "1-2256",
                buscarAutorPorNombreCompleto(autores, "Bruce", "Eckel"),
                buscarEditorialPorNombre(editoriales, "Pretince Hall")
        );

        Libro nuevoLibro2 = new Libro(
                2,
                "Java 2 Enterprise Edition 1.4 Bible",
                "2-7985",
                buscarAutorPorNombreCompleto(autores, "James", "McGovern"),
                buscarEditorialPorNombre(editoriales, "Wiley")
        );

        Libro nuevoLibro3 = new Libro(
                3,
                "Beginning Java 2 JDK5 Edition",
                "1-9857",
                buscarAutorPorNombreCompleto(autores, "Ivor", "Horton"),
                buscarEditorialPorNombre(editoriales, "Wrox")
        );

        Libro nuevoLibro4 = new Libro(
                4,
                "Effective Java",
                "0-1537",
                buscarAutorPorNombreCompleto(autores, "Joshua", "Bloch"),
                buscarEditorialPorNombre(editoriales, "Addison Wesley")
        );

        Libro nuevoLibro5 = new Libro(
                5,
                "Learning Java",
                "0-956547",
                buscarAutorPorNombreCompleto(autores, "Jonathan", "Knudsen"),
                buscarEditorialPorNombre(editoriales, "O ́Reilly")
        );

        ArrayList<Libro> listaLibros = new ArrayList<Libro>();
        listaLibros.add(nuevoLibro1);
        listaLibros.add(nuevoLibro2);
        listaLibros.add(nuevoLibro3);
        listaLibros.add(nuevoLibro4);
        listaLibros.add(nuevoLibro5);

        return listaLibros;
    }

    public static Map<String, Editorial> obtenerEditorialesPremiadas(int[] idsEditoriales){
        ArrayList<Editorial> posiblesEditoriales = (ArrayList<Editorial>) obtenerEditoriales();
        Map<String, Editorial> listaSeleccionada = new LinkedHashMap<String,Editorial>();
        for(int i = 0; i < idsEditoriales.length; i++){
             Editorial editorialGanadora = buscarEditorialPorId(posiblesEditoriales, idsEditoriales[i]);
            listaSeleccionada.put("Ganadora premio " + (i+1), editorialGanadora);
        }
        return listaSeleccionada;
    }

}
