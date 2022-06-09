/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnoapp.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ICBC
 */
public class Alum {
      Scanner leer= new Scanner(System.in);
    
    private String nombre;
    private ArrayList<Integer> notas;
    
    public void ServicioAlumno(String nombre, ArrayList<Integer> notas){
        this.nombre= nombre;
        this.notas= notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
     notas = notas;
    }

  


    
}
