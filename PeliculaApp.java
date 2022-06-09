/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculaapp;

import java.util.Scanner;
import peliculaapp.servicios.servicioPelicula;

/**
 *
 * @author ICBC
 */
public class PeliculaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        servicioPelicula serv= new servicioPelicula();
        
        serv.crearPelicula();
        
        String respuesta = null;        
        do{
            System.out.println("¿Desea ingresar otra pelicula?");
            respuesta=leer.next();
            if(respuesta.equals("si")){
            serv.crearPelicula();
            }else if(respuesta.equals("no")){
                System.out.println("No se cargan mas peliculas");
            }
        }while(respuesta.equals("si"));
        
        serv.mostrarPeliculas();
    }
    
}
