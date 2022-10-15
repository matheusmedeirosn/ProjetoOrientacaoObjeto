package Controller;

import Model.Aluno;

public class CalculaMediaController {

    public static double calculaMedia(double nota1, double nota2){
        return (nota1 + nota2)/2;
    }

    public static void atualizaMedia(Aluno aluno) {

        String mensagem = "";
        double media = aluno.getMedia();

        double nota1 = aluno.getNota1();
        double nota2 = aluno.getNota2();
        double nota3 = aluno.getNota3();

        if(nota3 > nota1) {
            media = calculaMedia(aluno.getNota3(), aluno.getNota2());
            aluno.setMedia(media);
            mensagem = "sua nova media �:" + aluno.getMedia();
        }
        else if(nota3 > nota2) {
            media = calculaMedia(aluno.getNota3(), aluno.getNota1());
            aluno.setMedia(media);
            mensagem = "sua nova media �:" + aluno.getMedia();
        }
        else if( nota3<nota1 || nota3<nota2 || nota3==nota1 || nota3==nota2 ) {
            mensagem = "Sua m�dia e situa��o permanece a mesma";

        }
        System.out.println(mensagem);
    }

}

