package _p119_Organismo;

public class Perico extends Organismo implements Ave {
    public Perico(String nombre) {
        super(nombre);
    }

    public void multiCelular() {
        System.out.println("Es un aimal multicelular, es un Perico");
    }

    public void sangreCaliente() {
        System.out.println("Es  un animal de sangre caliente, es un Perico");
    }

    public void dosPatas() {
        System.out.println("Es un ave de dos patas, es un Perico");
    }

    public void volar() {
        System.out.println("Es un ave puede volar, es un Perico");
    }
}
