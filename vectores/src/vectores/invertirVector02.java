/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author franco
 */
public class invertirVector02 {
    public static void main(String[] args) {
        int [] v1={2,4,6,8};
        int [] v2=new int[v1.length];
        
//        for (int i = 0; i < v1.length ; i++) {
//            int ran=(int)(Math.random()*(v1.length-i)+1);
//            int aux = v1[ran];
//            v2[i]   =  aux;
//            v1[ran] = 1;
//            
//        }
//        System.out.println("-----");
//        for (int i = 0; i < v2.length; i++) {
//            System.out.println(v2[i]);
//        }
        System.out.println("");
        for (int i = 0; i < v1.length; i++) {
            int ran=(int)(Math.random()*(v1.length-1)+1);
            System.out.println("ran:"+ran);
            boolean ban=false;
            for (int j = 0; j < v2.length; j++) {
                if (v1[ran] == v2[j]) {
                    System.out.println("   ::"+v1[ran]+" = "+v2[j]);
                    ban=true;
                    break;
                }   
            }
            if (ban==false) {
                v2[i] = v1[ran];
            }
            
        }
        System.out.println(" v2.................");
        for (int i = 0; i < v2.length; i++) {
            System.out.println(v2[i]);
        }
    }
}
