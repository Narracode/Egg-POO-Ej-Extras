package com.egg.ej4.nif;

import Entidad.NIF;
import Servicios.ServicioNIF;
/**
 *
 * @author zero
 */
public class Ej4NIF {

    public static void main(String[] args) {
        ServicioNIF serNIF = new ServicioNIF();
        
        NIF solicitud = serNIF.crearNIF();
        serNIF.mostrarNIF(solicitud);
    }
}
