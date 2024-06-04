import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EquiposDB {
    protected static int error;
    public static boolean añadirEquipo(Scanner teclado){
        try {
            Equipo aux = new Equipo();
            System.out.println("Introduce el id del equipo , debe de ser un numero");
            aux.id_equipo = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce el nombre");
            aux.nombre=teclado.nextLine();
            System.out.println("Introduce su estadio");
            aux.estadio=teclado.nextLine();
            PreparedStatement ps=AdminConexion.con.prepareStatement("insert into equipos (id_equipo, nombre, estadio) "+
                    "VALUES (?,?,?)");
            ps.setInt(1,aux.id_equipo);
            ps.setString(2,aux.nombre);
            ps.setString(3,aux.estadio);
            if(ps.executeUpdate()==1){
                error=InfoError.OK;
                return true;
            }
            else {
                return false;
            }
        }catch (SQLException sqle){
            if(sqle.getMessage().contains("pk")){
                System.out.println("Has introducido un id que ya existe");
                return false;
            } else if (sqle.getMessage().contains("uk1")) {
                System.out.println("Has introducido un estadio que ya existe");
                return false;
            }else {
                System.out.println(InfoError.getMensaje(InfoError.ERRPR_RECOGER_DATOS));
                return false;
            }
        }
    }
}
