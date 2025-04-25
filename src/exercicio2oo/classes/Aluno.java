package exercicio2oo.classes;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private int nota1, nota2, nota3, nota4;

    public String getMatricula() {
        return this.matricula;
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
        return this.nota2
    }

    public int getNota3() {
        return this.nota3;
    }

    public int getNota4() {
        return this.nota4;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
}