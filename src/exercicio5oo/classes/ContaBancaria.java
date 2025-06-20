package exercicio5oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(){

    }
    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    @Override
    public String toString() {
        return String.format("\nNumero da conta: %s \nTitular: %s \nSaldo R$: %.1f \n",
                this.numeroConta, this.titular, this.saldo);
    }

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
        if (saldo < 0) {
            System.out.println("Saldo negativo");
            return;
        } else {
            System.out.println("Saldo positivo");
        }
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
