package _p112_ControlVentas;
import java.util.ArrayList;

public class Tienda {
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;

    public Tienda(){
        Clientes = new ArrayList<>();
    }
    public Tienda(String nombre, String propietario, String domicilio){
        this();
        Nombre=nombre;  Propietario=propietario;    Domicilio=domicilio;
    }

    public void agregarCliente(Cliente cliente){
        Clientes.add(cliente);
    }
    public ArrayList<Cliente> getCliente(){
        return Clientes;
    }

    public int getTotal(){
        int total=0;
        for(Cliente cliente : Clientes){
            total+=cliente.getTotal();
        }
        return total;
    }

    public void reporte(){
        for(Cliente cliente : Clientes){
            System.out.println(">> " + cliente);
            for(Venta venta : cliente.getVenta())
                System.out.println(venta);
            if(cliente.getVenta().size()!=0) System.out.println();
        }
    }

    public double montoTotal(){
        double monto=0;
        for(Cliente cliente : Clientes)
            monto+=cliente.montoTotal();
        return monto;
    }

    public String toString(){
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", Clientes=" + this.getTotal() + ", Total=" + this.montoTotal() + "]"; 
    }
}
