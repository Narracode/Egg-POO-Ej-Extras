package Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class ServicioNIF {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNIF() {
        NIF nif = new NIF();
        
        System.out.println("*Bienvenido*\nIngrese su DNI: ");
        long dni = 0;
        do {
            System.out.print("DNI de 8 digitos > ");
            dni = leer.nextLong();
            if (String.valueOf(dni).length() != 8) {
                System.out.println("Invalido, intenta otra vez");
            }
        } while (String.valueOf(dni).length() != 8);
        nif.setDNI(dni);
        
        nif.setLetra(cualLetra(dni));
        return nif;
    }
    
    public static char cualLetra(long DNI) {
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N',
            'J','Z','S','Q','V','H','L','C','K','E'};
        int pos = (int) (DNI % 23);
        return letras[pos];
    }
    
    public void mostrarNIF(NIF n) {
        System.out.println(n.mostrar());
    }
}
