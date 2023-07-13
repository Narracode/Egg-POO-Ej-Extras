package com.egg.ej6.ahorcado;

import Entidad.Ahorcado;
import Servicio.ServicioAhorcado;
/**
 *
 * @author zero
 */
public class Ej6Ahorcado {

    public static void main(String[] args) {
        ServicioAhorcado serAhorcado = new ServicioAhorcado();
        
        Ahorcado juego = serAhorcado.crearJuego();
        System.out.println(juego.getPalabra());
        serAhorcado.juego(juego);
    }
}
