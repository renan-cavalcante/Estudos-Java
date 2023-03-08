
package OrientacaoObjeto;

/**
 *
 * @author Renan
 */
public class Carro {
    String cor, modelo;
    double capacidadeTanque;
    
    Carro(){ // inicia o objeto vazio
        
    }
    
    Carro(String cor, String modelo,double capacidadeTanque){ // sobrecagar para iniciar o objeto com os atributos
        this.cor=cor;
        this.modelo=modelo;
        this.capacidadeTanque = capacidadeTanque;
        
    }
    
    
    void setCor(String cor){ // metodo para atribuir o valor da cor;
        this.cor=cor;
    }
    
    String getCor(){ // metodo para retornar o valor da cor;
        return cor;
    }
    
    void setModelo(String modelo){ // metodo para atribuir o valor da cor;
        this.modelo=modelo;
    }
    
    String getModelo(){ // metodo para retornar o valor da cor;
        return modelo;
    }
    
    void setCapacidadeTanque(double capacidadeTanque){ // metodo para atribuir o valor da cor;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    double getCapacidadeTanque(){ // metodo para retornar o valor da cor;
        return capacidadeTanque;
    }
    
    double valorEncherTanque(double valorGasolina){
        System.out.printf("sera nescessario R$");
        return capacidadeTanque * valorGasolina;
    }
}
