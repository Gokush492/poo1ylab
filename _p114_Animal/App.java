package _p114_Animal;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Gato migato=new Gato();
        migato.dormir();
        migato.sonido();
        migato.comer();

        Perro miperro=new Perro();
        miperro.dorimr();
        miperro.sonido();
        miperro.comer();
    }
}
