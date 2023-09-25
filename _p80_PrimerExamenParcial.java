import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner sc=new Scanner(System.in);

        String nombre;
        int edad;
        char sexo;
        char tParticipante;
        char op;
        int opc;

        //Case2
        int totalTrabajadores=0;
        int totalParticipantes=0;
        int totalDocentes=0;
        int totalAlumos=0;
        int totalSexF=0;
        int totalSexM=0;
        float promedioParticipantes=0;
        int totalCostAlumno=0;
        int totalCostDocente=0;
        int totalCostoTrabajador=0;
        int totalCosto=0;

        do{
            System.out.println("Que accion desea hacer\n[1] Inscribir\n[2] Participantes Totales\n[3] Recaudo Total"); opc=sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Dame tu nombre: "); nombre=sc.next();
                    do{
                        System.out.print("Dame tu edad: "); edad=sc.nextInt();
                        if(edad<18)
                            System.out.println("Necesitas ser mayor de edad");
                    }while(edad<18);
                    System.out.print("Sexo (M/F): "); sexo=Character.toUpperCase(sc.next().charAt(0));
                    System.out.print("Tipo de participante Alumno [A] Docente [D] Trabajador [T] :"); tParticipante=Character.toUpperCase(sc.next().charAt(0));

                    int act=1;
                    int costAlumno=50;
                    int costDocente=80;
                    int costTrabajador=60;

                    if(tParticipante == 'A'){
                        totalAlumos++;
                        totalCostAlumno = totalCostAlumno + costAlumno;
                    }
                    if (tParticipante == 'D'){
                        totalDocentes++;
                        totalCostDocente = totalCostDocente + costDocente;
                    }
                    if (tParticipante=='T'){
                        totalTrabajadores++;
                        totalCostoTrabajador = totalCostoTrabajador + costTrabajador;
                    }
                    if (sexo=='F'){
                        totalSexF++;
                    }
                    if (sexo=='M'){
                        totalSexM++;
                    }
                    if(act==1){
                        totalParticipantes++;
                    }
                    promedioParticipantes = promedioParticipantes + edad;
                    promedioParticipantes = promedioParticipantes/totalParticipantes;
                    totalCosto = totalCostAlumno + totalCostDocente + totalCostoTrabajador;
                    break;
                
                case 2:
                    //TotalParticipantes()
                    System.out.println("El total de alumnos es de: " + totalAlumos);
                    System.out.println("El total de docentes es de: " + totalDocentes);
                    System.out.println("El total de trabajadores es de: " + totalTrabajadores);
                    System.out.println("El total de participantes femeninos es de: " + totalSexF);
                    System.out.println("El total de participantes masculinos es de: " + totalSexM);
                    System.out.println("El total de participantes es de: " + totalParticipantes);
                    System.out.println("El promedio de edad de los participantes es: " + promedioParticipantes);
                    break;
                
                    case 3:
                    //TotalRecaudo()
                    System.out.println("Total recaudado por Alumnos: " + totalCostAlumno);
                    System.out.println("Total recaudado por Docentes: " + totalCostDocente);
                    System.out.println("Total recaudado por Trabajadores: " + totalCostoTrabajador);
                    System.out.println("Total recaudado: " + totalCosto);

                    if(totalCosto>0 &&totalCosto<=100)
                        System.out.println("Las Ganancias son BAJAS");
                    if (totalCosto>100 && totalCosto<=200)
                        System.out.println("Las Ganancias son MODERADAS");
                    if (totalCosto>200)
                        System.out.println("Las Ganancias son BUENAS");

                default:
                    System.out.print("Opcion Invalida");
                    break;
            }
            System.out.println("Desea continuar (S/N) ?"); op=Character.toUpperCase(sc.next().charAt(0));
        }while(op != 'N');
    }
}
