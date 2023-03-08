package Metodos;


public class Controle {
    public static void main(String [] args) throws Exception {
        SmartTv smartTv = new SmartTv();
             
        smartTv.ligarDesligar();
        
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
                      
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(110);
        
    }
}
