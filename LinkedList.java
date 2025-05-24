public class LinkedList {

    private NodeSimples<T> head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    } 

//     isEmpty (): verifica se a lista L está vazia retornando
// verdadeiro se vazia e falso caso contrário;
    public boolean isEmpty(){
        return getHead() == null;
    }

// – isFull(): verifica se a lista L está cheia retornando verdadeiro
// se cheia e falso caso contrário;
    public boolean isFull(){
        NodeSimples<T> aux =new NodeSimples<T>();
        return aux == null;
    }

// – getSize() e getHead(): obtém o tamanho da lista/obtém o
// ponteiro cabeça de lista;
    public int getSize(){
        return size;
    }

    public NodeSimples<T> getHead(){
        return head;
    }

// – get(pos): retorna o nó (Node) localizado na posição “pos”,
// retornando null se não existe elemento na posição;
    public NodeSimples<T> get(int pos){
        if (isEmpty()) return null;
        if (pos <= 0 || pos > size) return null;
        int cont = 1;
        NodeSimples<T> aux = head;
        while (cont != pos) {
            aux = aux.getProximo();
            cont++;
        }
        return aux;
    }

// – insertHead e insertTail(data) ou addFirst/addLast: insere
// um elemento “data” no início/final da lista L, retornando
// verdadeiro se inserção com sucesso ou falso caso contrário;
    public void insertHead(T data){
        if(!isFull()) {
            NodeSimples<T> aux = new NodeSimples<T>(data, null); 
            if (isEmpty()){
                head = aux;
            }else{
                aux.setProximo(head);
                head = aux;
            }
            size++;
        }
    }

    public void insertTail(T data){
        if(!isFull()) {
            NodeSimples<T> aux = new NodeSimples<T>(data, null); 
            if (isEmpty()){
                head = aux;
            }else{
               pAnda = head; // Ponteiro que anda até o final da lista
               while (pAnda.getProx() != null)
                    pAnda = pAnda.getProx();
               pAnda.setProx( aux );

            }
            size++;
        }
    }


// Estruturas de Dados - Lista Encadeada
// Operações
// • A seguir serão estudadas algumas operações, são elas:
// – insert(T id, int pos): insere um elemento “id” na posição
// “pos”, caso seja uma posição maior que o tamanho da lista,
// insere no final se posição de inserção for inválida (<= 0)
// retorna false
// – search (data): procura a existência de um elemento “data” na
// lista L, retornando o ponteiro que indica o elemento.


// – remove (id): remove o elemento “id”, se existir, na lista L,
// retornando verdadeiro se elemento removido ou falso caso
// contrário;


// – pollFirst(): remove e retorna o elemento do começo da lista;


// – pollLast(): remove e retorna o elemento do final da lista;


// – print (): imprime os elementos armazenados em L na console.


// – clear(): limpa a lista ligada original, deixando-a vazia;


// – toString():monta a lista a ser apresentada quando é
// convertida em string


}