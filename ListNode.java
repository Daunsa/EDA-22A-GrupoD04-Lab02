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
}
