package _p108_Vehiculo;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Vehiculo v1=new Vehiculo("CP0100010122", "Ford", 2023, 12345.22);
        Vehiculo v2=new Vehiculo("CP1000145555", "Nissan", 2010, 54500.33);
        Vehiculo v3=new Vehiculo("CA104014544", "Dina", 2008, 234567.15);
        Vehiculo v4=new Vehiculo("CA774814599", "Hongyan", 2003, 934577.98);
        Compacto co1=new Compacto(v1, 4, 2);
        Compacto co2=new Compacto(v2, 6, 4);
        Camioneta ca1=new Camioneta(v3, 450, 4);
        Camioneta ca2=new Camioneta(v4, 1200, 4);

        System.out.println("°°°Datos de los Vehiculos de la flota°°°");
        System.out.println(co1);
        System.out.println(co2);
        System.out.println(ca1);
        System.out.println(ca2);

        ArrayList<Vehiculo> vehiculos=new ArrayList<>();
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(v4);
        
        double total=0;
        System.out.println("\nCalculando el total de precio de todos los vehículos ...");
        for(Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.getPrecio());
            total+= vehiculo.getPrecio();
        }
        System.out.println("La suma de precios es: " + total);
    }
}
