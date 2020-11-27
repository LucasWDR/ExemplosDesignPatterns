package exemplo_chain_response;

// Aqui foi implementado uma cadeia de responsabilidade do Banco

public abstract class BancoChain {

    protected BancoChain next;
    protected IDBancos identificadorDoBanco;
 
    public BancoChain(IDBancos id) {
        next = null;
        identificadorDoBanco = id;
    }
 
    public void setNext(BancoChain forma) {
        if (next == null) {
            next = forma;
        } else {
            next.setNext(forma);
        }
    }


public void efetuarPagamento(IDBancos id) throws Exception {

    if (podeEfetuarPagamento(id)) {
        efetuaPagamento();
    } else {
        if (next == null) {
            throw new Exception("banco não cadastrado");
        }
        next.efetuarPagamento(id);
    }
}
 
private boolean podeEfetuarPagamento(IDBancos id) {
    if (identificadorDoBanco == id) {
        return true;
    }
    return false;
}
 
protected abstract void efetuaPagamento();

}


//Nesta classe possui irá possuir dois atributos, o identificador do banco e uma referência para o próximo objeto da corrente. 
//No construtor inicializamos estes atributos. O método setNext recebe uma nova instância da classe e faz o seguinte:

//Se o próximo for nulo, então o próximo na corrente será o parâmetro. 
//Caso contrário ira repassar esta responsabilidade para o próximo elemento. 
// Assim, a instância que deve ser adicionada na corrente irá percorrer os elementos até chegar no último elemento

