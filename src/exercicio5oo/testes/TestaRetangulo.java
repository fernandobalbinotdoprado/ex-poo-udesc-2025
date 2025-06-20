package exercicio5oo.testes;
import exercicio5oo.classes.Retangulo;
class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(4);
        retangulo.setAltura(3);
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        retangulo.calcularArea();

        Retangulo retangulo1 = new Retangulo(4,3);
        System.out.println(retangulo1);
    }
}
