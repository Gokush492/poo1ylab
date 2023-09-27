public class _p81_InicializaArregloNumeros {
    public static void main(String[] args){

        int MAX = 8;
        double[] nums = new double[MAX];

        nums[0] = 0.5;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;
        nums[7] = 666;
       
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nEl primer elemento de el arreglo es " + nums[0]);
        System.out.println("El ultimo elemento del arreglo es " + nums[7]);

        System.out.println("\nTodos los valores del arreglo con un ciclo for tradicional");
        for(int i = 0; i < nums.length; i++){
            System.out.printf( "%.2f ",nums[i]);
        }

        System.out.println("\n\nTodos los valores del arreglo con un ciclo for - each : ");
        for(double num : nums){
            System.out.printf("%.2f ",num ); 
        }
    }
}
