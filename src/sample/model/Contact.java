package sample.model;

public class Contact {
    private String nama;
    private String noTelepon;
    private String alamat;
    private String alamatEmail;

    public Contact(String nama, String noTelepon, String alamat, String alamatEmail) {
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
        this.alamatEmail = alamatEmail;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }
}
