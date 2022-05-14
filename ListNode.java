public class ListNode<T> {
    Node<T> root;
    public ListNode(T value){
        root = new Node<T>(value);
    }
    //Metodos de clase listNode

    public void add(int i, T value){
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

    public T remove (int i){
        Node temp;
        for(int j;j<this.largo;j++){
            if(j == (i-1)){
                temp = this.root.nextNode;
                this.root.nextNode = temp.nextNode;
                return temp;
            } else {
                temp = this.root.nextNode;
            }
        }
    }
    public int indexOf (Object o){
        if(o==null{
            return -1;
        }
        Node temp;
        for(int i=0;i<this.largo;i++){
            if(this.root.value == o && o.equals(root.value){
                return i;
            }else{
                temp = this.root.nextNode();
            }
        }
        return -1;
    }
    public int lastIndexOf (Object o){
        if(o==null{
            return -1;
        }
        Node temp;
        int j=-1;
        for(int i=0;i<this.largo;i++){
            if(this.root.value == o || o.equals(root.value){
               j = i;
            }else{
                temp = this.root.nextNode();
            }
        }
        if (j!=-1){
            return j;
        }
        return -1;
    }

}
