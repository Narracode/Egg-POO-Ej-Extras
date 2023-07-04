package com.egg.ej2.puntos;

import Entidad.Puntos;
import Servicio.ServicioPuntos;

/**
 *
 * @author zero
 */
public class Ej2Puntos {

    public static void main(String[] args) {
        ServicioPuntos serPun = new ServicioPuntos();
        Puntos p = serPun.crearPuntos();
        serPun.mostrarDistancia(p);
    }
}
