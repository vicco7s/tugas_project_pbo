package model;

public class Negara {

    //membuat sebuah atribut
    private String kode_negara;
    private String nama_negara;
    private int jumlah_penduduk;
    private String benua;
    private String bahasa;
    private double gdp;
    private String lagu_kebangsaan;
    private String ibu_kota;
    private String organisasi;
    private double pnb;


    //method and getter setter

    public String getOrganisasi() {
        return organisasi;
    }

    public void setOrganisasi(String organisasi) {
        this.organisasi = organisasi;
    }

    public String getIbu_kota() {
        return ibu_kota;
    }

    public void setIbu_kota(String ibu_kota) {
        this.ibu_kota = ibu_kota;
    }

    public String getLagu_kebangsaan() {
        return lagu_kebangsaan;
    }

    public void setLagu_kebangsaan(String lagu_kebangsaan) {
        this.lagu_kebangsaan = lagu_kebangsaan;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public String getBahasa() {
        return bahasa;
    }

    public void setBahasa(String bahasa) {
        this.bahasa = bahasa;
    }

    public String getBenua() {
        return benua;
    }

    public void setBenua(String benua) {
        this.benua = benua;
    }

    public int getJumlah_penduduk() {
        return jumlah_penduduk;
    }

    public void setJumlah_penduduk(int jumlah_penduduk) {
        this.jumlah_penduduk = jumlah_penduduk;
    }

    public String getNama_negara() {
        return nama_negara;
    }

    public void setNama_negara(String nama_negara) {
        this.nama_negara = nama_negara;
    }

    public String getKode_negara() {
        return kode_negara;
    }

    public void setKode_negara(String kode_negara) {
        this.kode_negara= kode_negara;
    }
    public double getPnb() {
        return pnb;
    }

    public void setPnb(double pnb) {
        this.pnb = pnb;
    }


  //constructor
    public Negara() {

    }

    public Negara(double pnb) {
        this.pnb = pnb;
        System.out.println("Pendapatan Bruto : "+pnb);
    }

    public Negara(String nama_negara, int jumlah_penduduk, String benua, String bahasa, double gdp, String lagu_kebangsaan, String ibu_kota, String organisasi) {
        this.nama_negara = nama_negara;
        this.jumlah_penduduk = jumlah_penduduk;
        this.benua = benua;
        this.bahasa = bahasa;
        this.gdp = gdp;
        this.lagu_kebangsaan = lagu_kebangsaan;
        this.ibu_kota = ibu_kota;
        this.organisasi = organisasi;
    } // construktor yang akan menyimpan sebuah atribut kedalam consturktor

    public Negara(String kode_negara) {
        this.kode_negara = kode_negara;
        System.out.println("Kode Negara : "+kode_negara);
    }

    //method
    public String nGdp(){
        String bantuan;
        if (gdp <= 5000) {
            bantuan = "Menerima Bantuan";
        }else {
            bantuan = "Tidak menerima bantuan";
        }
        return bantuan;
    }
    public void info(){
        System.out.println("Nama Negara : "+nama_negara);
        System.out.println("Jumlah Penduduk Negara : "+jumlah_penduduk);
        System.out.println("Benua : "+benua);
        System.out.println("Bahasa Negara : "+bahasa);
        System.out.println("gdp Negara : "+gdp);
        System.out.println("Lagu Negara : "+lagu_kebangsaan);
        System.out.println("Ibu Kota Negara : "+ibu_kota);
        System.out.println("Organisasi negara : "+organisasi);
        System.out.println("Status Bantuan : "+nGdp());
        System.out.println("pendapatan perkapital : "+ppk()+" $");
    }

    public double ppk() {
        double ppk;
        ppk = pnb / jumlah_penduduk;
        return ppk;
    }


}
