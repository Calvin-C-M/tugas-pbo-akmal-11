/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

/**
 *
 * @author Calvin C M
 */
public class Student {
    private String nama;
    private String npm;
    private Nilai tugas;
    private Nilai uts;
    private Nilai uas;

    Student() {
        this.nama="";
        this.npm="";
        this.tugas=new Nilai();
        this.uts=new Nilai();
        this.uas=new Nilai();
    }

    Student(String nama, String npm, Nilai tugas, Nilai uts, Nilai uas) {
        this.nama=nama;
        this.npm=npm;
        this.tugas=tugas;
        this.uts=uts;
        this.uas=uas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setTugas(Nilai tugas) {
        this.tugas = tugas;
    }

    public void setUas(Nilai uas) {
        this.uas = uas;
    }

    public void setUts(Nilai uts) {
        this.uts = uts;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public Nilai getTugas() {
        return tugas;
    }

    public Nilai getUas() {
        return uas;
    }

    public Nilai getUts() {
        return uts;
    }

    public Nilai getNilaiAkhir() {
        return new Nilai((this.tugas.getValue()*0.3) + (this.uts.getValue()*0.3) + (this.uas.getValue()*0.4));
    }

    public char getHurufMutu(double nilai) {
        if(nilai > 80 && nilai <= 100) {
            return 'A';
        } else if(nilai > 68 && nilai <= 80) {
            return 'B';
        } else if(nilai > 55 && nilai <= 68) {
            return 'C';
        } else if(nilai > 45 && nilai <= 55) {
            return 'D';
        }
        return 'E';
    }
}
