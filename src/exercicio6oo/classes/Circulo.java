package exercicio6oo.classes;

public class Circulo {
    private double raio;

    public Circulo(){

    }
    public Circulo(double raio) {
        this();
        this.raio = raio;
    }
    @Override
    public String toString() {
        return String.format("Raio: %.1f", this.raio);
    }

    public double getRaio() {
        if (raio >= 0 && raio <= 1000) {
            System.out.println("Raio válido");
        } else {
            System.out.println("Raio inválido");
            return 0;
        }
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
        }

    public void calcularDiametro() {
        double diametro;
        diametro = 2 * raio;
        System.out.println("Diametro: " + diametro);
    }
    public void calcularPerimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * raio;
        System.out.println("Perimetro: " + String.format("%.2f",perimetro));
    }
    public void calcularArea() {
        double area;
        area = (Math.PI * raio*raio);
        System.out.println("Area: " + String.format("%.2f",area));
    }
   }

