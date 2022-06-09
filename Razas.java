/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.entidades;

import java.util.Scanner;

/**
 *
 * @author ICBC
 */
public class Razas {
    
    Scanner leer= new Scanner(System.in);
    
    private String raza;
    
    public void Razas(String raza){
        this.raza=raza;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
