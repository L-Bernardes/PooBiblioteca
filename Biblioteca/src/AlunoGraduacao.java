package src;

public class AlunoGraduacao extends Usuario {
    
    private String endereco;

    @Override
    public void mostrarUsuarios() {
        super.mostrarUsuarios();
    }

    public AlunoGraduacao(String CPF, String nome, String email, Boolean comLivro, String endereco) {
        super(CPF, nome, email, comLivro);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
