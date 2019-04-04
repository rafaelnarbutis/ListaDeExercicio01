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
public class Ex1 {
    
     
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Olá");
        System.out.println("Digite suas horas trabalhadas");
        Double horas = scn.nextDouble();
        System.out.println("Digite quanto voce recebe por hora");
        Double RecebeHoras = scn.nextDouble();
        Double result = horas * RecebeHoras;
        System.out.println("Seu Salario é: "+"R$"+result);
        
    }
    
    
}
