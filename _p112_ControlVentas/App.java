package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        //Se crea una Tienda
        Tienda miTienda=new Tienda("Cuidado con el Dog", "Dz Shino", "Colonia el Ete 13");

        //Se agregan Clientes a la Tienda
        miTienda.agregarCliente(new Cliente("Carolina Caro", "Villas 21", "Caro.Line@gmail.com"));
        miTienda.agregarCliente(new Cliente("Pedrito Mendoza", "Florencia 212", "PedritoPower@gmail.com"));
        System.out.print("Reporte de clientes sin Ventas: ");
        System.out.println(miTienda);
        miTienda.reporte();
        System.out.println();

        //Se agregan ventas a los Clientes
        miTienda.getCliente().get(0).agregarVenta(new VentaContado("Pantalon", 1, 400, 10, "Calcetas"));
        miTienda.getCliente().get(0).agregarVenta(new VentaCredito("Playeras", 3, 200, 6, 5));
        miTienda.getCliente().get(1).agregarVenta(new VentaContado("Tenis", 1, 1100, 25, "Limpia Calzado"));
        miTienda.getCliente().get(1).agregarVenta(new VentaCredito("Chamarra", 2, 800, 12, 10));
        System.out.print("Reporte de clientes con Ventas: ");
        System.out.println(miTienda);
        miTienda.reporte();
        System.out.println();
    }
}
