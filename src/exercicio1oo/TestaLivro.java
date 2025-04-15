package exercicio1oo;

 class TestaLivro {
    public static void main (String[] args) {
        Livro livro = new Livro();
        livro.titulo = "Memórias Postumas de Brás Cubas";
        livro.autor = "Machado de Assis";
        livro.genero = "Romance";
        livro.emprestado = true;
        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Genero: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }

}
