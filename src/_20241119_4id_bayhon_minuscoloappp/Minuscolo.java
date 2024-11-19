/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _20241119_4id_bayhon_minuscoloappp;

import java.util.Scanner;

/**
 *
 * @author Ospite1
 */
//attributi
public class Minuscolo {
    
    public void lettura(){
         Scanner in = new Scanner(System.in);
        //stringa come oggetto
        String parola;
        //stringa come array
        char[] minuscolo = new char[TANTI];
        System.out.println("\nInserisci una parola : ");
        //legge una stringa
        parola = in.next();
    }
    
    public void StringArray(){
        for (int x = 0; x < parola.length(); x++) {
            //primo carattere letto
            minuscolo[x] = parola.charAt(x);
        }
        
    }
    public void transformaMinuscolo(){
         for(int x = 0; x < parola.length(); x++)
             minuscolo[x] = Character.toLowerCase(minuscolo[x]);
    }
    public void StampaMinuscolo(){
        String parolaMinu = new String(minuscolo);
           System.out.println("\nLa parola in minuscolo (oggetto:");
           System.out.println(parolaMinu);
        
    }
 
    
}
