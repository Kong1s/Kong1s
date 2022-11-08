/**
 * Nama : MUH. SATRIYO ADINUL HABIB
 * Nim : 1800018280
 * 
 */


public class Karyawan {
    private String nip, nama, alamat, gender;
    private int tanggal_lahir, tahun_masuk, gaji;

    public String getNip(){
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(int tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public int getTahun_masuk() {
        return tahun_masuk;
    }

    public void setTahun_masuk(int tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public void tampilKaryawan(){
        System.out.println("Nip    :"+nip);
        System.out.println("Nama    :"+nama);
        System.out.println("Alamat   :"+alamat);
        System.out.println("Gender   :"+gender);
        System.out.println("Tanggal_lahir   :"+tanggal_lahir);
        System.out.println("Tahun_masuk  :"+tahun_masuk);
        System.out.println("Gaji   :"+gaji);
    }
}
