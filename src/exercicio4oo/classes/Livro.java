package exercicio4oo.classes;
// .
public class Livro {

 private String titulo;
 private String autor;
 private String genero;
 private boolean emprestado;

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
  this.emprestado = emprestado;
 }
}
