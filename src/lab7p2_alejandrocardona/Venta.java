
package lab7p2_alejandrocardona;

public class Venta {
    
    private Vendedor seller;
    private Cliente client;
    private double costo;
    private Vehiculo carro;

    public Venta(Vendedor seller, Cliente client, double costo, Vehiculo carro) {
        this.seller = seller;
        this.client = client;
        this.costo = costo;
        this.carro = carro;
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
    
    
    
    
    
}
