
package Model;


public class Cls_Calculo {
    private int valorMensalidadeSemDesconto;
    private int valorDesconto;
    private int modalidade;
    
    public int ValorDesconto(String pacote ){
        
       switch (pacote){
           case"1":valorDesconto = 20;break;
           case"2":valorDesconto = 20;break;
           case"3":valorDesconto = 20;break;
           default:valorDesconto =0;break;
       }
       return valorDesconto;
    }
    
    public int ValorMensalidadeSemDesconto(String pacote){
        switch(pacote){
          case"1":valorMensalidadeSemDesconto = 2*80;break;
           case"2":valorMensalidadeSemDesconto= 3*80;break;
           case"3":valorMensalidadeSemDesconto = 4*80;break;
           default:valorMensalidadeSemDesconto =0;break;   
        }
         return valorMensalidadeSemDesconto;
    }
    
    public int Modalidade (String pacote){
        
        switch (pacote){
            
           case"1":modalidade = 2;break;
           case"2":modalidade= 3;break;
           case"3":modalidade = 4;break;
           default:modalidade=0;break;   
            
        }
        
        return modalidade;
    }
    
}
