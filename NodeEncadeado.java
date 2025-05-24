public class NodeEncadeado <T> {
    private T dado;
    private NodeEncadeado<T> anterior;
    private NodeEncadeado<T> proximo;

    public NodeEncadeado(){
        this.dado = null;
        this.anterior = null;
        this.proximo = null;
    }

    public NodeEncadeado (T dado, NodeEncadeado<T> anterior, NodeEncadeado<T> proximo){
        this.dado = dado;
        this.anterior = anterior;
        this.proximo = proximo;
    }

    public T getDado(){
        return dado;
    }

    public void setDado(T dado){
        this.dado = dado ; 
    }
    
    public T getAnterior(){
        return anterior;
    }

    public void setAnterior(NodeSimples<T> ante){
        this.anterior = ante ; 
    }

    public T getProximo(){
        return proximo;
    }

    public void setProximo(NodeSimples<T> prox){
        this.proximo = prox ; 
    }

    
}