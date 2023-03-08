public class DecisaoEncurtada {
   public static void main(String [] args){
      int a = 48;
      int b = 6;
      char dadop = '0';
      
      String  verifica = a == b ? "verdadeiro" : "falso";
      int verifica2 = a != b ? 1 : 0;
      
      System.out.printf("%s %s", verifica,  verifica2);
      
      if(a == dadop){
          System.out.print("verdadeiro");
      } 
      else{
          System.out.print("Falso");
      }
   }
    
   
}
