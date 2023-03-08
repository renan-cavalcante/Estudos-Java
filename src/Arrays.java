/**
 *
 * @author Renan
 */

import java.util.*;
import java.io.IOException;


public class Arrays {
    public static void main(String[] args){
        carro();
    }
    static void consoantes(){
        
        int contador = 0;
        int quantidadeConsoantes = 0;
        
        String[] consoantes = new String[6];
        Scanner ler = new Scanner(System.in);
        
        
        do{
            String letra = ler.next();
            if( !(letra.equalsIgnoreCase("a") || //verifica se a letra é uma vogal e inveter o resultado logico, para excluir as vogais
                 letra.equalsIgnoreCase("e") ||
                 letra.equalsIgnoreCase("i") ||
                 letra.equalsIgnoreCase("o") ||
                 letra.equalsIgnoreCase("u") )){
                
                consoantes[contador] = letra;              
                quantidadeConsoantes++;
            }
        contador++;
       
        }while(contador < consoantes.length);
            
        for( String consoante : consoantes){ // for para exibir arrays
            if(consoante != null){
                System.out.print(consoante +" ");
            }
            
        }
    }
    static void numerosAleatorios(){
        Random aleatorio = new Random();
        
        int[] numerosAleatorios = new int[20];
        
        for(int contador = 0; contador < numerosAleatorios.length; contador++){
            numerosAleatorios[contador] = aleatorio.nextInt(100);
        }
        
        for(int numero : numerosAleatorios){
            System.out.printf("%s e o proximo numero: %d %n", numero, (numero+1));
        }
    }
    
    static void carro(){
double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     for (int i = 1; i <= n; i++) {
     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
           h = h + (1/(double)i);
      }
     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
       System.out.println(Math.round(h));
        }
       
	
}
    

