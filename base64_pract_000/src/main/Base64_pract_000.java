/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 *
 * @author franco
 */
public class Base64_pract_000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //encriptar 
        String cad= "encriptar";
        System.out.println(" =========================");
        System.out.println("... encriptando ...");
        Base64.Encoder en=Base64.getEncoder();
        String encriptado=en.encodeToString(cad.getBytes(StandardCharsets.UTF_8));
        System.out.println("cadena     : "+cad);
        System.out.println("encriptado : "+ encriptado);
        
        System.out.println(" ========================");
        System.out.println(" ... desencriptando ...");
        
        Base64.Decoder de=Base64.getDecoder();
        byte[] deco=de.decode(encriptado);
        System.out.println("Encriptado    : "+encriptado);
        String desen=new String(deco);
        System.out.println("Desencriptado : "+desen);
        
        
    }
    
}
