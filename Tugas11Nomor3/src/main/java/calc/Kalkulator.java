/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Calvin C M
 */
public class Kalkulator {
    private double value1;
    private double value2;
    private String operand;

    Kalkulator() {
        this.value1=0;
        this.value2=0;
        this.operand="";
    }

    Kalkulator(double val1, double val2, String opr) {
        this.value1=val1;
        this.value2=val2;
        this.operand=opr;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public String getOperand() {
        return operand;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }
}
