
package lab7p2_alejandrocardona;

public class Cliente {
    
    private String nombre , profesion;
    private double sueldo;
    private int edad;

    public Cliente(String nombre, String profesion, double sueldo, int edad) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
