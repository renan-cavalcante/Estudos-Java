package Metodos;


public class Controle {
    public static void main(String [] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Esta ligada? " + smartTv.ligada);
        
        smartTv.LigarDesligar();
        System.out.println("Esta ligada? " + smartTv.ligada);
        
    }
}
