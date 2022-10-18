package Controller;

import DataBase.DataBase;
import Model.Aluno;

import java.util.Scanner;

import static java.lang.System.in;

public class AlunoController {
    public static void inserirAluno() {
        String nome = "";
        int matricula = 0;

        Scanner sc = new Scanner(in);
        Aluno aluno = new Aluno();

        System.out.println("Nome do aluno: ");
        aluno.setNome(nome = sc.next());

        System.out.println("Matricula: ");
        aluno.setMatricula(matricula = sc.nextInt());

        System.out.println("Cadastro realizado com sucesso!");

        for (Aluno a : DataBase.nomeAluno) {
            if (matricula == a.getMatricula()) {
                System.out.println("ERRO: A matricula informada ja existe");
                break;
            } else {
                DataBase.adicionar(aluno);
                aluno = new Aluno();
                break;
            }

        }
    }

    public static void pesquisarAluno() {

        int matricula;
        Scanner sc = new Scanner(in);

        System.out.println("Informe o numero da matricula do aluno que voce deseja pesquisar: ");
        matricula = sc.nextInt();

        String mensagem = null;
        for (Aluno a : DataBase.nomeAluno) {
            if (a.getMatricula() == (matricula)) {
                mensagem = "O aluno é:" + a;
            }
        }

        if (mensagem != null) {
            System.out.println(mensagem);
        } else {
            System.out.println("Aluno não cadastrado");
        }

    }

    public static void excluirAluno() {

        Scanner sc = new Scanner(in);
        int matricula;

        System.out.println("Informe o numero da matricula do aluno que voce deseja deletar: ");
        matricula = sc.nextInt();

        String mensagem = null;
        for (Aluno aluno : DataBase.nomeAluno) {
            System.out.println(aluno.getMatricula());
            if (aluno.getMatricula() == matricula) {
                mensagem = "O aluno deletado tem como:" + aluno;
                System.out.println(mensagem);
                DataBase.nomeAluno.remove(aluno);
                break;
            }
        }
    }

    public static void inseriNotas() {

        for (Aluno aluno : DataBase.nomeAluno) {
            InserirNotaController.validarNotas();
            CalculaMediaController.atualizaMedia(aluno);
            break;
        }
    }

    public static void relatorioAlunos() {
        System.out.println(DataBase.nomeAluno);
    }

    public static void informacoesDisciplina() {
        System.out.println("Disciplina:" + Aluno.getDisciplina());
        System.out.println("Total de alunos:" + DataBase.nomeAluno.stream().count());

//        CalculaMediaController.mediaGeral();

    }
}



