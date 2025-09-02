package br.engeneering.rlopes.naruto;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int numero; 
    private boolean ativo;
    private List<Shinobi> shinobis = new ArrayList<Shinobi>(4); 
    private List<Missao> missoes = new ArrayList<Missao>();
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    public List<Shinobi> getShinobis() {
        return shinobis;
    }
    public void setShinobis(List<Shinobi> shinobis) {
        this.shinobis = shinobis;
    }
    public List<Missao> getMissoes() {
        return missoes;
    }
    public void setMissoes(List<Missao> missoes) {
        this.missoes = missoes;
    }

    
}
