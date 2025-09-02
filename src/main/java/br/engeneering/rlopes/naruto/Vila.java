package br.engeneering.rlopes.naruto;

import java.util.ArrayList;
import java.util.List;

public class Vila extends Ser{
    private String localizacao;
    private String bandana;
    private List<Cla> clas = new ArrayList<Cla>();  
    private List<Ser> membros = new ArrayList<Ser>();

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
    public List<Cla> getClas() {
        return clas;
    }
    public void setClas(List<Cla> clas) {
        this.clas = clas;
    }
    public List<Ser> getMembros() {
        return membros;
    }
    public void setMembros(List<Ser> membros) {
        this.membros = membros;
    }  
}