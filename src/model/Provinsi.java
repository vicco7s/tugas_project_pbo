package model; // import dari sebuah package model dari class

public class Provinsi extends Negara{
    // atribut provinsi
    private String kode_provinsi;
    private String ibu_kotaprov;
    private int Pendapatan;

    //method getter and setter
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

    //construktor
    public Provinsi() {
        kode_provinsi = getKode_provinsi();
        ibu_kotaprov = getIbu_kotaprov();
        Pendapatan = getPendapatan();
    }

    public Provinsi(String nama_negara, int jumlah_penduduk, String benua, String bahasa, double gdp, String lagu_kebangsaan, String ibu_kota, String organisasi, String kode_provinsi, String ibu_kotaprov, int pendapatan) {
        super(nama_negara, jumlah_penduduk, benua, bahasa, gdp, lagu_kebangsaan, ibu_kota, organisasi);
        this.kode_provinsi = kode_provinsi;
        this.ibu_kotaprov = ibu_kotaprov;
        Pendapatan = pendapatan;
    }

    //method
    public void tampil() {
        System.out.println("nama Negara : "+getNama_negara());
        System.out.println("jumlah Penduduk : "+getJumlah_penduduk());
        System.out.println("bahasa : "+getBahasa());
        System.out.println("gdp Negara : "+getGdp());
        System.out.println("Lagu Negara : "+getLagu_kebangsaan());
        System.out.println("Ibu Kota Negara : "+getIbu_kota());
        System.out.println("Organisasi negara : "+getOrganisasi());
        System.out.println("Status Bantuan : "+nGdp());
        System.out.println("pendapatan perkapital : "+ppk()+" $");
        System.out.println("----------------//---------------------");
        System.out.println("Kode Provinsi : "+kode_provinsi);
        System.out.println("Kota prov : "+ibu_kotaprov);
        System.out.println("pendapatan : "+Pendapatan);
        System.out.println("Pendapatan Provinsi mencakup seluruh penduduk "+getNama_negara()+" : "+method(getPendapatan(),getJumlah_penduduk()));
        System.out.println("Bantuan Negara : "+bntuanNegara());
        System.out.println("Tambahan pendapatan dari prov : " +method(getPnb(),getPendapatan()));
        System.out.println("pajak prov : " + pjk());
        System.out.println("pajak Negara : " + pjknegara());
    }

    public double pjk(){
        double pjak,persen; // pajak 5%
        persen = Pendapatan * 0.005;
        pjak = Pendapatan - persen;
        return pjak;
    }

    public double pjknegara(){
        double pjk,persen;
        persen = getPnb() * 0.05;
        pjk = getPnb()-persen;
        return pjk;
    }

    public double bntuanNegara(){
        return pjk()+50000;
    }


    //overloading
    static int method(int pdp,int pndu){
        int hs;
        hs = pdp - pndu;
        return hs;
    }

    static double method(double pnb, int pendapatan){
        return pnb + pendapatan;
    }

}
