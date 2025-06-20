package exercicio4oo.classes;

public class Carro {
  private String modelo;
  private String marca;
  private int ano;
  private double velocidade;

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
