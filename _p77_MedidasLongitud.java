import java.util.Scanner;

public class _p77_MedidasLongitud {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        Menu();
    }

    public static float PulgadasACentimetros(float pulgadas){
        float centimetros = 0f;
        centimetros = pulgadas * 2.54f;
        return centimetros;
    }

    public static float MetrosAPies(float metros){
        float pies = 0f;
        pies = metros * 3.281f;
        return pies;
    }

    public static void Menu(){
        Scanner sc= new Scanner(System.in);
        char op;
        float pulgadas, metros;
        pulgadas=metros=0f;
        System.out.println("°°°Conversor de Medidas°°°");
        System.out.print("Pulgadas a Metros... [P]\nMetros a Pies...     [M]\nopcion: "); op=Character.toUpperCase(sc.next().charAt(0));
        switch (op) {
            case 'P':
                System.out.print("\033[H\033[2J");System.out.flush();
                System.out.println("°°°Conversor de Pulgadas a Metros°°°");
                System.out.print("Dame el valor en Pulgadas: "); pulgadas=sc.nextFloat();
                System.out.println("\nEl equivalente en Metros es: " + PulgadasACentimetros(pulgadas));
                break;

            case 'M':
                System.out.print("\033[H\033[2J");System.out.flush();
                System.out.println("°°°Conversor de Metros a Pies°°°");
                System.out.print("Dame el valor en Metros: "); metros=sc.nextFloat();
                System.out.println("\nEl equivalente en Pies es: " + MetrosAPies(metros));
                break;
        
            default:
                System.out.println("Opcion Invalida");
                break;
        }
    }
}
