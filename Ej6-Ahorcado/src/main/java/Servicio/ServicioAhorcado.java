package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioAhorcado {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        
        System.out.print("*Juguemos Ahorcados!*\nPara empezar, escribe la"
            + " palabra secreta > ");
        String palabraJuego = leer.next().toUpperCase();
        juego.setPalabra(new char[palabraJuego.length()]);
        juego.setPalabra(vectorPalabra(palabraJuego));
        System.out.print("¿Cual sera el numero maximo de fallos para "
                + "adivinar la palabra? > ");
        juego.setOportunidades(leer.nextInt());
        juego.setCoincidencias(0);
        
        return juego;
    }
    
    public void largoPalabra(Ahorcado j) {
        System.out.println("La palabra de este juego es de " + j.longitud()
            + " letras.");
    }
    
    public static char[] vectorPalabra(String p) {
        int largo = p.length();
        char[] vectorPalabra = new char[largo];
        for (int i = 0; i < largo; i++) {
            vectorPalabra[i] = p.charAt(i);
        }
        return vectorPalabra;
    }
    
    public void buscar(Ahorcado j) {
        System.out.print("¿Que letra crees que existe en el ahorcado? > ");
        char letra = leer.next().toUpperCase().charAt(0);
        boolean esta = j.encontrada(letra);
        if (esta) {
            System.out.print("Acertaste, " + letra + " es parte de la palabra.");
//            for (int i = 0; i < j.longitud(); i++) {
//                if (letra == j.getPalabra()[i]) {
//                    a[i] = letra;
//                }
//            }
        } else {
            System.out.println("Lo lamento, " + letra + " no esta en el juego.");
        }
        
    }
    
    public void intentos(Ahorcado j) {
        System.out.println("Te restan " + j.getOportunidades() + " intentos.");
    }
    
    public void juego(Ahorcado j) {
        
        boolean restanIntentos = false;

      //  char[] avance = iniciarPropuesta(j.longitud());
        
        System.out.println("Saludos Jugador\nTe han retado a una "
                + "partida de ahorcados");
        do {
            largoPalabra(j);
            buscar(j);
            if (j.getOportunidades() != 0) {
            restanIntentos = true;
           }
//            System.out.println(avance);
        } while (restanIntentos == true);
        
        if (!restanIntentos) {
            System.out.println("Te quedaste sin intentos. La palabra era "
                + j.getPalabra() + "\n*GAME OVER*");
        }
    }
    
    public char[] iniciarPropuesta(int longitud) {
        char[] avance = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            avance[i] = '_';
        }
        return avance;
    }
    
}