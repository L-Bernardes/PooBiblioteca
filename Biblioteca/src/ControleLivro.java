package src;

import java.util.ArrayList;

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
        for (int i = 0; i < acervo.size(); i++) {
            System.out.println("\nID: " + acervo.get(i).getId() + "\nTitulo: " + acervo.get(i).getTitulo() +
             "\nAno de publicação: " + acervo.get(i).getAnoPublicacao() + "\nAutor: " + acervo.get(i).getAutor() +
              "\nEditora: " + acervo.get(i).getEditora() + "\nDisponivel: " + acervo.get(i).getDisponivel() + "\n");
        }
    }
}
