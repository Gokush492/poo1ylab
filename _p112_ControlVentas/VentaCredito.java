package _p112_ControlVentas;

public class VentaCredito extends Venta {
    private int Meses;
    private double Interes;

    public VentaCredito(String articulo, int cantidad, double precio,int meses, double interes){
        super(articulo, cantidad, precio);
        Meses=meses;    Interes=interes;
    }

    public double getTotalVenta(){
        double var =0;
        var = Total/100;
        var = var * Interes * Meses;
        return Total= Total + var;
    }

    public String toString(){
        return "VentaCredito [" + super.toString() + ", Meses=" + Meses + ", Interes=" + Interes + "%, TotalVenta=" + this.getTotalVenta() + "]"; 
    }
}
