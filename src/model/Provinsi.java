package model;

public class Provinsi extends Negara{
    // atribut provinsi
    private String kode_provinsi;
    private String ibu_kotaprov;
    private int total_pengeluaran;

    public String getKode_provinsi(){
        return kode_provinsi;
    }
    public String getIbu_kotaprov(){
        return  ibu_kotaprov;
    }
}
