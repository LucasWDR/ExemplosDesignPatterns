package exemplo_adapter;

public class Principal {
    
    public static void main(String[] args) {
        
        // estanciamento 

        CotacaoAdapter cotacao = new CotacaoAdapter();
          cotacao.setValor(1.00);

          // onde irá imprimir o valor Real e do Dolar
         System.out.println("R$" + cotacao.getValor());
         
         System.out.println("Equivale:");
         System.out.println("$" + cotacao.getValorDolar());
    }
}

// Quando imprimido irá aparecer que 1 real equivale