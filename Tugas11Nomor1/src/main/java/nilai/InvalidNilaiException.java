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
public class InvalidNilaiException extends Exception {
    public InvalidNilaiException() {
        super("Nilai yang dimasukkan harus dalam range angka 0-100");
    }
}
