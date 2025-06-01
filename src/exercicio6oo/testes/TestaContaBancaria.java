package exercicio6oo.testes;
import exercicio5oo.classes.ContaBancaria;
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

        ContaBancaria contabancaria1 = new ContaBancaria("Cc4587","Guilherme", 2345);
        System.out.println(contabancaria1);
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
