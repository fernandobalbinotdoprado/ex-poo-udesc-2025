package exercicio1oo;

class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = "Cc4587";
        conta.titular = "Guilherme";
        conta.saldo = 2345;
        System.out.println("Numero da conta :" + conta.numeroConta);
        System.out.println("Titular :" + conta.titular);
        System.out.println("Saldo da conta :" + conta.saldo);
    }
}
