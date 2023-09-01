
package lab7p2_alejandrocardona;

public class Vendedor {
    
    private String nombre;
    private int cantCarros;
    private double cantDinero;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantCarros() {
        return cantCarros;
    }

    public void setCantCarros(int cantCarros) {
        this.cantCarros = cantCarros;
    }

    public double getCantDinero() {
        return cantDinero;
    }

    public void setCantDinero(double cantDinero) {
        this.cantDinero = cantDinero;
    }

    @Override
    public String toString() {
        return "[\n\t" + nombre + ",\n\t" + cantCarros + ", ,\n\t" + cantDinero +"]\n";
    }
    
    
    
}
