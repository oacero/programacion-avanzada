public class Cuenta {
    // Atributos
    private double saldo;

    // Costructores
    public Cuenta(){
        this.saldo = 0.0;
    }
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    // Metodos
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retiro(double monto){
        this.saldo -= monto;
    }

    public void deposito(double monto){
        this.saldo += monto;
    }


}
