package exercicio5oo.testes;
import exercicio5oo.classes.Aluno;

class TestaAluno {
     public static void main(String[] args){
        calcularMedia(7,8,9,10);
        Aluno fernando = new Aluno(); // .
        fernando.setNome("Fernando Balbinot");
        fernando.setIdade(18);
        fernando.setNota1(7);
        fernando.setNota2(8);
        fernando.setNota3(9);
        fernando.setNota4(10);
        System.out.println("Nome: " + fernando.getNome());
        System.out.println("Idade: " + fernando.getIdade());
        System.out.println("Nota 1: " + fernando.getNota1());
        System.out.println("Nota 2: " + fernando.getNota2());
        System.out.println("Nota 3: " + fernando.getNota3());
        System.out.println("Nota 4: " + fernando.getNota4());

        Aluno guilherme = new Aluno();
        guilherme.setNome("Guilherme Pierdoná");
        guilherme.setIdade(19);
        guilherme.setNota1(7);
        guilherme.setNota2(8);
        guilherme.setNota3(9);
        guilherme.setNota4(10);
        System.out.println("Nome: " + guilherme.getNome());
        System.out.println("Idade: " + guilherme.getIdade());
        System.out.println("Nota 1: " + guilherme.getNota1());
        System.out.println("Nota 2: " + guilherme.getNota2());
        System.out.println("Nota 3: " + guilherme.getNota3());
        System.out.println("Nota 4: " + guilherme.getNota4());

        Aluno aluno1 = new Aluno("Fernando Balbinot",18, 7, 8, 9, 10);
        System.out.println(aluno1);

        Aluno aluno2 = new Aluno("Guilherme Pierdoná", 19, 7, 8, 9, 10);
        System.out.println(aluno2);
        }
   static void calcularMedia(int nota1,int nota2,int nota3,int nota4) {
      int media = (nota1 + nota2 + nota3 + nota4)/4;
      System.out.println("Média: " + media);
      if (media >= 7) {
         System.out.println("Aprovado");
      } else {
         System.out.println("Reprovado");
      }
   }
   }
