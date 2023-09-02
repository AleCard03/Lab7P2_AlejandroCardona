
package lab7p2_alejandrocardona;

import java.awt.Color;
import java.util.Date;
import java.util.Random;

public class Vehiculo {
    Random rng = new Random();
    private String marca, modelo;
    private String color;
    private int fecha;
    private Double precio;
    private int ID;

    public Vehiculo(String marca, String modelo, String color, int fecha, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fecha = fecha;
        this.precio = precio;
        this.ID = rng.nextInt(1000);
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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
