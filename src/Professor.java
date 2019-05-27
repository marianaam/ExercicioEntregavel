import java.util.Objects;

public class Professor {

    private String nomeProfessor;
    private String sobrenomeProfessor;
    private Integer codigoProfessor;

    public Professor() {

    }

    public Professor(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.codigoProfessor = codigoProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codigoProfessor, professor.codigoProfessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoProfessor);
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }
}
