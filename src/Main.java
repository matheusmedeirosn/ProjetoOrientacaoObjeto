import Controller.CalculaMediaController;
import Model.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();
        System.out.println("Informe a primeira nota: ");
        aluno.setNota1(sc.nextDouble());
        System.out.println("Informe a segunda nota: ");
        aluno.setNota2(sc.nextDouble());

        aluno.setMedia(CalculaMediaController.calculaMedia(aluno.getNota1(),aluno.getNota2()) );

        if(aluno.getMedia() >=6) {
            System.out.println("Aprovado! Sua media foi de:" + aluno.getMedia());
            System.out.println("Voce  deseja realizar a prova 3? Escreva S para sim ou N para n�o");
            String desejaFazerN3=sc.next();
            if(desejaFazerN3.equals("s")) {
                System.out.println("Informe sua terceira nota: ");
                aluno.setNota3(sc.nextDouble());
                CalculaMediaController.atualizaMedia(aluno);
                System.out.println("Voc� est� aprovado");
            }
        }
        else if(aluno.getMedia() <6){
            System.out.println("Voce esta em recuperacao.");
            System.out.println("Portanto, informe sua terceira nota: ");
            aluno.setNota3(sc.nextDouble());
            CalculaMediaController.atualizaMedia(aluno);
        }
        sc.close();
    }
}



