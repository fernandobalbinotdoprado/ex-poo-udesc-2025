package exercicio4oo.testes;
import exercicio4oo.classes.Livro;

class TestaLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("Memórias Póstumas de Brás Cubas");
        livro.setAutor("Machado de Assis");
        livro.setGenero("Romance");
        livro.setEmprestado(false);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Emprestado?: " + livro.getEmprestado());

        System.out.println("\nVerificando situação...");
        livro.verificaEmprestimo(livro);

        System.out.println("\nTentando devolver o livro...");
        livro.devolveLivro(livro);
        livro.verificaEmprestimo(livro);

        System.out.println("\nTentando emprestar o livro novamente...");
        livro.emprestaLivro(livro);
        livro.verificaEmprestimo(livro);
    }
}
