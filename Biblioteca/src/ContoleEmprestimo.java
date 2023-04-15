package src;

import java.util.HashMap;
import java.util.Map;

public class ContoleEmprestimo {
    
    public static Map <Usuario, Livro> emprestado = new HashMap<Usuario, Livro>();

    public static String emprestarLivro(Livro livro, Usuario usuario){
        if (usuario.getComLivro() == true) {
            return "Caloteiro, devolva o livro!";
        } else {
            if (ControleLivro.acervo.contains(livro)) {
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
            if (ControleLivro.acervo.contains(livro)) {
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
    }

    //Printar emprestado
    public static void mostrarEmprestado() {
        for (Usuario usuario : emprestado.keySet()) {
            //Capturamos o valor a partir da chave
            Livro livro = emprestado.get(usuario);
            System.out.println(usuario.getCPF() + " = " + livro.getId());
        }
        
    }
}
