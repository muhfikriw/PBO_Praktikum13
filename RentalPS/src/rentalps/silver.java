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
public class silver{
    //attribute yang digunakan untuk membership (silver,gold,platinum)
    private int disc,poin;
    public int sewa,banyakhari,totalsewa;
    
    
    //method poin
    int poin(){
        int banyakpoin = poin*banyakhari;
        return banyakpoin;
    }
    
    //method untuk menghitung total biaya sewa selama n hari
    int totalsewa(){
        totalsewa = (sewa*(100-disc)/100)*banyakhari;
        return totalsewa;
    }
    
    
    
    //encapsulation
    public void setdisc(int disc){
        if (disc > 0){
            this.disc = disc;
        } else {
            this.disc = 0;
        }
    }
    
    public void setpoin(int poin){
        if (poin > 0){
            this.poin = poin;
        } else {
            this.poin = 0;
        }
    }
    
    public void setsewa(int sewa){
        if (sewa > 0){
            this.sewa = sewa;
        } else {
            this.sewa = 0;
        }
    }
}
