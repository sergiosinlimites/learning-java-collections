/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libreria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author ESTUDIANTE
 */
public class Libreria {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una clase Colleciones la cual posea un método estático llamado obtenerEditoriales() que devuelva una
        //lista de objetos editoriales que correspondan a la siguiente tabla Editoriales. El método deberá devolver una referencia a
        //la interfaz List y ser implementado internamente con una Arraylist.

         ArrayList<Editorial> misEditoriales = (ArrayList<Editorial>) Coleccion.obtenerEditoriales();
         System.out.println(misEditoriales);
        // Devuelve una lista con el hashCode de cada una de las editoriales


        // Cambie en el método obtenerEditoriales() la implementación de la lista a un LinkedList. Ejecute el
        //programa y saque conclusiones.
//        LinkedList<Editorial> misEditoriales = (LinkedList<Editorial>) Coleccion.obtenerEditorialesLinked();
//        System.out.println(misEditoriales);
        // Devuelve la referencia al apuntador del elemento siguiente en la lsita: [Libreria.Editorial@5fd0d5ae, Libreria.Editorial@2d98a335, Libreria.Editorial@16b98e56, Libreria.Editorial@7ef20235, Libreria.Editorial@27d6c5e0]

        // Cree en la clase Colecciones el método estático buscarEditorial, que busque en una lista de Editoriales un objeto con el id suministrado como parámetro y que devuelva el objeto editorial. Para buscar en la lista utilice un iterador
         try {
             System.out.println(Coleccion.buscarEditorial(misEditoriales, 5).getNombre());
         } catch (NullPointerException exception) {
             System.out.println("No existe una editorial con ese id");
             System.out.println("exception = " + exception);
         }

         // Cree el método estático obtenerLibros() que instancie los objetos Libros con sus objetos asociados y devuelva una lista de ellos. Para crear los objetos fíjese en las tablas a continuación. Codifique también un método que recorra la lista muestre en pantalla en forma tabular los datos del libro.

        ArrayList<Libro> misLibros = (ArrayList<Libro>) Coleccion.obtenerLibros();
        System.out.println("Mis libros son");
        try {
            for(int i = 0; i < misLibros.size(); i++){
                System.out.println(misLibros.get(i).detalles());
            }
        } catch (NullPointerException exception) {
            System.out.println("Hubo un error al presentar un libro");
        }

        // 5- En un reciente concurso las editoriales Wiley, Addison-Wesley y Pretince Hall obtuvieron el primer, segundo y tercer premio respectivamente. Cree el método obtenerEditorialesPremiadas() que devuelva un Map<String,Editorial> conteniendo las editoriales galardonadas como valores y un String referente al premio como clave. Utilice internamente los métodos obtenerEditoriales() para crearlas y buscarEditorial() para filtrarlas por su idEditorial conocido. Pruebe el método creado desde la clase principal.
        int[] idsGanadoras = {2,3,4};
        System.out.println((Coleccion.obtenerEditorialesPremiadas(idsGanadoras)));
    }


}
