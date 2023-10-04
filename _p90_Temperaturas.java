public class _p90_Temperaturas{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};
        System.out.println("\nEl primer elemento del arreglo es: " + temperaturas[0]);
        System.out.println("El tercer elemento del arreglo es: " + temperaturas[2] + "\n");
        System.out.print("Los elementos del Arreglo son: ");
        Mostrar(temperaturas);
        System.out.print("\nLos elementos del Arreglo < 10 son: ");
        MostrarMenos10(temperaturas);
    }
    public static void Mostrar(float[] t){
        for(int i=0; i < t.length; i++)
            System.out.print(t[i] + " ");
    }
    public static void MostrarMenos10(float[] t){
        for(int i=0; i < t.length; i++){
            if(t[i] > 10){
                t[i] = 0;
            }
            System.out.print(t[i] + " ");
        }
    }
}