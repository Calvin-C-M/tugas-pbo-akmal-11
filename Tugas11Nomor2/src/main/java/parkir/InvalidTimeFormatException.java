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
public class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException() {
        super("Yang anda masukkan bukan dalam format waktu yang benar");
    }
}
