package flashlaundry;
/*
 * @author dzakwandh
 */
public class Pengguna {
    private String idPengguna;
    private String namaPengguna;
    private String noHP;
    private String alamatPengguna;
    private String email;
    private String kataSandi;

    public Pengguna(String idPengguna, String namaPengguna, String noHP, String alamatPengguna, String email, String kataSandi) {
        this.idPengguna = idPengguna;
        this.namaPengguna = namaPengguna;
        this.noHP = noHP;
        this.alamatPengguna = alamatPengguna;
        this.email = email;
        this.kataSandi = kataSandi;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getAlamatPengguna() {
        return alamatPengguna;
    }

    public void setAlamatPengguna(String alamatPengguna) {
        this.alamatPengguna = alamatPengguna;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKataSandi() {
        return kataSandi;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }
    
}
