package br.engeneering.rlopes.naruto;

public class Main {

    public static void main(String[] args) {
        Cla cla = new Cla();
        cla.setNome("Uchiha");

        KekkeiGenkai r = new KekkeiGenkai(cla);
        r.setNome("Rinnegan");
        Shinobi n = new Shinobi();
        n.setNome("Negato");
        n.setApelido("Pain");
        n.setRenegado(true);
        n.getKekkeigenkkais().add(r);
        System.out.println(r.getCla().getNome());
    }
}