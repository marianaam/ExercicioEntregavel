import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Matricula> listaMatriculas = new ArrayList<>();


    public Aluno getAlunoPorCodigo(Integer codigoAluno) {
        for (Aluno aluno : listaAlunos) {
            if (codigoAluno.equals(aluno.getCodigoAluno())) {
                return aluno;
            }

        }
        return null;

    }

    public Curso getCursoPorCodigo(Integer codigoCurso) {
        for (Curso curso : listaCursos) {
            if (codigoCurso.equals(curso.getCodigoCurso())) {
                return curso;
            }
        }
        return null;

    }

    public Professor getProfessorPorCodigo(Integer codigoProfessor) {
        for (Professor professor : listaProfessores) {
            if (codigoProfessor.equals((professor.getCodigoProfessor()))) {
                return professor;
            }

        }
        return null;

    }


    public void registrarCurso(String nomeCurso, Integer codigoCurso, Integer qtdMaximaAlunos) {

        Curso curso = new Curso();
        curso.setNomeCurso(nomeCurso);
        curso.setCodigoCurso(codigoCurso);
        curso.setQtdMaximaAlunos(qtdMaximaAlunos);

        listaCursos.add(curso);


    }

    public void excluirCurso(Integer codigoCurso) {

        listaCursos.remove(listaCursos.get(codigoCurso));
    }

    public void registrarProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, Integer horasMentoria) {

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto();
        professorAdjunto.setNomeProfessor(nomeProfessor);
        professorAdjunto.setSobrenomeProfessor(sobrenomeProfessor);
        professorAdjunto.setCodigoProfessor(codigoProfessor);
        professorAdjunto.setHorasMonitoria(horasMentoria);

        listaProfessores.add(professorAdjunto);
    }

    public void registrarProfessorTitular(String nomeProfessor, String sobrenomeProfessor, Integer codigoProfessor, String especialidade) {

        ProfessorTitular professorTitular = new ProfessorTitular();
        professorTitular.setNomeProfessor(nomeProfessor);
        professorTitular.setSobrenomeProfessor(sobrenomeProfessor);
        professorTitular.setCodigoProfessor(codigoProfessor);
        professorTitular.setEspecialidade(especialidade);

        listaProfessores.add(professorTitular);
    }

    public void excluirProfessor(Integer codigoProfessor) {

        listaProfessores.remove(listaProfessores.get(codigoProfessor));
    }

    public void registrarAluno(String nomeAluno, String sobrenomeAluno, Integer codigoAluno) {

        Aluno aluno = new Aluno();
        aluno.setNomeAluno(nomeAluno);
        aluno.setSobrenomeAluno(sobrenomeAluno);
        aluno.setCodigoAluno(codigoAluno);

        listaAlunos.add(aluno);
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

        Aluno aluno = getAlunoPorCodigo(codigoAluno);
        Curso curso = getCursoPorCodigo(codigoCurso);

        if (curso.adicionarAluno(aluno)) {

            Matricula matricula = new Matricula(aluno, curso);
            listaMatriculas.add(matricula);
            System.out.println("O aluno foi matriculado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a matrícula por falta de vagas");
        }


    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        ProfessorTitular professorTitular = (ProfessorTitular) getProfessorPorCodigo(codigoProfessorTitular);
        ProfessorAdjunto professorAdjunto = (ProfessorAdjunto) getProfessorPorCodigo(codigoProfessorAdjunto);

        Curso curso = getCursoPorCodigo(codigoCurso);
        curso.setProfessorTitular(professorTitular);
        curso.setProfessorAdjunto(professorAdjunto);


    }

    public Curso consultarCursoPorAluno(Integer codigoAluno) {

        for (Matricula matricula : listaMatriculas) {
            if (matricula.getAluno().getCodigoAluno().equals(codigoAluno)) {
                return matricula.getCurso();

            }
        }
        return null;
    }


    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }
}


