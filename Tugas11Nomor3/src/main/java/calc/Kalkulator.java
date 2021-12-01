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
    private int value1;
    private int value2;
    private String operand;

    Kalkulator() {
        this.value1=0;
        this.value2=0;
        this.operand="";
    }

    Kalkulator(int val1, int val2, String opr) {
        this.value1=val1;
        this.value2=val2;
        this.operand=opr;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public String getOperand() {
        return operand;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
}
