import java.util.Scanner;
import java.util.ArrayList;

public class Futbol{
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        boolean go=true;
        String opcion="";
        ArrayList<Extremo> extremos=new ArrayList<Extremo>();
        ArrayList<Portero> porteros=new ArrayList<Portero>();
        while (go){
            printMenu();
            opcion=sc.nextLine();
            System.out.println("");

            switch (opcion){
                case "1":
                    System.out.println("Ingrese el nombre del jugador");
                    String nombre=sc.nextLine();
                    System.out.println("Ingrese el pais del jugador");
                    String pais=sc.nextLine();
                    System.out.println("Ingrese la edad del jugador");
                    int edad=sc.nextInt();
                    System.out.println("Ingrese los goles directos del jugador");
                    int golesDirectos=sc.nextInt();
                    System.out.println("Ingrese el total de lanzamientos del jugador");
                    int totalLanzamientos=sc.nextInt();
                    System.out.println("Ingrese el tipo de jugador");
                    System.out.println("1. Portero");
                    System.out.println("2. Extremo");
                    int tipo=sc.nextInt();
                    if (tipo==1){
                        System.out.println("Ingrese las paradas del portero");
                        int paradas=sc.nextInt();
                        System.out.println("Ingrese los goles recibidos del portero");
                        int golesRecibidos=sc.nextInt();
                        Portero portero=new Portero(nombre,pais,edad,golesDirectos,totalLanzamientos,paradas,golesRecibidos);
                        porteros.add(portero);
                    }else if (tipo==2){
                        System.out.println("Ingrese las asistencias del extremo");
                        int asistencias=sc.nextInt();
                        System.out.println("Ingrese los pases del extremo");
                        int pases=sc.nextInt();
                        Extremo extremo=new Extremo(nombre,pais,edad,golesDirectos,totalLanzamientos,asistencias,pases);
                        extremos.add(extremo);
                    }
                    break;
                case "2":
                    System.out.println("Jugadores extremos");
                    for (int i=0;i<extremos.size();i++){
                        System.out.println(extremos.get(i).toString());
                        System.out.println("");
                    }
                    System.out.println("Jugadores porteros");
                    for (int i=0;i<porteros.size();i++){
                        System.out.println(porteros.get(i).toString());
                    }
                    break;
                case "3":
                    System.out.println("Los 3 mejores porteros son");
                    for (int i=0;i<porteros.size();i++){
                        if (porteros.get(i).getGolesRecibidos()<5){
                            System.out.println(porteros.get(i).toString());
                        }
                    }
                    break;
            }
        }


    }
    public static void printMenu(){
        System.out.println("\u001B[31m--------------------------------------------------");
        System.out.println("Bienvenido al programa de futbol");
        System.out.println("Seleccione una opcion");
        System.out.println("1. Agregar jugador");
        System.out.println("2. Mostrar jugadores");
        System.out.println("3. 3 mejores porteros en base a su efectividad");
        System.out.println("4. Extremos en base a su 85% de efectividad");
        System.out.println("5. Salir");
        System.out.println("--------------------------------------------------");
    }   
}
