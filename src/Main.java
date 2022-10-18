import Controller.AlunoController;
import DataBase.DataBase;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DataBase.cadastroInicial();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char sair = 0;

        do {

            System.out.println("Insira o codigo da acao desejadada:\n" +
                    " 1-Cadastrar Aluno" +
                    "\n 2-Remover Aluno" +
                    "\n 3-Pesquisar Aluno" +
                    "\n 4-Inserir notas" +
                    "\n 5-Relatorio de alunos" +
                    "\n 6-Informaçoes da disciplina");

            int opcaoCodigo = 0;

            System.out.print("nº: ");
            opcaoCodigo = sc.nextInt();

            switch (opcaoCodigo) {
                case 1:
                    AlunoController.inserirAluno();
                    break;
                case 2:
                    AlunoController.excluirAluno();
                    break;
                case 3:
                    AlunoController.pesquisarAluno();
                    break;
                case 4:
                    AlunoController.inseriNotas();
                    break;
                case 5:
                    AlunoController.relatorioAlunos();
                    break;
                case 6:
                    AlunoController.informacoesDisciplina();
            }
            System.out.println("Voce deseja sair do sitema?" +
                    "\nEscreva 's' para sim e 'n' para nao");
            sair = sc.next().charAt(0);
        }
        while (sair != 's');

        sc.close();

    }
}



