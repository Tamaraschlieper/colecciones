
package alumnoapp;

import alumnoapp.Servicio.ServicioAlum;
import java.util.Scanner;


public class Alumnoapp {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        ServicioAlum serv= new ServicioAlum();
        
        serv.crearAlumno();
        String respuesta = null;        
        do{
            System.out.println("¿Desea ingresar otro alumno?");
            respuesta=leer.next();
            if(respuesta.equals("si")){
            serv.crearAlumno();
            }else if(respuesta.equals("no")){
                System.out.println("No se cargan mas alumnos");
            }
        }while(respuesta.equals("si"));
       
        serv.buscarAlumno();
    }
       
}
