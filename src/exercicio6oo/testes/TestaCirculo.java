package exercicio6oo.testes;
import exercicio6oo.classes.Circulo;

class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        System.out.println("Raio do Círculo: " + circulo.getRaio());
        circulo.calcularDiametro();
        circulo.calcularPerimetro();
        circulo.calcularArea();

        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1);
    }
}