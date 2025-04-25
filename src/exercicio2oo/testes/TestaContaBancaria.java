package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta("Cc4587");
        conta.setTitular("Guilherme");
        conta.setSaldo(2345);
        System.out.println("Numero da conta :" + conta.getNumeroConta());
        System.out.println("Titular :" + conta.getTitular());
        System.out.println("Saldo da conta :" + conta.getSaldo());
    }
}
