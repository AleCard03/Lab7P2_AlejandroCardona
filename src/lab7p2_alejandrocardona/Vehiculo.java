
package lab7p2_alejandrocardona;

import java.awt.Color;
import java.util.Date;

public class Vehiculo {
    
    private String marca, modelo;
    private Color color;
    private Date fecha;

    public Vehiculo(String marca, String modelo, Color color, Date fecha) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
