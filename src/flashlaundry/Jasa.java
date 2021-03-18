/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashlaundry;
/*
 * @author gilan
 */
public class Jasa {
    private String idJasa, idToko, namaJasa, deskripsiJasa;
    private int harga, diskon, totalDisukai;

    public Jasa(String idJasa, String idToko, String namaJasa, String deskripsiJasa, int harga, int diskon) {
        this.idJasa = idJasa;
        this.idToko = idToko;
        this.namaJasa = namaJasa;
        this.deskripsiJasa = deskripsiJasa;
        this.harga = harga;
        this.diskon = diskon;
    }

    public String getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(String idJasa) {
        this.idJasa = idJasa;
    }

    public String getIdToko() {
        return idToko;
    }

    public void setIdToko(String idToko) {
        this.idToko = idToko;
    }

    public String getNamaJasa() {
        return namaJasa;
    }

    public void setNamaJasa(String namaJasa) {
        this.namaJasa = namaJasa;
    }

    public String getDeskripsiJasa() {
        return deskripsiJasa;
    }

    public void setDeskripsiJasa(String deskripsiJasa) {
        this.deskripsiJasa = deskripsiJasa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public int getTotalDisukai() {
        return totalDisukai;
    }

    public void setTotalDisukai(int totalDisukai) {
        this.totalDisukai = totalDisukai;
    }

}
