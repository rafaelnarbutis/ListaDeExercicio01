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
public class Ex5 {
    
    
    public static void main(String[] args){
    
        System.out.println("Digite um numero para saber seu quadrado!!");
        Scanner scn = new Scanner(System.in);
        int valor = scn.nextInt();
        int valorquadrado = valor * valor;
        System.out.println("O quadrado de "+valor+" é "+valorquadrado);
    
    
    }
    
    
    
    
}
