public class Portero extends Jugador {
    private int paradas;
    private int golesRecibidos;

    //Constructor
    public Portero(String nombre, String pais, int edad, int golesDirectos, int totalLanzamientos, int paradas, int golesRecibidos) {
        super(nombre, pais, edad, golesDirectos, totalLanzamientos);
        this.paradas = paradas;
        this.golesRecibidos = golesRecibidos;
    }

    //getters
    public int getParadas() {
        return paradas;
    }
    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    //toString
    @Override
    public String toString() {
        return "Portero [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", golesDirectos=" + golesDirectos
                + ", totalLanzamientos=" + totalLanzamientos + ", paradas=" + paradas + ", golesRecibidos="
                + golesRecibidos + "]";
    }
}
