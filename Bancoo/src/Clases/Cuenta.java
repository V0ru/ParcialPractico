package Clases;

public class Cuenta {
    private int Numero_deCuenta;
    private String Tipo_de_Cuenta;
    private double Saldo_Inicial;
    private double Saldo;
    private Persona Titular;

    public Cuenta(int Numero_deCuenta, String Tipo_de_Cuenta, double Saldo_Inicial, double Saldo, Persona Titular) {
        this.Numero_deCuenta = Numero_deCuenta;
        this.Tipo_de_Cuenta = Tipo_de_Cuenta;
        this.Saldo_Inicial = Saldo_Inicial;
        this.Saldo = Saldo;
        this.Titular = Titular;
    }

    public int getNumero_deCuenta() {
        return Numero_deCuenta;
    }

    public void setNumero_deCuenta(int Numero_deCuenta) {
        this.Numero_deCuenta = Numero_deCuenta;
    }

    public String getTipo_de_Cuenta() {
        return Tipo_de_Cuenta;
    }

    public void setTipo_de_Cuenta(String Tipo_de_Cuenta) {
        this.Tipo_de_Cuenta = Tipo_de_Cuenta;
    }

    public double getSaldo_Inicial() {
        return Saldo_Inicial;
    }

    public void setSaldo_Inicial(double Saldo_Inicial) {
        this.Saldo_Inicial = Saldo_Inicial;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public Persona getTitular() {
        return Titular;
    }

    public void setTitular(Persona Titular) {
        this.Titular = Titular;
    }


    public String Datos_b() {
        return "\n Numero de cuenta:  "+ this.getNumero_deCuenta() +"\n Tipo de la cuenta + "+ this.getTipo_de_Cuenta()+"\n Saldo inical de la cuenta:  " +this.getSaldo_Inicial()+ "\n Saldo:  " + this.getSaldo() + "\n Titular: " + this.getTitular();
    }
}
