public class Extremo extends Jugador {
    private int asistencias;
    private int pases;

    //Constructor
    public Extremo(String nombre, String pais, int edad, int golesDirectos, int totalLanzamientos, int asistencias, int pases) {
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

    @Override
    public String toString() {
        return "Extremo [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", golesDirectos=" + golesDirectos
                + ", totalLanzamientos=" + totalLanzamientos + ", asistencias=" + asistencias + ", pases=" + pases
                + "]";
    }
}
