package _p96_Empleado03;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        Empleado empleado1 = new Empleado("Juan Perez", 35);
        System.out.println(empleado1.toString());

        Empleado empleado2 = new Empleado("Maria de Jesús",16);
        System.out.println(empleado2.toString());

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Santi Gimenez");
        empleado3.setEdad(33);
        System.out.println(empleado3.toString());

        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
    }
}
