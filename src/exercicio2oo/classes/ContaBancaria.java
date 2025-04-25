package exercicio2oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String NumeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
