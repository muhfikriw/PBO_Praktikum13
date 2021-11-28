/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

/**
 *
 * @author Asus
 */
public class platinum extends gold{
    //attribute yang digunakan untuk membership
    private int pulsa;
    
    //method hitung pulsa
    int pulsa(){
        int banyakpulsa = pulsa*banyakhari;
        return banyakpulsa;
    }
    
    
    //encapsulation
    public void setpulsa(int pulsa){
        if (pulsa > -1){
            this.pulsa = pulsa;
        } else {
            this.pulsa = 0;
        }
    }
    
    
}
