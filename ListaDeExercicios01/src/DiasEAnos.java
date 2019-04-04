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
public class DiasEAnos {
    
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scn.nextInt();
        int resultAnos = idade / 365;
        double resultMeses = (idade * 365) / 12;
        
        System.out.println("===== Result ====");
        System.out.println("Você viveu "+resultAnos+" anos");
        System.out.println(resultMeses+" Meses");
        System.out.println(idade + " dias");
    
    
    
    }
    
    
    
}
