/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg1.pkg3;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pasar dolares a euros
        float dolares, euros, conv;
        Scanner sc;
        sc=  new Scanner (System.in);
        System.out.println("Introduzca importe en euros");
        euros=sc.nextFloat();
        System.out.println("Introduzca tasa de conversion");
        conv=sc.nextFloat();
        
        dolares=conv*euros;
        System.out.println("valor equivalente en dolares de; " +euros + " euros es:" +dolares);
        
        
        
    }
    
}
