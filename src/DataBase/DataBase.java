package DataBase;

import Model.Aluno;

import java.util.ArrayList;

public class DataBase {

    public static ArrayList<Aluno> nomeAluno = new ArrayList<>();

    public static void adicionar(Aluno ca) {
        nomeAluno.add(ca);
    }


    public static void cadastroInicial() {

        nomeAluno.add(new Aluno("Matheus", 12345678, 1, 10, 0, 0));

        nomeAluno.add(new Aluno("Keylla", 87654321, 10, 7, 0, 8.5));

        nomeAluno.add(new Aluno("Victor", 75412368, 7, 7, 0, 7));

        nomeAluno.add(new Aluno("Luiza", 75412368, 2, 5, 10, 7.5));

    }
}
