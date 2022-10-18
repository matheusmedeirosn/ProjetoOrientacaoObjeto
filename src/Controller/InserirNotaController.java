package Controller;

import DataBase.DataBase;
import Model.Aluno;

import java.util.Scanner;

public class InserirNotaController {

    public static void validarNotas() {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;
        int matricula;

        System.out.println("Informe o numero da matricula do aluno em que deseja inserir suas respectivas notas: ");
        matricula = sc.nextInt();

        for (Aluno a : DataBase.nomeAluno) {
            if (matricula == a.getMatricula()) {

                System.out.println("Informe a primeira nota: ");
                nota1 = sc.nextDouble();
                a.setNota1(nota1);
                System.out.println("Informe a segunda nota: ");
                nota2 = sc.nextDouble();
                a.setNota2(nota2);

                a.setMedia(CalculaMediaController.calculaMedia(a.getNota1(), a.getNota2()));


                if (a.getMedia() >= 6) {
                    System.out.println("Aprovado! Sua media foi de:" + a.getMedia());
                    System.out.println("Voce  deseja realizar a prova 3? Escreva S para sim ou N para nao");
                    String desejaFazerN3 = sc.next();
                    if (desejaFazerN3.equals("s")) {
                        System.out.println("Informe sua terceira nota: ");
                        nota3 = sc.nextDouble();
                        a.setNota3(nota3);
                        CalculaMediaController.atualizaMedia(a);
                        System.out.println("Voc� est� aprovado");
                    }
                } else if (a.getMedia() < 6) {
                    System.out.println("Voce esta em recuperacao.Sua media foi:" + a.getMedia());
                    System.out.println("Portanto, informe sua terceira nota: ");
                    a.setNota3(sc.nextDouble());
                    CalculaMediaController.atualizaMedia(a);
                }
                break;
            }
        }
    }


}


