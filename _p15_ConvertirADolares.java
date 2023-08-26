import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double pesos, dolar, eqDolar;
        Scanner sc=new Scanner(System.in);

        pesos=dolar=0;
        eqDolar=0.060;
        System.out.println("°Favor de proporcionar una cantidad en Pesos para convertir a Dolares°"); pesos=sc.nextDouble();
        dolar= pesos*eqDolar;
        System.out.println(String.format("%.2f Pesos es equivalente a %.2f Dolares",pesos,dolar));
    }
}
