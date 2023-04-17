package src;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
    public static void mostrarUsuarios() {
        String mensagem = "";
        for (int i = 0; i < listUsuarios.size(); i++) {
            Usuario usuario = listUsuarios.get(i);
            mensagem += "CPF: " + usuario.getCPF() + "\n"
                     + "Nome: " + usuario.getNome() + "\n"
                     + "Email: " + usuario.getEmail() + "\n"
                     + "Possui livro: " + usuario.getComLivro() + "\n\n";
        }
    
        JTextArea textArea = new JTextArea(mensagem);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 400));
        JOptionPane.showMessageDialog(null, scrollPane, "Informações dos Usuários", JOptionPane.PLAIN_MESSAGE);
    }
}
