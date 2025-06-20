package exercicio5oo.classes;

public class Retangulo {
    double largura;
    double altura;

    public Retangulo() {

    }
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return String.format("\nLargura: %.1f \nAltura: %.1f ", this.largura, this.altura);
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if (largura >= 0 && largura <= 1000) {
            System.out.println("Largura válida");
        } else {
            System.out.println("Largura inválida");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura >= 0 && altura <= 1000) {
            System.out.println("Altura válida");
        } else {
            System.out.println("Altura inválida");
            return;
        }
        this.altura = altura;
    }
    public void calcularArea() {
        double area = largura * altura;
        System.out.println("Area: " + area);
    }
}
