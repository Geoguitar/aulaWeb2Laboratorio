
package calculo;


public class Calculo {
    
    private int valorCompra;
    private int percentualDesconto;
    private float valorDesconto;
    private float valorAPagar;
     
    public int calculoValorCompra(int qtd)
    {
        valorCompra = qtd * 5;
        return valorCompra;      
        
    }
    public float calculoValorDesconto (int qtd,int valorCompra)
    {
        if (qtd <=20)
            percentualDesconto = 0;
        else if ((qtd > 20) && (qtd<=100))
          percentualDesconto = 10;
        else  percentualDesconto = 20;
        
        valorDesconto = valorCompra * percentualDesconto / 100;
        
        return valorDesconto;
    }
    public float calculoValorAPagar (int valorCompra,float valorDesconto){
        valorAPagar = valorCompra - valorDesconto;
        
        return valorAPagar;
        
    }
}
