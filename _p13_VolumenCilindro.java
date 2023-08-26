import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double radio, altura, volumen;
        Scanner sc=new Scanner(System.in);

        radio=altura=volumen=0;
        System.out.println("°Favor de proporcionar el Radio y la Altura del cilindro°");
        System.out.println("Radio del cilindro: "); radio=sc.nextDouble();
        System.out.println("Altura del cilindro: "); altura=sc.nextDouble();

        volumen= Math.PI*radio*radio*altura;
        System.out.println(String.format("El volumen del cilindro es: %.2f",volumen));
    }
}
