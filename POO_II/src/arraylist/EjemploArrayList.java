/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

import foreach.Alumnos;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author elizabeth
 */
public class EjemploArrayList {
    public static void main(String[] args) {
        
        //creación de una lista vacia del tipo alumno
        System.out.println("==== Crear lista vacia ====");
        ArrayList<Alumnos> grupo = new ArrayList<>();
        System.out.println("Lista recien creada: "+grupo);
        System.out.println("¿Está vacía? "+grupo.isEmpty());
        
        
        //agrgar datos
        System.out.println("\n === Agregar alumnos con add(elemento) ===");
        grupo.add(new Alumnos("Ana",8.7));
        grupo.add(new Alumnos("Luis",5.2));
        grupo.add(new Alumnos("Marco",7.7));
        grupo.add(new Alumnos("Sofia",9.7));
        grupo.add(new Alumnos("Juan",4.7));
        
        System.out.println("Lista tras agregar alumnos: "+grupo);
        System.out.println("Tamaño actual: "+grupo.size());
        
        //inserción por posición
        System.out.println("\n === Agregar alumnos con add(indice,elemento) ===");
        grupo.add(2,new Alumnos("Diego",6.5));
        System.out.println("Lista actualizada: "+grupo);
        
        //acceder y modificar
        System.out.println("\n === Leer con get() y modificar con set() ====");
        Alumnos primero = grupo.get(0);
        System.out.println("Primero en la lista: "+primero);
        
        grupo.set(1, new Alumnos ("Luis",7.8));
        System.out.println("Lista con calificación de luis corregida "+grupo);
        
       //
        
        
        //recorrer con foreach (solo lectura)
        System.out.println("\n === Recorrer con for each ===");
        for(Alumnos alum: grupo){
            System.out.println(" "+alum);
        }
        
        
        //recorrer el arreglo para procesar y modificar
        System.out.println("\n === Aplicar 0.5 pts a quien tenga menos de 7 ===");
        for (int i = 0; i < grupo.size(); i++) {
            Alumnos alum = grupo.get(i);
            if(alum.getPromedio()<7.0){
                alum.setPromedio(alum.getPromedio()+0.5);
            }
            
        }
        System.out.println("Lista despues del ajuste: "+grupo);
        
        
        //Eliminar
        System.out.println("\n === Eliminar con remove(indice) y remove (objeto) ===");
        grupo.remove(0);
        System.out.println("Tras eliminación: "+grupo);
        
        
        
        System.out.println(primero);
        
        grupo.remove(primero);
        
        System.out.println("Tras eliminación: "+grupo);
        
        //Promedio final
        System.out.println("Promedio general y aprobados");
        double suma = 0;
        int aprobados = 0;
        
        
                
        for(Alumnos alum: grupo){
            suma += alum.getPromedio();
            if(alum.getPromedio()>=7.0){
                aprobados++;
            }
        
        }
        double promedioGrupo = grupo.isEmpty() ? 0:suma/grupo.size();
        /*if(grupo.isEmpty()){ 
        promedioGrupo = 0;
        }else{
            promedioGrupo = suma / grupo.size();
        }*/
        System.out.printf("Promedio general: %.2f", promedioGrupo);
        System.out.println("Promedio general: "+String.format("%.2f", promedioGrupo));
        System.out.println("Alumnos aprobadds "+aprobados+ " de "+grupo.size());
        
       
        //vaciar lista 
        System.out.println("\n === Vaciar la loista con clar() ===");
        grupo.clear();
        System.out.println("Lista final "+grupo);
        System.out.println("¿Esta vacia? "+grupo.isEmpty());
        
        
        
        
        boolean isAna = grupo.contains(primero);
        System.out.println("Primero "+primero);
        System.out.println("Constains() compara el mismo objeto, no el nombre: "+isAna);
        int posicionAlum = -1;
        
        for (int i = 0; i < grupo.size(); i++) {
            if(grupo.get(i).getNombre().equals("Marco"));{
            
            posicionAlum = i;
            }
            
        }
        System.out.println("Marco esta en la posicion: "+posicionAlum);
        
        
         //buscar
        ArrayList<String> nombres = new ArrayList<>(); 
        nombres.add("Anaa");
        nombres.add("Luiss");
        nombres.add("Marcoo");
        nombres.add("Sofiaa");
        nombres.add("Juann");
       
        
        System.out.println(nombres);
        
        System.out.println("\n === Buscar con contains() y indexOf() ===");
        
        System.out.println("contains(\"Marcoo\") " + nombres.contains("Marcoo"));
        System.out.println("contains(\"Pablo\") " + nombres.contains("Pablo"));
        
        System.out.println("Index of devuelve la posición y si no existe da -1");
        
        System.out.println("indexOf(\"Marcoo\") " + nombres.indexOf("Marcoo"));
        System.out.println("indexOf(\"Pablo\") " + nombres.indexOf("Pablo"));
        
        
        System.out.println("Elementos repeditos con index of");
        System.out.println("indexOf(\"Luiss\") " + nombres.indexOf("Luiss"));
        System.out.println("lastIndexOf(\"Luiss\") " + nombres.lastIndexOf("Luiss"));
        
        
        //Es sensible a mayusculas mi minusculas 
        
        
        
        
        
        
    }   
}
