public class _p93_ParesImpares {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        int MAX = 100;
        int[] a=new int[MAX];
        int[] b=new int[MAX];

        NumAleatorio(a);
        System.out.println("ELEMENTOS DEL ARREGLO");
        Mostrar(a);
        System.out.println();
        System.out.println("\nELEMENTOS PARES DEL ARREGLO");
        Pares(a);
        System.out.println();
        System.out.println("\nELEMENTOS IMPARES DEL ARREGLO");
        Impares(a);
        System.out.println();
        System.out.println("\nCANTIDAD DE ELEMENTOS PARES:   " + ContPares(a));
        System.out.println("CANTIDAD DE ELEMENTOS IMPARES: " + ContImpares(a));
    }

    public static void NumAleatorio(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 21);
        }
    }

    public static void Mostrar(int[] b){
        for (int i = 0; i < b.length; i++) {
            System.out.printf(" %d",b[i]);
        }
    }

    public static void Pares(int[] c){
        for (int i = 0; i < c.length; i++) {
            if(c[i]%2==0){
                System.out.printf(" %d",c[i]);
            }
        }
    }

    public static void Impares(int[] d){
        for (int i = 0; i < d.length; i++) {
            if(d[i]%2!=0){
                System.out.printf(" %d",d[i]);
            }
        }
    }

    public static int ContPares(int[] c){
        int cont=0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]%2==0)
                cont++;
        }
        return cont;
    }

    public static int ContImpares(int[] d){
        int cont =0;
        for (int i = 0; i < d.length; i++) {
            if(d[i]%2!=0)
                cont++;
        }
        return cont;
    }
}
