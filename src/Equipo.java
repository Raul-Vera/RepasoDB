public class Equipo {
    protected int id_equipo;
    protected String nombre;
    protected String estadio;
    public Equipo(int id,String nombre,String estadio){
        this.estadio=estadio;
        this.nombre=nombre;
        this.id_equipo=id;
    }

    public Equipo() {

    }
}
