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
        if(root.value == valor){
            return true;
        }
        if(root.nextNode != null){
            contains(valor, root.nextNode);
        }
        return false;
    }
    public boolean add(T valor){
        if(this.root == null){
            this.root = new Node(valor);
            return true;
        }
        return add(valor, this.root);
    }
    private boolean add(T valor, Node root){
        if(root.nextNode != null){
            add(valor, root.nextNode);
        }
        root.nextNode = new Node(valor);
        return true;   
    }
    public boolean remove(T valor){
        return contains(valor, this.root)[0];
    }
    private Object[] remove (T valor, Node root){
        if(root.nextNode != null){
            Object[] arraytemp = remove(valor, root.nextNode);
            if(arraytemp[0]){
                root.nextNode = arraytemp[1];
            }
            return {false, null};
        }
        if(root.value == valor){
		    Node temp = root.nextNode;
            root = null;
            return {true,temp};
        }
        return {false, null};
    }
    public boolean containsAll(T [] c){
        for(int i=0; i<c.length; i++){
            if(!contains(c[i])){
                return false;
            }
        }
        return true;
    }
}
