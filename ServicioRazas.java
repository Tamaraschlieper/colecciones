/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package mascotaapp.servicios;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import mascotaapp.entidades.Razas;

public class ServicioRazas {
    
    Scanner leer= new Scanner(System.in);
    
    private ArrayList<Razas>lasRazas= new ArrayList();
    private String raza, respuesta;
    
    
    public void PedirRaza(){
        System.out.println(" Ingresar raza del perro");
        Razas raz= new Razas();// creo un objeto con las caracteristicas de la clase
        
        raz.setRaza(leer.next()); // guardo lo que el usuario ingresa en el set 
        
        lasRazas.add(raz);// y ese objeto raz lo agrego a la lista de ArrayList
     }
   
    public void VariasRazas(){
        do{
            System.out.println(" Desea ingresar otra raza o desea salir");
            respuesta=leer.next();
            if( respuesta.equals("si")){
                PedirRaza();
            }else
                for (Razas var: lasRazas){
                System.out.println(var.getRaza());
            }
        }while(respuesta.equals("si"));
    }
    
    /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada*/
    
    
    
    public void ElegirPerro(){
        boolean p= true;
        System.out.println("Ahora elija una raza de perro que desee eliminar de la lista si lo desea");
        String perro=leer.next();
        Iterator<Razas> it= lasRazas.iterator();
        while(it.hasNext()){
            Razas var= it.next();
            if(var.getRaza().equals(perro)){
                it.remove();
                System.out.println(" Se elimina la raza "+perro);
            }
        }
        if(p==false){
                System.out.println("No se encontró"); 
        }
    }
    public void mostrarRaza(){
        for(Razas var: lasRazas){
            System.out.println(var.getRaza());
    }
}
    
    }
    


