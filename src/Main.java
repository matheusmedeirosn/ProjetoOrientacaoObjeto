import Controller.CalculaMediaController;
import Controller.InserirNotaController;
import DataBase.DataBase;
import Model.Aluno;
import Model.Notas;
import View.CadastrarAluno;
import View.DeletarAluno;

import java.util.Locale;
import java.util.Scanner;

import static DataBase.DataBase.cadastroInicial;
import static DataBase.DataBase.nomeAluno;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Insira o codigo da acao desejadada:\n 1-Cadastrar Aluno\n 2-Remover Aluno\n 3-Pesquisar aluno\n 4-Inserir notas\n Relatório de alunos\n5-Informações da disciplina");
        int opcaoCodigo = 0;

        System.out.print("nº: ");
        opcaoCodigo = sc.nextInt();

        if (opcaoCodigo == 1) {
            CadastrarAluno.inserirAluno();
        }
        else if(opcaoCodigo==2) {
            DeletarAluno.excluirAluno();
        }
        cadastroInicial();
        for(Aluno s :nomeAluno){
            System.out.println("Aluno"+ s);
        }

        sc.close();
    }
}



