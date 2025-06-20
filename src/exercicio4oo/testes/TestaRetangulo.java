package exercicio4oo.testes;
import exercicio4oo.classes.Retangulo;

class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(4);
        retangulo.setAltura(3);
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        retangulo.calcularArea();
    }
}
