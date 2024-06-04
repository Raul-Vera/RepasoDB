import java.util.Scanner;

public class app {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        String eleccion;
        System.out.println(InfoError.getMensaje(AdminConexion.obtenerConexion()));
        System.out.println("Buenas");
        System.out.println("1) Introducir Equipo");
        System.out.println("Inroduce la opcion que desee");
        eleccion=teclado.nextLine();
        switch (eleccion){

            case "1":
                if(EquiposDB.añadirEquipo(teclado))
                    System.out.println(InfoError.getMensaje(EquiposDB.error));;
                break;
        }

    }
}
