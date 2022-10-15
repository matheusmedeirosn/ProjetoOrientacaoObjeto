package View;

import DataBase.DataBase;
import Model.Aluno;

import java.util.Scanner;

public class CadastrarAluno {
    public static void inserirAluno() {
        String nome = "";
        int matricula=0;

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome do aluno: ");
        aluno.setNome(nome = sc.next());

        System.out.println("Matricula: ");
        aluno.setMatricula(matricula = sc.nextInt());

        DataBase.adicionar(aluno);
        aluno = new Aluno();
        }
    }
