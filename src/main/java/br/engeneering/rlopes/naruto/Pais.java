package br.engeneering.rlopes.naruto;

import java.util.ArrayList;
import java.util.List;

public class Pais extends Ser{
    private String localizacao;
    private String bandana;
    private List<Vila> vilas = new ArrayList<Vila>();

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getBandana() {
        return bandana;
    }
    public void setBandana(String bandana) {
        this.bandana = bandana;
    }
    public List<Vila> getVilas() {
        return vilas;
    }
    public void setVilas(List<Vila> vilas) {
        this.vilas = vilas;
    } 
}