public class Jugador {
    protected String nombre;
    protected String pais;
    protected int edad;
    protected int golesDirectos;
    protected int totalLanzamientos;

    //Constructor
    public Jugador(String nombre, String pais, int edad, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }
    //getters
    protected String getNombre() {
        return nombre;
    }
    protected String getPais() {
        return pais;
    }
    protected int getEdad() {
        return edad;
    }
    protected int getGolesDirectos() {
        return golesDirectos;
    }
    protected int getTotalLanzamientos() {
        return totalLanzamientos;
    }
}
