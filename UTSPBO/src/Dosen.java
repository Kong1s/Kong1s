public class Dosen extends Karyawan{
    private String nidn, nama, alamat, gender,jurusan;
    private int tanggal_lahir, tahun_masuk, gaji;

    public String getNidn(){
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
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

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
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
}
