package DataBase;

import Model.Aluno;
import View.CadastrarAluno;

import java.util.ArrayList;

public class DataBase {

    public static ArrayList<Aluno> nomeAluno = new ArrayList<>();

    public static void adicionar(Aluno ca) {
        nomeAluno.add(ca);
    }


    public static void cadastroInicial() {

        nomeAluno.add(new Aluno("Matheus", 12345678, null, null, null));

        nomeAluno.add(new Aluno("Keylla", 87654321, null, null, null));

        nomeAluno.add(new Aluno("Victor", 75412368,null, null, null));

        nomeAluno.add(new Aluno("Luiza", 75412368, null, null, null));

    }
}
