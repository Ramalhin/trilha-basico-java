import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando o bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Aprenda Java do zero ao avançado");

        // Criando cursos
        Curso cursoJavaBasico = new Curso("Java Básico", "Curso de Java para iniciantes", 40, LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 31));
        Curso cursoJavaAvancado = new Curso("Java Avançado", "Curso de Java para desenvolvedores experientes", 60, LocalDate.of(2024, 11, 1), LocalDate.of(2024, 12, 31));
        
        // Adicionando cursos ao bootcamp
        bootcamp.adicionarCurso(cursoJavaBasico);
        bootcamp.adicionarCurso(cursoJavaAvancado);

        // Criando mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Sessão de mentoria sobre Java", LocalDate.of(2024, 10, 15));
        
        // Adicionando mentorias ao bootcamp
        bootcamp.adicionarMentoria(mentoriaJava);

        // Criando devs
        Dev dev1 = new Dev("Alice");
        Dev dev2 = new Dev("Bob");
        
        // Inscrevendo devs em cursos
        dev1.inscreverCurso(cursoJavaBasico);
        dev2.inscreverCurso(cursoJavaAvancado);
        
        // Participando das mentorias
        dev1.participarMentoria(mentoriaJava);
        dev2.participarMentoria(mentoriaJava);

        // Adicionando devs ao bootcamp
        bootcamp.adicionarDev(dev1);
        bootcamp.adicionarDev(dev2);

        // Exibindo informações
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        
        System.out.println("Cursos:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println(" - " + curso.getTitulo());
        }
        
        System.out.println("Mentorias:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println(" - " + mentoria.getTitulo());
        }
        
        System.out.println("Devs:");
        for (Dev dev : bootcamp.getDevs()) {
            System.out.println(" - " + dev.getNome());
        }
    }
}
