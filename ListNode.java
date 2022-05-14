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
    
    public boolean removeAll(Node[] c){
        if(c.length == 0)
            return false;
        for (int i = 0; i < c.length; i++) {
            remove(c[i]);
        }
        return true;
    }
    
    public void clear(){
        if(root != null){
            clear(this.root);
        }
    }

    private void clear(Node root){
        if(root.nextNode != null){
            clear(root.nextNode);
        }
        remove(root);
    }

    public boolean equals(ListNode list){
        return equals(list.root);
    }
    public boolean equals(Node root1, Node root2){
        if(root1.nextNode != null && root2.nextNode != null){
            if(root1.value != root2.value){
                return false;
            }else{
                return equals(root1.nextNode, root2.nextNode);
            }
        }
        return true;
    }
    public Node get(int i){
        if(i < 0 || i > (largo - 1)){
            return null;
        }
        Node temp = this.root;
        for (int j = 0; j < largo; j++) {
            if(j == i){
                return temp;
            }else{
                temp = root.nextNode;
            }
        }
        return null;
    }
    public boolean set(int i, Node nodo){
        if(i < 0 || i > (largo - 1)){
            System.out.println("Fuera de rango");
            return false;
        }
        if(i == 0){
            Node temp = root.nextNode;
            root = nodo;
            root.nextNode = temp;
        }
        Node temp = this.root;
        for (int j = 0; j < largo; j++) {
            if(j == (i - 1)){
                temp.nextNode = nodo;
                break;
            }else{
                temp = root.nextNode;
            }
        }
        return true;
    }
}
