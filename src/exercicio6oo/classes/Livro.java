package exercicio6oo.classes;

public class Livro {

 private String titulo;
 private String autor;
 private String genero;
 private boolean emprestado;

 public Livro() {
 }
 public Livro(String titulo, String autor, String genero) {
  this.titulo = titulo;
  this.autor = autor;
  this.genero = genero;
 }
 public Livro(String titulo, String autor, String genero, boolean emprestado) {
  this(titulo, autor, genero);
  this.emprestado = emprestado;
 }
 @Override
 public String toString() {
  return String.format("\nTitulo: %s \nAutor: %s \nGenero: %s \nEmprestado: %b ",
          this.titulo, this.autor, this.genero, this.emprestado);
 }

 public String getTitulo() {
  return this.titulo;
 }

 public void setTitulo(String titulo) {
  this.titulo = titulo;
 }

 public String getAutor() {
  return this.autor;
 }

 public void setAutor(String autor) {
  this.autor = autor;
 }

 public String getGenero() {
  return this.genero;
 }

 public void setGenero(String genero) {
  this.genero = genero;
 }

 public boolean getEmprestado() {
  return this.emprestado;
 }

 public void setEmprestado(boolean emprestado) {
  if (this.emprestado && emprestado) {
   System.out.println("Erro: O livro já está emprestado.");
   return;
  } else if (!this.emprestado && !emprestado) {
   System.out.println("Erro: O livro já está disponível.");
   return;
  }
  this.emprestado = emprestado;
 }

}
