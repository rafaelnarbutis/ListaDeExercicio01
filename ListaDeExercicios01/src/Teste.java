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
public class Teste {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       // System.out.println("Digite sua senha");
       // String senha = scn.nextLine();
       // senha = senha.toUpperCase();
        //System.out.println("Redigite a senha");
        //String senha2 = scn.nextLine();
        //senha2 = senha2.toUpperCase();
        //if(senha.equals(senha2)&& senha.equals("SENHA") && senha.length() > 4){
          //  System.out.println("Sucesso");
        //}        
            
       /* System.out.println("Digite um texto");
        String texto = scn.nextLine();
        texto = texto.toUpperCase();
        boolean acharPalavra = texto.indexOf("FILHO D P") >= 0;
        if(acharPalavra){
            System.out.println("Achou a palavra FILHO D P esta no texto");
            texto = texto.replace("FILHO D P", "OIII");
            System.out.println(texto);
        }
        texto = texto.substring(0, 3);
        System.out.println(texto);
        System.out.println(texto.length());
        */
        System.out.println("Digite uma frase");
        String texto = scn.nextLine();
        texto = texto.toUpperCase();
        System.out.println("Digite uma palavra da frase");
        String palavra = scn.nextLine();
        palavra = palavra.toUpperCase();
        if(texto.indexOf(palavra) > -1){
            System.out.println("Digite uma palavra para substituir a palavra encontrada");
            String palavra2 = scn.nextLine();
            palavra2 = palavra2.toUpperCase();
            texto = texto.replaceFirst(palavra, palavra2);
            int posicao = texto.indexOf(palavra2);
            System.out.println("A palavra comeca na posicao: "+posicao);
            System.out.println("E o texto com a nova palavra fica: "+texto);
            
            
        }else{
        
            System.out.println("A palavra digitada nao esta no texto");
        }
    }
}
