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
    //Efectividad
    // ((paradas efectivas - goles recibidos) * 100 / (paradas efectivas + goles recibidos)) + golesdirectos * 100 / total de lanzamientos
    public int efectividad(){
        int efectividad=0;
        efectividad=((paradas-golesRecibidos)*100/(paradas+golesRecibidos))+(golesDirectos*100/totalLanzamientos);
        return efectividad;
    }

    //toString
    @Override
    public String toString() {
        return "Portero [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", golesDirectos=" + golesDirectos
                + ", totalLanzamientos=" + totalLanzamientos + ", paradas=" + paradas + ", golesRecibidos="
                + golesRecibidos + ", efectividad=" + efectividad() + "]";
    }
}
