/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ubkit
 */
import java.util.Scanner;
public class Ex8 {
    
    public static void main(String[] args){
    
    Scanner scn = new Scanner(System.in);
    
        System.out.println("Soma");
        System.out.println("Digite o primeiro numero");
        int valor1 = scn.nextInt();
        System.out.println("Sigite o segundo valor");
        int valor2 = scn.nextInt();
        int result = valor1 + valor2;
        System.out.println(valor1+" + "+valor2+" = "+result);
    
    
    }
    
    
}
