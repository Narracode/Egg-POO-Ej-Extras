package Servicio;

import Entidad.Puntos;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioPuntos {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos() {
        Puntos p = new Puntos();
        
        System.out.print("*Bienvenido*\nPara establecer un par de coordenadas,"
            + " deberá ingresar valores para posicionar los puntos en los ejes."
            + "\nPunto 1 (P1)\nPosicion en el eje \'X\' > ");
        p.setX1(leer.nextInt());
        System.out.print("Posicion en el eje \'Y\' > ");
        p.setY1(leer.nextInt());
        System.out.print("\nPunto 2 (P2)\nPosicion en el eje \'X\' > ");
        p.setX2(leer.nextInt());
        System.out.print("Posicion en el eje \'Y\' > ");
        p.setY2(leer.nextInt());
        return p;
    }
    
    public void mostrarDistancia(Puntos p) {
        System.out.println("La distancia entre los puntos P1(" + p.getX1() + ","
            + p.getY1() + ") y P2(" + p.getX2() + "," + p.getY2() + ") es: "
            + p.distancia());
    }
}