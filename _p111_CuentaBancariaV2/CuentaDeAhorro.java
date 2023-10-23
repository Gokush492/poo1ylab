package _p111_CuentaBancariaV2;

public class CuentaDeAhorro extends CuentaBancaria {
    private double TasaInteres;

    public CuentaDeAhorro(double cantidad, double tasaInteres){
        super(cantidad);
        TasaInteres=tasaInteres;
    }

    public void calcularInteres(){
        Saldo=Saldo*TasaInteres;
    }

    public boolean retira(double cantidad){
        if(Saldo >= cantidad){
            Saldo-=cantidad;
            return true;
        }else
            return false;
    }

    public String toString(){
        return "Cuenta de Ahorro [" + super.toString() + ", TasaInteres=" + TasaInteres + "]";
    }
}
