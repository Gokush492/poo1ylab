package _p112_ControlVentas;

public abstract class Venta {
    protected String Articulo;
    protected int Cantidad;
    protected double Precio;
    protected double Total;

    public Venta(String articulo, int cantidad, double precio){
        Articulo=articulo;  Cantidad=cantidad;
        Precio=precio;      Total=precio*cantidad;
    }

    public double getTotal(){
        return Total;
    }
    public void setTotal(double total){
        Total=total;
    }

    public abstract double getTotalVenta();

    public String toString(){
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + Total + "]";
    }
}
