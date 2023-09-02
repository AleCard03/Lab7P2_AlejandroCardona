
package lab7p2_alejandrocardona;

import java.awt.Color;
import java.util.Date;

public class Vehiculo {
    
    private String marca, modelo;
    private Color color;
    private int fecha;
    private Double precio;

    public Vehiculo(String marca, String modelo, Color color, int fecha, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "[\n\t" +  marca + ";\n\t" + modelo + ";\n\t"+color+";\n\t" + fecha + ";\n\t" + precio + ";\n]\n";
    }
    
    
    
    
}
