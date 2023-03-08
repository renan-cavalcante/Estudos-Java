
package OrientacaoObjeto;

/**
 *
 * @author Renan
 */
public class ExecutarObjeto {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        
        carro1.setCor("Azul");
        carro1.setModelo("Celta");
        carro1.setCapacidadeTanque(50);
        
        System.out.printf("%s%n",carro1.getModelo());
        System.out.printf("%s%n",carro1.getCor());
        System.out.printf("%s %n",carro1.getCapacidadeTanque());
        System.out.printf("%.2f  %n",carro1.valorEncherTanque(2.31));
        
    }
    
}
