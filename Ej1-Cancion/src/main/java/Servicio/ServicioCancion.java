package Servicio;
import Entidad.Cancion;
import java.util.Scanner;
/**
 *
 * @author zero
 */
public class ServicioCancion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion() {
        Cancion c = new Cancion();
        
        System.out.print("*Asistente de registro de Cancion*\nPor favor,"
            + " ingrese el titulo del tema > ");
        c.setTitulo(leer.next());
        System.out.print("Teclea el nombre del autor > ");
        c.setAutor(leer.next());
        return c;
    }
}