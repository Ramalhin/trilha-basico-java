import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos;
    private List<Mentoria> mentoriasParticipadas;

    public Dev(String nome) {
        this.nome = nome;
        this.cursosInscritos = new ArrayList<>();
        this.mentoriasParticipadas = new ArrayList<>();
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void participarMentoria(Mentoria mentoria) {
        mentoriasParticipadas.add(mentoria);
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public List<Mentoria> getMentoriasParticipadas() {
        return mentoriasParticipadas;
    }
}
