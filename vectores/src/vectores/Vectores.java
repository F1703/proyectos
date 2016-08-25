/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Random;

/**
 *
 * @author franco
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] ve={2,1,4,6,7};
        int  n= (int)(Math.random()*(ve.length) + 1) ;
        System.out.println(n+" ["+ve[n-1]+"]"); 
        
        int [] tmp= new int [ve.length];
//        int pri= ve[0];
        System.out.println("tam: "+ve.length);
//        System.out.println("pri: "+pri);
        for (int i = 0; i < ve.length ; i++) {
            int posicion=(int)(Math.random()*(ve.length-1) + 1);
            tmp[i]=ve[posicion];
            System.out.println(" *"+posicion);
        }
//        tmp[ve.length-1]=pri;
//        System.out.println("ultim: "+tmp[ve.length-1]);
        System.out.println("-------temp-------");
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
    }
    
}
