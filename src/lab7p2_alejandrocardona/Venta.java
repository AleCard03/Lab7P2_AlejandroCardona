
package lab7p2_alejandrocardona;

import java.util.Random;

public class Venta {
    
    Random rng = new Random();
    private Vendedor seller;
    private Cliente client;
    private double costo;
    private Vehiculo carro;
    private int IDVenta;
    
    public Venta(Vendedor seller, Cliente client, double costo, Vehiculo carro) {
        this.seller = seller;
        this.client = client;
        this.costo = costo;
        this.carro = carro;
        this.IDVenta = rng.nextInt(1000);
        
    }

    public Vendedor getSeller() {
        return seller;
    }

    public void setSeller(Vendedor seller) {
        this.seller = seller;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Vehiculo getCarro() {
        return carro;
    }

    public void setCarro(Vehiculo carro) {
        this.carro = carro;
    }

    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int IDVenta) {
        this.IDVenta = IDVenta;
    }

    
    
    @Override
    public String toString() {
        return "[\n\t"+"ID Venta: "+getIDVenta()+",\n\t" + seller.getNombre() + ",\n\t" + client.getNombre() + ",\n\t" + costo + ",\n" + "ID Vehiculo: "+carro.getID() + "\n]\n";
    }
    
    
    
    
    
}
