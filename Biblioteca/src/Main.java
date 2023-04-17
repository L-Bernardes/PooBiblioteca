package src;

public class Main{

    public static void main(String[] args) {
        
        LivroDigital d1 = new LivroDigital(001, 2015, "A Garota no Trem", "Paula Hawkins", "Record", "PDF", true);
        LivroDigital d2 = new LivroDigital(002, 2012, "As Vantagens de Ser Invisível", "Stephen Chbosky", "Leya", "PDF", true);
        LivroDigital d3 = new LivroDigital(003, 2019, "Verity", "Colleen Hoover", "Amazon", "PDF", true);
        LivroDigital d4 = new LivroDigital(004, 2018, "Eleanor Oliphant Está Muito Bem", "Gail Honeyman", "HarperCollins Brasil", null, true);
        LivroDigital d5 = new LivroDigital(005, 2020, "O Testamento", "John Grisham", "Intrínseca", "PDF", true);

        LivroFisico f1 = new LivroFisico(501, 1960, "O Processo", "Franz Kafka", "Companhia das Letras", 304, true);
        LivroFisico f2 = new LivroFisico(502, 1985, "O Amor nos Tempos do Cólera", "Gabriel García Márquez", "Record", 416, true);
        LivroFisico f3 = new LivroFisico(503, 2003, "O Código da Vinci", "Dan Brown", "Sextante", 476, true);
        LivroFisico f4 = new LivroFisico(504, 2013, "A Menina que Roubava Livros", "Markus Zusak", "Intrínseca", 480, true);
        LivroFisico f5 = new LivroFisico(505, 2017, "A Coragem de Ser Imperfeito", "Brené Brown", "Sextante", 208, true);

        AlunoGraduacao g1 = new AlunoGraduacao("357.924.680-21", "João Silva", "joaosilva@email.com", false, "Rua das Flores, 123, Bairro Jardim, Cidade dos Sonhos, Estado Imaginário");
        AlunoGraduacao g2 = new AlunoGraduacao("986.547.321-01", "Ana Santos", "anasantos@email.com", false, "Avenida das Águas, 456, Bairro Novo Horizonte, Cidade das Maravilhas, Estado Encantado");
        AlunoGraduacao g3 = new AlunoGraduacao("123.456.789-09", "Pedro Almeida", "pedroalmeida@email.com", false, "Praça dos Pássaros, 789, Bairro Alto da Colina, Cidade dos Anjos, Estado da Felicidade");
        AlunoGraduacao g4 = new AlunoGraduacao("258.963.147-03", "Maria Oliveira", "mariaoliveira@email.com", false, "Alameda das Estrelas, 1010, Bairro Celestial, Cidade do Amor, Estado dos Sonhos");
        AlunoGraduacao g5 = new AlunoGraduacao("654.321.987-01", "Lucas Souza", "lucassouza@email.com", false, "Travessa dos Sonhos, 222, Bairro Boa Vista, Cidade das Ilusões, Estado da Imaginação");

        AlunoPosGraduacao p1 = new AlunoPosGraduacao("789.456.123-02", "Juliana Silva", "juliana.silva@email.com", false, "MBA em Gestão de Negócios Internacionais");
        AlunoPosGraduacao p2 = new AlunoPosGraduacao("357.246.890-10", "Rafael Oliveira", "rafael.oliveira@email.com", false, "Especialização em Direito Penal e Processual Penal");
        AlunoPosGraduacao p3 = new AlunoPosGraduacao("123.987.654-03", "Maria Santos", "maria.santos@email.com", false, "Mestrado em Psicologia Clínica e da Saúde");
        AlunoPosGraduacao p4 = new AlunoPosGraduacao("456.789.123-01", "Lucas Souza", "lucas.souza@email.com", false, "Pós-graduação em Engenharia de Software");
        AlunoPosGraduacao p5 = new AlunoPosGraduacao("159.753.624-08", "Carolina Lima", "carolina.lima@email.com", false, "MBA em Marketing e Comunicação Digital");

        ControleLivro.adicionarLivro(d1);
        ControleLivro.adicionarLivro(d2);
        ControleLivro.adicionarLivro(d3);
        ControleLivro.adicionarLivro(d4);
        ControleLivro.adicionarLivro(d5);
        ControleLivro.adicionarLivro(f1);
        ControleLivro.adicionarLivro(f2);
        ControleLivro.adicionarLivro(f3);
        ControleLivro.adicionarLivro(f4);
        ControleLivro.adicionarLivro(f5);
        
        ControleUsuario.adicionarUsuario(g1);
        ControleUsuario.adicionarUsuario(g2);
        ControleUsuario.adicionarUsuario(g3);
        ControleUsuario.adicionarUsuario(g4);
        ControleUsuario.adicionarUsuario(g5);
        ControleUsuario.adicionarUsuario(p1);
        ControleUsuario.adicionarUsuario(p2);
        ControleUsuario.adicionarUsuario(p3);
        ControleUsuario.adicionarUsuario(p4);
        ControleUsuario.adicionarUsuario(p5);
 
        //Mostrar os livros e usuários
        ControleLivro.mostrarLivros();
        ControleUsuario.mostrarUsuarios();

        //Efetuar o emprestimo de 4 livros
        ContoleEmprestimo.emprestarLivro(d2, g2);
        ContoleEmprestimo.emprestarLivro(f2, p2);
        ContoleEmprestimo.emprestarLivro(f4, g1);
        ContoleEmprestimo.emprestarLivro(d5, p4);
        
        //Mostrar os livros emprestados
        ContoleEmprestimo.mostrarEmprestado();

        //Devolver 2 livros emprestados
        ContoleEmprestimo.devolverLivro(f4, g1);
        ContoleEmprestimo.devolverLivro(d5, p4);

        //Mostrar os livros emprestados
        ContoleEmprestimo.mostrarEmprestado();
    }
    
}
