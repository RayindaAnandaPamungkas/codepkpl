package com.company;

import java.util.Scanner;
class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    protected void printMahasiswa(String name, String nim) {
        System.out.println("=====Printing Mahasiswa Card =====");
        System.out.println(" Nama           : " + this.nama + " ");
        System.out.println(" NIM            : " + this.nim + " ");
    }
}
class HM extends Mahasiswa {
    private String namaHimpunan;




    public HM (String nim, String nama, String namaHimpunan) {
        super(nim, nama);
        this.namaHimpunan = namaHimpunan;
    }
    public String getNamaHimpunan() {
        return namaHimpunan;
    }
    public void setNamaHimpunan(String namaHimpunan) {
        this.namaHimpunan = namaHimpunan;
    }


    public void printMahasiswa(String nim, String nama) {
        super.printMahasiswa(nama, nim);
        System.out.println(" Himpunan       : " + namaHimpunan + " ");
    }
}
class KelompokStudi extends Mahasiswa {
    private String kelompokStudi;


    public KelompokStudi(String kelompokStudi) {
        this.kelompokStudi = kelompokStudi;

    }
    public String getKelompokStudi() {
        return kelompokStudi;
    }
    public void setKelompokStudi(String kelompokStudi) {
        this.kelompokStudi = kelompokStudi;
    }


    public void printMahasiswa(String nim, String nama) {
        System.out.println(" Kelompok Studi : " + this.kelompokStudi + " ");
    }
}
public class Main {


    public static void main(String[] args) {
        // properties
        Scanner in = new Scanner(System.in);


        System.out.print("Masukan nama anda                : " );
        String nama = in.nextLine();


        System.out.print("Masukan nim anda                 : " );
        String nim = in.nextLine();


        System.out.print("Masukan nama himpunan anda       : " );
        String namaHimpunan = in.nextLine();


        System.out.print("Masukan nama kelompok studi anda : " );
        String kelompokStudi = in.nextLine();


        // sprarator
        System.out.print("\n");
        System.out.println("Creating your student id........");
        System.out.println("Id created successfully");
        System.out.print("\n");


        Mahasiswa objMahasiswa = new Mahasiswa(nim, nama);
        Mahasiswa objHM = new HM(objMahasiswa.getNim(), objMahasiswa.getNama(),
                namaHimpunan);
        Mahasiswa objKelompokStudi = new KelompokStudi(kelompokStudi);


        objHM.printMahasiswa(objMahasiswa.getNim(), objMahasiswa.getNama());
        objKelompokStudi.printMahasiswa(objMahasiswa.getNim(),
                objMahasiswa.getNama());
    }


}