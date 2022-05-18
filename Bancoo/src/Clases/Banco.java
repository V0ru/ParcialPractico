package Clases;
import java.util.Scanner;
public class Banco {
    private String Nombre;
    private final int MaxSedes = 5;
    private Sede[] sedes;
    static Scanner leer = new Scanner(System.in);
    public Banco() {
        this.sedes = new Sede[MaxSedes];
    }
    public Banco(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public Sede[] getSedes() {
        return sedes;
    }
    public void setSedes(Sede[] sedes) {
        this.sedes = sedes;
    }
    public static Scanner getLeer() {
        return leer;
    }
    public static void setLeer(Scanner leer) {
        Banco.leer = leer;
    }
    public void Crear_Sede() {
        String Nombre;
        String Direccion;
        String Ciudad;
        int Codigo;
        int Num_sedes;
        System.out.println("--------------------------------------------");
        System.out.println("Digite el numero de sedes que desea crear: ");
        System.out.println("--------------------------------------------");
        Num_sedes = leer.nextInt();
        if (Num_sedes > 5) {
            //QUERIDO USUARIO.RECUERDE QUE USTED NO PUEDE DIGITAR MAS DE 5 SEDES.
            System.out.println("--------------------------------------------");
            System.out.println("Usted no puede digitar mas de 5 sedes");
            System.out.println("--------------------------------------------");
        } else {
            for (int i = 0; i < Num_sedes; i++) {
                System.out.println("--------------------------------------------");
                System.out.println("Digite el nombre de la soda: ");
                Nombre = leer.next();
                System.out.println("Digite la direccion de la sede: ");
                Direccion = leer.next();
                System.out.println("Digite la ciudad en la que esta ubicada la sede:  ");
                Ciudad = leer.next();
                System.out.println("Digite el codigo de la sede:  ");
                Codigo = leer.nextInt();
                sedes[i] = new Sede(Nombre,Direccion,Ciudad,Codigo);
            }
        }
    }
    public void Consultar_Sede() {
        int codigo;
        System.out.println("Digite el codigo de la sede que desea buscar: ");
        codigo = leer.nextInt();

        for (Sede sede : sedes) {
            if (sede.getCodigo() == codigo) {
                System.out.println("--------------------------------------------");
                System.out.println("La sede se ha encontrado con exito ");
                System.out.println(sede);
            } else {
                System.out.println("Esta sede no ha sido registrada ");
            }
        }
    }
    public void Lista_Sedes() {
        System.out.println("Estas son las listas de las sedes : ");
        for (int i = 0; i < sedes.length; i++) {

            System.out.println(sedes[i]);
        }
    }
    public String toString() {
        return "\nNombre:  " + this.getNombre();
    }
}