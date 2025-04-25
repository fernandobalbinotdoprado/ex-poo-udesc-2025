package exercicio1oo;
 class TestaAluno {
     public static void main(String[] args){
        Aluno fernando = new Aluno();
        fernando.nome = "Fernando Balbinot";
        fernando.idade = 18;
        fernando.nota1 = 7;
        fernando.nota2 = 8;
        fernando.nota3 = 9;
        fernando.nota4 = 10;
        System.out.println("Nome: " + fernando.nome);
        System.out.println("Idade: " + fernando.idade);
        System.out.println("Nota 1: " + fernando.nota1);
        System.out.println("Nota 2: " + fernando.nota2);
        System.out.println("Nota 3: " + fernando.nota3);
        System.out.println("Nota 4: " + fernando.nota4);


        Aluno guilherme = new Aluno();
        guilherme.nome = "Guilherme Pierdoná";
        guilherme.idade = 19;
        guilherme.nota1 = 7;
        guilherme.nota2 = 8;
        guilherme.nota3 = 9;
        guilherme.nota4 = 10;
        System.out.println("Nome: " + guilherme.nome);
        System.out.println("Idade: " + guilherme.idade);
        System.out.println("Nota 1: " + guilherme.nota1);
        System.out.println("Nota 2: " + guilherme.nota2);
        System.out.println("Nota 3: " + guilherme.nota3);
        System.out.println("Nota 4: " + guilherme.nota4);

    }
}
