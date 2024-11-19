/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _20241119_4id_bayhon_minuscoloappp;
import java.util.Scanner;
        

/**
 *
 * @author Ospite1
 */
public class _20241119_4id_Bayhon_MinuscoloAppp {
static final int TANTI = 30;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String parola;
        char[] minuscolo = new char[TANTI];
        System.out.println("inserisci una parola : ");
        parola = in.next();
        for(int x = 0; x < parola.length(); x++)
            minuscolo[x] = parola.charAt(x);
         for(int x = 0; x < parola.length(); x++)
             minuscolo[x] = Character.toLowerCase(minuscolo[x]);
          System.out.println("la parola in minuscolo(array) :");
           for(int x = 0; x < parola.length(); x++)
               System.out.println(minuscolo[x]);
           
           
           String parolaMinu = new String(minuscolo);
           System.out.println("\nLa parola in minuscolo (oggetto:");
           System.out.println(parolaMinu);
         
    
}
