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
public class Ex6 {
    
    
    public static void main(String[] args){
    
        System.out.println("Saber o produto");
        System.out.println("Digite o primeiro numero");
        Scanner scn = new Scanner(System.in);
        Double valor1 = scn.nextDouble();
        System.out.println("Digite o segundo numero");
        Double valor2 = scn.nextDouble();
        Double result = valor1 * valor2;
        System.out.println("O produto"+" de "+valor1+" e "+valor2+" é "+result);
        
    
    }
    
}
