package Entidad;

/**
 *
 * @author zero
 */
public class Ahorcado {
    private char[] palabra;
    private int coincidencias;
    private int oportunidades;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int coincidencias, int oportunidades) {
        this.palabra = palabra;
        this.coincidencias = coincidencias;
        this.oportunidades = oportunidades;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCoincidencias() {
        return coincidencias;
    }

    public void setCoincidencias(int coincidencias) {
        this.coincidencias = coincidencias;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }
    
    public int longitud() {
        return this.palabra.length;
    }
    
    public boolean encontrada(char letra) {
        boolean esta = false;
//        int i = 0;
//        do {
//            esta = letra == palabra[i];
//            i++;
//        } while (i < palabra.length);
//        
        for (int i = 0; i < longitud(); i++) {
            if (letra == palabra[i]) {
                esta = true;
            }
            if (esta == true) {
                coincidencias++;
            } else {
                oportunidades--;
            }
        }
        return esta;
    }
    
 
}
