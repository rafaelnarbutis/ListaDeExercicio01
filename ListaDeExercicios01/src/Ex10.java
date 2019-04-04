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
public class Ex10 {
    
    
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in); 
        System.out.println("Soma dos quadrados");
        System.out.println("Digite o primeiro valor");
        int valor1 = scn.nextInt();
        System.out.println("Digite o segundo valor");
        int valor2 = scn.nextInt();
        System.out.println("Digite o terceiro valor");
        int valor3 = scn.nextInt();
        System.out.println("Digite o quarto valor");
        int valor4 = scn.nextInt();
    
        int result = (valor1*valor1)+(valor2*valor2)+(valor3*valor3)+(valor4*valor4)    ;
        System.out.println("A soma dos quadrados foi: "+result);
    
    }
    
    
}
