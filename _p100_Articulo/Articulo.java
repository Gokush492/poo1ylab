package _p100_Articulo;

public class Articulo {
    private String Id;
    private String Desc;
    private int Cant;
    private double PrecioUnit;

    public Articulo(String id, String desc, int cant, double precioUnit){
        this.Id=id;     this.Desc=desc;
        this.Cant=cant; this.PrecioUnit=precioUnit;     
    }

    public String getId(){
        return Id;
    }
    public String getDesc(){
        return Desc;
    }
    public int getCant(){
        return Cant;
    }

    public void setCant(int cant){
        Cant=cant;
    }

    public double getPrecioUnit(){
        return PrecioUnit;
    }
    public void setPrecioUnit(double precioUnit){
        PrecioUnit=precioUnit;
    }

    public double getTotal(){
        return PrecioUnit*Cant;
    }

    public String toString(){
        return String.format("Articulo [Id=%s, Desc=%s, Cant=%d, PrecioUnit=%.2f]", Id, Desc, Cant, PrecioUnit);
    }
}
