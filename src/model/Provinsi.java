package model; // import dari sebuah package model dari class

import java.text.ParseException;

public class Provinsi extends Negara{
    // atribut provinsi
    private String kode_provinsi, nama_negara;
    private String ibu_kotaprov,namaprovin;
    private int Pendapatan;

    public Provinsi(String nama_negara, String kode_provin, String namaprovin, String ibu_kota, int pendapatan) {
        super(nama_negara, kode_provin, namaprovin, ibu_kota, pendapatan);
        this.nama_negara = nama_negara;
        this.kode_provinsi = kode_provin;
        this.namaprovin = namaprovin;
        this.ibu_kotaprov = ibu_kota;
        this.Pendapatan = pendapatan;
    }


    //method getter and setter

    @Override
    public String getNama_negara() {
        return nama_negara;
    }

    @Override
    public void setNama_negara(String nama_negara) {
        this.nama_negara = nama_negara;
    }

    public String getNamaprovin() {
        return namaprovin;
    }

    public void setNamaprovin(String namaprovin) {
        this.namaprovin = namaprovin;
    }

    public String getKode_provinsi() {
        return kode_provinsi;
    }

    public void setKode_provinsi(String kode_provinsi) {
        this.kode_provinsi = kode_provinsi;
    }

    public String getIbu_kotaprov() {
        return ibu_kotaprov;
    }

    public void setIbu_kotaprov(String ibu_kotaprov) {
        this.ibu_kotaprov = ibu_kotaprov;
    }

    public int getPendapatan() {
        return Pendapatan;
    }

    public void setPendapatan(int pendapatan) {
        Pendapatan = pendapatan;
    }


    //method
    public void tampil() {
        System.out.println("Nama Negara : "+nama_negara);
        System.out.println("Kode Provinsi : "+kode_provinsi);
        System.out.println("Nama provinsi : "+namaprovin);
        System.out.println("Kota prov : "+ibu_kotaprov);
        System.out.println("pendapatan : "+Pendapatan);
        System.out.println("Bantuan Negara : "+bntuanNegara());
        System.out.println("pajak prov : " + pjk());
        System.out.println("bantuan Negara : " + bntuanNegara());
    }

    public double pjk(){
        double pjak,persen; // pajak 5%
        persen = Pendapatan * 0.005;
        pjak = Pendapatan - persen;
        return pjak;
    }

    public double bntuanNegara(){
        return pjk()+50000;
    }


    //override

    @Override
    public double getPnb() {
        return super.getPnb();
    }

    @Override
    public void setPnb(double pnb) {
        super.setPnb(pnb);
    }
}
