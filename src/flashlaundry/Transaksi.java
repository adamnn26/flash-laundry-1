package flashlaundry;
/*
 * @author LENOVO
 */
public class Transaksi {
    private String idTransaksi, idJasa, idDetailStatus, deskripsiCucian, beratCucian, ongkir, bayar;
    private int totalBayar;

    public Transaksi(String idTransaksi, String idJasa, String idDetailStatus, String deskripsiCucian, String beratCucian, String ongkir, String bayar, int totalBayar) {
        this.idTransaksi = idTransaksi;
        this.idJasa = idJasa;
        this.idDetailStatus = idDetailStatus;
        this.deskripsiCucian = deskripsiCucian;
        this.beratCucian = beratCucian;
        this.ongkir = ongkir;
        this.bayar = bayar;
        this.totalBayar = totalBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getIdJasa() {
        return idJasa;
    }

    public String getIdDetailStatus() {
        return idDetailStatus;
    }

    public String getDeskripsiCucian() {
        return deskripsiCucian;
    }

    public String getBeratCucian() {
        return beratCucian;
    }

    public String getOngkir() {
        return ongkir;
    }

    public String getBayar() {
        return bayar;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setIdJasa(String idJasa) {
        this.idJasa = idJasa;
    }

    public void setIdDetailStatus(String idDetailStatus) {
        this.idDetailStatus = idDetailStatus;
    }

    public void setDeskripsiCucian(String deskripsiCucian) {
        this.deskripsiCucian = deskripsiCucian;
    }

    public void setBeratCucian(String beratCucian) {
        this.beratCucian = beratCucian;
    }

    public void setOngkir(String ongkir) {
        this.ongkir = ongkir;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }
}