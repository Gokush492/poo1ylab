package _p109_FormaV2;

public abstract class Forma {
    private String Color;
    private boolean Relleno;

    public Forma(){}
    public Forma(String color, boolean relleno){
        Color=color;    Relleno=relleno;
    }

    public String getColor(){
        return Color;
    }
    public void setColot(String color){
        Color=color;
    }

    public boolean getRelleno(){
        return Relleno;
    }
    public void setRelleno(boolean relleno){
        Relleno=relleno;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    public String toString(){
        return "Forma [Color=" + Color + ", Relleno=" + Relleno + "]";
    }
}
