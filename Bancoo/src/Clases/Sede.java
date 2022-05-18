package Clases;
import java.util.Scanner;
public class Sede {
    private String Nombre;
    private String Ciudad;
    private String Direccion;
    private int Codigo;
    private Cuenta[] cuenta;
    private final int MaxCuentas=10;
    public Sede() {
        this.cuenta=new Cuenta[MaxCuentas];
    }
    public Sede(String Nombre, String Direccion, String Ciudad, int Codigo) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Codigo = Codigo;
        this.cuenta = cuenta;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    public Cuenta[] getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta;
    }
     static Scanner leer = new Scanner(System.in);   
public void Crear_Cuenta(){
   int Numero,NumCuenta;
   String Tipo_Cuenta,CC,Nombre,Apellido;
   double Saldo_Incial,Saldo;
   char Sexo;
    System.out.println("Digite las cuentas que desea crear: ");
    Numero=leer.nextInt();
       for(int i=0;i<Numero;i++){
       System.out.println("Digite el numero de cuenta: ");
       NumCuenta= leer.nextInt();
       System.out.println("Digite el tipo de cuenta: ");
       Tipo_Cuenta= leer.next();
       System.out.println("Digite el saldo inicial: ");
       Saldo_Incial= leer.nextDouble();
       System.out.println("Digite el saldo: ");
       Saldo= leer.nextDouble();
       System.out.println("Digite su identificacion: ");
       CC= leer.next();
       System.out.println("Digite su nombre: ");
       Nombre= leer.next();
       System.out.println("Digite su  apellido: ");
       Apellido= leer.next();
       System.out.println("Digite su sexo:");
       Sexo= leer.next().charAt(0);
       Persona Titular = new Persona(CC,Nombre,Apellido,Sexo);
       cuenta [i]=new Cuenta(NumCuenta,Tipo_Cuenta,Saldo_Incial,Saldo,Titular);
           System.out.println("La cuenta ha sido creada");
       
               }
}
 public void Consultar_Cuenta(){
      int Numero_cuenta;
      System.out.println("NUMERO DE LA CUENTA: ");
      Numero_cuenta=leer.nextInt();
      for (Cuenta cuentaa : cuenta) {
           if (cuentaa.getNumero_deCuenta()==Numero_cuenta) {
               System.out.println("La busqueda ha sido un exito");
               System.out.println(cuentaa);
           }else{
               System.out.println("Esta cuenta no ha sido registrada");     
           }
       }             
   }
    public String toString(){    
     return "\n Nombre de la Sede:  " + this.getNombre() + "\n Dirección de la Sede: " + this.getDireccion() + "\n Ciudad: " + this.getCiudad() + "\n codigo: " + this.getCodigo();                     
    } 
}
