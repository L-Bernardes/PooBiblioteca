package src;

import java.util.ArrayList;

public class ControleUsuario {

    static ArrayList <Usuario> listUsuarios = new ArrayList<Usuario>();

    public static String adicionarUsuario(Usuario usuario){
        if (!listUsuarios.contains(usuario)) {
            listUsuarios.add(usuario);
            return "Usuário adicionado";
        }else{
            return "Usuário já existe";
        }
    } 

    public static String removerUsuario(Usuario usuario){
        if (listUsuarios.contains(usuario)) {
            listUsuarios.remove(usuario);
            return "Usuário removido";
        }else{
            return "Usuário não existe";
        }
    } 
    //Printar todos os usuários
    public static void mostrarUsuarios(){
        for (int i = 0; i < listUsuarios.size(); i++) {
            System.out.println("\nCPF: " + listUsuarios.get(i).getCPF() + "\nNome: " + listUsuarios.get(i).getNome() +
             "\nEmail: " + listUsuarios.get(i).getEmail() + "\nPossui livro: " + listUsuarios.get(i).getComLivro());
        }
    }
}
