package _p119_Organismo;

public class App {
    public static void main(String[] args) {
        Perro miperro = new Perro("Gordo");
        System.out.println("Mi perro se llama " + miperro.getNombre() + " y hace asi: ");

        miperro.multiCelular();
        miperro.sangreCaliente();
        miperro.correr();
        miperro.cuatroPatas();

        miperro.respiracion();
        miperro.crecimiento();
        miperro.movimiento();
        miperro.muriendo();

        Perico miperico = new Perico("Chahui");
        System.out.println("Mi perico se llama " + miperico.getNombre() + " y hace asi: ");

        miperico.multiCelular();
        miperico.sangreCaliente();
        miperico.dosPatas();
        miperico.volar();

        miperico.respiracion();
        miperico.crecimiento();
        miperico.movimiento();
        miperico.muriendo();
    }
}
