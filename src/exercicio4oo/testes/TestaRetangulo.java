package exercicio4oo.testes;
import exercicio2oo.classes.Retangulo;
// .
class TestaRetangulo {
    public static void main(String[] args) {
        calcularArea(4,3);
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(4);
        retangulo.setAltura(3);
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
    }
    static void calcularArea(double largura,double altura) {
        double area = largura * altura;
        System.out.println("Area: " + area);
    }
}
