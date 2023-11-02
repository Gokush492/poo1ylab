package _p120_Vehiculo;

public class Maquina {
    private String Nombre;
    private String Propietario;
    private int Pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPropietario() {
        return Propietario;
    }
    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public int getPasajeros() {
        return Pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }

    public void Repostar() {
        System.out.println("Repostando...");
    }
    public void Arrancar() {
        System.out.println("Arrancando...");
    }
    public void Frenando() {
        System.out.println("Frenando...");
    }

    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }
}
