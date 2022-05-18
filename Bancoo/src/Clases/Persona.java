
package Clases;

public class Persona {
    private String Nombre;
    private String CC;
    private String Apellido;
    private char Sexo;

    public Persona(String CC, String Nombre, String Apellido, char Sexo) {
        this.CC = CC;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String Mostrardatos2(){
        return "\n Numero de identificacion :  "+ this.getCC() 
                + "\n Nombre : "+ this.getNombre() +
                "\n Apellido : "+ this.getApellido() +
                "\n Sexo : "+ this.getSexo();
        
    }    
    
    
}
