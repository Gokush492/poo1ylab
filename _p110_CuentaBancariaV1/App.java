package _p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        //Cuenta
        System.out.println("\n°°°Probando clase CuentaBancaria:");
        CuentaBancaria cuenta1=new CuentaBancaria(5000);
        cuenta1.deposita(10000);
        System.out.println("El saldo es: " + cuenta1.getSaldo());
        double cRetiro = 56;
        boolean retiro = cuenta1.retira(cRetiro);
        if (retiro) System.out.println("Retiro de: " + cRetiro + " efectuado con éxito, nuevo saldo: " + cuenta1.getSaldo());
        else System.out.println("Ni para los cigarros tienes!!!");
        
        //Cliente
        System.out.println("\n°°°Probando clase Cliente:");
        Cliente cliente1=new Cliente("Juan Perez", cuenta1);
        System.out.println("Cliente 1: " + cliente1);
        Cliente cliente2=new Cliente("Carlos Castaneda", new CuentaBancaria(1000));
        System.out.println("Cliente 2: " + cliente2);
        double newRetiro=50;
        //cliente2.getCuenta().retira(newRetiro);
        if(cliente2.getCuenta().retira(newRetiro))
            System.out.println("El retiro de: " + newRetiro + " efectuado con éxito, nuevo saldo: " + cliente2.getCuenta().getSaldo());
        else System.out.println("No monkeyMoney!!! >:c");

        //Banco
        System.out.println("\n°°°Probando clase Banco:");
        Banco miBanco=new Banco("Banco Patitos SA de CV", "Arboledas 124");
        miBanco.agregarCliente(cliente1);
        miBanco.agregarCliente(cliente2);
        Cliente cliente3=new Cliente("Felipe Correa", new CuentaBancaria(2000));
        miBanco.agregarCliente(cliente3);
        miBanco.getClientes().get(0).getCuenta().deposita(1500);
        miBanco.getClientes().get(1).getCuenta().deposita(1000);
        miBanco.getClientes().get(2).getCuenta().deposita(12000);
        System.out.println("-Resumen del Banco...");
        System.out.println(miBanco);
        double totalBanco = 0.0;
        for(Cliente cliente : miBanco.getClientes()){
            System.out.println(cliente);
            totalBanco += cliente.getCuenta().getSaldo();
        }
        System.out.println("-Total de dinero en el Banco: " + totalBanco);
    }
}
