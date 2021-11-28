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
public class gold extends silver{
    //attribute yang digunakan untuk membership
    private int cashback;
    
    //method untuk menghitung cashback pelanggan
    int cashback(){
        int banyakcashback = cashback*banyakhari;
        return banyakcashback;
    }
    
    //encapsulation
    public void setcashback(int cashback){
        if (cashback > 0){
            this.cashback = cashback;
        } else {
            this.cashback = 0;
        }
    }
}
