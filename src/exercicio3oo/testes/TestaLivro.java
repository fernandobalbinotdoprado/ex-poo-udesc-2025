package exercicio3oo.testes;
import exercicio2oo.classes.Livro;
// .
class TestaLivro {
    public static void main (String[] args) {
        Livro livro = new Livro(); /// .
        livro.setTitulo("Memórias Postumas de Brás Cubas");
        livro.setAutor("Machado de Assis");
        livro.setGenero("Romance");
        livro.setEmprestado(true);
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Emprestado: " + livro.getEmprestado());
    }

}
