import java.util.Scanner;
import java.lang.Math.*;

public class _p10_HipotenusaTriangulo{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double longitudLado1, longitudLado2, hipotenusa;
        Scanner sc=new Scanner(System.in);

        longitudLado1=longitudLado2=0;
        System.out.println("°Dame la medida de los lados del Triangulo°");
        System.out.println("Longitud del Lado 1: "); longitudLado1=sc.nextDouble();
        System.out.println("Longitud del Lado 2: "); longitudLado2=sc.nextDouble();

        hipotenusa = Math.sqrt(longitudLado1*longitudLado1+longitudLado2*longitudLado2);
        System.out.println(String.format("La longitud de la hipotenusa es: %.2f ",hipotenusa));   
    }
}