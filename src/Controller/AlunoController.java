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
                return;
            } else {
                DataBase.adicionar(aluno);
                aluno = new Aluno();
                return;
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
                mensagem = "O aluno deletado tem como nome:" + aluno.getNome();
                System.out.println(mensagem);
                DataBase.nomeAluno.remove(aluno);
                return;
            }
        }
    }

    public static void inseriNotas() {

        for (Aluno aluno : DataBase.nomeAluno) {
            InserirNotaController.validarNotas();
            CalculaMediaController.atualizaMedia(aluno);
            return;
        }
    }

    public static void relatorioAlunos() {
        System.out.println(DataBase.nomeAluno);
    }

    public static void informacoesDisciplina() {
        int totalAlunos = DataBase.nomeAluno.size();
        double soma = 0;
        Aluno maiorNota1 = DataBase.nomeAluno.get(0);
        Aluno maiorNota2 = DataBase.nomeAluno.get(0);
        Aluno maiorNota3 = DataBase.nomeAluno.get(0);
        Aluno maiorMedia = DataBase.nomeAluno.get(0);

        for(Aluno a: DataBase.nomeAluno){

            soma += a.getMedia();

            if(a.getNota1() > maiorNota1.getNota1()){
                maiorNota1 = a;
            }
            if(a.getNota2()> maiorNota2.getNota2()){
                maiorNota2=a;
            }
            if(a.getNota3()>maiorNota3.getNota3()){
                maiorNota3=a;
            }
            if(a.getMedia()>maiorNota3.getNota3()){
                maiorNota3=a;
            }
        }

        double mediaGeral = soma/totalAlunos;


        System.out.println("Disciplina:" + Aluno.getDisciplina());
        System.out.println("Total de alunos:" + totalAlunos);
        System.out.println("Média Geral: "  + mediaGeral);
        System.out.println("\n Maior nota 1:");
        System.out.println(" - Aluno: " + maiorNota1.getNome());
        System.out.println(" - Nota: " + maiorNota1.getNota1());
        System.out.println("\n Maior nota 2:");
        System.out.println(" - Aluno: " + maiorNota2.getNome());
        System.out.println(" - Nota: " + maiorNota2.getNota2());
        System.out.println("\n Maior nota 3:");
        System.out.println(" - Aluno: " + maiorNota3.getNome());
        System.out.println(" - Nota: " + maiorNota3.getNota3());
        System.out.println("\n Maior media:");
        System.out.println(" - Aluno: " + maiorMedia.getNome());
        System.out.println(" - Nota: " + maiorMedia.getMedia());


    }


}



