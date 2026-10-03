/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach;

import java.util.Arrays;

/**
 *
 * @author elizabeth
 */

class Alumno{
    
    private String nombre;
    private double promedio;

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }   
    
}



//MAIN
public class Desafios {
    public static void main(String[] args) {
        
        //inicializar contador de palbras que tengan más de 5 letras
        int contador = 0;
        
        System.out.println("\n========= DESAFIO 1: Contar palabras =========");
        
        //crear array con las palabras
        String[] palabras = {"sol","computadora","mesa","algoritmo", "luz"};
        //Validar si tienen más de 5 letras
        
        for (String p: palabras){
            if (p.length()>= 5){
                
                //sumar al cobatdor
                contador+=1;
            }
        }
        //mostrar resultado
        System.out.println("Hay "+contador+" palabras con más de 5 letras");
        
        
        System.out.println("\n========= DESAFIO 2: Mostrar Alumnos =========");
        
        
        //Crear array cob alumnos
        Alumno[] grupo = {
            new Alumno("Ana",9.8),
            new Alumno ("Jose", 8.7),
            new Alumno ("Juan",7.0),
            new Alumno ("Isac", 8.9),
            new Alumno ("Sandy", 9.9)
               
        
        };
        //use ciclo for normal porque de esrta manera podemos obtener el indice y asi mostrar alumno 1 de 5
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("\nNombre: "+grupo[i].getNombre()+" - Promedio: "+grupo[i].getPromedio());
            System.out.println("Alumno "+ (i+1)+ " de 5");
            
            
        }
       
        
        System.out.println("\n========= DESAFIO 3: Mostrar Promedio más alto =========");
        //inicializar variable que almacena el valor del más alto
        double masAlto = 0;
        String nombreMasAlto = " ";
        
        //con for each hacer la comparación para obtener el promedio más alto
        for(Alumno alum: grupo){ 
            if (alum.getPromedio()>masAlto){
                masAlto = alum.getPromedio();
                nombreMasAlto = alum.getNombre();
            }   
        }
        //mostrar resultado
        System.out.println("El promedio más alto es "+ masAlto);
        System.out.println("Su nombre es: "+nombreMasAlto);
        
        
        System.out.println("\n========= DESAFIO 4 =========");
        //Este código intenta duplicar cada precio de un arreglo, pero no funciona
        
        double[] precios = {100.0, 250.0, 80.0};
        //cambio de ciclo for each a for normal 
        // for normal modifica 
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i]*2;
            
        }
        System.out.println(Arrays.toString(precios));

    }
    
}
