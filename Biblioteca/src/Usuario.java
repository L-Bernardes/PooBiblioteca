package src;

public abstract class Usuario {
    
    protected String CPF, nome, email;
    protected Boolean comLivro;

    public void mostrarUsuario(){

    }

    public Usuario(String CPF, String nome, String email, Boolean comLivro) {
        this.CPF = CPF;
        this.nome = nome;
        this.email = email;
        this.comLivro = comLivro;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getComLivro() {
        return comLivro;
    }
    public void setComLivro(Boolean comLivro) {
        this.comLivro = comLivro;
    }

    
}
