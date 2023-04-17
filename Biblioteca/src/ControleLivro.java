package src;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleLivro {

    static ArrayList <Livro> acervo = new ArrayList<Livro>();    

    public static String adicionarLivro(Livro livro){
        if (!acervo.contains(livro)) {
            acervo.add(livro);
            return "Livro adicionado";
        }else{
            return "Livro já existe";
        }
    } 

    public static String removerLivro(Livro livro){
        if (acervo.contains(livro)) {
            acervo.remove(livro);
            return "Livro removido";
        }else{
            return "Livro não existe";
        }
    } 

    //Printar todos os livros
    public static void mostrarLivros(){
        String mensagem = "";

        for (int i = 0; i < acervo.size(); i++) {
            Livro livro = acervo.get(i);
            mensagem += "ID: " + livro.getId() + "\n"
                     + "Título: " + livro.getTitulo() + "\n"
                     + "Ano de publicação: " + livro.getAnoPublicacao() + "\n"
                     + "Autor: " + livro.getAutor() + "\n"
                     + "Editora: " + livro.getEditora() + "\n"
                     + "Disponível: " + livro.getDisponivel() + "\n\n";
        }
    
        JTextArea textArea = new JTextArea(mensagem);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 400));
        JOptionPane.showMessageDialog(null, scrollPane, "Informações dos Livros", JOptionPane.PLAIN_MESSAGE);
    }
    
}
