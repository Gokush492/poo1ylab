package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar {
    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    public void sistemaElectrico() {
        System.out.println("Es un automovil con sistema electrico es un Sedan");
    }

    public void combustionInterna() {
        System.out.println("Es un automovil de combustion interna es un Sedan");
    }

    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
    }

    public void chasisMonocasco() {
        System.out.println("Es de tipo Familiar con chasis monocaso es un Sedan");
    }
}
