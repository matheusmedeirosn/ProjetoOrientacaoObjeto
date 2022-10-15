package Controller;

import Model.Notas;
import java.util.Scanner;

public class InserirNotaController {

        public static void validarNotas() {
            Notas notas = new Notas();
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe a primeira nota: ");
            notas.setNota1(sc.nextDouble());
            System.out.println("Informe a segunda nota: ");
            notas.setNota2(sc.nextDouble());

            notas.setMedia(CalculaMediaController.calculaMedia(notas.getNota1(), notas.getNota2()));


            if (notas.getMedia() >= 6) {
                System.out.println("Aprovado! Sua media foi de:" + notas.getMedia());
                System.out.println("Voce  deseja realizar a prova 3? Escreva S para sim ou N para n�o");
                String desejaFazerN3 = sc.next();
                if (desejaFazerN3.equals("s")) {
                    System.out.println("Informe sua terceira nota: ");
                    notas.setNota3(sc.nextDouble());
                    CalculaMediaController.atualizaMedia(notas);
                    System.out.println("Voc� est� aprovado");
                }
            } else if (notas.getMedia() < 6) {
                System.out.println("Voce esta em recuperacao.Sua media foi:" + notas.getMedia());
                System.out.println("Portanto, informe sua terceira nota: ");
                notas.setNota3(sc.nextDouble());
                CalculaMediaController.atualizaMedia(notas);
            }
        }


    }

