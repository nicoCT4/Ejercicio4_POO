public class Extremo extends Jugador {
    private int asistencias;
    private int pases;
    private int faltas;

    //Constructor
    public Extremo(String nombre, String pais, int edad, int golesDirectos, int totalLanzamientos, int asistencias, int pases, int faltas) {
        super(nombre, pais, edad, golesDirectos, totalLanzamientos);
        this.asistencias = asistencias;
        this.pases = pases;
    }

    //getters
    public int getAsistencias() {
        return asistencias;
    }
    public int getPases() {
        return pases;
    }
    //Efectividad
    //((pases + asistencias efectivas - faltas) * 100 / (pases + asistencias efectivas + faltas)) + golesdirectos * 100 / total de lanzamientos

    public int efectividad(){
        int efectividad=0;
        efectividad=((pases+asistencias)*100/(pases+asistencias+faltas))+(golesDirectos*100/totalLanzamientos);
        return efectividad;
    }

    @Override
    public String toString() {
        return "Extremo [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", golesDirectos=" + golesDirectos
                + ", totalLanzamientos=" + totalLanzamientos + ", asistencias=" + asistencias + ", pases=" + pases
                + ", faltas=" + faltas + ", efectividad=" + efectividad() + "]";
    }

}
