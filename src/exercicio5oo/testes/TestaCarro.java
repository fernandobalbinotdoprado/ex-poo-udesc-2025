package exercicio5oo.testes;
import exercicio5oo.classes.Carro;
class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Uno");
        carro.setMarca("Fiat");
        carro.setAno(2010);
        carro.setVelocidade(200);
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade: " + carro.getVelocidade());

        System.out.println("\nVerificando velocidade...");
        carro.veloAtual(carro);

        System.out.println("\nAcelerando...");
        carro.aumentarVelo(carro);

        System.out.println("\nVerificando velocidade...");
        carro.veloAtual(carro);

        System.out.println("\nFreiando...");
        carro.diminuirVelo(carro);

        System.out.println("\nVerificando velocidade...");
        carro.veloAtual(carro);

        Carro carro1 = new Carro("Uno","Fiat",2010 ,200 );
        System.out.println(carro1);
    }
}
