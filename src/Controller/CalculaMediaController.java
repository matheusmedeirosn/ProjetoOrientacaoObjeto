package Controller;

import Model.Notas;

public class CalculaMediaController {

    public static double calculaMedia(double nota1, double nota2){
        return (nota1 + nota2)/2;
    }

    public static void atualizaMedia(Notas notas) {

        String mensagem = "";
        double media = notas.getMedia();

        double nota1 = notas.getNota1();
        double nota2 = notas.getNota2();
        double nota3 = notas.getNota3();

        if(nota3 > nota1) {
            media = calculaMedia(notas.getNota3(), notas.getNota2());
            notas.setMedia(media);
            mensagem = "sua nova media �:" + notas.getMedia();
        }
        else if(nota3 > nota2) {
            media = calculaMedia(notas.getNota3(), notas.getNota1());
            notas.setMedia(media);
            mensagem = "sua nova media �:" + notas.getMedia();
        }
        else if( nota3<nota1 || nota3<nota2 || nota3==nota1 || nota3==nota2 ) {
            mensagem = "Sua m�dia e situa��o permanece a mesma";

        }
        System.out.println(mensagem);
    }

}

