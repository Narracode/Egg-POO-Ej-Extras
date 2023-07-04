package com.egg.ej1.cancion;

import Entidad.Cancion;
import Servicio.ServicioCancion;
/**
 *
 * @author zero
 */
public class Ej1Cancion {

    public static void main(String[] args) {
        ServicioCancion serCan = new ServicioCancion();
        Cancion c = serCan.crearCancion();
        
        System.out.println(c);
    }
}
