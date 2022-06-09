/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import mascotaapp.servicios.ServicioRazas;

/**
 *
 * @author ICBC
 */
public class MascotaAPP {
    public static void main(String[] args) {
      
        ServicioRazas serv= new ServicioRazas();
        serv.PedirRaza();
        serv.VariasRazas();
        serv.ElegirPerro();
        serv.mostrarRaza();
    }
    
}
