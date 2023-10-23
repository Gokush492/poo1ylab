package _p112_ControlVentas;

public class VentaContado extends Venta{
    private double Descuento;
    private String Regalo;


    public VentaContado(String articulo, int cantidad, double precio, double descuento, String regalo){
        super(articulo, cantidad, precio);
        Descuento=descuento;    Regalo=regalo;
    }

    public double getTotalVenta(){
        double desc=0;
        desc = Total/100;
        desc = desc * Descuento;
        return Total = Total-desc;
    }

    public String toString(){
        return "VentaContado [" + super.toString() + ", Descuento=" + Descuento + "%, Regalo=" + Regalo + ", Total="  + getTotalVenta() + "]";
    }
}
