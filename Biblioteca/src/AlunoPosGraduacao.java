package src;

public class AlunoPosGraduacao extends Usuario {

    private String curso;

    @Override
    public void mostrarUsuario() {
        super.mostrarUsuario();
    }

    public AlunoPosGraduacao(String CPF, String nome, String email, Boolean comLivro, String curso) {
        super(CPF, nome, email, comLivro);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
