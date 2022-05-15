import java.util.ListIterator;

public class ListNode<T> {
    Node<T> root;
    private final int largo;

    public ListNode(final T  value){
        root = new Node<T>(value);
    }

    // Metodos de clase listNode
    public boolean addAll(final  T[] c){
        if (c.length == 0)
            return false;
        for (int i = 0; i < c.length; i++) {
            add(c[i]);
        }
        return true;
    }

    public boolean removeAll(final Nod e[] c){
        if (c.length == 0)
            return false;
        for (int i = 0; i < c.length; i++) {
            remove(c[i]);
        }
        return true;
    }

    public void clear() {
        if (root != null) {
            clear(this.root);
        }
    }

    private void clear(final Node  root){
        if (root.nextNode != null) {
            clear(root.nextNode);
        }
        remove(root);
    }

    public boolean equals(final ListNode  list){
        return equals(list.root);
    }

    public boolean equals(final Node root1, final  Node root2){
        if (root1.nextNode != null && root2.nextNode != null) {
            if (root1.value != root2.value) {
                return false;
            } else {
                return equals(root1.nextNode, root2.nextNode);
            }
        }
        return true;
    }

    public Node get(final  int i){
        if (i < 0 || i > (largo - 1)) {
            return null;
        }
        Node temp = this.root;
        for (int j = 0; j < largo; j++) {
            if (j == i) {
                return temp;
            } else {
                temp = root.nextNode;
            }
        }
        return null;
    }

    public boolean set(final int i, fina l Node nodo){
        if (i < 0 || i > (largo - 1)) {
            System.out.println("Fuera de rango");
            return false;
        }
        if (i == 0) {
            final Node temp = root.nextNode;
            root = nodo;
            root.nextNode = temp;
        }
        Node temp = this.root;
        for (int j = 0; j < largo; j++) {
            if (j == (i - 1)) {
                temp.nextNode = nodo;
                break;
            } else {
                temp = root.nextNode;
            }
        }
        return true;
    }

    public int size() {
        return largo;
    }

    public boolean isEmpty() {
        if (this.root != null) {
            return false;
        }
        return true;
    }

    public boolean contains(final T  valor){
        return contains(valor, this.root);
    }

    private boolean contains(final T valor, fina l Node root){
        if (root.value == valor) {
            return true;
        }
        if (root.nextNode != null) {
            contains(valor, root.nextNode);
        }
        return false;
    }

    public boolean add(final T  valor){
        if (this.root == null) {
            this.root = new Node(valor);
            return true;
        }
        return add(valor, this.root);
    }

    private boolean add(final T valor, final N ode<T> root){
        if (root.nextNode != null) {
            add(valor, root.nextNode);
        }
        this.root.nextNode = new Node<T>(valor);
        return true;
    }

    public boolean remove(final T  valor){
        return remove(valor, this.root)[0];
    }

    private Object[] remove (final T valor, Node<T> root){
        if(root.nextNode != null){
            final Object[] arraytemp = remove(valor, root.nextNode);
            if(arraytemp[0]){
                root.nextNode = arraytemp[1];
            }
            return {false, null};
        }
        if(root.value == valor){
		    final Node<T> temp = this.root.nextNode;
            root = null;
            return {true,temp};
        }
        return {false, null};
    }

    public boolean containsAll(fnal T  [] c){
        for (int i = 0; i < c.length; i++) {
            if (!contains(c[i])) {
                return false;
            }
        }
        return true;
    }

    public void add(final int i, T value){
        if (i < 0 || i > (this.largo - 1)) {
            return;
        }
        if (i == 0) {
            final Node<T> temp = this.root;
            this.root = new Node<T>(value);
            this.root.nextNode = temp;
        }
        Node<T> temp = this.root;
        for (int j = 0; j < this.largo; j++) {
            if (j == (i - 1)) {
                temp = this.root.nextNode;
                this.root.nextNode = new Node<T>(value);
                this.root.nextNode.nextNode = temp;
                break;
            } else {
                temp = this.root.nextNode;
            }
        }
    }

    public Node<T> remove(final  int i){
        Node<T> temp;
        for (int j = 0; j < this.largo; j++) {
            if (j == (i - 1)) {
                temp = this.root.nextNode;
                this.root.nextNode = temp.nextNode;
                return temp;
            } else {
                temp = this.root.nextNode;
            }
        }
        return null;
    }

    public int indexOf(Object o){
        if (o == null) {
            return -1;
        }
        Node<T> temp;
        for (int i = 0; i < this.largo; i++) {
            if (this.root.value == null || o.equals(root.value)) {
                return i;
            } else {
                temp = this.root.nextNode;
            }
        }
        return -1;
    }

    public int lastIndexOf(final Object  o){
        if (o == null) {
            return -1;
        }
        Node<T> temp;
        int j = -1;
        for (int i = 0; i < this.largo; i++) {
            if (this.root.value == o || o.equals(root.value)) {
                j = i;
            } else {
                temp = this.root.nextNode;
            }
        }
        if (j != -1) {
            return j;
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        ListIterator<T> temp = this.root.listIterator();
        while (temp.hasNext()){
            System.out.println(temp.next());
        }
        return temp;
    }

    public ListIterator<T> listIterator(final int index) {
        for(int i=0;i<this.largo;i++){
            if(i==index){
                break;
            }else{
                Node<T> borrar = this.root.nextNode;
            }
        }
        ListIterator<T> temp = this.root.listIterator();
        while (temp.hasNext())
            System.out.println(temp.next());
        return temp;
    }

    public Node<T> subList (int fromIndex, int toIndex){
        final Node<T> temp;
        for(int i=0;i<fromIndex;i++){
            Node<T> borrar = this.root.nextNode;
        }
        for(int i=0;i<toIndex;i++){
            this.root.nextNode=this.root.nextNode.nextNode;
            temp.add(this.root);
        } 
        return temp;
    }
}
