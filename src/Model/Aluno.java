package Model;

public class Aluno {

    private String nome;
    private int matricula;

    @Override
    public String toString(){
        return "Nome: " + this.nome;
    }

    public Aluno(){}

    public Aluno(String nome, int matricula, Notas nota1, Notas nota2, Notas nota3) {
        this.nome = nome;
        this.matricula = matricula;
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

    public void setMatricula(int matricula) {
        this.matricula = matricula;


    }
}
