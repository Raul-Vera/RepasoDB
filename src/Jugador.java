public class Jugador {
    protected int id_jugador;
    protected int id_equipo;
    protected int id_posicion;
    protected String nombre;
    protected String apellido;
    protected int goles;

    public Jugador(int id_jugador, int id_equipo, int id_posicion, String nombre, String apellido, int goles) {
        this.id_jugador = id_jugador;
        this.id_equipo = id_equipo;
        this.id_posicion = id_posicion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.goles = goles;
    }
}
