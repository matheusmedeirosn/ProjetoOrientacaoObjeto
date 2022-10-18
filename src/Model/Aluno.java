package Model;

public class Aluno {

    private String nome;

    private int matricula;

    private double nota1 = 0, nota2 = 0, nota3 = 0;

    private double media;

    public static String disciplina = "Geografia";

    @Override
    public String toString() {
        return "\n==============\nNome: " + this.nome + "\n| Nota1: " + this.nota1 + "\n| Nota2: " + this.nota2 + "\n| Nota3: " + this.nota3 + "\n| Media: " + this.media;
    }


    public Aluno() {
    }

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public static String getDisciplina() {
        return disciplina;
    }

    public static void setDisciplina(String disciplina) {
        Aluno.disciplina = disciplina;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;


    }
}
