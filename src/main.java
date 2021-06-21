import model.Negara; // import dari sebuah package model dari class
import model.Provinsi; // import dari sebuah package model dari class

public class main {
    public static void main(String[] args) {

        System.out.println("--- Informasi Negara dan serta Provinsinya ---");
        System.out.println("----------------------------------------------");

        Negara nr1 = new Negara("+62"); //membuat object yg di panggila dari class Negara yang berada construktor
        Negara nr2 = new Negara(); // memanggil object
        nr2.setNama_negara("Indonesia"); //input data
        nr2.setJumlah_penduduk(27300);
        nr2.setBenua("Asia");
        nr2.setBahasa("Indonesia");
        nr2.setGdp(4000);
        nr2.setLagu_kebangsaan("Indonesia raya");
        nr2.setOrganisasi("Asean,Pbb");
        nr2.setIbu_kota("Jakarta");
        nr2.setPnb(496399);
        nr2.info();
        Negara nr3 = new Negara(496399); // memanggil object sekaligus menginput

        System.out.println("");

        Negara pr1 = new Negara("+62");
        Negara prl1 = new Negara(496399);
        Provinsi pr = new Provinsi(); // membuat object yang di panggil di class provinsi
        pr.setNama_negara("Indonesia"); //input data
        pr.setJumlah_penduduk(27300);
        pr.setBenua("Asia");
        pr.setBahasa("Indonesia");
        pr.setGdp(4000);
        pr.setLagu_kebangsaan("Indonesia raya");
        pr.setOrganisasi("Asean,Pbb");
        pr.setIbu_kota("Jakarta");
        pr.setPnb(496399);
        pr.setKode_provinsi("K19");
        pr.setIbu_kotaprov("Banjarmasin");
        pr.setPendapatan(5000);
        pr.tampil();





    }
}
