package Main;
import Clases.*;
import java.util.Scanner;
public class VistaClases {
     static Scanner leer = new Scanner(System.in);
   public static void Crear_Banco(){
       String Nom;
       System.out.println("Digite el nombre del respectivo banco: ");
       Nom=leer.next();
       Banco banco1 = new Banco(Nom);  
   }
    public static void main(String[] args) {
        int opciones=0;
        Banco banco2 = new Banco();
        Sede sede1 = new Sede();
        do {
            System.out.println("--------------------------------------------");
            System.out.println("\n --------Banco--------");
            System.out.println("DIGITE UNA OPCION: ");
            System.out.println("---------1.Crear el banco--------------");     
            System.out.println("---------2.Crear la Sede---------------");
            System.out.println("---------3.Crear una cuenta bancaria---");
            System.out.println("---------4.Consultar la sede-----------");
            System.out.println("---------5.Lista de sedes--------------");
            System.out.println("---------6.Consulta cuenta bancaria----");
            System.out.println("---------7.Salir-----------------------");
            System.out.println("Seleccione una Opción:");
            System.out.println("--------------------------------------------");
            opciones=leer.nextInt();
            switch(opciones){
                case 1:
                    Crear_Banco();
                    break;
                case 2:
                    banco2.Crear_Sede();
                    break;
                case 3:
                    sede1.Crear_Cuenta();
                    break;
                case 4:
                    banco2.Consultar_Sede();
                    break;
                case 5:
                    banco2.Lista_Sedes();
                    break;
                case 6:
                    sede1.Consultar_Cuenta();
                    break;
                    
                default:
                     System.out.println("ELIGA UNA OPCION");
            }
        }while(opciones!=7);
                
  }
}
