package exercicio5oo.classes;

public class Circulo {
    private double raio;

    public Circulo(){

    }
    public Circulo(double raio) {
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
        }

