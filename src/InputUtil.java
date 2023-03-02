import java.util.Scanner;

public class InputUtil {
    public static void main(String [] arqs){
        
        Scanner input = new Scanner(System.in);
        
        int numero1, numero2, soma;
        
        System.out.println("Digite o primeiro numero");
        numero1 = input.nextInt();
        
        System.out.println("Digite o primeiro numero");
        numero2 = input.nextInt();
        
        soma = numero1 + numero2;
        
        System.out.println("Soma \t "+soma);
    }
}
