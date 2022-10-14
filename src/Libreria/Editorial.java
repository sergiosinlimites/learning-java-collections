/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

/**
 *
 * @author ESTUDIANTE
 */
public class Editorial {
    private int idEditorial;
    private String nombre = null;
    public Editorial(int idEditorial, String nombre){
        this.idEditorial = idEditorial;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getIdEditorial(){
        return idEditorial;
    }
    
    
}
