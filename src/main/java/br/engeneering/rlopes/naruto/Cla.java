package br.engeneering.rlopes.naruto;

import java.util.ArrayList;
import java.util.List;

public class Cla extends Ser {
    private String simbolo;
    private List<Shinobi> clas = new ArrayList<Shinobi>();
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public List<Shinobi> getClas() {
        return clas;
    }
    public void setClas(List<Shinobi> clas) {
        this.clas = clas;
    }      
}