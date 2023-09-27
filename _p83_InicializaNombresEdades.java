public class _p83_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"PepeELPollo","PerroGuarumo","ELPajaroLoco"};
        int[] edades = {13,18,22};

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nTodos los nombres");
        for(String nombre : nombres)
            System.out.printf("%s ",nombre);
        
        System.out.println();
        System.out.println("\nTodas las edades");
        for(int edad : edades)
            System.out.printf("%d ",edad);
        
        System.out.println();
        System.out.println("\nCada nombre con su respectiva edad");
        for(int i=0; i < nombres.length; i++)
            System.out.printf("Nombre: %s\tEdad: %d\tNombre: %s\n",nombres[i],edades[i],nombres[i].toUpperCase());
    }
}
