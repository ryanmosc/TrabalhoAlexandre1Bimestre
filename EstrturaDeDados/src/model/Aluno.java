package model;

public class Aluno {

    private String nome;
    private int ra;
    private int idade;
    private String  sexo;
    private Double media;
    private String resultado;

    public Aluno(){}

    public Aluno(String nome, int ra, int idade, String sexo, Double media) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
        this.sexo = sexo;
        this.media = media;
        this.resultado = String.valueOf(validarMedia(media));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    private AlunoEnum validarMedia(Double media){
        if (media >= 6){
            return AlunoEnum.APROVADO;
        }
        else {
            return AlunoEnum.REPROVADO;
        }
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", sexo='" + sexo + '\'' +
                ", media=" + media +
                ", resultado='" + resultado + '\'' +
                '}';
    }
}
