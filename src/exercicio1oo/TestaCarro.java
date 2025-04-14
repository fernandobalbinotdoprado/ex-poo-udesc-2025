package exercicio1oo;

  class TestaCarro {
     public static void main(String[] args) {


         Carro carro = new Carro();
         carro.modelo = "Uno";
         carro.marca = "Fiat";
         carro.ano = 2010;
         carro.velocidade = 200;
         System.out.println("Modelo: " + carro.modelo);
         System.out.println("Marca: " + carro.marca);
         System.out.println("Ano: " + carro.ano);
         System.out.println("Velocidade: " + carro.velocidade);
     }
}
