package _p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        //Se crea un Banco
        Banco miBanco=new Banco("Banco Tigres del Norte SA de CV", "Privada Las Cumbres 492");

        //Se agregan Clientes al Banco
        miBanco.agregarCliente(new Cliente("Carlos Castaneda"));
        miBanco.agregarCliente(new Cliente("Pedro de Leon"));
        miBanco.agregarCliente(new Cliente("Rene Menorga"));
        miBanco.agregarCliente(new Cliente("Maria NoQ NoQueria"));
        System.out.println("\nLos Clientes del Banco son:");
        miBanco.reporte();

        //Se agregan cuentas de diferentes tipos a los Clientes del Banco 
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.10));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000, 0.20));
        miBanco.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000, 500));
        miBanco.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500, 500));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000, 600));
        miBanco.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000, 0.40));
        System.out.println("\n>>> Los clientes con sus cuentas y saldos iniciales son:");
        miBanco.reporte();

        //Se retira y deposita a las diferentes Cuentas de algunos Clientes
        miBanco.getClientes().get(0).getCuentas().get(0).retira(500);
        miBanco.getClientes().get(0).getCuentas().get(1).retira(100);
        miBanco.getClientes().get(1).getCuentas().get(0).deposita(100);
        miBanco.getClientes().get(2).getCuentas().get(0).deposita(300);
        miBanco.getClientes().get(2).getCuentas().get(1).retira(1000);
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de los movimientos son:");
        miBanco.reporte();

        // Reporte de clientes del banco y el saldo de sus cuentas, despues del cálculo de intereses
        miBanco.calcularInteres();
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de calcular intereses:");
        miBanco.reporte();
    }
}
