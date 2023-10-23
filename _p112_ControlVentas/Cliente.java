package _p112_ControlVentas;
import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> Ventas;

    public Cliente(){
        Ventas = new ArrayList<>();
    }

    public Cliente(String nombre, String domicilio, String correo){
        this();
        Nombre=nombre;  Domicilio=domicilio;    Correo=correo;
    }

    public ArrayList<Venta> getVenta(){
        return Ventas;
    }
    public void agregarVenta(Venta venta){
        Ventas.add(venta);
    }

    public int getTotal(){
        int total=0;
        for(Venta venta : Ventas)
            total++;
        return total;
    }

    public double montoTotal(){
        double monto=0;
        for (Venta venta : Ventas)
            monto+= venta.Total;
        return monto;
    }

    public String toString(){
        return "Cliente [ Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Ventas=" + getTotal() + ", Total=" + montoTotal() + "]";
    }
}
