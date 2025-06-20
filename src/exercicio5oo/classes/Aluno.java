package exercicio5oo.classes;
public class Aluno {
    private String nome;
    private int idade;
    private int nota1, nota2, nota3, nota4;

    public Aluno() {

    }

    public Aluno(String nome, int idade, int nota1, int nota2, int nota3, int nota4) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s \nidade: %d \nNota1: %d \nNota2: %d \nNota3: %d \nNota4: %d ",
                this.nome, this.idade, this.nota1, this.nota2, this.nota3, this.nota4);
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getNota1() {
        return this.nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public int getNota3() {
        return this.nota3;
    }

    public int getNota4() {
        return this.nota4;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(int nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            System.out.println("Nota1 válida");
        } else {
            System.out.println("Nota inválida");
            return;
        }
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            System.out.println("Nota2 válida");
        } else {
            System.out.println("Nota2 inválida");
            return;
        }
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            System.out.println("Nota3 válida");
        } else {
            System.out.println("Nota3 inválida");
            return;
        }
        this.nota3 = nota3;
    }

    public void setNota4(int nota4) {
        if (nota4 >= 0 && nota4 <= 10) {
            System.out.println("Nota4 válida");
        } else {
            System.out.println("Nota4 inválida");
            return;
        }
        this.nota4 = nota4;
    }

    public void calcularMedia() {
        int media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}