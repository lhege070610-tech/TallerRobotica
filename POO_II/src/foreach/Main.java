/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach;

/**
 *
 * @author elizabeth
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Alumnos[] grupo = new alumnos[5];
        Alumnos[] grupo = {
            new Alumnos("Ana",9.8),
            new Alumnos ("Jose", 8.7),
            new Alumnos ("Juan",7.0)
        
        };
        
        System.out.println("======= FOR EACH =======");
        
        for(Alumnos alum: grupo){
            System.out.println("Nombre: "+alum.getNombre()+" - Promedio: "+alum.getPromedio());
           
        }
        System.out.println("n======= FOR NORMAL =======");
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("Nombre: "+grupo[i].getNombre()+" - Promedio: "+grupo[i].getPromedio());
            
            
        }
        
    }


}
