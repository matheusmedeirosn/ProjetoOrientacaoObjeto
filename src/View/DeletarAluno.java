package View;
import DataBase.DataBase;
import Model.Aluno;

import java.util.Scanner;

public class DeletarAluno {

    public static void excluirAluno() {
        Scanner sc = new Scanner(System.in);

        int numeroMatricula;
        System.out.println("informe o nome do aluno que voce deseja excluir: ");
        numeroMatricula = sc.nextInt();

        Aluno aluno = new Aluno();

        for (int i = 0; i < DataBase.nomeAluno.size(); i++) {
            Aluno a = DataBase.nomeAluno.get(i);

            if (aluno.equals(numeroMatricula)) {
                DataBase.nomeAluno.remove(a);

                break;
            }
            System.out.print("Pessoas cadastradas após remoção:\n");
        }
        for(int i = 0; i < DataBase.nomeAluno.size(); i++)
        {
            System.out.print(DataBase.nomeAluno.get(i).getNome() + "\n");
        }
    }
}
