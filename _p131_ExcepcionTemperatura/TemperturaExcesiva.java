package _p131_ExcepcionTemperatura;

public class TemperturaExcesiva extends Exception {
    public TemperturaExcesiva(String err){
        super(err);
        //err = "Temperatura demasiado alta, no se puede convertir";
    }
}
