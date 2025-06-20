package exercicio4oo.testes;
import exercicio4oo.classes.Circulo;

class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        System.out.println("Raio do Círculo: " + circulo.getRaio());
        circulo.calcularDiametro();
        circulo.calcularPerimetro();
        circulo.calcularArea();
    }
}