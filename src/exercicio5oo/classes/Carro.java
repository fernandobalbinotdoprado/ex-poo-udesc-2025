package exercicio5oo.classes;

public class Carro {
  private String modelo;
  private String marca;
  private int ano;
  private double velocidade;

  public Carro() {

  }
  public Carro(String modelo, String marca, int ano, double velocidade) {
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.velocidade = velocidade;
  }
  @Override
  public String toString() {
return String.format("Modelo: %s \nMarca: %s \nAno: %d \nVelocidade: %.1f \n",
        this.modelo, this.marca, this.ano, this.velocidade);
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getAno() {
    return this.ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public double getVelocidade() {
    return this.velocidade;
  }

  public void setVelocidade(double velocidade) {
    if (velocidade >= 0 && velocidade <= 300) {
      System.out.println("Velocidade válida");
    } else {
      System.out.println("Velocidade inválida");
      return;
    }
    this.velocidade = velocidade;
  }
  public void aumentarVelo(Carro carro) {
    carro.setVelocidade(carro.getVelocidade() + 10);
  }

  public void diminuirVelo(Carro carro) {
    carro.setVelocidade(carro.getVelocidade() - 10);
  }
  public void veloAtual(Carro carro) {
    System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
  }
}
