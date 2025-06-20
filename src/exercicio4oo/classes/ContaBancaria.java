package exercicio4oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public String getNumeroConta() {
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saldoAtual(ContaBancaria conta) {
        System.out.println("Saldo atual:R$ " + conta.getSaldo());
    }
    public void realizarDeposito(ContaBancaria conta) {
        conta.setSaldo(conta.getSaldo() + 1000);
    }
    public void realizarSaque(ContaBancaria conta) {
        conta.setSaldo(conta.getSaldo() - 1234);
    }
}
