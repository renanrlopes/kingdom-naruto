package br.engeneering.rlopes.naruto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Shinobi extends Ser{
    private String sexo; 
    private Date nascimento; 
    private String categorai; 
    private boolean renegado; 
    private List<KekkeiGenkai> kekkeigenkkais = new ArrayList<KekkeiGenkai>();
    private Bijuu bijuus;

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public String getCategorai() {
        return categorai;
    }
    public void setCategorai(String categorai) {
        this.categorai = categorai;
    }
    public boolean isRenegado() {
        return renegado;
    }
    public void setRenegado(boolean renegado) {
        this.renegado = renegado;
    }
    public List<KekkeiGenkai> getKekkeigenkkais() {
        return kekkeigenkkais;
    }
    public void setKekkeigenkkais(List<KekkeiGenkai> kekkeigenkkais) {
        this.kekkeigenkkais = kekkeigenkkais;
    }
    public Bijuu getBijuus() {
        return bijuus;
    }
    public void setBijuus(Bijuu bijuus) {
        this.bijuus = bijuus;
    } 
}