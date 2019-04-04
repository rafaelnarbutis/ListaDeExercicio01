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
public class Ex7 {
      

public static void main(String[] args){
    System.out.println("Digite um numero inteiro");
    Scanner scn = new Scanner(System.in);
    int valor1 = scn.nextInt();
    System.out.println("Digite o expoente");
    int numeroexpoente = scn.nextInt();
    //Dando um valor inicial para result nao travar com 0
    int result = valor1;
    for(int i = 1; i < numeroexpoente; i++){
        //result vai receber e atualizar o valor a cada loop 
        result *=  valor1;
        System.out.println(result);
    }
   
  
       

}

    
}
