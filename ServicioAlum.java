/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package alumnoapp.Servicio;

import alumnoapp.entidades.Alum;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioAlum {
   Scanner leer= new Scanner(System.in);
   
   private  ArrayList<Integer> notas= new ArrayList();
   private  ArrayList<Alum> Alumnos= new ArrayList();
    
   public void crearAlumno(){
       System.out.println("Ingresar nombre del alumno");
       Alum A= new Alum();
       A.setNombre(leer.next());
       Alumnos.add(A);
       System.out.println("Ingresar 3 notas");
       for(int i=0; i<3;++i){
           notas.add(leer.nextInt());
       }
         A.setNotas(notas);
    }
   
      public int notaFinal(ArrayList<Integer>notas){
        int cont=0;
        for( Integer aux : notas){
        cont= cont+ aux;
       
    }
       return cont/3;
}
    public void buscarAlumno(){
        String busca;
        System.out.println("Ingrese el nombre de un alumno que desea promediar");
        busca=leer.next();
        Iterator<Alum> it= Alumnos.iterator();
        while(it.hasNext()){
            Alum var= it.next();
            if(var.getNombre().equals(busca)){
               notaFinal(var.getNotas());
            }
        }
        
     
   }
 
}

