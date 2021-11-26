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
public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    Waktu() {
        this.jam=0;
        this.menit=0;
        this.detik=0;
    }

    Waktu(int jam, int menit, int detik) {
        this.jam=jam;
        this.menit=menit;
        this.detik=detik;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }
    
    public void setDetik(int detik) {
        this.detik = detik;
    }

    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    public String toString() {
        return this.jam + ":" + this.menit + ":" + this.detik;
    }
}
