package exercicio4oo.testes;
import exercicio4oo.classes.Livro;
// .
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
        verificaEmprestimo(livro);

        System.out.println("\nTentando devolver o livro...");
        devolveLivro(livro);
        verificaEmprestimo(livro);

        System.out.println("\nTentando emprestar o livro novamente...");
        emprestaLivro(livro);
        verificaEmprestimo(livro);
    }

    static void verificaEmprestimo(Livro livro) {
        if (livro.getEmprestado()) {
            System.out.println("O livro está emprestado.");
        } else {
            System.out.println("O livro está disponível.");
        }
    }

    static void emprestaLivro(Livro livro) {
        System.out.println("Estado antes de emprestar: " + livro.getEmprestado());
        if (!livro.getEmprestado()) {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Ação: O livro já está emprestado.");
        }
    }

    static void devolveLivro(Livro livro) {
        if (livro.getEmprestado()) {
            livro.setEmprestado(false);
            System.out.println("Ação: Livro devolvido com sucesso.");
        } else {
            System.out.println("Ação: O livro já está disponível.");
        }
    }
}
