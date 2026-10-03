package arraylist;
import java.util.ArrayList;

class Alumno {
    private String nombre;
    private int edad;
    private boolean pagoCompleto;

    public Alumno(String nombre, int edad, boolean pagoCompleto) {
        this.nombre = nombre;
        this.edad = edad;
        this.pagoCompleto = pagoCompleto;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public boolean getPagoCompleto() { return pagoCompleto; }
    public void setPagoCompleto(boolean pagoCompleto) { this.pagoCompleto = pagoCompleto; }

    @Override
    public String toString() {
        return nombre + " (" + edad + " anios, pago: " + (pagoCompleto ? "completo" : "pendiente") + ")";
    }
}

public class Taller {
    public static void main(String[] args) {
        //PARTE 1
        //craer lista de alumnos inscritos
        System.out.println("=== LISTA DE ALUMNOS INSCRITOS ===");
        ArrayList<Alumno> inscritos = new ArrayList<>();

        //agregar alumnos a la lista
        inscritos.add(new Alumno("Ana",8,true));
        inscritos.add(new Alumno("Luis",9,false));
        inscritos.add(new Alumno("Rosa",12,true));
        inscritos.add(new Alumno("Liz",13,false));
        inscritos.add(new Alumno("Gael",7,true));
        inscritos.add(new Alumno("Oscar",4,false));
        inscritos.add(new Alumno("Sofia",15,true));
        inscritos.add(new Alumno("Josue",6,true));
        inscritos.add(new Alumno("Valentin",12,false));

        //mostrar alumnos de la lista y tamaño del array
        for (Alumno a : inscritos) {
            System.out.println(a); // Imprime a cada alumno 
        }
        System.out.println("Total de alumnos inscritos: "+inscritos.size());

        //PARTE 2
        //buscar y modificar
        System.out.println("\n=== BUSCAR Y MODIFICAR ===");
        //alumno a buscar
        String buscado = "Luis";

        //Recorrer con foreach y modificar su pago
        for (Alumno a : inscritos) {
            if(a.getNombre().equals(buscado)){
                //modificar su estado de pago
                a.setPagoCompleto(true);
                break;
            }
            
        }

        //agrrgar a almuno en la posición cero
        inscritos.add(0,new Alumno("Samantha", 9, true));

        //corrección de edad de unb alumo
        inscritos.set(8, new Alumno("Josue", 7, true));

        //mostrar lista con datos correjidos
        System.out.println("\nLista correcta");
        for (Alumno a : inscritos) {
            System.out.println(a); // Imprime a cada alumno 
        }

        //PARTE 3
        System.out.println("\n=== RECORRER Y ACUMULAR ===");
        System.out.println("\nAlumnos menores de 12 años");

        for (Alumno a : inscritos) {
            if(a.getEdad()<12){
                //mostrar menores de 12
                System.out.println(a.getNombre());
            }
            
        }

        System.out.println("\nAlumnos con pago pendiente:");

        for (Alumno a : inscritos) {
            if(!a.getPagoCompleto()){
                //mostrar con pago pendiente
                System.out.println(a.getNombre());
            }
            
        }

        //suma de edades y calculo de edad promedio
        double suma = 0.0;
        for (Alumno a : inscritos) {
            suma += a.getEdad();
            
        }
        System.out.println("\nEdad promedio: "+suma/inscritos.size());


        //Alumno con mayor edad
        int mayorEdad = 0;
        String nomMayorEdad = "";
        for (Alumno a : inscritos) {
            if(a.getEdad()> mayorEdad){
                nomMayorEdad = a.getNombre();
                mayorEdad = a.getEdad();
            }
            
        }
        System.out.println("\nAlumno con mayor edad: "+nomMayorEdad);

        for (Alumno a : inscritos) {
            System.out.println(a); 
        }

        //PARTE 4
        //usar for para eliminar a alumnos que no han pagado
        System.out.println("\n=== ELIMINAR Y REPORTE FINAL ===");
        for(int i = inscritos.size()-1; i>0; i--){
            if (inscritos.get(i).getPagoCompleto() == false) {
                inscritos.remove(i);
            }
        }
        

        //lista de alumnos con pago completo
        System.out.println("Lista de alumnos con pago compelto: ");
        for (Alumno a : inscritos) {
            System.out.println(a); 
        }

        //mostrar y calcular lugares disponibles
        int lugaresTotales = 20;
        int lugaresDisponibles = lugaresTotales - inscritos.size();
        System.out.println("\nLugares disponibles en el taller: " + lugaresDisponibles);



    }
    
    
}