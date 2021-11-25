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
public class Nilai {
    private double value;

    Nilai() {
        this.value=0;
    }

    Nilai(double val) {
        this.value=val;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
