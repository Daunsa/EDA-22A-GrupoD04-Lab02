public class ListNode<T> {
    Node<T> root;
    public ListNode(T value){
        root = new Node<T>(value);
    }
    //Metodos de clase listNode

    void add(int i, T value){
        if(i < 0 || i > (this.largo - 1)){
            return;
        }
        if (i==0){
            Node temp = this.root;
            this.root = new Node(value);
            this.root.nextNode = temp;
        }
        Node temp = this.root;
        for (int j = 0; j < this.largo; j++) {
            if(j == (i-1)){
                temp = this.root.nextNode;
                this.root.nextNode=new Node(value);
                this.root.nextNode.nextNode=temp;
                break;
            }else{
                temp = this.root.nextNode;
            }
        }
    }

}
