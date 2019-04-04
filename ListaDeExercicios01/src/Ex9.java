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
public class Ex9 {
    
    public static void main(String[] args){
    
    Scanner scn = new Scanner(System.in);
        System.out.println("Dolar");
        System.out.println("Digite quanto esta a cotação do dólar");
        Double cotacao = scn.nextDouble();
        System.out.println("Digite quantos Dolares você tem");
        int quantiadolar = scn.nextInt();
        Double result = quantiadolar * cotacao;
        System.out.println("O valor em reais seria: R$"+result);
    
    }
    
    
    
    
}
