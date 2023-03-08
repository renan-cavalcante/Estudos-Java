package Metodos;

public class SmartTv {
    boolean ligada = false;
    int volume = 30;
    int canal = 5;
    
    public void ligarDesligar(){
        ligada = !ligada;
        imprimirEstado("Tv ligada?", ligada);
        
    }
    
    public void aumentarVolume(){
        volume = volume != 100 ? ++volume : null ;
        imprimirAcao("Volume", volume);       
    }
    
    public void diminuirVolume(){
        volume = volume > 0 ? --volume: null;
        imprimirAcao("Volume", volume);
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal >= 0 && novoCanal <= 100 ? novoCanal : canal;
        imprimirAcao("Canal", canal);
    }
    
    public void aumentarCanal(){
        canal = canal > 99 ? 0 : ++canal;
        imprimirAcao("Canal", canal);
    }
    
    public void diminuirCanal(){
        canal = canal < 1 ? 100 : --canal;
        imprimirAcao("Canal", canal);
    }
    
    public void imprimirAcao(String texto, int opcao){
        System.out.printf("%s: %s %n" ,texto, opcao);
    }
    
    public void imprimirEstado(String texto, boolean estado){
        System.out.printf("%s: %s %n" ,texto, estado);
    }
    
    
}
