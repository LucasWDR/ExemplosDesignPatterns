package exemplo_adapter;

// essa classe faz adaptação do valor que a gente irá precisar
public class CotacaoAdapter extends Cotacao{
    
    

    // metodos que ela fará 
    public void setValor(double valor){

        super.setValor(valor /5.33);
    }

    // vai  sobrescrever o getValor e setValor fazendo a Adaptação que irá ser preciso
     public double getValor(){

         // necessidade de sobrescrever
         return (super.getvalor() * 5.33);

     }

     // poderemos ter mais metodos mesmo nao sendo para sobrescrever
     // esse metodo irá dar return na nossa cotação que ou seja em real
     public double getValorDolar(){
         
         return super.getvalor();
     } 
}
