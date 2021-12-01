/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;

/**
 *
 * @author Calvin C M
 */
public class Parkir {
    private String noKendaraan;
    private String jenisKendaraan;
    private Waktu datang;
    private Waktu pulang;

    Parkir() {
        this.noKendaraan="";
        this.jenisKendaraan="";
        this.datang=new Waktu();
        this.pulang=new Waktu();
    }

    Parkir(String noKend, String jenisKend, Waktu dtng, Waktu plng) {
        this.noKendaraan=noKend;
        this.jenisKendaraan=jenisKend;
        this.datang=dtng;
        this.pulang=plng;
    }

    public void setNoKendaraan(String noKendaraan) {
        this.noKendaraan = noKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public void setDatang(Waktu datang) {
        this.datang = datang;
    }

    public void setPulang(Waktu pulang) {
        this.pulang = pulang;
    }

    public String getNoKendaraan() {
        return noKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public Waktu getDatang() {
        return datang;
    }

    public Waktu getPulang() {
        return pulang;
    }

    public Waktu getLamaParkir() {
        int newJam=this.pulang.getJam()-this.datang.getJam();
        int newMenit=this.pulang.getMenit()-this.datang.getMenit();
        int newDetik=this.pulang.getDetik()-this.datang.getDetik();

        newMenit-=(newDetik < 0) ? 1 : 0;
        newJam-=(newMenit < 0) ? 1 : 0;

        return new Waktu(newJam, newMenit, newDetik);
    }

    public double getBiayaParkir() {
        Waktu lamaParkir=this.getLamaParkir();
        double totalJam=lamaParkir.getJam();
        double totalMenit=lamaParkir.getMenit();
        totalMenit += (lamaParkir.getDetik() > 0) ? 1 : 0;
        totalJam += (totalMenit > 0) ? 1 : 0;
        switch(this.jenisKendaraan) {
            case "Mobil": return totalJam*3000;
            case "Motor": return totalJam*2000;
        }
        return 0;
    }
}
