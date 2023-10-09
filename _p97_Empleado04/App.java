package _p97_Empleado04;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Checo Perez", 35, 'H', true));
        empleados.add(new Empleado("Maria de Jesus", 16, 'M', false));
        empleados.add(new Empleado("Diario Jimenez", 33, 'H', true));
        empleados.add(new Empleado("Jessica Gimenez", 45, 'H', true));

        System.out.println("\nLos empleados en el ArrayList");
        for (Empleado empleado : empleados)
            System.out.println(empleado.toString());
        System.out.println("\nEl primer elemento del ArrayList");
        System.out.println(empleados.get(0));
        System.out.println("\nRealizando calculos");
        int suma =0, th=0, tm=0, tc=0, ts=0;
        for (int i=0; i < empleados.size(); i++){
            suma = suma + empleados.get(i).getEdad();
            if(empleados.get(i).getSexo()=='H') th++; else tm++;
            if(empleados.get(i).getEstadoCivil()) tc++; else ts++;
        }
        System.out.println("Promedio de edades: " + (suma/empleados.size()));
        System.out.println("Hombres: " + th);
        System.out.println("Mujeres: " + tm);
        System.out.println("Casados: " + tc);
        System.out.println("Solteros: " + ts);
    }
}
