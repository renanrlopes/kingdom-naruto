package br.engeneering.rlopes.naruto;

public abstract class EntidadePolitica {
    private String nome;
    private String atuacao;
    private Ser lider;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAtuacao() {
        return atuacao;
    }
    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
    public Ser getLider() {
        return lider;
    }
    public void setLider(Ser lider) {
        this.lider = lider;
    } 
}
