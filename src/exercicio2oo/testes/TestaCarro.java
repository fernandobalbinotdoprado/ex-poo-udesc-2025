package exercicio2oo.testes;
import exercicio2oo.classes.Carro;
// .
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
    }
}
