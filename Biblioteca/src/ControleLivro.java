package src;

import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;

public class ControleLivro {

    static ArrayList <Livro> acervo = new ArrayList<Livro>();
    //static Map <Usuario, Livro> emprestado = new HashMap<Usuario, Livro>();
    

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

    /*public static String emprestarLivro(Livro livro, Usuario usuario){
        if (usuario.getComLivro() == true) {
            return "Caloteiro, devolva o livro!";
        } else {
            if (acervo.contains(livro)) {
                if (livro.getDisponivel() == true) {
                    livro.setDisponivel(false);
                    usuario.setComLivro(true);
                    emprestado.put(usuario, livro);
                    return "Livro emprestado";
                } else {
                    return "Livro não disponivel";
                } 
            } else {
                return "Livro não existe";
            } 
        }
    }

    public static String devolverLivro(Livro livro, Usuario usuario){
        if (usuario.getComLivro() == false) {
            return "Você não tem livro!";
        } else {
            if (acervo.contains(livro)) {
                if (livro.getDisponivel() == false) {
                    livro.setDisponivel(true);
                    emprestado.remove(usuario, livro);
                    return "Livro devolvido";
                } else {
                    return "Livro já foi devolvido";
                } 
            } else {
                return "Livro não existe";
            } 
        }
    }*/
    //Printar todos os livros
    public static void mostrarLivros(){
        for (int i = 0; i < acervo.size(); i++) {
            System.out.println("\nID: " + acervo.get(i).getId() + "\nTitulo: " + acervo.get(i).getTitulo() +
             "\nAno de publicação: " + acervo.get(i).getAnoPublicacao() + "\nAutor: " + acervo.get(i).getAutor() +
              "\nEditora: " + acervo.get(i).getEditora() + "\nDisponivel: " + acervo.get(i).getDisponivel() + "\n");
        }
    }
}
