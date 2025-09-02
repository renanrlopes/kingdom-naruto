package br.engeneering.rlopes.naruto;

public class Main {

    public static void main(String[] args) {
        KekkeiGenkai r = new KekkeiGenkai(null);
        r.setNome("Rinnegan");
        Shinobi n = new Shinobi();
        n.setNome("Negato");
        n.setApelido("Pain");
        n.setRenegado(true);
        n.getKekkeigenkkais().add(r);
    }
}