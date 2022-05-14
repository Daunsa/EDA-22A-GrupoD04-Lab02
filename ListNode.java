public class ListNode<T> {
    Node<T> root;
    private int largo = 0;
    public ListNode(T value){
        root = new Node<T>(value);
    }
    //Metodos de clase listNode
    public int size(){
        return largo;
    }
    public boolean isEmpty(){
        if(this.root != null){
            return false;
        }
        return true;
    }
    public boolean contains(T valor){
        return contains(valor, this.root);
    }
    private boolean contains (T valor, Node root){
        if(root.value = valor){
            return true;
        }
        if(root.nextNode != null){
            contains(valor, root.nextNode);
        }
        return false;
    }
}
