import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfessorTitular("Andre", "Santos", 01, "Full Stack");
        digitalHouseManager.registrarProfessorTitular("Paula", "Gonçalves", 02, "Android");

        digitalHouseManager.registrarProfessorAdjunto("Vitoria", "Gonçalves", 03, 14);
        digitalHouseManager.registrarProfessorAdjunto("Lucia", "Silva", 04, 18);

        digitalHouseManager.registrarCurso("Full Stack", 20001, 3);
        digitalHouseManager.registrarCurso("Android", 20002, 2);

        digitalHouseManager.alocarProfessores(20001, 01, 03);
        digitalHouseManager.alocarProfessores(20002, 02, 04);


        digitalHouseManager.matricularAluno(01, 20001);
        digitalHouseManager.matricularAluno(02, 20001);

        digitalHouseManager.matricularAluno(03, 20002);
        digitalHouseManager.matricularAluno(04, 20002);
        digitalHouseManager.matricularAluno(05, 20002);





    }
}
