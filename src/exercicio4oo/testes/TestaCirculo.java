package exercicio4oo.testes;
// .
import exercicio2oo.classes.Circulo;

class TestaCirculo {
    public static void main(String[] args) {
        calcularDiametro(5);
        calcularPerimetro(5);
        calcularArea(5);
        Circulo circulo = new Circulo();
        circulo.setRaio(5);
        System.out.println("Raio do Círculo: " + circulo.getRaio());
    }
    static void calcularDiametro(double raio) {
        double diametro;
        diametro = 2 * raio;
        System.out.println("Diametro: " + diametro);
    }
    static void calcularPerimetro(double raio) {
        double perimetro;
        perimetro = 2 * Math.PI * raio;
        System.out.println("Perimetro: " + String.format("%.2f",perimetro));
    }
    static void calcularArea(double raio) {
        double area;
        area = (Math.PI * raio*raio);
        System.out.println("Area: " + String.format("%.2f",area));
    }
}