package Entidad;

/**
 *
 * @author zero
 */
public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
// (b^2)-4*a*c
    public double getDiscriminante() {
        return Math.pow(b, 2)-(4*a*c);
    }
    
    public double getRadical() {
        return Math.sqrt(getDiscriminante() / (2*a));
    }
    
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }
    
    public boolean tieneRaiz() {
        return getDiscriminante() > 0;
    }
// (-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices() {
        double solucion1 = 0, solucion2 = 0;
        if(tieneRaices()) {
            solucion1 = (-1*b) + getRadical();
            solucion2 = (-1*b) - getRadical();
        }
        System.out.println("Solucion 1 = " + solucion1 + "\nSolucion 2 = "
            + solucion2);
    }
    
    public void obtenerRaiz() {
        double solucion =0;
        
        if(tieneRaiz())
            solucion = -b;
        System.out.println("Solucion = " + solucion);
    }
    
    public void calcular() {
        if (tieneRaices())
            obtenerRaices();
        else if (tieneRaiz())
            obtenerRaiz();
        else
            System.out.println("El set de numeros no tiene solucion de"
                    + " segundo grado.");
    }
}