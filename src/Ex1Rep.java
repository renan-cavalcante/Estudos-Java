import java.util.Scanner;
/**
 *
 * @author Renan
 */
public class Ex1Rep {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        
        String[] nome = new String[20];
        int idade[] = new int[20];
        int i = 0;
        
        do{
            System.out.printf("Digite seu nome:%n");
            nome[i] = ler.next();
            if(nome[i].equals("0")) break;// equalsIgnoreCase "para vereficar maiusculo e minusculo"
            
            System.out.printf("Digite sua idade:%n");
            idade[i] = ler.nextInt();
            
            i++;
        }while( i < 20);
        
    }
}
