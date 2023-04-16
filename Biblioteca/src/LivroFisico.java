package src;

public class LivroFisico extends Livro{
    
    private int numPaginas;

    @Override
    public void mostrarLivros() {
        super.mostrarLivros();
    }

    public LivroFisico(int id, int anoPublicacao, String titulo, String autor, String editora,
            int numPaginas, Boolean  disponivel) {
        super(id, anoPublicacao, titulo, autor, editora, disponivel);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

}
