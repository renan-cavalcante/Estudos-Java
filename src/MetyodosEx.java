/**
 * 
 * @author Renan
 */

import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class MetyodosEx {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args){
        
       LocalDateTime agora = LocalDateTime.now(); // pega a data e hora atual
        
        
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH"); // pega a hora e formata ela (HH:mm:ss)
        String hora = formatterHora.format(agora); // atribui a hora a variavel hora
        
        messagem(hora);
        
        
        
        
        System.out.println("resultado: " + calculadora());
        
    }
    
    static double calculadora( ){
        double resultado = 0;        
        int opcao;
        double parametro1, parametro2;
        
        
        System.out.println("Selecio a opção de operação:");        
        System.out.println("1 - Subtração");
        System.out.println("2 - Adição");
        System.out.println("3 - multiplicação");
        System.out.println("4 - Divisão");        
        opcao = ler.nextInt();
        
        System.out.println("digite os dois parametros :");
        parametro1 = ler.nextDouble();
        parametro2 = ler.nextDouble();
        
        
        switch (opcao){
            case 1 -> resultado = subtrair(parametro1, parametro2);
            case 2 -> resultado = somar(parametro1, parametro2);
            case 3 -> resultado = multiplicar(parametro1, parametro2);
            case 4 -> resultado = dividir(parametro1, parametro2);
            default -> System.out.println("opção invalida");
        } 
        return(resultado);
    }
    
    static double somar(double parametro1, double parametro2) {
        return(parametro1 - parametro2);
    }
    
    static double subtrair(double parametro1, double parametro2) {
        return(parametro1 - parametro2);
    }
    
    static double multiplicar(double parametro1, double parametro2) {
        return(parametro1 * parametro2);
    }
    
    static double dividir(double parametro1, double parametro2) {
        return(parametro1 / parametro2);
    }
    
    
    static void messagem(String hora){
        switch (hora){
            case "5" , "6" , "7" , "8", "9", "10", "11", "12" -> System.out.println("Bom dia");
            case "13", "14", "15", "16", "17" -> System.out.println("Boa tarde");
            case "18", "19", "20", "21", "22", "23", "0", "1", "2", "3", "4" -> System.out.println("Boa noite");
            default -> System.out.println("Hora invalida");           
        }
        
        
        
    }
    
}
