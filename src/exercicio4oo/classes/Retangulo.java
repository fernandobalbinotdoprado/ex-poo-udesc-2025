package exercicio4oo.classes;

public class Retangulo {
    double largura;
    double altura;

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        double area = largura * altura;
        System.out.println("Area: " + area);
    }

}
