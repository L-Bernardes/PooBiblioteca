package src;

public abstract class Livro{

    protected int id, anoPublicacao;
    protected String titulo, autor, editora;
    protected Boolean disponivel;


    public void mostrarLivro(){
    }

    public Livro(int id, int anoPublicacao, String titulo, String autor, String editora, Boolean disponivel) {
        this.id = id;
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.disponivel = disponivel;
    }

  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
    

    
}
