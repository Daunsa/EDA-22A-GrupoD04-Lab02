public class ListNode<T> {
    Node<T> root;
    public ListNode(T value){
        root = new Node<T>(value);
    }
    //Metodos de clase listNode
    public boolean addAll(T[] c){
        if(c.length == 0)
            return false;
        for (int i = 0; i < c.length; i++) {
            add(c[i]);
        }
        return true;
    }

}
