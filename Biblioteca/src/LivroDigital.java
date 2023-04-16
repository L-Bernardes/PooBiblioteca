package src;

public class LivroDigital extends Livro{
    
    private String formato;

    @Override
    public void mostrarLivros() {
        super.mostrarLivros();
    }

    
    public LivroDigital(int id, int anoPublicacao, String titulo, String autor, String editora,
            String formato, Boolean disponivel) {
        super(id, anoPublicacao, titulo, autor, editora, disponivel);
        this.formato = formato;
    }


    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
   
}
