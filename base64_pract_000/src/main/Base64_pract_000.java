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
        
        String cad= "encriptar";
        Base64.Encoder en=Base64.getEncoder();
        String encriptado=en.encodeToString(cad.getBytes(StandardCharsets.UTF_8));
        System.out.println(encriptado);
    }
    
}
