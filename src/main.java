import model.Negara; // import dari sebuah package model dari class
import model.Provinsi;

import java.text.ParseException;

public class main {
    public static void main(String[] args) throws ParseException {

        System.out.println("--- Informasi Negara dan serta Provinsinya ---");
        System.out.println("----------------------------------------------");

        //object 1 input kode negara
        //membuat object yg di panggila dari class Negara yang berada construktor
        Negara indonesia1 = new Negara("+62");
        Negara indonesia = new Negara("Indoneisa", 207000,"Asia","indonesia",4000,"indonesia raya",50000,"Jakarta");
        indonesia.info();
        System.out.println();
        Provinsi Kalimantan_Selatan = new Provinsi("Indonesia","Kl1","Kalimatan Selatan","Banjarmasin",6000);
        Kalimantan_Selatan.tampil();
        System.out.println();

        //memanggil class dengan menggunakan object
        Negara malaysia1 = new Negara("+66");
        Negara malaysia = new Negara("Malaysia", 30000,"Asia","Melayu,inggris",11000,"Negara ku",70000,"Kuala Lumpur");
        malaysia.info();

        System.out.println();
        Provinsi Sabah = new Provinsi("Malaysia","Sb1","Sabah","Kinabalu",8000);
        Sabah.tampil();

        System.out.println();



    }
}
