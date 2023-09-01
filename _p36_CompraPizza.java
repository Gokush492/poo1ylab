import java.util.Scanner;

public class _p36_CompraPizza {
    // °Diego de Jesús Alvarado Díaz°
    // Programa que simula una pizzeria, donde se proporcionara precio de pizzas por tamaño a elegir, cantidad de pizzas y un descuento a partir
    // de cierta compra, despues imprimira toda la informacion de compra 
    // 31/08/2023 Version 1

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        float totalFinal, descuento, cantidadCompra, total, precio;
        int tamañoPizza;
        Scanner sc=new Scanner(System.in);
        tamañoPizza=0;
        totalFinal=descuento=cantidadCompra=total=precio=0f;
        System.out.println("°°°Bienvenido a Pizza Planeta°°°");
        System.out.println("A continuacion el precio de nuestras pizzas:");
        System.out.println("1- Chica     ...$5\n2- Mediana   ...$10\n3- Grande    ...$20");
        System.out.println("En caso de realizar una compra mayor a $2000 se le realizara un descuento");
        System.out.print("Favor de indicar el tamaño de la pizza con el numero correspondiente: "); tamañoPizza = sc.nextInt();
        System.out.print("Favor de indicar la cantidad de pizzas que desea comprar: "); cantidadCompra = sc.nextFloat();

        switch (tamañoPizza) {
            case 1:
                total = cantidadCompra * 5;
                if (total>2000){
                    System.out.print("\033[H\033[2J"); System.out.flush();
                    
                    descuento = total * 0.15f;
                    totalFinal = total - descuento;

                    System.out.println("Tamaño:           Chica");
                    System.out.println(String.format("Cantidad:         %.2f",cantidadCompra));
                    System.out.println(String.format("Total:            %.2f",total));
                    System.out.println(String.format("Descuento:        %.2f",descuento));
                    System.out.println(String.format("Precio Total:     %.2f",totalFinal));
                    System.out.println("\n°°°GRACIAS POR SU COMPRA°°°");

                }else{
                    System.out.print("\033[H\033[2J"); System.out.flush();

                    System.out.println("Tamaño:           Chica");
                    System.out.println(String.format("Cantidad:         %.2f",cantidadCompra));
                    System.out.println(String.format("Total:            %.2f",total));
                    System.out.println(String.format("Descuento:        %.2f",descuento));
                    System.out.println(String.format("Precio Total:     %.2f",total));
                    System.out.println("\n°°°GRACIAS POR SU COMPRA°°°");
                }
                break;

            case 2:
                total = cantidadCompra * 10;
                if (total>2000){
                    System.out.print("\033[H\033[2J"); System.out.flush();

                    descuento = total * 0.15f;
                    totalFinal = total - descuento;

                    System.out.println("Tamaño:           Mediana");
                    System.out.println(String.format("Cantidad:         %.2f",cantidadCompra));
                    System.out.println(String.format("Total:            %.2f",total));
                    System.out.println(String.format("Descuento:        %.2f",descuento));
                    System.out.println(String.format("Precio Total:     %.2f",totalFinal));
                    System.out.println("\n°°°GRACIAS POR SU COMPRA°°°");

                }else{
                    System.out.print("\033[H\033[2J"); System.out.flush();

                    System.out.println("Tamaño:           Chica");
                    System.out.println(String.format("Cantidad:         %.2f",cantidadCompra));
                    System.out.println(String.format("Total:            %.2f",total));
                    System.out.println(String.format("Descuento:        %.2f",descuento));
                    System.out.println(String.format("Precio Total:     %.2f",total));
                    System.out.println("\n°°°GRACIAS POR SU COMPRA°°°");
                }
                break;

            case 3:
                total = cantidadCompra * 20;
                if (total>2000){
                    System.out.print("\033[H\033[2J"); System.out.flush();

                    descuento = total * 0.15f;
                    totalFinal = total - descuento;

                    System.out.println("Tamaño:           Grande");
                    System.out.println(String.format("Cantidad:         %.2f",cantidadCompra));
                    System.out.println(String.format("Total:            %.2f",total));
                    System.out.println(String.format("Descuento:        %.2f",descuento));
                    System.out.println(String.format("Precio Total:     %.2f",totalFinal));
                    System.out.println("\n°°°GRACIAS POR SU COMPRA°°°");

                }else{
                    System.out.print("\033[H\033[2J"); System.out.flush();

                    System.out.println("Tamaño:           Chica");
                    System.out.println(String.format("Cantidad:         %.2f",cantidadCompra));
                    System.out.println(String.format("Total:            %.2f",total));
                    System.out.println(String.format("Descuento:        %.2f",descuento));
                    System.out.println(String.format("Precio Total:     %.2f",total));
                    System.out.println("\n°°°GRACIAS POR SU COMPRA°°°");
                }
                break;

            default:
                System.out.print("\033[H\033[2J"); System.out.flush();
                System.out.println("Error: Opcion Invalida");
                break;
        }
    }
}
