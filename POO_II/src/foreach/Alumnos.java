/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foreach;

/**
 *
 * @author elizabeth
 */
public class Alumnos{
    
    private String nombre;
    private double promedio;

    public Alumnos(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    } 

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public String toString(){
        return nombre + "( "+promedio+" )";
    }
    
    
}

