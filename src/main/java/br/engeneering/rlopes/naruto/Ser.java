package br.engeneering.rlopes.naruto;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private String apelido;
    private int chakra;
    private List<Artefato> artefatos= new ArrayList<Artefato>();
    private EntidadePolitica governa; 
    private List<Jutsu> jutsos = new ArrayList<Jutsu>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public int getChakra() {
        return chakra;
    }
    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
    public List<Artefato> getArtefatos() {
        return artefatos;
    }
    public void setArtefatos(List<Artefato> artefatos) {
        this.artefatos = artefatos;
    }
    public EntidadePolitica getGoverna() {
        return governa;
    }
    public void setGoverna(EntidadePolitica governa) {
        this.governa = governa;
    }
    public List<Jutsu> getJutsos() {
        return jutsos;
    }
    public void setJutsos(List<Jutsu> jutsos) {
        this.jutsos = jutsos;
    }
}