public class NodeSimples <T> {
    private T dado;
    private NodeSimples<T> proximo;

    public NodeSimples(){
        this.dado = null;
        this.proximo = null;
    }

    public NodeSimples (T dado, NodeSimples<T> proximo){
        this.dado = dado;
        this.proximo = proximo;
    }

    public T getDado(){
        return dado;
    }

    public void setDado(T dado){
        this.dado = dado ; 
    }
    
    public T getProximo(){
        return proximo;
    }

    public void setProximo(NodeSimples<T> prox){
        this.proximo = prox ; 
    }

    
}