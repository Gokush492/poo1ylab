import java.io.File;
import java.util.Scanner;

public class _p126_Excepcion6 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        File nombres=new File("nombres.txt");
        try {
            Scanner sc=new Scanner(nombres);
            while (sc.hasNextLine()) 
            System.out.println(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo...");
        }
    }    
}
