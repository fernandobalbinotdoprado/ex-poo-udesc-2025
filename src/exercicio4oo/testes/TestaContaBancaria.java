package exercicio4oo.testes;
import exercicio4oo.classes.ContaBancaria;
class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta("Cc4587");
        conta.setTitular("Guilherme");
        conta.setSaldo(2345);
        System.out.println("Numero da conta :" + conta.getNumeroConta());
        System.out.println("Titular :" + conta.getTitular());
        System.out.println("Saldo da conta :" + conta.getSaldo());

        System.out.println("\nVerificando saldo...");
        saldoAtual(conta);

        System.out.println("\nRealizando depósito...");
        realizarDeposito(conta);

        System.out.println("\nVerificando saldo...");
        saldoAtual(conta);

        System.out.println("\nRealizando saque...");
        realizarSaque(conta);

        System.out.println("\nVerificando saldo...");
        saldoAtual(conta);
    }
    static void saldoAtual(ContaBancaria conta) {
        System.out.println("Saldo atual:R$ " + conta.getSaldo());
    }
    static void realizarDeposito(ContaBancaria conta) {
        conta.setSaldo(conta.getSaldo() + 1000);
    }
    static void realizarSaque(ContaBancaria conta) {
        conta.setSaldo(conta.getSaldo() - 1234);
    }
}
