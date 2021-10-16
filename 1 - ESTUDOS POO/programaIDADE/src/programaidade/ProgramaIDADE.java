/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author raulg
 */
public class ProgramaIDADE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("digite o ano de nascimento: ");
        float nasc = teclado.nextFloat();
        float idade = 2018 - nasc;
        
        if (idade>=18){
            System.out.println("MAIOR  de idade! "+  idade+" anos.");
        } else System.out.println("MENOR de idade! "+idade+" anos.");
        
    }
    
}
