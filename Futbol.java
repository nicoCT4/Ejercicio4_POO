//Universidad del valle de Guatemala
//Carne:23197
//Fecha: 22/09/2023
//Herencia

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * Clase principal que simula mostrar datos estadisticos de jugadores de futbol
 */
public class Futbol{
            /**
     * Método principal que ejecuta la aplicación.
     *
     * @param args Los argumentos de línea de comandos 
     */
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
                        System.out.println("Ingrese las faltas del extremo");
                        int faltas=sc.nextInt();
                        Extremo extremo=new Extremo(nombre,pais,edad,golesDirectos,totalLanzamientos,asistencias,pases,faltas);
                        extremos.add(extremo);
                    }
                    break;
                case "2":
                    //Mostramos los jugadores tanto de portero como de extremo por separado
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
                    //Mostramos los tres mejores porteros en base a su efectividad
                    System.out.println("Los 3 mejores porteros son en base a su efectividad:");
                    
                    // Creamos una lista para almacenar a los porteros ordenados por efectividad
                    ArrayList<Portero> porterosOrdenados = new ArrayList<>(porteros);

                    // Ordenamos la lista de porteros en orden descendente de efectividad
                    Collections.sort(porterosOrdenados, new Comparator<Portero>() {
                        @Override
                        public int compare(Portero p1, Portero p2) {
                            // Comparamos los valores de efectividad en orden descendente
                            return Double.compare(p2.efectividad(), p1.efectividad());
                        }
                    });

                    // Mostramos los tres mejores porteros
                    int contador = 0;
                    for (Portero portero : porterosOrdenados) {
                        if (contador < 3) {
                            System.out.println(portero.toString());
                            contador++;
                        } else {
                            break; // Mostramos solo los tres mejores
                        }
                    }
                    break;

                case "4":
                    System.out.println("Los extremos con 85% de efectividad son");
                    for (int i=0;i<extremos.size();i++){
                        if (extremos.get(i).efectividad()>=85){
                            System.out.println(extremos.get(i).toString());
                        }
                    }
                    break;

                case "5":
                    go=false;
                    break;
            }
        }
    }
    /**
     * Método que imprime el menú de opciones
     */
    public static void printMenu(){
        System.out.println("\u001B[34m--------------------------------------------------");
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
